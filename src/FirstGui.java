import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class FirstGui {
	public static void main(String args[])
	{
		JFrame fenetre = new JFrame("اول واجهة رسومية ");
		fenetre.setSize(500,500);
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		String[] items= {"items1", "items2","items3","items4","items5"};
		final JComboBox tf = new JComboBox(items);
		
		
		fenetre.add(tf, BorderLayout.PAGE_START);
		
		
		JButton btn= new JButton("احذف العنصر ");
		fenetre.add(btn, BorderLayout.PAGE_END);

		btn.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				tf.removeItemAt(tf.getSelectedIndex());
				
				
			}
			
		});
		
		fenetre.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
