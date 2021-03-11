package swing_study.component.Listner;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class MouseListenerEx extends JFrame {

	private JPanel contentPane;
	private JLabel lblLa;
	
	
	
	
	public MouseListenerEx() {
		initialize();
	}
	private void initialize() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
	
		lblLa = new JLabel("Go To Hell");
		lblLa.setBounds(45, 45, 50, 50);
		contentPane.add(lblLa);
		
		contentPane.addMouseListener(new MouseListener() {
			public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			lblLa.setLocation(x, y);
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {}

		@Override
		public void mouseReleased(MouseEvent e) {}

		@Override
		public void mouseEntered(MouseEvent e) {}

		@Override
		public void mouseExited(MouseEvent e) {}
		
		
		}); 
			
	}
}


