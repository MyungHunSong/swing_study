package swing_study.dlg;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.management.openmbean.OpenDataException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class JFielChooserEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblImg;
	private JButton btnOpen;
	private JFileChooser chooser = new JFileChooser(System.getProperty("user.dir"));
	private String chooseFilePath;
	
	public JFielChooserEx() {
		initialize();
		
	}
	private void initialize() {
		setTitle("파일츄절스");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblImg = new JLabel("New label");
		lblImg.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblImg, BorderLayout.CENTER);
		
		btnOpen = new JButton("불러오기");
		btnOpen.addActionListener(this);
		contentPane.add(btnOpen, BorderLayout.SOUTH);
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOpen) {
			if(e.getActionCommand().equals("불러오기")) {
				actionPerformedBtnOpen(e);
			}else {
				actionPerformedBtnSave(e);
			}
			
		}
	}
	
	
	
	private void actionPerformedBtnSave(ActionEvent e) {
		// download 폴더에 JLable에 있는 이미지를 저장되도록 만약 download 폴더가 존재하지 않으면 생성후 저장되도록 하세요
		int res = chooser.showSaveDialog(null); // res 에 chooser 를 저장한다
		
		if(res != JFileChooser.APPROVE_OPTION){ //
			JOptionPane.showMessageDialog(null, "파일을 선택하지 않앗습니다", "경고", JOptionPane.WARNING_MESSAGE);
			return;
		}
		ImageIcon icon = (ImageIcon) lblImg.getIcon();
		BufferedImage bi = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_BGR);
		
		Graphics2D g2 = bi.createGraphics();
		g2.drawImage(icon.getImage(), 0, 0, null);
		g2.dispose();
		
		String chooseFilePath = chooser.getSelectedFile().getPath();
		String extStr = chooseFilePath.substring(chooseFilePath.lastIndexOf(".") + 1);
		
		try {
			ImageIO.write(bi, extStr, new File(chooseFilePath));
			JOptionPane.showMessageDialog(null, chooseFilePath + "에 저장되었습니다");
		}catch(IOException e1) {
			e1.printStackTrace();
		}
		
		if(btnOpen.getText().equals("저장하기")) {
			btnOpen.setText("불러오기");
		}
		
	 }
	
	
	protected void actionPerformedBtnOpen(ActionEvent e) {
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"JPG & PNG & GIF imges",
				"jpg","png","gif");
		
		chooser.showOpenDialog(null);
		
		int res = chooser.showOpenDialog(null);
		if(res != JFileChooser.APPROVE_OPTION) {
			JOptionPane.showMessageDialog(null, "옵션을 선택하지 않았습니다","경고", JOptionPane.WARNING_MESSAGE);
			return;
		}
		chooseFilePath = chooser.getSelectedFile().getPath(); //파일검색 했던것
		lblImg.setIcon(new ImageIcon(chooseFilePath));
		
		if(btnOpen.getText().equals("불러오기")) {
			btnOpen.setText("저장하기");
		}
		
		
	}
}
