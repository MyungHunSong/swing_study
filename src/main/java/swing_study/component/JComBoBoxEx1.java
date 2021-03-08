package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import javax.swing.border.TitledBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JComBoBoxEx1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JComboBox<String> Cmb1;
	private JComboBox<String> Cmb2;
	private JComboBox<String> Cmb3;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;

	public JComBoBoxEx1() {
		initialize();

		addDatecnCmb1();
		addDatecnCmb2();
		addDatecnCmb3();
	}
	
	//Cmb3
	private void addDatecnCmb3() {
		List <String> fruits = Arrays.asList( "apple", "banna", "kiwi", "mango", 
					"pear", "peach", "berry", "strawberry", "blackberry" );
		
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(new Vector<>(fruits));
		
		Cmb3.setModel(model);
	}

	// Cmb2
	private void addDatecnCmb2() {
		String[] fruits = { "apple", "banna", "kiwi", "mango", "pear",
				"peach", "berry", "strawberry", "blackberry" };
		
		DefaultComboBoxModel<String> cbm = (DefaultComboBoxModel<String>)Cmb2.getModel();
		
		for(String f : fruits) {
					cbm.addElement(f);
				}
				
	}

	// Cmb1
	private void addDatecnCmb1() {
		String[] fruits = { "apple", "banna", "kiwi", "mango", "pear",
					"peach", "berry", "strawberry", "blackberry" };

		for (String f : fruits) {
			Cmb1.addItem(f);
		}

	}

	private void initialize() {
		setTitle("JComboBox 기본예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 10, 10));

		JPanel pCmb1 = new JPanel();
		pCmb1.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.add(pCmb1);

		Cmb1 = new JComboBox<>();
		pCmb1.add(Cmb1);
		
		tf1 = new JTextField();
		tf1.addActionListener(this);
		pCmb1.add(tf1);
		tf1.setColumns(10);

		JPanel pCmb2 = new JPanel();
		contentPane.add(pCmb2);

		Cmb2 = new JComboBox<>();
		pCmb2.add(Cmb2);
		
		tf2 = new JTextField();
		tf2.addActionListener(this);
		pCmb2.add(tf2);
		tf2.setColumns(10);

		JPanel pCmb3 = new JPanel();
		contentPane.add(pCmb3);

		Cmb3 = new JComboBox<>();
		pCmb3.add(Cmb3);
		
		tf3 = new JTextField();
		tf3.addActionListener(this);
		pCmb3.add(tf3);
		tf3.setColumns(10);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tf3) {
			actionPerformedTf3(e);
		}
		if (e.getSource() == tf1) {
			actionPerformedTf1(e);
		}
		if (e.getSource() == tf2) {
			actionPerformedTf2(e);
		}
	}
	
	// Tf1
	protected void actionPerformedTf1(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "tf1");
		String item = tf1.getText().trim();
		Cmb1.addItem(item);
		tf1.setText("");
	}
	
	
	// Tf2
	protected void actionPerformedTf2(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "tf2");
		String item = tf2.getText().trim();
		Cmb2.addItem(item);
		tf2.setText("");
	}
	
	// Tf3
	protected void actionPerformedTf3(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "tf3");
		String item = tf3.getText().trim();
		DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) Cmb3.getModel();
		model.addElement(item);
		tf3.setText("");
	}
}
