package kr.kis.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class GuiOption extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	public final String Name = "OptionMB";
	Button btnSave, btnDel;
	
	GuiOption() {
		setLayout(new BorderLayout(10, 10));
		
		btnSave = new Button("DATA SAVE");
		btnSave.setSize(40,40);
		btnSave.addActionListener(this);
		btnDel =new Button("Member Delete");
		btnDel.addActionListener(this);
		btnDel.setSize(40,40);
		
		add(btnSave, BorderLayout.NORTH);
		add(btnDel,BorderLayout.CENTER);
		
	}	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
