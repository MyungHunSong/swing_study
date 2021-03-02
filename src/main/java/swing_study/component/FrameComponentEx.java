package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

public class FrameComponentEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btn2;
	private JButton btn3;
	private JButton btn1;
	private JButton btn_1;

	public static void main(String[] args) {
		
	}

	public FrameComponentEx() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		btn1 = createBtn();
		contentPane.add(btn1);
		
		 btn2 = new JButton("Disabled Button");
		 btn2.addActionListener(this);
		btn2.setEnabled(false);
		contentPane.add(btn2);
		
		btn3 = new JButton("getX(),getY()");
		btn3.addActionListener(this);
		contentPane.add(btn3);

		
	}

	private JButton createBtn() {
		btn_1 = new JButton("Magenta/Yellow Button");
		btn_1.addActionListener(this);
		btn_1.setForeground(Color.MAGENTA);
		btn_1.setFont(new Font("Arial", Font.ITALIC, 20));
		btn_1.setBackground(Color.YELLOW);
		return btn_1;
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn_1) {
			actionPerformedBtn(e);
		}
		if (e.getSource() == btn2) {
			actionPerformedBtn2(e);
		}
		if (e.getSource() == btn3) {
			actionPerformedBtn3(e);
		}
	}
	protected void actionPerformedBtn3(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		FrameComponentEx parent = (FrameComponentEx) btn.getTopLevelAncestor();
		parent.setTitle(btn.getX() + ", " + btn.getY());
		
		
		if(btn2.isEnabled()) {
			btn2.setEnabled(false);
			
		}else {
			btn2.setEnabled(true);
		}
		
	}
	protected void actionPerformedBtn2(ActionEvent e) {
		if(btn1 != null) {
			contentPane.remove(btn1); // 콘텐ㅌ퉅투퉅트ㅡ 페인에 있는 btn1 
			btn1 = null;
			revalidate(); // 삭제됫을시 새로 그려야 됄꺼 아닌가? 변경된 내용으로 교체 해줘야 하니까 이걸 쓰는 거다
			
			
		}else {
			
			btn1 = createBtn();
			contentPane.add(btn1, 0);
			revalidate();
		}
			
	
		
	}
	protected void actionPerformedBtn(ActionEvent e) {
		if(btn3.isVisible()) {
			btn3.setVisible(false);
		}else {
			btn3.setVisible(true);
		}
	}
}
