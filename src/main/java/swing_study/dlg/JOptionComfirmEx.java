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
import java.awt.Font;

@SuppressWarnings("serial")
public class JOptionComfirmEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JLabel lblRes;

	
	
	public JOptionComfirmEx() {
		initialize();
	}
	private void initialize() {
		setTitle("콘필맨");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblRes = new JLabel("");
		lblRes.setFont(new Font("궁서체", Font.PLAIN, 20));
		contentPane.add(lblRes);
		
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(this);
		contentPane.add(btnNewButton);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		
		String imgPath = System.getProperty("user.dir") + File.separator + "images" + File.separator;
		ImageIcon icon2 = new ImageIcon(imgPath + "good.jpg");
		
		
		int res = JOptionPane.showConfirmDialog(
				null,
				"계속 할것인가?",
				"confirm",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.WARNING_MESSAGE,
				icon2);
		
		
		
		
		if(res == JOptionPane.YES_OPTION) {
			lblRes.setText("야스!");
		}
		if(res == JOptionPane.NO_OPTION) {
			lblRes.setText("노");
		}
		if(res == JOptionPane.CANCEL_OPTION) {
			lblRes.setText("돌아가라");
		}
		System.out.println(res);
		
		//ERROR_MESSAGE
		//INFORMATION_MESSAGE	
		//WARNING_MESSAGE
		//QUESTION_MESSAGE
		//PLAIN_MESSAGE
	}
}
