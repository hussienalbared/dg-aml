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
	
//	@PersistenceContext
//	private EntityManager em;
	@RequestMapping(value="updateroutine", method=RequestMethod.PUT)
//	@Transactional
	public void upfateParam(@RequestBody AC_Routine ac_Routine) {
		
//		em.find(AC_Routine.class, ac_Routine.getRoutine_Id());
//		this.em.merge(ac_Routine);
//		
		
		//this.ac_RoutineRepository.save(tar_ac_Routine);
//		this.ac_RoutineRepository.updateAcRoutine(ac_Routine.getRoutine_Id(), ac_Routine.getRoutine_Name(), ac_Routine.getRoutine_Desc()
//				, ac_Routine.getRoutine_Short_Desc(), ac_Routine.getRoutine_Status_Cd(), ac_Routine.getRisk_Fact_Ind(), 
//				ac_Routine.getRoutine_Run_Freq_Cd(), ac_Routine.getAlarm_Categ_Cd(), ac_Routine.getAlarm_Subcateg_Cd(), 
//				ac_Routine.getRoutine_Type_Cd(), ac_Routine.getSave_Trig_Trans_Ind(), ac_Routine.getObj_Level_Cd()
//				, ac_Routine.getRoutine_Msg_Txt());
	}
}
