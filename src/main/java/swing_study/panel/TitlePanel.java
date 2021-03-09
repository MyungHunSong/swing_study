package swing_study.panel;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TitlePanel extends JPanel {
	private JTextField tfTno;
	private JTextField tfTname;

	
	public TitlePanel() {

		initialize();
	}
	//set으로 세팅
	public void setTitle(Title title) {
		tfTno.setText(title.gettNo() + "");
		tfTname.setText(title.gettName());
	}
	
	
	
	// get으로 받아오는것
	public Title getTitle() {
		int tno = Integer.parseInt(tfTno.getText().trim());
		String tName = tfTname.getText().trim();
		
		return new Title(tno, tName);
	}
	
	public void clearTf() {
		tfTno.setText("");
		tfTname.setText("");
	}
	
	
	
	
	
	
	
	
	private void initialize() {
		setBorder(new TitledBorder(null, "직책 정보", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblTno = new JLabel("직책 번호");
		lblTno.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblTno);
		
		tfTno = new JTextField();
		add(tfTno);
		tfTno.setColumns(10);
		
		JLabel lalTname = new JLabel("직책 이름");
		lalTname.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lalTname);
		
		tfTname = new JTextField();
		tfTname.setColumns(10);
		add(tfTname);
	}
	
	
	

}
