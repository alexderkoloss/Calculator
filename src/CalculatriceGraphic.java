import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class CalculatriceGraphic extends JFrame {

	public static void main(String args[])
	{
		JLabel EcranCalc = new JLabel();
		EcranCalc.setText(("Calculatrice"));
		
		JPanel menu = new JPanel();
		menu.setLayout(new FlowLayout());
		menu.setBackground(Color.cyan);
		JButton b0 =new JButton(" + "); 
		JButton b1 =new JButton(" - "); 
		JButton b2 =new JButton(" * ");
		JButton b3 =new JButton(" / "); 
		JButton b4 =new JButton(" EFF "); 
		JButton b5 =new JButton(" GO ");
		
		b0.setSize(100,20);
		b1.setSize(100,20);
		b2.setSize(100,20);
		b3.setSize(100,20);
		b4.setSize(100,20);
		b5.setSize(100,20);
		menu.add(EcranCalc);
		menu.add(b0);
		menu.add(b1);
		menu.add(b2);
		menu.add(b3);
		menu.add(b4);
		menu.add(b5);
		

		JFrame fenetre = new CalculatriceGraphic();
		fenetre.setTitle("Calcultatice Java , By Ivan Klarman");
		fenetre.getContentPane().add(menu);
		fenetre.setBounds(0,0,500,500);
		fenetre.setVisible(true);
	}
}