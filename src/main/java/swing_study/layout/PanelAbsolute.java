package swing_study.layout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class PanelAbsolute extends JPanel {

	
	public PanelAbsolute() {

		initialize();
	}
	private void initialize() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(343, 29, 57, 15);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(191, 122, 97, 23);
		add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(28, 255, 75, 24);
		add(textArea);
	}
}
