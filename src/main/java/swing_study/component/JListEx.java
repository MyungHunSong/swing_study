package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class JListEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private String imgPath = System.getProperty("user.dir") + File.separator + ("images") + File.separator;
	private ImageIcon[] icons = {
			new ImageIcon(imgPath + "home.jpg"),
			new ImageIcon(imgPath + "good.jpg"),
			new ImageIcon(imgPath + "wifi.jpg"),
			new ImageIcon(imgPath + "key.jpg"),
	};
	String[] fruits = new String[] {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
	private JButton btn01;
	private JList<String> strList;

	public JListEx() {
		initialize();
	}
	private void initialize() {
		setTitle("J리스트 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 10, 10));
		
		//JList<String> strList = new JList<String>(fruits);
 		
		strList = new JList(fruits);
		strList.setListData(fruits);
		contentPane.add(strList);
		
		JList<ImageIcon> list = new JList(icons);// 이미지 아이콘 이미지를 넣겟다
		contentPane.add(list);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		btn01 = new JButton("첫리스트 선택 확인");
		btn01.addActionListener(this);
		panel.add(btn01);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn01) {
			actionPerformedBtn01(e);
		}
	}
	protected void actionPerformedBtn01(ActionEvent e) {
		int idx = strList.getSelectedIndex(); //하나만 선택 하는것
		String selStr = strList.getSelectedValue(); // 값을 선택하는것
		List<String> seldedList = strList.getSelectedValuesList();
		String msg = String.format("index : %d%n selectedValue : %s%n, SelectedList : %s", idx, selStr, seldedList);
		
		JOptionPane.showMessageDialog(null, msg);
	}
}
