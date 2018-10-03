package kr.kis.ui;

import java.util.Scanner;

import kr.kis.data.Person;
import kr.kis.main.Main;

public class UiInfo {
	private Scanner str_scan = new Scanner(System.in);
	
	public void newPerson(String name, String phon) {
		int id = getNewPersonId();
		
		Person temp = new Person(name, phon, id);
		Main.perlist.add(temp);
	}
	
	//member Create
	public void newPerson() {

		System.out.print("이름:");
		String name = str_scan.nextLine();
		System.out.print("전화번호");
		String phon = str_scan.nextLine();
		int id = getNewPersonId();
		
		Person temp = new Person(name, phon, id);
		Main.perlist.add(temp);
	}
	
	//Get Member Id
	public int getNewPersonId() {
		int id = 0;
		boolean Ok = true;
		while(Ok){
			boolean IdSerchOk = true;
			
			for(Person temp : Main.perlist){
				if(temp.getId() == id)
				{
					IdSerchOk = false;
					break;
				}
			}
			
			if(IdSerchOk)break;
			else id ++;
		}
		System.out.println("고객 신규 아이디 :" + id);
		return id;
	}
	
	//Delete Member
	public boolean delPerson(int id) {
		boolean Ok = false;
		boolean del = false;
		
		System.out.println("삭제하시겠습니까?");
		System.out.print("1.Y 2.N >");
		if(str_scan.nextLine().equals("1")) {
			del = true;
		}
		
		if(del) {
			for(int i=0; i<Main.perlist.size(); i++){
				Person temp = Main.perlist.get(i);
				if(temp.getId() == id){
					Main.perlist.remove(i);
					Ok = true;
				}
			}
		}
		else System.out.println("취소");
		
		return Ok;
	}
	
	//Output MemberList
	public void listInfo() { 
		
		for(int i=0; i<Main.perlist.size(); i++){
			Person temp = Main.perlist.get(i);
			System.out.println(temp);
		}
	}
}
