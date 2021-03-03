package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class JLableEx extends JFrame implements MouseListener {

	private JPanel contentPane;
	private JLabel lblTop;
	private JLabel lblMid;
	private JLabel lblBottom;
	private String path = System.getProperty("user.dir") + File.separator + ("images") + File.separator;
	
	
	public JLableEx() {
		System.out.println(path);
		initialize();
	}
	private void initialize() {
		setTitle("JLable");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		lblTop = new JLabel("사랑한다.");
		lblTop.addMouseListener(this);
		lblTop.setOpaque(true);
		lblTop.setBackground(Color.PINK);
		lblTop.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTop, BorderLayout.NORTH);
		//C:\\workspace_java\\swing_study\\
		lblMid = new JLabel("갓나라");
		lblMid.setIcon(new ImageIcon(path + "\\common.jpg"));
		lblMid.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblMid, BorderLayout.CENTER);
		//C:\\workspace_java\\swing_study\\
		lblBottom = new JLabel("갓카레형");
		lblBottom.setBackground(Color.GREEN);
		lblBottom.setOpaque(true);
		lblBottom.setIcon(new ImageIcon(path + "\\common(1).jpg"));
		lblBottom.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBottom, BorderLayout.SOUTH);
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblTop) {
			mouseClickedLblTop(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	
	protected void mouseClickedLblTop(MouseEvent e) {
		lblMid.setIcon(new ImageIcon(path + "common (1).jpg"));
		lblBottom.setText("010-1234-1234");
		JOptionPane.showMessageDialog(null, "변경 완료");
	}
}
