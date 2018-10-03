package kr.kis.data;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	private String name, phon;	
	private int id;
	String str_date;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhon() {
		return phon;
	}

	public void setPhon(String phon) {
		this.phon = phon;
	}

	public Person(String name , String phon, int id) {
		this.name = name;
		this.phon = phon;
		this.id = id;
		
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd.hh:mm:ss");
		this.str_date = dateFormat.format(date);
	}
	
	public Person(String id, String name, String phon, String date) {
		this.name = name;
		this.phon = phon;
		this.id = Integer.parseInt(id);
		this.str_date = date;
	}
	
	@Override
	public String toString() {
		return "회원 번호:" +(id)+ " 이름:"+getName()+" 전화번호:"+getPhon()+" date:"+ str_date;
	}
	
	public String saveFormat() {
		return id+","+getName()+","+getPhon()+","+str_date;
	}
	//시간 포맷 예제
	//http://everlikemorning.tistory.com/entry/SimpleDateFormat-%ED%8C%A8%ED%84%B4%EB%B0%8F-%EC%82%AC%EC%9A%A9%EC%98%88%EC%A0%9C
}
