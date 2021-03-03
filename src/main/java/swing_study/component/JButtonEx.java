package swing_study.component;

import java.awt.BorderLayout;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

@SuppressWarnings("serial")
public class JButtonEx extends JFrame implements ActionListener {
	
	private String imgPath = System.getProperty("user.dir" + File.separator + "images" + File.separator);
	
	
	private JPanel ContentPane;
	private MyButton btn03;
	private JToggleButton tglBtn;

	
	public JButtonEx() {
		
		initialize();
	}
	private void initialize() {
		setTitle("JButton예제&토글");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 515);
		ContentPane = new JPanel();
		ContentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		ContentPane.setLayout(new BorderLayout(0, 0));
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
		
		JPanel pTop = new JPanel();
		getContentPane().add(pTop);
		pTop.setLayout(new BoxLayout(pTop, BoxLayout.Y_AXIS));
		
		javax.swing.JButton btn1 = new javax.swing.JButton("전화해");
		btn1.setIcon(new ImageIcon("C:\\workspace_java\\swing_study\\images\\Call1.jpg"));
		btn1.setPressedIcon(new ImageIcon("C:\\workspace_java\\swing_study\\images\\Call2.jpg"));		
		btn1.setRolloverIcon(new ImageIcon("C:\\workspace_java\\swing_study\\images\\Call3.jpg"));
		pTop.add(btn1);
		
		tglBtn = new JToggleButton("토글맨");
		tglBtn.addActionListener(this);
		tglBtn.setHorizontalAlignment(SwingConstants.LEFT);
		pTop.add(tglBtn);
		
		JPanel pRight1 = new JPanel();
		getContentPane().add(pRight1);
		pRight1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "\uC804\uD654\uC774\uBBF8\uC9C0", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pRight1.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		MyButton btnNewButton = new MyButton();
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setText("Left");
		panel_2.add(btnNewButton);
		
		MyButton btnNewButton_1 = new MyButton();
		btnNewButton_1.setText("Center");
		panel_2.add(btnNewButton_1);
		
		MyButton btnNewButton_2 = new MyButton();
		btnNewButton_2.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton_2.setText("right");
		panel_2.add(btnNewButton_2);
		
		JPanel pRight2 = new JPanel();
		pRight1.add(pRight2);
		
		btn03 = new MyButton();
		btn03.setVerticalAlignment(SwingConstants.TOP);
		btn03.setHorizontalAlignment(SwingConstants.LEADING);
		btn03.addActionListener(this);
		pRight2.setLayout(new GridLayout(0, 3, 0, 0));
		pRight2.add(btn03);
		
		MyButton btn04 = new MyButton();
		pRight2.add(btn04);
		
		MyButton btn05 = new MyButton();
		btn05.setVerticalAlignment(SwingConstants.BOTTOM);
		pRight2.add(btn05);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tglBtn) {
			actionPerformedTglBtn(e);
		}
		if (e.getSource() == btn03) {
			actionPerformedBtn03(e);
		}
	}
	protected void actionPerformedBtn03(ActionEvent e) {
		
	}
	protected void actionPerformedTglBtn(ActionEvent e) {
		if(tglBtn.isSelected()) {
			tglBtn.setText("눌럿네");
		}else {
			tglBtn.setText("눌러봐");
		}
	}
}
