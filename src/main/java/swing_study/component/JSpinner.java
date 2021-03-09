package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;
import java.util.Date;
import java.util.Calendar;

public class JSpinner extends JFrame {

	private JPanel contentPane;

	
	

	
	public JSpinner() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(null, "SpinnerBro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pList = new JPanel();
		contentPane.add(pList);
		pList.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		javax.swing.JSpinner spinner1 = new javax.swing.JSpinner();
		spinner1.setModel(new SpinnerListModel(new String[] {"소설", "잡지", "전공서적", "취미"}));
		pList.add(spinner1);
		
		JPanel pNum = new JPanel();
		contentPane.add(pNum);
		
		javax.swing.JSpinner spinner2 = new javax.swing.JSpinner();
		spinner2.setModel(new SpinnerListModel(new String[] {"1", "-10", "10", "1"}));
		pNum.add(spinner2);
		
		JPanel pDate = new JPanel();
		contentPane.add(pDate);
		
		javax.swing.JSpinner spinner3 = new javax.swing.JSpinner();
		Calendar cal = Calendar.getInstance();
		Date value= cal.getTime();
		
		cal.add(Calendar.YEAR, -50);
		Date start = cal.getTime();
		
		cal.add(Calendar.YEAR, 50);
		Date end = cal.getTime();
		
		spinner3.setModel(new SpinnerDateModel(value, start, end, Calendar.YEAR));
		spinner3.setEditor(new javax.swing.JSpinner.DateEditor(spinner3, "yyyy/MM/dd"));
		pDate.add(spinner3);
		add(pDate);
		setVisible(true);
	}
}
