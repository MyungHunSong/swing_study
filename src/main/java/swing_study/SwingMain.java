package swing_study;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import swing_study.component.FrameComponentEx;
import swing_study.layout.FrameLayout;
import swing_study.layout.LayoutGuBun;
import swing_study.uiframe.ContentPaneEx;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.BoxLayout;

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
		setBounds(10, 10, 700, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 10, 10));
		
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
	}

	public void actionPerformed(ActionEvent e) {
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
	protected void actionPerformedBtn03(ActionEvent e) {
		FrameComponentEx frame = new FrameComponentEx();
		frame.setVisible(true);
	}
}
