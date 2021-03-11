package swing_study.component.menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class JMenuFrameEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuItem mntmLoad;
	private JMenuItem mntmHide;
	private JMenuItem mntmReshow;
	private JMenuItem mntmExit;
	private String path = System.getProperty("user.dir") + File.separator + ("images") + File.separator;
	private JLabel lblImg;
	
	
	
	public JMenuFrameEx() {
		
		initialize();
	}
	private void initialize() {
		setTitle("매뉴");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnScreen = new JMenu("New menu");
		menuBar.add(mnScreen);
		
		mntmLoad = new JMenuItem("Load");
		mntmLoad.addActionListener(this);
		mnScreen.add(mntmLoad);
		
		mntmHide = new JMenuItem("Hide");
		mntmHide.addActionListener(this);
		mnScreen.add(mntmHide);
		
		mntmReshow = new JMenuItem("Reshow");
		mntmReshow.addActionListener(this);
		mnScreen.add(mntmReshow);
		
		JSeparator separator = new JSeparator();
		mnScreen.add(separator);
		
		mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(this);
		mnScreen.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblImg = new JLabel("");
		contentPane.add(lblImg, BorderLayout.CENTER);
		 
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmLoad) {
			actionPerformedMntmLoad(e);
		}
		
		if(e.getSource() == mntmHide) {
			actionPerformedMntmHide(e);
		}
		
		if(e.getSource() == mntmReshow) {
			actionPerformedMntmReshow(e);
		}
		
		if(e.getSource() == mntmExit) {
			actionPerformedMntmExit(e);
		}
	}
	
	protected void actionPerformedMntmLoad(ActionEvent e) {
		lblImg.setIcon(new ImageIcon(path + "common.jpg"));
		lblImg.setHorizontalAlignment(SwingConstants.CENTER);
		lblImg.setVisible(true);
	}
	
	
	private void actionPerformedMntmHide(ActionEvent e) {
	
		lblImg.setVisible(false);
	}
	
	
	private void actionPerformedMntmReshow(ActionEvent e) {
	
		lblImg.setVisible(true);
	}
	
	
	private void actionPerformedMntmExit(ActionEvent e) {
		System.exit(0);
	}


}
