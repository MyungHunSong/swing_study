package swing_study.component;

import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class MyButton extends JButton {
	
	private String imgPath = System.getProperty("user.dir" + File.separator + "images" + File.separator);

	public MyButton() {
		setIcon(new ImageIcon("C:\\workspace_java\\swing_study\\images\\Call1.jpg"));
		setPressedIcon(new ImageIcon("C:\\workspace_java\\swing_study\\images\\Call2.jpg"));		
		setRolloverIcon(new ImageIcon("C:\\workspace_java\\swing_study\\images\\Call3.jpg"));
	}
	
	
}
