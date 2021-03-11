package swing_study;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import swing_study.component.FrameComponentEx;
import swing_study.component.Fruit;
import swing_study.component.JButtonEx;
import swing_study.component.JComBoBoxEx1;
import swing_study.component.JComBoBoxEx2;
import swing_study.component.JComBoBoxEx3;
import swing_study.component.JLableEx;
import swing_study.component.JLableEx2;
import swing_study.component.JListEx;
import swing_study.component.JListEx2;
import swing_study.component.JListEx3;
import swing_study.component.JRadioButtonEx;
import swing_study.component.JSliderEx;
import swing_study.component.JSpinner;
import swing_study.component.JTabbedPaneEx;
import swing_study.component.JTableEx;
import swing_study.component.JTextFieldAreaEx;
import swing_study.component.JcheckBoxCustom;
import swing_study.component.JcheckBoxEx;
import swing_study.component.Listner.IndepClassAnonymous;
import swing_study.component.Listner.IndepClassInner;
import swing_study.component.Listner.IndepClassListener;
import swing_study.component.Listner.MouseListenerEx;
import swing_study.component.menu.JMenuFrameEx;
import swing_study.component.menu.JPopUpMenuEx;
import swing_study.dlg.JFielChooserEx;
import swing_study.dlg.JOptionComfirmEx;
import swing_study.dlg.JOptionInputEx;
import swing_study.dlg.JOptionMessageEx;
import swing_study.layout.FrameLayout;
import swing_study.layout.LayoutGuBun;
import swing_study.uiframe.ContentPaneEx;

