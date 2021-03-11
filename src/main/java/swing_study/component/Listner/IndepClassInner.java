package swing_study.component.Listner;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class IndepClassInner extends JFrame {

	private JPanel contentPane;

	


	
	public IndepClassInner() {
		initialize();
	}
	private void initialize() {
		setTitle("독릭클래스");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		contentPane.add(btn, BorderLayout.CENTER);
	}
	
	
	class MyActionListener implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			System.out.println(e);
			JButton btn = (JButton) e.getSource();
			
			if(e.getActionCommand().equals("Action")) { // 겟 액션 코맨드를 통해 액션과 비교를한다.
				
				btn.setText("액션");
			}else {
				btn.setText("Action");
			}
			
		}
		
	}

}




