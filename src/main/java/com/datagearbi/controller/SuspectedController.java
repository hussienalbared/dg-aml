package com.datagearbi.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.AC_Alarm;
import com.datagearbi.model.AC_Suspected_Object;
import com.datagearbi.model.AC_Suspected_ObjectPK;
import com.datagearbi.model.Comment;
import com.datagearbi.model.Comments;
import com.datagearbi.repository.AlaramObjectRepository;
import com.datagearbi.repository.CommentsRepository;
import com.datagearbi.repository.SuspectCommentRrepository;
import com.datagearbi.repository.SuspectedObjectRepository;

@RestController
@RequestMapping("aml/api/v1/")
@CrossOrigin(origins = "*")
public class SuspectedController {
	@PersistenceContext
	private EntityManager entityManager;
	@Autowired
	private SuspectedObjectRepository suspectedObjectRepository;
	@Autowired
	private AlaramObjectRepository alaramObjectRepository;
	
	@Autowired
	private SuspectCommentRrepository SuspectCommentRrepository;
	
	@Autowired
	private CommentsRepository commentsRepository;
	
	@Autowired
    private SimpMessagingTemplate template;
	
	@RequestMapping(value = "suspectedObject", method= RequestMethod.GET)
	public Object[] list() {
		System.out.println("---list---");
		return this.suspectedObjectRepository.getAllSuspectWithNames();
//		return this.suspectedObjectRepository.findByalarmsCountGreaterThan(0).subList(1, 2);
//		return suspectedObjectRepository.findAll().stream().filter(f->f.getAlarms_Count()>0).collect(Collectors.toList());
	}
	
	@RequestMapping(value = "suspectedObject/{key}/{levelCode}" , method= RequestMethod.GET)
	public AC_Suspected_Object get(@PathVariable int key,@PathVariable String levelCode) {
		AC_Suspected_ObjectPK id = new AC_Suspected_ObjectPK(levelCode, key);
		return suspectedObjectRepository.getOne(id);
	}
	@RequestMapping(value = "alarms", method= RequestMethod.GET)
	public AC_Suspected_Object getAlarms(@RequestParam("key") String key,
			@RequestParam("code") String levelCode) {
		
		
		AC_Suspected_Object asObj= suspectedObjectRepository.findById(new AC_Suspected_ObjectPK(levelCode, Long.parseLong(key))).get();

		Set<AC_Alarm> alarms=asObj.getAcAlarm().stream().filter(a->a.getAlarm_Status_Cd().equalsIgnoreCase("act")).
		collect(Collectors.toSet());
		asObj.setAcAlarm(alarms);
		return asObj;
		//		
		
		
		//return suspectedObjectRepository.findAll();
	}
	@RequestMapping(value = "updateUser", method= RequestMethod.PUT)
	public void  updateUser(@RequestParam("key") String key,
			@RequestParam("code") String levelCode,
			@RequestParam("user") String user
			) {
		
this.suspectedObjectRepository.updateAcSuspectedObj(Long.parseLong(key), levelCode, user);	
		

	}
	@RequestMapping(value = "removeOwnerShip", method= RequestMethod.PUT)
	public void  removeOwnerShip(@RequestParam("key") String key,
			@RequestParam("code") String levelCode
			) {
		
this.suspectedObjectRepository.updateAcSuspectedObj(Integer.parseInt(key), levelCode,null);	
		

	}
	
	//close all alarams of suspect given key and level code of the suspect
	@RequestMapping(value = "closeAllSuspectAlarms", method= RequestMethod.GET)
	public void  closeAllSuspectAlarms(
			@RequestParam("key") String key,
			@RequestParam("code") String levelCode,
			@RequestParam("eventType") String eventType
			) {
		
		
		  //close all alarms or uppress it according to eventType
		  this.alaramObjectRepository.closeAlarms(Long.parseLong(key), levelCode,eventType);
	
		  //update alert count
		  this.suspectedObjectRepository.updateAcSuspectedObjAlertCount(Long.parseLong(key), levelCode, 0);
	
	
	}
	
	
	@RequestMapping(value = "getSuspetedByObjectNumber", method= RequestMethod.GET)
	public List getByObjectNumber(@RequestParam("obj_number") String obj_number)
	{
		String query="select a.id.alarmed_Obj_Key ,a.id.alarmed_Obj_level_Cd from AC_Suspected_Object a "
				+ "where a.alarmed_Obj_No='"+obj_number+"'";
	
				List s= entityManager.createQuery(query).getResultList();
				int y=s.size();
				if(s.size()==0)
					return null;
				
				return s;

	
	
	}

	@RequestMapping(value="addcomment",method=RequestMethod.POST)
	public void addComment(@RequestBody Comment comment) {
		/*
		 * insert comment
		 * get all comments
		 * converstAndSend all comments to the topic 
		 */
    	Date date = new Date();
    	comment.setUploadDate(date);
		this.SuspectCommentRrepository.save(comment);
		
//		List<Comment> allcommants = getAllComments(comment.getAlarmed_Obj_level_Cd(), comment.getAlarmed_Obj_Key());
		// Push notifications to front-end
        template.convertAndSend("/topic/comment", comment);
	}
//	
	@RequestMapping(value="comments",method=RequestMethod.GET)
	public List<Comments> getAllComments(@RequestParam("alarmed_Obj_level_Cd") String alarmed_Obj_level_Cd,
										@RequestParam("alarmed_Obj_Key") long alarmed_Obj_Key) {
		/*
		 * get all suspect comments
		 */
		//return this.SuspectCommentRrepository.getAllComments(alarmed_Obj_level_Cd,alarmed_Obj_Key);
		return this.commentsRepository.findAll();
	}
	
}