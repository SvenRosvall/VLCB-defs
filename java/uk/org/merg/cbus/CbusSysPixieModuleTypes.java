/* DO NOT EDIT THIS FILE.
 * This file is automatically generated by ./generate.sh from cbusdefs.csv
 */ 

package uk.org.merg.cbus;

// 
// Copyright (C) Pete Brownlow 2011-2022   software@upsys.co.uk
// Originally derived from opcodes.h (c) Andrew Crosland.
// CSV version by Ian Hogg inspired by David W Radcliffe
// 
// Ver 8w 
// 
//   This work is licensed under the:
//       Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License.
//   To view a copy of this license, visit:
//       http://creativecommons.org/licenses/by-nc-sa/4.0/
//   or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
// 
//   License summary:
//     You are free to:
//       Share, copy and redistribute the material in any medium or format
//       Adapt, remix, transform, and build upon the material
// 
//     The licensor cannot revoke these freedoms as long as you follow the license terms.
// 
//     Attribution : You must give appropriate credit, provide a link to the license,
//                    and indicate if changes were made. You may do so in any reasonable manner,
//                    but not in any way that suggests the licensor endorses you or your use.
// 
//     NonCommercial : You may not use the material for commercial purposes. **(see note below)
// 
//     ShareAlike : If you remix, transform, or build upon the material, you must distribute
//                   your contributions under the same license as the original.
// 
//     No additional restrictions : You may not apply legal terms or technological measures that
//                                   legally restrict others from doing anything the license permits.
// 
//    ** For commercial use, please contact the original copyright holder(s) to agree licensing terms
// 
//     This software is distributed in the hope that it will be useful, but WITHOUT ANY
//     WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE
// 
// Version history:
// Pete Brownlow,6/4/11,Original from spec version 7e
// Roger Healey,6/4/11,Add OPC_CMDERR response codes
// Pete Brownlow,7/6/11,Updated to spec ver 7f and add new module ids
// Pete Brownlow,4/7/11,Updated to spec ver 7g
// Pete Brownlow,14/8/11,Updated to spec ver 7h
// Pete Brownlow,18/2/12,Updated to spec ver 8a, Rocrail and animated modeller module types added
// Pete Brownlow,10/4/12,Updated to spec ver 8b, extended parameter bytes
// Pete Brownlow,17/4/12,Updated parameter block definitions, added processor type definitions.
// Roger Healey,13/7/12,Add CANTOTI
// Pete Brownlow,15/9/12,Updated to spec ver 8c, added 0x5D ENUM and 0x75 CANID
// Pete Brownlow,4/1/13,Ver 8d New module types, added 0x5E  NNRST
// Roger Healey,15/2/13,Now at version d. Added new Module Ids (as per ModuleIds Issue 9) and
//          Align Processor Ids with constants.inc
//          Added .(fullstop) before each processor Id > 9
//          Added OPC_NNRST
// Roger Healey,27/4/13,Added CANSIG8 and CANSIG64
// Roger Healey,6/8/13,Added CANCOND8C
// Roger Healey,22/1/14,Added CANPAN, CANACE3C, CANPanel and CANMIO
// Pete Brownlow,22/1/14,Ver 8g New module types, OPC_NNRST & OPC_NNRSM, catch up with .inc file
//          Added parameter definitions for manufacturer's CPU id
//          Added extern C so can be included by c++ code
//          Fixed CANGC1e type definition
// Phil Wheeler,1/2/14,Corrected some typos. Added PRM_BETA, dotted some more decimal numbers
// Phil Wheeler,9/3/14,Corrected CANSIG MTYP definitions
// Pete Brownlow,19/4/14,Ver 8h Added module type defs for CANTOTIMIO, CANACE8MIO, CANBIP, CANSOL
// Pete Brownlow,06/7/15,Ver 8j Add new module types as per modules definitions v17 : CANCDU, CANACC4CDU, CANWiBase, WiCAB, CANWiFi, CANFTT
//          Add new opcode ALOC, added CPU manufacturer code CPUM_ATMEL
// Mike Bolton,2/3/16,Ver 8k    Add module type CANRFID8
// Pete Brownlow,2/7/16,Ver 8m Add new module types CANHNDST, CANTCHNDST, CANmchRFID and CANPiWi
//          Add processor codes for ARM chips used in Raspberry Pi's
// Pete Brownlow,16/2/17,Ver 8n Add module ids to bring it up to module ids document ver 25
// Pete Brownlow,29/7/17,Ver 8p Add new module ids and new cab signalling opcode
// Pete Brownlow,09/1/18,Ver 8q Add new parameter flag for module can consume its own events
// Ian Hogg,11/9/18,Ver 8r Added CANACE16CMIO, CANPiNODE, CANDISP, CANCOMPUTE
// Richard Crawshaw,29/02/2020,Fixed order of columns in CbusCabSigAspect2.
// Pete Brownlow,01/09/20,Ver 8s for additional module ids defined in the ModuleIds file ver 33.
//                        Updated descriptive comments for some module types
//                        Updated CABDAT opcode to match RFC0004
// Pete Brownlow,06/09/20,Ver 8t Added module type for CANRCOM. Fixed: Opcode for CABDAT, names for CANRC522 and CANMAG
// Pete Brownlow,13/10/20,Ver 8u Added module types 67 to 74 including some Arduino projects
//                               Added SPROG manufacturer code 44 and new SPROG CBUS module types
//                               Additional error code for overload - now removed as not required after all
//                               New bus type USB for modules with only USB and no CAN
// Pete Brownlow,19/02/21,Ver 8u Added manufacturer code 13 for new development - who don't have a manufacturer id yet
//                               Added proccessor identification codes for 18F25k83, 18F26k83 and 18F14K22.
// Andrew Crosland,21/09/2021,Ver 8t Added PICs P18F14K22 P18F26K83 P18F27Q84 P18F47Q84 and P18F27Q83
// Andrew Crosland,19/01/2022,Ver 8t, Added OPC_VCVS, Verify CV service mode - used for CV read hints, update SPROG modules types (PR#13)
// Duncan Greenwood,07/10/2021,Ver 8t Added OPC_DTXC opcode (0xE9) for CBUS long messages - RFC 0005
// Richard Crawshaw,11/10/2021,Ver 8t Fixed trailing comma in CbusCabSigAspect0
// Pete Brownlow,28/07/2022,Ver 8v Resolve and merge changes in 8u branch with changes subsequently applied to master, now ver 8v in new branch,
//   							Add requested module type ids 75 to 78
//                               Resolve changes from PR #13,  move proposed and/or agreed opcodes not yet in the published spec to below the others
// Pete Brownlow,5/08/2022, Ver 8w  Add module type 79 for CANBUFFER
// Pete Brownlow,5/01/2023, Ver 8w  Add module type 80 for CANPMSense
// Ian Hogg,14/08/2023, Ver 8x  Add manufacturer code for VLCB. This is a way to allocate a block of module Id to VLCB even though VLCB group is not a manufacturer per se. The VLCB module IDs will be defined in the VLCB repo

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
