package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.JScrollPane;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class JListEx2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tfValue;
	private JList nameList;
	private ArrayList<String> stdList = new ArrayList<>();
	private JList nameList2;
	


	public JListEx2() {
		stdList.add("김인환");
		stdList.add("이태훈");
		stdList.add("김상건");
		stdList.add("전수린");
		
		initialize();
	}
	private void initialize() {
		setTitle("실시간 추가 예");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pNorth = new JPanel();
		contentPane.add(pNorth, BorderLayout.NORTH);
		
		JLabel lblTitle = new JLabel("입력후 엔터키");
		lblTitle.setToolTipText("");
		pNorth.add(lblTitle);
		
		tfValue = new JTextField();
		tfValue.addActionListener(this);
		pNorth.add(tfValue);
		tfValue.setColumns(10);
		
		JPanel pList = new JPanel();
		pList.setBorder(new EmptyBorder(0, 100, 0, 100));
		contentPane.add(pList, BorderLayout.CENTER);
		pList.setLayout(new GridLayout(0, 2, 10, 10));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		pList.add(scrollPane_1);
		
	
		nameList = new JList<>();
		nameList.setListData(new Vector<String>(stdList));
		nameList.setFixedCellWidth(100);
		nameList.setVisibleRowCount(5);
		scrollPane_1.setViewportView(nameList);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		pList.add(scrollPane_2);
		
		nameList2 = new JList();
		nameList2.setModel(getModel(stdList));//모델을 갖고 와서 여기다 넣으럮다
		scrollPane_2.setViewportView(nameList2);
	}

	
	private ListModel<String> getModel(List<String> stdList) {
		DefaultListModel<String> model = new DefaultListModel<String>(); 
		//내가 원하는 리스트를 보여줘~
		for(String e : stdList) {
			model.addElement(e);
		}
		return model;
	}
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tfValue) {
			actionPerformedTfValue(e);
		}
	}
	
	
	
	
	protected void actionPerformedTfValue(ActionEvent e) {
		String value = tfValue.getText().trim();
		//JOptionPane.showMessageDialog(null, value);
		
		stdList.add(value);
		
		nameList.setListData(new Vector<String>(stdList));
		tfValue.setText("");
		tfValue.requestFocus();
		
		DefaultListModel<String> model = (DefaultListModel<String>) nameList2.getModel();
		model.addElement(value);
	}
	
}
