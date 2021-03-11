package swing_study.component.menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;

public class JPopUpMenuEx extends JFrame {

	private JPanel contentPane;
	private String imgPath = System.getProperty("user.dir") + File.separator + ("images") + File.separator;
	private JLabel imgLabel = new JLabel();
	private JMenuItem mntmLoad;
	private JMenuItem mntmHide;
	private JMenuItem mntmReshow;
	private JMenuItem mntmExit;
	
	public JPopUpMenuEx() {
		
		initialize();
	}

	public void initialize(){
		
		
			
		setTitle("팝업매뉴");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		mntmLoad = new JMenuItem("Load");
		mntmLoad.addActionListener(listener);
		imgLabel.add(mntmLoad);
		
		mntmHide = new JMenuItem("Hide");
		mntmHide.addActionListener(listener);
		imgLabel.add(mntmHide);
		
		mntmReshow = new JMenuItem("Reshow");
		mntmReshow.addActionListener(listener);
		imgLabel.add(mntmReshow);
		
		mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(listener);
		imgLabel.add(mntmExit);
		
		
		contentPane.setComponentPopupMenu(createPopUpMenu());
		contentPane.add(imgLabel, BorderLayout.SOUTH);
		
	}

	private JPopupMenu createPopUpMenu() {
		JPopupMenu popupMenu = new JPopupMenu();
		
		
		
		contentPane.invalidate();
		
		JMenuItem screen = new JMenuItem("Screen");
		screen.addActionListener(listener);
		popupMenu.add(screen);
		return popupMenu;
	}
	
	
	
	ActionListener listener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("Screen")) {
				
				ImageIcon icon = new ImageIcon(imgPath + "common.jpg");
				Image changeImg = icon.getImage().getScaledInstance(500, 500,Image.SCALE_SMOOTH);
				imgLabel.setIcon(new ImageIcon (changeImg));
				
				
				
			}
			
			if(e.getActionCommand().equals("Load")) {
				imgLabel.setVisible(true);
			}
			
			if(e.getActionCommand().equals("Hide")) {
				imgLabel.setVisible(false);
			}
			
			if(e.getActionCommand().equals("Reshow")) {
				imgLabel.setVisible(true);
			}
			
			if(e.getActionCommand().equals("Exit")) {
				System.exit(0);
			}
			
			
		}
	};

}
