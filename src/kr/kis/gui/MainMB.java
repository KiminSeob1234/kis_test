package kr.kis.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainMB extends JFrame implements ActionListener{
	/**
	 * 180906 전체적인 System UI 표시 GUI 메인격.
	 * 1.회원등록 2.회원정보 3.회원정보삭제 4.회원정보수정 7.정보저장 9.종료
	 */
	private static final long serialVersionUID = 1L;
	final static String Name = "MemberSystem";
	public static Label lbLog = new Label("Log");
	JPanel pnAll, pnMenu,pnTitle;
	JTabbedPane tpTab;
	newMB nMB;
	infoMB iMB;
	optionMB oMB;
	Label lbTitle;
	
	
	
	public MainMB(){
		
		super(Name);
		this.setSize(400,400);
		//setLayout(new BorderLayout(30,10));
		
		nMB = new newMB();
		iMB = new infoMB();
		oMB = new optionMB();
		pnTitle = new JPanel();
		pnMenu = new JPanel();
		pnAll = new JPanel();
		lbTitle  = new Label(Name);
		tpTab = new JTabbedPane();
		
		tpTab.setSize(380,200);
		tpTab.addTab("맴버정보", iMB);
		tpTab.addTab("신규등록", nMB);
		tpTab.addTab("옵션", oMB);
		pnTitle.add(lbTitle);
		pnMenu.add(tpTab);
		
		Dimension max_Dms = new Dimension(380,380);
		
		pnAll.setLayout(new BorderLayout(30,10));
		pnAll.setMaximumSize(max_Dms);
		pnAll.add(pnTitle,BorderLayout.NORTH);
		pnAll.add(pnMenu,BorderLayout.CENTER);
		pnAll.add(lbLog, BorderLayout.SOUTH);
		
		this.add(pnAll);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
