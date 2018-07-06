package com.datagearbi.helper;

public class AcRoutineHelper {
	private long routine_Id;
	private String routine_Name;
	private String alarm_Categ_Cd;
	private String alarm_Subcateg_Cd;
    	private String	routine_Short_Desc;
          private String  routine_Msg_Txt ;
		public long getRoutine_Id() {
			return routine_Id;
		}
		public AcRoutineHelper(long routine_Id, String routine_Name, String alarm_Categ_Cd, String alarm_Subcateg_Cd,
				String routine_Short_Desc, String routine_Msg_Txt) {
			super();
			this.routine_Id = routine_Id;
			this.routine_Name = routine_Name;
			this.alarm_Categ_Cd = alarm_Categ_Cd;
			this.alarm_Subcateg_Cd = alarm_Subcateg_Cd;
			this.routine_Short_Desc = routine_Short_Desc;
			this.routine_Msg_Txt = routine_Msg_Txt;
		}
		public void setRoutine_Id(long routine_Id) {
			this.routine_Id = routine_Id;
		}
		public String getRoutine_Name() {
			return routine_Name;
		}
		public void setRoutine_Name(String routine_Name) {
			this.routine_Name = routine_Name;
		}
		public String getAlarm_Categ_Cd() {
			return alarm_Categ_Cd;
		}
		public void setAlarm_Categ_Cd(String alarm_Categ_Cd) {
			this.alarm_Categ_Cd = alarm_Categ_Cd;
		}
		public String getAlarm_Subcateg_Cd() {
			return alarm_Subcateg_Cd;
		}
		public void setAlarm_Subcateg_Cd(String alarm_Subcateg_Cd) {
			this.alarm_Subcateg_Cd = alarm_Subcateg_Cd;
		}
		public String getRoutine_Short_Desc() {
			return routine_Short_Desc;
		}
		public void setRoutine_Short_Desc(String routine_Short_Desc) {
			this.routine_Short_Desc = routine_Short_Desc;
		}
		public String getRoutine_Msg_Txt() {
			return routine_Msg_Txt;
		}
		public void setRoutine_Msg_Txt(String routine_Msg_Txt) {
			this.routine_Msg_Txt = routine_Msg_Txt;
		}
}
