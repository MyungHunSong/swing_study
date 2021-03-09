package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;

import java.awt.GridLayout;
import javax.swing.JSlider;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.event.ChangeListener;

public class JSliderEx extends JFrame implements ChangeListener {

	private JPanel contentPane;
	private JSlider sliderRed;
	private JSlider sliderGreen;
	private JSlider sliderBlue;
	private JLabel lblColor;

	
	public JSliderEx() {
		initialize();
		
		sliderRed.addChangeListener(this);
		sliderGreen.addChangeListener(this);
		sliderBlue.addChangeListener(this);
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 10, 5, 10));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pCenter = new JPanel();
		contentPane.add(pCenter, BorderLayout.CENTER);
		pCenter.setLayout(new GridLayout(0, 1, 0, 0));
		
		sliderRed = new JSlider();
		
		sliderRed.setForeground(Color.RED);
		sliderRed.setPaintTicks(true);
		sliderRed.setPaintLabels(true);
		sliderRed.setMinorTickSpacing(10);
		sliderRed.setMajorTickSpacing(50);
		sliderRed.setMaximum(250);
		sliderRed.setValue(125);
		pCenter.add(sliderRed);
		
		
		
		sliderGreen = new JSlider();
		sliderGreen.setForeground(Color.GREEN);
		sliderGreen.setPaintTicks(true);
		sliderGreen.setPaintLabels(true);
		sliderGreen.setMinorTickSpacing(10);
		sliderGreen.setMajorTickSpacing(50);
		sliderGreen.setMaximum(250);
		sliderGreen.setValue(125);
		pCenter.add(sliderGreen);
		
		sliderBlue = new JSlider();
		sliderBlue.setMajorTickSpacing(50);
		sliderBlue.setForeground(Color.BLUE);
		sliderBlue.setPaintTicks(true);
		sliderBlue.setPaintLabels(true);
		sliderBlue.setMinorTickSpacing(10);
		sliderBlue.setMaximum(250);
		sliderBlue.setValue(125);
		pCenter.add(sliderBlue);
		
		JPanel pSouth = new JPanel();
		contentPane.add(pSouth, BorderLayout.SOUTH);
		
		lblColor = new JLabel("New label");
		lblColor.setOpaque(true);
		pSouth.add(lblColor);
}
	
	
	public void stateChanged(ChangeEvent e) {
		int red = sliderRed.getValue();
		int green = sliderGreen.getValue();
		int blue = sliderBlue.getValue();
		
		String message = String.format("Red(%d) Green(%d) Blue(%d)", red, green, blue);
		lblColor.setText(message);
		lblColor.setBackground(new Color(red, green, blue));
	}
}
