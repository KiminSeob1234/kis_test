package kr.kis.main;

import java.util.ArrayList;

import kr.kis.data.*;
import kr.kis.gui.*;

public class Main {
	public static ArrayList<Person> perlist = new ArrayList<Person>();
	
	public static void main(String[] args){			
		
		MainMB gui = new MainMB();
		//Thread thread = new Thread(gui);
		
		PersonSystem Ps = new PersonSystem();
		dataSaveCsv read = new dataSaveCsv();
		
		read.dataRead();
		Ps.Run();
	}
	
}
