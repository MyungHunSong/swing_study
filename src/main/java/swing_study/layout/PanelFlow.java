package swing_study.layout;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.UIManager;
import java.awt.Color;

@SuppressWarnings("serial")
public class PanelFlow extends JPanel {

	public PanelFlow() {

		initialize();
	}
	private void initialize() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "align()", TitledBorder.LEFT, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
		add(panel_2);
		
		JButton btnNewButton = new JButton("1");
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		panel_2.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "align()", TitledBorder.TRAILING, TitledBorder.BOTTOM, null, null));
		add(panel_1);
		
		JButton btnNewButton_2 = new JButton("1");
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("2");
		panel_1.add(btnNewButton_3);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "align()", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		JButton btnNewButton_4 = new JButton("1");
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("2");
		panel.add(btnNewButton_5);
	}

}
