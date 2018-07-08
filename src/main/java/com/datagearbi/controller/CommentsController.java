package com.datagearbi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.datagearbi.model.Comments;
import com.datagearbi.repository.CommentsRepository;
import com.datagearbi.service.FileStorageService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("aml/api/comments")
public class CommentsController {

	@Autowired
	private CommentsRepository CommentsRepository;
	
	@Autowired
	private FileStorageService fileStorageService;

	@RequestMapping(value = "all", method = RequestMethod.GET)
	public List<Comments> findAll() {
		List<Comments> comments = this.CommentsRepository.findAll();
		comments.forEach(c->{
			if (c.getUserview()!=null) {				
				System.out.println("getDisplayName:"+c.getUserview().getDisplayName());
			}
		});
		System.out.println("comments"+comments.size());
		return comments;
	}
	
	@RequestMapping(value="comments",method=RequestMethod.GET)
	public List<Comments> getAllComments(@RequestParam("alarmed_Obj_level_Cd") String alarmed_Obj_level_Cd,
										@RequestParam("alarmed_Obj_Key") long alarmed_Obj_Key) {
		/*
		 * get all suspect comments
		 */
		return this.CommentsRepository.getAllComments(alarmed_Obj_level_Cd,alarmed_Obj_Key);
	}
	
	@PostMapping("/updateComment")
	public void updateComment(int commentid, int alarmed_Obj_Key,String alarmed_Obj_level_Cd, String description, 
			int uplodedById,@RequestParam MultipartFile[] files) {
//		System.out.println(comments.getAlarmed_Obj_level_Cd());
//		System.out.println(comments.getId());
		this.fileStorageService.updateComment(commentid,alarmed_Obj_Key, alarmed_Obj_level_Cd,description,uplodedById, files);
	}
	
	@DeleteMapping("/deleteComment")
	public void deleteComment(@RequestParam("commentId") int commentId, @RequestParam("updaterId") int updaterId) {
		System.out.println("*****************in deleteComment");
		this.fileStorageService.deleteComment(commentId, updaterId);
	}

	
}