/* DO NOT EDIT THIS FILE.
 * This file is automatically generated by ./generate.sh from vlcb-defs.csv
 */ 

package uk.org.merg.cbus;

// Copyright (C) Sven Rosvall (sven@rosvall.ie)
// This file is part of VLCB-Arduino project on https://github.com/SvenRosvall/VLCB-Arduino
// Licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License.
// The full licence can be found at: http://creativecommons.org/licenses/by-nc-sa/4.0/

public enum CbusSysPixieModuleTypes {
// 
// SysPixie Module types (Konrad Orlowski)
// 
	MTYP_CANPMSense(1);	//Motorised point motor driver with current sense

	private final int v;

	private CbusSysPixieModuleTypes(int v) {
		this.v = v;
	}

	public int value() {
		return v;
	}
}
