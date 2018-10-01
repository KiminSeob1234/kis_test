package kr.kis.gui;

import java.util.Scanner;

import kr.kis.data.dataSaveCsv;
import kr.kis.main.*;

public class PersonSystem {
	private final int MaxPersonCount = 150;
	
	public void Run() 
	{
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		Listinfo listMenu = new Listinfo();
		
		while(run)
		{	
			System.out.println("1.회원등록 2.회원정보 3.회원정보삭제 4.회원정보수정 7.정보저장 9.종료");
			System.out.print("입력>");
			int num = scan.nextInt();
			
			switch(num)
			{
				case 1:
				{
					if(Main.perlist.size() < MaxPersonCount) listMenu.newPerson();
					else System.out.println("등록 가능 인원 Full. 등록 불가.");
				}
				break;
				case 2:
				{
					if(Main.perlist.size() > 0)
					{
						listMenu.listInfo();
					}
					else System.out.println("회원 정보가 없습니다.");
				}
				break;
				case 3:
				{
					listMenu.listInfo();
					
					System.out.print("삭제할 id를 입력해 주세요.>");
					int id = scan.nextInt();
					boolean del = listMenu.delPerson(id);
					
					if(del)System.out.println("삭제완료.");
					else System.out.println("삭제 불가.");
					
				}
				break;
				case 4:
				{
					
				}
				break;
				case 7:
				{
					System.out.println("저장하시겠습니까? >");
					if(scan.nextInt()== 1) {
						dataSaveCsv save = new dataSaveCsv();
						boolean fl = save.dataSave();
						
						if(fl)System.out.println("저장 성공");
						else System.out.println("저장 실패.");
					}
					else System.out.println("취소.");
				}
				break;
				case 9:
				{
					run = false;
				}
				break;
				default:
				{
					System.out.println("잘못된 번호.");
				}
				break;
			}
		}
		System.out.println("프로그램 종료");
		scan.close();
	}
}
