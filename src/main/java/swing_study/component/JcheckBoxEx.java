package swing_study.component;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.event.ItemEvent;

public class JcheckBoxEx extends JFrame implements ItemListener {

	private JPanel contentPane;
	private JCheckBox chckbxApple;
	private int sum;
	private JLabel lblResult;
	private String resStr ="현재 %d 원입니다.";
	private JCheckBox chckbxPear;
	private JCheckBox chckbxCherry;
	
	
	public JcheckBoxEx() {
		
		initialize();
		chckbxCherry.setSelected(true);
	}
	private void initialize() {
		setTitle("체크박스 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pNorth = new JPanel();
		contentPane.add(pNorth);
		pNorth.setLayout(new BoxLayout(pNorth, BoxLayout.Y_AXIS));
		
		JLabel lblTitle = new JLabel("사과 100원, 배 500원, 체리 20000원");
		pNorth.add(lblTitle);
		
		JPanel panel = new JPanel();
		pNorth.add(panel);
		
		chckbxApple = new JCheckBox("사과");
		chckbxApple.addItemListener(this);
		panel.add(chckbxApple);
		
		chckbxPear = new JCheckBox("배");
		chckbxPear.addItemListener(this);
		panel.add(chckbxPear);
		
		chckbxCherry = new JCheckBox("체리");
		chckbxCherry.addItemListener(this);
		panel.add(chckbxCherry);
		
		lblResult = new JLabel(resStr);
		pNorth.add(lblResult);
	}
	
				
				
				
	

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == chckbxCherry) {
			itemStateChangedChckbxCherry(e);
		}
		if (e.getSource() == chckbxPear) {
			itemStateChangedChckbxPear(e);
		}
		if (e.getSource() == chckbxApple) {
			itemStateChangedChckbxApple(e);
		}
		String resStr = String.format("현재 %d 원입니다.", sum);
		lblResult.setText(resStr);
	}
	
	
	protected void itemStateChangedChckbxApple(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			sum += 100;
		}else {
			sum -= 100;
		}
		
	}
	protected void itemStateChangedChckbxPear(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			sum += 500;
		}else {
			sum -= 500;
		}
	
	}
	protected void itemStateChangedChckbxCherry(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			sum += 20000;
		}else {
			sum -= 20000;
		}
	}
	
	
	
	
	
	
}
