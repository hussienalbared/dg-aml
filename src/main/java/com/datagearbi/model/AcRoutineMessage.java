package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the AC_ROUTINE_MESSAGE database table.
 * 
 */
@Entity
@Table(name="AC_ROUTINE_MESSAGE")
@NamedQuery(name="AcRoutineMessage.findAll", query="SELECT a FROM AcRoutineMessage a")
public class AcRoutineMessage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="routine_message_name")
	private String routineMessageName;

	@Column(name="routine_message_text")
	private String routineMessageText;

	public AcRoutineMessage() {
	}

	public String getRoutineMessageName() {
		return this.routineMessageName;
	}

	public void setRoutineMessageName(String routineMessageName) {
		this.routineMessageName = routineMessageName;
	}

	public String getRoutineMessageText() {
		return this.routineMessageText;
	}

	public void setRoutineMessageText(String routineMessageText) {
		this.routineMessageText = routineMessageText;
	}

}