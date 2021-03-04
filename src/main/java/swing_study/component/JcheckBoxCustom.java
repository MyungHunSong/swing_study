package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JcheckBoxCustom extends JFrame implements ItemListener{
	private ArrayList<Fruit> list;
	private JPanel contentPane;
	private int sum;
	private JLabel lblRes;

	public JcheckBoxCustom(ArrayList<Fruit> list) {
		this.list = list;
		initialize();
//		list.forEach(s -> System.out.println(s));
	}
	private void initialize() {
		setTitle("실자 체크 박스");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(450, 350, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pTop = new JPanel();
		contentPane.add(pTop, BorderLayout.NORTH);
		
		JLabel lblTitle = new JLabel("New label");
		pTop.add(lblTitle);
		
		JPanel pSouth = new JPanel();
		contentPane.add(pSouth, BorderLayout.SOUTH);
		
		lblRes = new JLabel("New label");
		pSouth.add(lblRes);
		
		JPanel pCenter = new JPanel();
		contentPane.add(pCenter, BorderLayout.CENTER);
		
		for(Fruit f : list) {
			JCheckBox ck = new JCheckBox(f.getName());
			
			pCenter.add(ck);
			ck.addItemListener(this);
		}
		
	// 사과 100원, 배 500원, 체리 2000원"
		String title = " ";
		for(Fruit f : list) {
			title = f.toString() + " ";
			JCheckBox ck = new JCheckBox(f.getName());
			pCenter.add(ck);
			ck.addItemListener(this);
		}
		lblTitle.setText(title);
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		JCheckBox cb = (JCheckBox)e.getSource();
		Fruit selectFruit = list.get(list.indexOf(new Fruit(cb.getText())));
		
		if(e.getStateChange() == ItemEvent.SELECTED) {
			sum += selectFruit.getPrice();
		}else {
			sum -= selectFruit.getPrice();
		}
		
		lblRes.setText(sum+" ");
	}


}
