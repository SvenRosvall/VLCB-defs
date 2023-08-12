/* DO NOT EDIT THIS FILE.
 * This file is automatically generated by ./generate.sh from vlcb-defs.csv
 */ 

package uk.org.merg.cbus;

// Copyright (C) Sven Rosvall (sven@rosvall.ie)
// This file is part of VLCB-Arduino project on https://github.com/SvenRosvall/VLCB-Arduino
// Licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License.
// The full licence can be found at: http://creativecommons.org/licenses/by-nc-sa/4.0/

public enum CbusSStats {
// 
// Status codes for OPC_SSTAT
// 
	SSTAT_NO_ACK(1),	//
	SSTAT_OVLD(2),	//
	SSTAT_WR_ACK(3),	//
	SSTAT_BUSY(4),	//
	SSTAT_CV_ERROR(5);	//

	private final int v;

	private CbusSStats(int v) {
		this.v = v;
	}

	public int value() {
		return v;
	}
}
