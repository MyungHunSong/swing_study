package swing_study.layout;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class PanelGrid extends JPanel {

	public PanelGrid() {

		initialize();
	}
	private void initialize() {
		setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblName = new JLabel("이름");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblName);
		
		JTextArea tfName = new JTextArea();
		add(tfName);
		
		JLabel lblNo = new JLabel("학번");
		lblNo.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblNo);
		
		JTextArea tfNo = new JTextArea();
		add(tfNo);
		
		JLabel lblMaj = new JLabel("학과");
		lblMaj.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblMaj);
		
		JTextArea tfMaj = new JTextArea();
		add(tfMaj);
		
		JLabel lblMa = new JLabel("과목");
		lblMa.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblMa);
		
		JTextArea tfMa = new JTextArea();
		add(tfMa);
	}

}
