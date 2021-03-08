package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.io.File;
import java.awt.event.ActionEvent;

public class JComBoBoxEx2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JComboBox<String> Cmb1;
	private JLabel lblImg;
	private String imgPath = System.getProperty("user.dir") + File.separator + ("images") + File.separator;
	private ImageIcon[] icons = { new ImageIcon(imgPath + "Apple.jpg"),
								new ImageIcon(imgPath + "Pear.jpg"),
								new ImageIcon(imgPath + "Cherry.jpg"),
								};
	
	
	private String[] fruits;

	public JComBoBoxEx2() {
		initialize();
		
		addDateCmb1();
	}

	private void addDateCmb1() {
		String[] fruits = {"Apple", "Pear","Cherry"};
		for(String f : fruits) {
			Cmb1.addItem(f);
		}
		
	}

	private void initialize() {
		setTitle("JComboBox 이벤트예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		Cmb1 = new JComboBox<>();
		Cmb1.setModel(new DefaultComboBoxModel<String>(fruits));
		Cmb1.addActionListener(this);
		
		contentPane.add(Cmb1, BorderLayout.NORTH);

		lblImg = new JLabel("");
		lblImg.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblImg, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Cmb1) {
			actionPerformedCmb1(e);
		}
	}

	protected void actionPerformedCmb1(ActionEvent e) {
		
	}
}
