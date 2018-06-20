/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datagearbi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainAGP {
	@Autowired
	AlarmsProcess alarmsProcess;

	// private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd
	// HH:mm:ss");

	public void Run_AGP() {
		// Scenarios that will be run SCR Vector.

		int SCR[] = { 1, 2, 3, 5, 7, 10, 16, 20, 21, 22, 23 };

		for (int x : SCR) {
			// System.out.println("gsjkfgskj:"+ x);

			switch (x) {
			case 1:
				alarmsProcess.insertAML001AlarmData();
				break;
			case 2:
				alarmsProcess.insertAML002AlarmData();
				break;
			case 3:
				alarmsProcess.insertAML003AlarmData();
				break;
			case 5:
				alarmsProcess.insertAML005AlarmData();
				break;
			case 7:
				alarmsProcess.insertAML007AlarmData();
				break;
			case 10:
				alarmsProcess.insertAML010AlarmData();
				;
				break;
			case 16:
				alarmsProcess.insertAML016AlarmData();
				break;
			case 20:
				alarmsProcess.insertAML020AlarmData();
				break;
			case 21:
				alarmsProcess.insertAML021AlarmData();
				break;
			case 22:
				alarmsProcess.insertAML022AlarmData();
				break;
			case 23:
				alarmsProcess.insertAML023AlarmData();
				break;
			default:
				System.out.println("Invalid Scenario Name");
				;
				break;
			}
		}

	}

}
