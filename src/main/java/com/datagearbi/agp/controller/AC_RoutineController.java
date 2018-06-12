package com.datagearbi.agp.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.agp.repository.AC_RoutineRepository;
import com.datagearbi.model.AC_Routine;
import com.datagearbi.model.AC_Routine_Parameter;

@RestController
@RequestMapping("aml/api/agp")
@CrossOrigin("*")
public class AC_RoutineController {
	@Autowired
	AC_RoutineRepository ac_RoutineRepository;

	@GetMapping("scenarios")
	private List<AC_Routine> selectRecordIntoSecsTable() {
		return ac_RoutineRepository.findAll();
	}
	@GetMapping("getscenario")
	private Optional<AC_Routine> selectRecordIntoSecsTable(@RequestParam("id") String id) {
		return ac_RoutineRepository.findById(Long.parseLong(id));
	}
	
	@RequestMapping(value="updateroutine", method=RequestMethod.PUT)
	public void updateRoutine(/*@RequestBody AC_Routine ac_Routine*/
			@RequestParam("routine_Id") String routine_Id,@RequestParam("routine_Name") String routine_Name,
			@RequestParam("routine_Short_Desc") String routine_Short_Desc,@RequestParam("routine_Desc") String routine_Desc,
			@RequestParam("routine_Status_Cd") String routine_Status_Cd,@RequestParam("risk_Fact_Ind") String risk_Fact_Ind,
			@RequestParam("routine_Run_Freq_Cd") String routine_Run_Freq_Cd,@RequestParam("alarm_Categ_Cd") String alarm_Categ_Cd,
			@RequestParam("alarm_Subcateg_Cd") String alarm_Subcateg_Cd,@RequestParam("routine_Type_Cd") String routine_Type_Cd,
			@RequestParam("save_Trig_Trans_Ind") String save_Trig_Trans_Ind,@RequestParam("obj_Level_Cd") String obj_Level_Cd,
			@RequestParam("routine_Msg_Txt") String routine_Msg_Txt) {
		
		System.out.println("DDDDDDDDDDDDD");
		
//		AC_Routine obj = em.find(AC_Routine.class, Long.parseLong(routine_Id));
//		obj.setRoutine_Name(routine_Name);		obj.setRoutine_Short_Desc(routine_Short_Desc);
//		obj.setRoutine_Desc(routine_Desc);		obj.setRoutine_Status_Cd(routine_Status_Cd);
//		obj.setRisk_Fact_Ind(risk_Fact_Ind);	obj.setRoutine_Run_Freq_Cd(routine_Run_Freq_Cd);
//		obj.setAlarm_Categ_Cd(alarm_Categ_Cd);	obj.setAlarm_Subcateg_Cd(alarm_Subcateg_Cd);
//		obj.setRoutine_Type_Cd(routine_Type_Cd);obj.setSave_Trig_Trans_Ind(save_Trig_Trans_Ind);
//		obj.setObj_Level_Cd(obj_Level_Cd);		obj.setRoutine_Msg_Txt(routine_Msg_Txt);
//		
//		this.em.merge(obj);
		
		this.ac_RoutineRepository.updateAcRoutine(Long.parseLong(routine_Id), routine_Name, routine_Short_Desc, 
				routine_Desc, routine_Status_Cd, risk_Fact_Ind, routine_Run_Freq_Cd, alarm_Categ_Cd, 
				alarm_Subcateg_Cd, routine_Type_Cd, save_Trig_Trans_Ind, obj_Level_Cd, routine_Msg_Txt);
		
	}
}