@SuppressWarnings("serial")
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
	private JPanel pCombo;
	private JButton btn12;
	private JButton btn13;
	private JButton btn14;
	private JPanel pSliderSpinner;
	private JPanel pSlider;
	private JPanel pSpinner;
	private JButton btn15;
	private JButton btn16;
	private JPanel pTabPane;
	private JButton btn17;
	private JButton btn0402;
	private JButton btn18;
	private JPanel pListner;
	private JButton btn19;
	private JButton btn20;
	private JButton btn21;
	private JButton btn22;
	private JPanel panel;
	private JButton btn24;
	private JButton btn25;
	private JPanel pJoption;
	private JButton btn26;
	private JButton btn27;
	private JButton btn28;
	private JPanel pFile;
	private JButton btn29;

	
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
		
		btn0402 = new JButton("JLable_side");
		btn0402.addActionListener(this);
		pCompenent.add(btn0402);
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
		
		pCombo = new JPanel();
		pCombo.setBorder(new TitledBorder(null, "J\uCF64\uBCF4", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pCombo);
		pCombo.setLayout(new GridLayout(0, 1, 0, 0));
		
		btn12 = new JButton("Jcombobox예1");
		btn12.addActionListener(this);
		pCombo.add(btn12);
		
		btn13 = new JButton("Jcombobox예2");
		btn13.addActionListener(this);
		pCombo.add(btn13);
		
		btn14 = new JButton("Jcombobox예3");
//		btn14.addActionListener(this);
		btn14.addMouseListener(new MouseListener() {	// JComBoBox ex3 
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("mouseReleased");
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				JComBoBoxEx3 frame = new JComBoBoxEx3();
				frame.setVisible(true);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("mouseExited");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("mouseEntered");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("mouseClicked");
				
			}
		});
		pCombo.add(btn14);
		
		pSliderSpinner = new JPanel();
		contentPane.add(pSliderSpinner);
		pSliderSpinner.setLayout(new GridLayout(0, 1, 0, 0));
		
		pSlider = new JPanel();
		pSlider.setBorder(new TitledBorder(null, "JSlider", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pSliderSpinner.add(pSlider);
		pSlider.setLayout(new BorderLayout(0, 0));
		
		btn15 = new JButton("Slider예");
		btn15.addActionListener(new MyActionListner());
		pSlider.add(btn15, BorderLayout.CENTER);
		
		pSpinner = new JPanel();
		pSpinner.setBorder(new TitledBorder(null, "JSpinner", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pSliderSpinner.add(pSpinner);
		pSpinner.setLayout(new BorderLayout(0, 0));
		
		btn16 = new JButton("Spinner예");
		btn16.addActionListener(this);
		pSpinner.add(btn16, BorderLayout.CENTER);
		
		pTabPane = new JPanel();
		pTabPane.setBorder(new TitledBorder(null, "TabPane&JTable", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pTabPane);
		
		btn17 = new JButton("텝드페인 예");
		btn17.addActionListener(this);
		pTabPane.setLayout(new GridLayout(0, 1, 0, 0));
		pTabPane.add(btn17);
		
		btn18 = new JButton("J테이블 예");
		btn18.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, e.getPoint());
				super.mouseClicked(e);
			}
			
		});
		btn18.addActionListener(this); 
		pTabPane.add(btn18);
		
		pListner = new JPanel();
		pListner.setBorder(new TitledBorder(null, "\uC774\uBCA4\uD2B8 \uB9AC\uC2A4\uB108", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pListner);
		pListner.setLayout(new GridLayout(0, 1, 0, 0));
		
		btn19 = new JButton("독립클래스");
		btn19.addActionListener(this);
		pListner.add(btn19);
		
		btn20 = new JButton("내부클래스");
		btn20.addActionListener(this);
		pListner.add(btn20);
		
		btn21 = new JButton("익명클래스");
		btn21.addActionListener(this);
		pListner.add(btn21);
		
		btn22 = new JButton("마우스 리스너");
		btn22.addActionListener(this);
		pListner.add(btn22);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "J\uB9E4\uB274&J\uD31D\uC5C5\uB9E4\uB274", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 1, 10, 10));
		
		btn24 = new JButton("메뉴바");
		btn24.addActionListener(this);
		panel.add(btn24);
		
		btn25 = new JButton("팝업매뉴");
		btn25.addActionListener(this);
		panel.add(btn25);
		
		pJoption = new JPanel();
		pJoption.setBorder(new TitledBorder(null, "J\uC635\uC158\uD328\uC778", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pJoption);
		pJoption.setLayout(new GridLayout(0, 1, 0, 0));
		
		btn26 = new JButton("InPutdig");
		btn26.addActionListener(this);
		pJoption.add(btn26);
		
		btn27 = new JButton("Comfirmdig");
		btn27.addActionListener(this);
		pJoption.add(btn27);
		
		btn28 = new JButton("messagedig");
		btn28.addActionListener(this);
		pJoption.add(btn28);
		
		pFile = new JPanel();
		pFile.setBorder(new TitledBorder(null, "JFileChooser", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pFile);
		
		btn29 = new JButton("JFileChooser");
		btn29.addActionListener(this);
		pFile.add(btn29);
	}// main done
	
	

		
	
	
	
	
	
	
	// class 를 통한 action listener
	class MyActionListner implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// JSilder
			JSliderEx frame = new JSliderEx();
			frame.setVisible(true);
			
		}
		
	}
	
	
	
	
	
	
	
	
	// JSpinner
		protected void actionPerformedBtn16(ActionEvent e) {
			JSpinner frame = new JSpinner();
			frame.setVisible(true);
		}
	
	
	
	// JTabPane
	protected void actionPerformedBtn17(ActionEvent e) {
		JTabbedPaneEx frame = new JTabbedPaneEx();
		frame.setVisible(true);
	}
	
	
	
	// JTableEx
	protected void actionPerformedBtn18(ActionEvent e) {
		JTableEx frame = new JTableEx();
		frame.setVisible(true);
	}
	
	
	
	
	

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn29) {
			actionPerformedBtn29(e);
		}
		if (e.getSource() == btn28) {
			actionPerformedBtn28(e);
		}
		if (e.getSource() == btn27) {
			actionPerformedBtn27(e);
		}
		if (e.getSource() == btn26) {
			actionPerformedBtn26(e);
		}
		if (e.getSource() == btn25) {
			actionPerformedBtn25(e);
		}
		if (e.getSource() == btn24) {
			actionPerformedBtn24(e);
		}
		if (e.getSource() == btn22) {
			actionPerformedBtn22(e);
		}
		if (e.getSource() == btn21) {
			actionPerformedBtn21(e);
		}
		if (e.getSource() == btn20) {
			actionPerformedBtn20(e);
		}
		if (e.getSource() == btn19) {
			actionPerformedBtn19(e);
		} // ActionEvent  객체 생성
		if (e.getSource() == btn18) {
			actionPerformedBtn18(e);
		}
		if (e.getSource() == btn0402) {
			actionPerformedBtn0402(e);
		}
		if (e.getSource() == btn17) {
			actionPerformedBtn17(e);
		}
		if (e.getSource() == btn16) {
			actionPerformedBtn16(e);
		}
	
		
		if (e.getSource() == btn13) {
			actionPerformedBtn13(e);
		}
		if (e.getSource() == btn12) {
			actionPerformedBtn12(e);
		}
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
	// ComBoBox ex1
	protected void actionPerformedBtn12(ActionEvent e) {
		JComBoBoxEx1 frame = new JComBoBoxEx1();
		frame.setVisible(true);
	}
	// ComBoBox ex2
	protected void actionPerformedBtn13(ActionEvent e) {
		JComBoBoxEx2 frame = new JComBoBoxEx2();
		frame.setVisible(true);
	}
	
	//JLableEx2
	protected void actionPerformedBtn0402(ActionEvent e) {
		JLableEx2 frame = new JLableEx2();
		frame.setVisible(true);
	}
	

	protected void actionPerformedBtn19(ActionEvent e) {
		IndepClassListener frame = new IndepClassListener();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn20(ActionEvent e) {
		IndepClassInner frame = new IndepClassInner();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn21(ActionEvent e) {
		IndepClassAnonymous frame = new IndepClassAnonymous();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn22(ActionEvent e) {
		MouseListenerEx frame = new MouseListenerEx();
		frame.setVisible(true);
	}
	
	// JMenu
	protected void actionPerformedBtn24(ActionEvent e) {
		JMenuFrameEx frame = new JMenuFrameEx();
		frame.setVisible(true);
	}
	
	// JPopUpMenu
	protected void actionPerformedBtn25(ActionEvent e) {
		JPopUpMenuEx frame = new JPopUpMenuEx();
	frame.setVisible(true);
	}
	protected void actionPerformedBtn26(ActionEvent e) {
		JOptionInputEx frame = new JOptionInputEx();
		frame.setVisible(true);
	}
	
	protected void actionPerformedBtn27(ActionEvent e) {
		JOptionComfirmEx frame = new JOptionComfirmEx();
		frame.setVisible(true);
	}
	
	protected void actionPerformedBtn28(ActionEvent e) {
		JOptionMessageEx frame = new JOptionMessageEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn29(ActionEvent e) {
		JFielChooserEx frame = new JFielChooserEx();
		frame.setVisible(true);
	}
	
}
