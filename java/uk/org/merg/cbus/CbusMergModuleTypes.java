/* DO NOT EDIT THIS FILE.
 * This file is automatically generated by ./generate.sh from vlcb-defs.csv
 */ 

package uk.org.merg.cbus;

// Copyright (C) Sven Rosvall (sven@rosvall.ie)
// This file is part of VLCB-Arduino project on https://github.com/SvenRosvall/VLCB-Arduino
// Licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License.
// The full licence can be found at: http://creativecommons.org/licenses/by-nc-sa/4.0/

public enum CbusMergModuleTypes {
// 
// MODULE TYPES
// 
// Please note that the existence of a module type id does not necessarily mean that firmware has been implemented
// 
// MERG Module types
// 
	MTYP_SLIM(0),	//default for SLiM nodes
	MTYP_CANACC4(1),	//Solenoid point driver
	MTYP_CANACC5(2),	//Motorised point driver
	MTYP_CANACC8(3),	//8 digital outputs
	MTYP_CANACE3(4),	//Control panel switch/button encoder
	MTYP_CANACE8C(5),	//8 digital inputs
	MTYP_CANLED(6),	//64 led driver
	MTYP_CANLED64(7),	//64 led driver (multi leds per event)
	MTYP_CANACC4_2(8),	//12v version of CANACC4
	MTYP_CANCAB(9),	//CANCAB hand throttle
	MTYP_CANCMD(10),	//CANCMD command station
	MTYP_CANSERVO(11),	//8 servo driver (on canacc8 or similar hardware)
	MTYP_CANBC(12),	//BC1a command station
	MTYP_CANRPI(13),	//RPI and RFID interface
	MTYP_CANTTCA(14),	//Turntable controller (turntable end)
	MTYP_CANTTCB(15),	//Turntable controller (control panel end)
	MTYP_CANHS(16),	//Handset controller for old BC1a type handsets
	MTYP_CANTOTI(17),	//Track occupancy detector
	MTYP_CAN8I8O(18),	//8 inputs 8 outputs
	MTYP_CANSERVO8C(19),	//Canservo with servo position feedback
	MTYP_CANRFID(20),	//RFID input
	MTYP_CANTC4(21),	//
	MTYP_CANACE16C(22),	//16 inputs
	MTYP_CANIO8(23),	//8 way I/O
	MTYP_CANSNDX(24),	//??
	MTYP_CANEther(25),	//Ethernet interface
	MTYP_CANSIG64(26),	//Multiple aspect signalling for CANLED module
	MTYP_CANSIG8(27),	//Multiple aspect signalling for CANACC8 module
	MTYP_CANCOND8C(28),	//Conditional event generation
	MTYP_CANPAN(29),	//Control panel 32/32
	MTYP_CANACE3C(30),	//Newer version of CANACE3 firmware
	MTYP_CANPanel(31),	//Control panel 64/64
	MTYP_CANMIO(32),	//Multiple I/O – Universal CANMIO firmware
	MTYP_CANACE8MIO(33),	//Multiple IO module 16 inputs emulating CANACE8C on CANMIO hardware
	MTYP_CANSOL(34),	//Solenoid driver module
	MTYP_CANBIP(35),	//Universal CANBIP firmware - Bipolar IO module with additional 8 I/O pins (CANMIO family)
	MTYP_CANCDU(36),	//Solenoid driver module with additional 6 I/O pins (CANMIO family)
	MTYP_CANACC4CDU(37),	//CANACC4 firmware ported to CANCDU
	MTYP_CANWiBase(38),	//CAN to MiWi base station
	MTYP_WiCAB(39),	//Wireless cab using MiWi protocol
	MTYP_CANWiFi(40),	//CAN to WiFi connection with Withrottle to CBUS protocol conversion
	MTYP_CANFTT(41),	//Turntable controller configured using FLiM
	MTYP_CANHNDST(42),	//Handset (alternative to CANCAB)
	MTYP_CANTCHNDST(43),	//Touchscreen handset
	MTYP_CANRFID8(44),	//multi-channel RFID reader
	MTYP_CANmchRFID(45),	//either a 2ch or 8ch RFID reader
	MTYP_CANPiWi(46),	//a Raspberry Pi based module for WiFi
	MTYP_CAN4DC(47),	//DC train controller
	MTYP_CANELEV(48),	//Nelevator controller
	MTYP_CANSCAN(49),	//128 switch inputs
	MTYP_CANMIO_SVO(50),	//16MHz 25k80 version of CANSERVO8c on CANMIO hardware
	MTYP_CANMIO_INP(51),	//16MHz 25k80 version of CANACE8MIO on CANMIO hardware
	MTYP_CANMIO_OUT(52),	//16MHz 25k80 version of CANACC8 on CANMIO hardware
	MTYP_CANBIP_OUT(53),	//16MHz 25k80 version of CANACC5 on CANBIP hardware
	MTYP_CANASTOP(54),	//DCC stop generator
	MTYP_CANCSB(55),	//CANCMD with on board 3A booster
	MTYP_CANMAG(56),	//Magnet on Track detector
	MTYP_CANACE16CMIO(57),	//16 input equivaent to CANACE8C
	MTYP_CANPiNODE(58),	//CBUS module based on Raspberry Pi
	MTYP_CANDISP(59),	//25K80 version of CANLED64 (IHart and MB)
	MTYP_CANCOMPUTE(60),	//Compute Event processing engine
	MTYP_CANRC522(61),	//Read/Write from/to RC522 RFID tags
	MTYP_CANINP(62),	//8 inputs module (2g version of CANACE8c) (Pete Brownlow)
	MTYP_CANOUT(63),	//8 outputs module (2g version of CANACC8) (Pete Brownlow)
	MTYP_CANEMIO(64),	//Extended CANMIO (24 I/O ports) (Pete Brownlow)
	MTYP_CANCABDC(65),	//DC cab
	MTYP_CANRCOM(66),	//DC Railcom detector/reader
	MTYP_CANMP3(67),	//MP3 sound player in response to events (eg: station announcements) (Duncan Greenwood)
	MTYP_CANXMAS(68),	//Addressed RGB LED driver (Duncan Greenwood)
	MTYP_CANSVOSET(69),	//Servo setting box (Duncan Greenwood)
	MTYP_CANCMDDC(70),	//DC Command station
	MTYP_CANTEXT(71),	//Text message display
	MTYP_CANASIGNAL(72),	//Signal controller
	MTYP_CANSLIDER(73),	//DCC cab with slider control (Dave Radcliffe)
	MTYP_CANDCATC(74),	//DC ATC module (Dave Harris)
	MTYP_CANGATE(75),	//Logic module using and/or gates (Phil Silver)
	MTYP_CANSINP(76),	//Q series PIC input module (Ian Hart)
	MTYP_CANSOUT(77),	//Q series PIC input module (Ian Hart)
	MTYP_CANSBIP(78),	//Q series PIC input module (Ian Hart)
	MTYP_CANBUFFER(79),	//Message buffer (Phil Silver)
// 
// At the time of writing the list of defined MERG module types is maintained by Pete Brownlow software@upsys.co.uk
// Please liaise with Pete before adding new module types, 
// and/or create your own GitHub branch, add your proposed new module type(s) and then create a Pull Request
// 
	MTYP_CAN_SW(0xFF),	//Software nodes
	MTYP_EMPTY(0xFE),	//Empty module, bootloader only
	MTYP_CANUSB(0xFD);	//USB interface

	private final int v;

	private CbusMergModuleTypes(int v) {
		this.v = v;
	}

	public int value() {
		return v;
	}
}
