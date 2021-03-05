package swing_study;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import swing_study.component.FrameComponentEx;
import swing_study.component.Fruit;
import swing_study.component.JButtonEx;
import swing_study.component.JLableEx;
import swing_study.component.JListEx;
import swing_study.component.JListEx2;
import swing_study.component.JListEx3;
import swing_study.component.JRadioButtonEx;
import swing_study.component.JTextFieldAreaEx;
import swing_study.component.JcheckBoxCustom;
import swing_study.component.JcheckBoxEx;
import swing_study.layout.FrameLayout;
import swing_study.layout.LayoutGuBun;
import swing_study.uiframe.ContentPaneEx;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.FlowLayout;

public class SwingMain extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btn01;
	private JButton btn2;
	private JPanel pLayout;
	private JButton btnFlowLayOut;
	private JButton btnGridLayOut;
	private JButton btnAbsoluteLayout;
	private JButton btnBorderLayOut;
	private JButton btn03;
	private JPanel pCompenent;
	private JButton btn04;
	private JButton btn05;
	private JPanel pCheck;
	private JButton btn06;
	private JButton btnNewButton_1;
	private JPanel pText;
	private JButton btn08;
	private JPanel pList;
	private JButton btn09;
	private JButton btn11;
	private JButton btn10;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingMain frame = new SwingMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SwingMain() {
		initialize();
	}
	private void initialize() {
		setTitle("스윙 스터디");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 700, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 5, 10, 10));
		
		btn01 = new JButton("Jfram예");
		btn01.addActionListener(this);
		contentPane.add(btn01);
		
		btn2 = new JButton("Jfram 예");
		btn2.addActionListener(this);
		contentPane.add(btn2);
		
		pLayout = new JPanel();
		pLayout.setBorder(new TitledBorder(null, "레이아웃", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pLayout);
		pLayout.setLayout(new GridLayout(0, 1, 0, 10));
		
		btnFlowLayOut = new JButton("플로우 레이아웃");
		btnFlowLayOut.addActionListener(this);

//		btnFlowLayOut.addActionListener(e -> new FrameLayout(LayoutGuBun.FLOW));
		pLayout.add(btnFlowLayOut);
		
		btnBorderLayOut = new JButton("보더 레이아웃");
		btnBorderLayOut.addActionListener(this);
		pLayout.add(btnBorderLayOut);
		
		btnGridLayOut = new JButton("그리드 레이아웃");
		btnGridLayOut.addActionListener(this);
		pLayout.add(btnGridLayOut);
		
		btnAbsoluteLayout = new JButton("절대 레이아웃");
		btnAbsoluteLayout.addActionListener(this);
		pLayout.add(btnAbsoluteLayout);
		
		btn03 = new JButton("JComponent 공통성");
		btn03.addActionListener(this);
		contentPane.add(btn03);
		
		pCompenent = new JPanel();
		pCompenent.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "pCompenent,Jtogglebuttorn", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(pCompenent);
		pCompenent.setLayout(new GridLayout(0, 1, 0, 10));
		
		btn04 = new JButton("JLable");
		btn04.addActionListener(this);
		pCompenent.add(btn04);
		
		btn05 = new JButton("andJaintoggle");
		btn05.addActionListener(this);
		pCompenent.add(btn05);
		
		pCheck = new JPanel();
		pCheck.setBorder(new TitledBorder(null, "JCheckBox&JRadioButton", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pCheck);
		pCheck.setLayout(new GridLayout(0, 1, 0, 0));
		
		btn06 = new JButton("체크박스 예제");
		btn06.addActionListener(this);
		pCheck.add(btn06);
		
		btnNewButton_1 = new JButton("래디오버튼예");
		btnNewButton_1.addActionListener(this);
		pCheck.add(btnNewButton_1);
		
		pText = new JPanel();
		pText.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\uD14D\uC2A4\uD2B8 \uD544\uB4DC", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(pText);
		
		btn08 = new JButton("JTextFieldEx");
		btn08.addActionListener(this);
		pText.add(btn08);
		
		pList = new JPanel();
		pList.setBorder(new TitledBorder(null, "Jlist", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pList);
		pList.setLayout(new GridLayout(0, 1, 0, 0));
		
		btn09 = new JButton("JList1");
		btn09.addActionListener(this);
		pList.add(btn09);
		
		btn10 = new JButton("JList2");
		btn10.addActionListener(this);
		pList.add(btn10);
		
		btn11 = new JButton("JList3");
		btn11.addActionListener(this);
		pList.add(btn11);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn11) {
			actionPerformedBtn11(e);
		}
		if (e.getSource() == btn10) {
			actionPerformedBtn10(e);
		}
		if (e.getSource() == btn09) {
			actionPerformedBtn09(e);
		}
		if (e.getSource() == btn08) {
			actionPerformedBtn08(e);
		}
		if (e.getSource() == btnNewButton_1) {
			actionPerformedBtnNewButton_1(e);
		}
		if (e.getSource() == btn06) {
			actionPerformedBtnNewButton(e);
		}
		if (e.getSource() == btn05) {
			actionPerformedBtn05(e);
		}
		if (e.getSource() == btn04) {
			actionPerformedBtn04(e);
		}
		if (e.getSource() == btn03) {
			actionPerformedBtn03(e);
		}
		if (e.getSource() == btnAbsoluteLayout) {
			actionPerformedBtnAbsoluteLayout(e);
		}
		if (e.getSource() == btnGridLayOut) {
			actionPerformedBtnGridLayOut(e);
		}
		if (e.getSource() == btnBorderLayOut) {
			actionPerformedBtnBorderLayOut(e);
		}
		if (e.getSource() == btnFlowLayOut) {
			actionPerformedBtnFlowLayOut(e);
		}
		if (e.getSource() == btn2) {
			actionPerformedBtn2(e);
		}
		if (e.getSource() == btn01) {
			actionPerformedBtn01(e);
		}
	}
	protected void actionPerformedBtn01(ActionEvent e) {
		ContentPaneEx frame = new ContentPaneEx();
		frame.setVisible(true);
	}
	
	
	protected void actionPerformedBtn2(ActionEvent e) {
		JpanerEx frame = new JpanerEx();
		frame.setVisible(true);
	}
	
	
	
	protected void actionPerformedBtnFlowLayOut(ActionEvent e) {
		FrameLayout frame = new FrameLayout(LayoutGuBun.FLOW);
		frame.setVisible(true);
	}
	
	
	
	protected void actionPerformedBtnBorderLayOut(ActionEvent e) {
		FrameLayout frame = new FrameLayout(LayoutGuBun.BORDER);
		frame.setVisible(true);
	}
	
	
	
	protected void actionPerformedBtnGridLayOut(ActionEvent e) {
		FrameLayout frame = new FrameLayout(LayoutGuBun.GRID);
		frame.setVisible(true);
	}
	
	
	protected void actionPerformedBtnAbsoluteLayout(ActionEvent e) {
		FrameLayout frame = new FrameLayout(LayoutGuBun.ABSOLUTE);
		frame.setVisible(true);
	}
	
	
	//Btn03
	protected void actionPerformedBtn03(ActionEvent e) {
		FrameComponentEx frame = new FrameComponentEx();
		frame.setVisible(true);
	}
	
	
	//Btn04
	protected void actionPerformedBtn04(ActionEvent e) {
		JLableEx frame = new JLableEx();
		frame.setVisible(true);
	}
	
	
	// Btn05
	protected void actionPerformedBtn05(ActionEvent e) {
		JButtonEx frame = new JButtonEx();
		frame.setVisible(true);
	}
	
	
	// actionPerformedBtnNewButton
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		
		
		
		
		
		
		
		JcheckBoxEx frame = new JcheckBoxEx();
		frame.setVisible(true);
		
		ArrayList<Fruit> list = new ArrayList<Fruit>();
		list.add(new Fruit("사과", 100));
		list.add(new Fruit("배", 500));
		list.add(new Fruit("체리", 20000));
		list.add(new Fruit("바나나", 1000));
		
		JcheckBoxCustom frame1 = new JcheckBoxCustom(list);
		frame1.setVisible(true);
	}
	protected void actionPerformedBtnNewButton_1(ActionEvent e) {
		JRadioButtonEx frame = new JRadioButtonEx();
		frame.setVisible(true);
	}
	
	
	
	
	protected void actionPerformedBtn08(ActionEvent e) {
		JTextFieldAreaEx frame = new JTextFieldAreaEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn09(ActionEvent e) {
		JListEx frame = new JListEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn10(ActionEvent e) {
		JListEx2 frame = new JListEx2();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn11(ActionEvent e) {
		JListEx3 frame = new JListEx3();
		frame.setVisible(true);
	}
}
