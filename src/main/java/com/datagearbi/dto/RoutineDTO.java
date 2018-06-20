package com.datagearbi.dto;

public class RoutineDTO {

	private long Routine_Id;
	private String  Routine_Name;
	private String alarm_Categ_Cd;
	public String getAlarm_Categ_Cd() {
		return alarm_Categ_Cd;
	}
	public void setAlarm_Categ_Cd(String alarm_Categ_Cd) {
		this.alarm_Categ_Cd = alarm_Categ_Cd;
	}
	


	public long getRoutine_Id() {
		return Routine_Id;
	}

	public void setRoutine_Id(long routine_Id) {
		Routine_Id = routine_Id;
	}

	public RoutineDTO(String routine_Name) {
		super();
		Routine_Name = routine_Name;
	}

	public String getRoutine_Name() {
		return Routine_Name;
	}

	public void setRoutine_Name(String routine_Name) {
		Routine_Name = routine_Name;
	}

	public RoutineDTO(long routine_Id, String routine_Name) {
		Routine_Id = routine_Id;
		Routine_Name = routine_Name;
	}
	@Override
    public String toString(){
        return "[\"Routine_Id:\""+Routine_Id+",\"Routine_Name:\""+Routine_Name+"]";
    }	
}
