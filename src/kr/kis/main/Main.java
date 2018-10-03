package kr.kis.main;

import java.util.ArrayList;

import kr.kis.data.*;
import kr.kis.gui.*;
import kr.kis.ui.UiMain;
/*
 * 주 진입점.
 */
public class Main {
	public static ArrayList<Person> perlist = new ArrayList<Person>();
	
	public static void main(String[] args) {
		MemberData memData = new MemberData();
		memData.dataRead(); //data read
		
		GuiMain gui = new GuiMain();
		//Thread thread = new Thread(gui);
		UiMain uiMain = new UiMain();
		
		uiMain.Run();
	}
	
}
