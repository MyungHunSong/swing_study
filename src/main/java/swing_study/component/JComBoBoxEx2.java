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
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;

@SuppressWarnings("serial")
public class JComBoBoxEx2 extends JFrame implements ActionListener{

	private JPanel pNorth;
	private JComboBox<String> Cmb1;
	private JLabel lblImg;
	private String imgPath = System.getProperty("user.dir") + File.separator + ("images") + File.separator;
	
	private Map<String, ImageIcon> map = new HashMap<String, ImageIcon>();
	
	
	private ImageIcon[] icons = { new ImageIcon(imgPath + "Apple.jpg"),
								new ImageIcon(imgPath + "Pear.jpg"),
								new ImageIcon(imgPath + "Cherry.jpg"),
								};
	
	
	private String[] fruits = {"Apple", "Pear", "Cherry"};

	public JComBoBoxEx2() {
		
		for(int i = 0; i<fruits.length; i++) {
			map.put(fruits[i], icons[i]); // 요것이 HashMap의 키와 밸류를 넣어 주는것 이다.
		}
		initialize();
		//addDateCmb1();
	}


	private void initialize() {
		setTitle("JComboBox 이벤트예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		pNorth = new JPanel();
		pNorth.setBorder(new EmptyBorder(5, 5, 5, 5));
		pNorth.setLayout(new BorderLayout(0, 0));
		setContentPane(pNorth);

		Cmb1 = new JComboBox<>();
		Cmb1.setModel(new DefaultComboBoxModel<String>(fruits));
		Cmb1.setSelectedIndex(-1); // 초기화 하는법
		Cmb1.addActionListener(this);
		pNorth.add(Cmb1, BorderLayout.NORTH);

		lblImg = new JLabel("");
		lblImg.setHorizontalAlignment(SwingConstants.CENTER);
		pNorth.add(lblImg, BorderLayout.CENTER);
	}
	// ---- hashMap 으로 찾아주기
	
	
	
//	private void addDateCmb1() {
//		String[] fruits = {"Apple", "Pear","Cherry"};
//		for(String f : fruits) {
//			Cmb1.addItem(f);
//		}
//		
//	}

	

//	public void actionPerformed(ActionEvent e) {
//		if (e.getSource() == Cmb1) {
//			actionPerformedCmb1(e);
//		}
//	}
//	
//	protected void actionPerformedCmb1(ActionEvent e) {
//		JComboBox<String> f = (JComboBox<String>) e.getSource(); // f ㅇ[디기 
//		int idx = f.getSelectedIndex(); // 요쪽이 이제 jBox 에잇는 친구들을 getSelectedIndex로 돌린다
//		String toGet = Cmb1.getItemAt(idx); // Cmb1.getItemAt(idx) 는 toGet에다가 넣어주는것
//		
//		switch(toGet) { // toGet으로 받아 왓으니까 이게 실행가능한거다
//		case "Apple":
//			lblImg.setIcon(icons[0]);
//			break;
//		case "Pear":
//			lblImg.setIcon(icons[1]);
//			break;
//		case "Cherry":
//			lblImg.setIcon(icons[2]);
//			break;
//		}
//	}
	
	// ---------- 선생님이 한것 HashMap() ---------
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Cmb1) {
			actionPerformedCmb1(e);
		}
	}
	protected void actionPerformedCmb1(ActionEvent e) {
		Object obj = Cmb1.getSelectedItem();
		
		lblImg.setIcon(map.get(obj));
	}
}
