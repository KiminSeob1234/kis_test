package kr.kis.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

import kr.kis.Enum.mSearch;

public class GuiInfo extends JPanel implements ActionListener{
	/**
	 * 맴버 정보 열람 및 정보 수정.
	 */
	private static final long serialVersionUID = 1L;
	public final String Name = "info Member";
	JTextField tfSearch;
	JComboBox<mSearch> cbOption;
	JPanel pnOption, pnSearch;
	Button btnOK;
	Label lb1;
	
	GuiInfo() {
		setLayout( new BorderLayout(5,10) );
		pnOption = new JPanel();
		pnSearch = new JPanel();
		
		lb1 = new Label("Search:");
		cbOption = new JComboBox<mSearch>();
		cbOption.addItem(mSearch.ID);
		cbOption.addItem(mSearch.Name);
		
		tfSearch = new JTextField(7);
		btnOK = new Button("OK");
		btnOK.addActionListener(this);
		
		pnSearch.add(lb1);
		pnSearch.add(tfSearch);
		
		pnOption.add(cbOption);
		pnOption.add(btnOK);
		
		add(pnSearch,BorderLayout.NORTH);
		add(pnOption,BorderLayout.CENTER);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object obj = arg0.getSource();
		
		if(obj == btnOK) {
			//정보 관련 버튼 내용 추가
		}
	}

}
