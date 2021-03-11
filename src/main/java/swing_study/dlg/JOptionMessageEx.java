package swing_study.dlg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class JOptionMessageEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btn;

	


	public JOptionMessageEx() {
		initialize();
	}
	private void initialize() {
		setTitle("메세즤");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblRes = new JLabel("");
		contentPane.add(lblRes);
		
		btn = new JButton("쇼맨메세지");
		btn.addActionListener(this);
		contentPane.add(btn);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn) {
			actionPerformedBtn(e);
		}
	}
	protected void actionPerformedBtn(ActionEvent e) {
		
		String imgPath = System.getProperty("user.dir") + File.separator + "images" + File.separator;
		ImageIcon icon3 = new ImageIcon(imgPath + "common (1).jpg");
		
		JOptionPane.showMessageDialog(null, "나다 10새끼야", "누구냐?", JOptionPane.WARNING_MESSAGE, icon3 );
	}
}
