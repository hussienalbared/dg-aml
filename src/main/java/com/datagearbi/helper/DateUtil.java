package com.datagearbi.helper;

import java.sql.Timestamp;

public class DateUtil {

	static public Timestamp startOfDay(String date) {
		return Timestamp.valueOf(date + " 00:00:00");
	}
	
	static public Timestamp endOfDay(String date) {
		return Timestamp.valueOf(date + " 21:59:59.999");
	}
}
