package kr.kis.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import kr.kis.main.Main;


public class dataSaveCsv {
	private final String csvFilePath ="D:\\MemberList.csv";
	Scanner scan = new Scanner(System.in);
	
	public boolean dataSave() //Csv Write
	{	
		boolean fl = true;
		//File dir = new File(csvFilePath); 
		
		try {
			BufferedWriter fw = new BufferedWriter(new FileWriter(csvFilePath));//덮어쓰기
			//BufferedWriter fw = new BufferedWriter(new FileWriter(csvFilePath,true));//이어쓰기
			for(int i=0; i<Main.perlist.size(); i++)
			{
				Person temp = Main.perlist.get(i);
				String info = temp.saveFormat();
				fw.write(info);
				fw.newLine();
			}
			fw.flush();
			fw.close();
			
		}
		catch(Exception e){
			fl = false;
			System.out.println(e);
		}
		
		return fl;
		
	}
	
	public void dataRead() // Csv Read
	{	
		File dir = new File(csvFilePath); 
		if(dir.isFile()) {
			String readLine;
			try {
				BufferedReader rw = new BufferedReader(new FileReader(csvFilePath));
				
				while((readLine = rw.readLine()) != null) {
					String[] split = readLine.split(",");
					Person temp = new Person(split[0],split[1],split[2],split[3]);
					Main.perlist.add(temp);
				}
				rw.close();
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		else System.out.println("파일이 존재하지않아 읽어올수가 없습니다.");
		
	}
}
