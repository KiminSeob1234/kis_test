package kr.kis.gui;

import java.awt.BorderLayout;
import java.awt.Button;

import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

import kr.kis.Enum.DiaOK;
import kr.kis.ui.UiInfo;

public class GuiAddMember extends JPanel implements ActionListener{
	/**
	 * 181906 새로운 인원 추가.
	 */
	private static final long serialVersionUID = 1L;
	public final String Name = "NewMember";
	
	private boolean boolLogin;
	Button btnOK, btnLogin;
	TextField tName, tPhonNumber;
	Label lbName, lbPhon;
	JPanel pnTop, pnMid, pnBot;
	JTextField tfName, tfPhon;
	
	Timer timer = new Timer(500, new ActionListener() { //반복 체크로  login 상태에 따라서 
		
		@Override
		public void actionPerformed(ActionEvent e) {
		
			btnOK.setEnabled(boolLogin);
			tfName.setEnabled(boolLogin);
			tfPhon.setEnabled(boolLogin);
		}
	});
	
	GuiAddMember() {
		boolLogin = false;
		setLayout( new BorderLayout(10,10) );
		btnOK = new Button("OK");
		btnOK.addActionListener(this);
		//btnOK.setBounds(3, 1, 8, 5);
		btnLogin = new Button("Login");
		btnLogin.addActionListener(this);
		
		lbName = new Label("Name :");
		lbPhon = new Label("Phon :");
		
		tfName = new JTextField(10);
		tfName.setText("Input Name");
		tfPhon = new JTextField(10);
		tfPhon.setText("Input Phon Number");
		
		pnTop = new JPanel();
		pnMid = new JPanel();
		pnBot = new JPanel();
		
		pnTop.add(lbName);
		pnTop.add(tfName);
		
		pnMid.add(lbPhon);
		pnMid.add(tfPhon);
		
		pnBot.add(btnOK);
		pnBot.add(btnLogin);
		
		add(pnTop,BorderLayout.NORTH);
		add(pnMid,BorderLayout.CENTER);
		add(pnBot,BorderLayout.SOUTH);
		
		timer.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {

		Object obj = arg0.getSource();
		
		if(obj == btnOK) {
			GuiMain.lbLog.setText(Name +" ButtonOK");
			if(mDialog("Add Member?", "new Member Create") == DiaOK.OK) {
				UiInfo list = new UiInfo();
				list.newPerson(tfName.getText(), tfPhon.getText());
				GuiMain.lbLog.setText(Name +" Member Add OK");
			}
			else GuiMain.lbLog.setText(Name +" Member Add CANCEL");
		}
		else if(obj == btnLogin) {
			
			if(boolLogin) boolLogin = false;
			else boolLogin = true;
			GuiMain.lbLog.setText(Name +" ButtonLogin State:"+boolLogin);
		}
		
	}
	
	public DiaOK mDialog(String message, String title) {
		int v = JOptionPane.showConfirmDialog(null , message, title, JOptionPane.YES_NO_OPTION);
		
		DiaOK ok = DiaOK.CANCEL;
		
		switch(v) {
			case 0:
				ok = DiaOK.OK;
				break;
			case 1:
				ok = DiaOK.CANCEL;
				break;
		}
	
		return ok;
	}
}
