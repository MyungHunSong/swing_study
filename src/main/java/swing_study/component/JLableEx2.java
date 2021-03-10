package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;

import javax.swing.JLabel;

public class JLableEx2 extends JFrame {/// 3/10 일짜 이미지 파일 크기 수정

	private JPanel contentPane;
	private JLabel lblImg1;
	private JLabel lblImg2;

	
	public JLableEx2() {
		initialize();
	}
	private void initialize() {
		setTitle("이미지 불러오기");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		//1. 이미지 경로
		//2. 아이콘 flower.jpg
		String imgPath = System.getProperty("user.dir")+File.separator + "images"+ File.separator;
		ImageIcon icon = new ImageIcon(imgPath + "flower.jpg");
		
		lblImg1 = new JLabel(icon);
		contentPane.add(lblImg1);
		
		// *레이블에도 이미지를 넣을수 잇구나!*
		//레이블의 사이즈에 맞춰 이미지 변경
		//icon.getimage
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(500, 500, Image.SCALE_SMOOTH); // 마지막에 잇는 hints 는 머 어떻게 넣을것이냐
		ImageIcon changeIcon = new ImageIcon(changeImg); // 저사이즈에 맞춰 변경이 되는것
		
		lblImg2 = new JLabel(changeIcon);
		contentPane.add(lblImg2);
		
		
	}

}
