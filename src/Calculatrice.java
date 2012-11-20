import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.*;
import javax.swing.*;


public class Calculatrice extends JFrame {


	JButton b0 = new JButton(" + "); 
	JButton b1 = new JButton(" - "); 
	JButton b2 = new JButton(" x ");
	JButton b3 = new JButton(" / "); 
	JButton b4 = new JButton(" C "); 
	JButton b5 = new JButton(" = ");

	JButton a0 = new JButton("0");
	JButton a1 = new JButton("1");
	JButton a2 = new JButton("2");
	JButton a3 = new JButton("3");
	JButton a4 = new JButton("4");
	JButton a5 = new JButton("5");
	JButton a6 = new JButton("6");
	JButton a7 = new JButton("7");
	JButton a8 = new JButton("8");
	JButton a9 = new JButton("9");

	JPanel menu = new JPanel();
	JPanel menuchiffre = new JPanel();		
	JPanel menuaffichage = new JPanel();

	static JLabel show = new JLabel();

	EcouteurBoutons ec = new EcouteurBoutons();
	Container contenu = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);

	static String text="";
	double res=0.0;
	double val1 ;
	double val2 ;
	static boolean flag = true;
	
	
	int indice= 0 ;
	
	// StringBuilder tableau = new StringBuilder("");



	public Calculatrice()
	{		

		menu.setBackground(Color.green);
		menuchiffre.setBackground(Color.yellow);

		b0.setSize(100,20);
		b1.setSize(100,20);
		b2.setSize(100,20);
		b3.setSize(100,20);
		b4.setSize(100,20);	
		b5.setSize(200,20);

		b0.addActionListener(ec);
		b1.addActionListener(ec);
		b2.addActionListener(ec);
		b3.addActionListener(ec);
		b4.addActionListener(ec);
		b5.addActionListener(ec);

		a0.setSize(100,20);
		a1.setSize(100,20);
		a2.setSize(100,20);
		a3.setSize(100,20);
		a4.setSize(100,20);
		a5.setSize(100,20);
		a6.setSize(100,20);
		a7.setSize(100,20);
		a8.setSize(100,20);
		a9.setSize(100,20);

		a0.addActionListener(ec);
		a1.addActionListener(ec);
		a2.addActionListener(ec);
		a3.addActionListener(ec);
		a4.addActionListener(ec);
		a5.addActionListener(ec);
		a6.addActionListener(ec);
		a7.addActionListener(ec);
		a8.addActionListener(ec);
		a9.addActionListener(ec);

		menu.add(b0);
		menu.add(b1);
		menu.add(b2);
		menu.add(b3);
		menu.add(b5);
		menu.add(b4);

		menu.add(show);

		menuchiffre.add(a1);
		menuchiffre.add(a2);
		menuchiffre.add(a3);
		menuchiffre.add(a4);
		menuchiffre.add(a5);
		menuchiffre.add(a6);
		menuchiffre.add(a7);
		menuchiffre.add(a8);
		menuchiffre.add(a9);
		menuchiffre.add(a0);


		contenu.add(menu);
		contenu.add(menuchiffre);


		setTitle("Calcultatice Java , By Ivan Klarman");
		getContentPane().add(contenu);

		setBounds(0,0,500,300);
		// Non Etirable
		setResizable(false);

	}

	// Ecouteur des boutons 
	public class EcouteurBoutons implements ActionListener	
	{

		public void actionPerformed(ActionEvent arg0)
		{			

			if (arg0.getSource()== a0 ) 
			{			
				text = text + "0";
				show.setText(text);
			}
			if (arg0.getSource()== a1 ) 
			{
				
				text = text + "1";
				show.setText(text);
				System.out.println("Vous avez saisi 1 !!!");

			}
			if (arg0.getSource()== a2 ) 
			{
				text = text + "2";
				show.setText(text);
				System.out.println("Vous avez saisi 2 !!!");

			}
			if (arg0.getSource()== a3 ) 
			{
				text = text + "3";
				show.setText(text);
				System.out.println("Vous avez saisi 3 !!!");

			}
			if (arg0.getSource()== a4 ) 
			{
				text = text + "4";
				show.setText(text);
				System.out.println("Vous avez saisi 4 !!!");

			}
			if (arg0.getSource()== a5 ) 
			{
				text = text + "5";
				show.setText(text);
				System.out.println("Vous avez saisi 5 !!!");

			}
			if (arg0.getSource()== a6 ) 
			{
				text = text + "6";
				show.setText(text);
				System.out.println("Vous avez saisi 6 !!!");

			}
			if (arg0.getSource()== a7 ) 
			{
				text = text + "7";
				show.setText(text);
				System.out.println("Vous avez saisi 7 !!!");

			}
			if (arg0.getSource()== a8 ) 
			{
				text = text + "8";
				show.setText(text);
				System.out.println("Vous avez saisi 8 !!!");

			}
			if (arg0.getSource()== a9 ) 
			{
				text = text + "9";
				show.setText(text);
				System.out.println("Vous avez saisi 9 !!!");

			}

			if (arg0.getSource()== b0 ) 
			{

				indice = 1;
				val1 = Double.parseDouble(text);
				text = "";
				show.setText(text);
				System.out.println("Addition");

			}

			if (arg0.getSource()== b1 ) 
			{

				indice = 2;
				val1 = Double.parseDouble(text);
				text = "";
				System.out.println("Soustraire");

			}

			if (arg0.getSource()== b2 ) 
			{

				indice = 3;
				val1 = Double.parseDouble(text);
				text = "";
				System.out.println("Multiplier");

			}

			if (arg0.getSource()== b3 ) 
			{

				indice = 4;
				val1 = Double.parseDouble(text);
				text = "";
				System.out.println("Diviser");

			}

			if (arg0.getSource()== b4 ) 
			{

				text="";
				indice = 0;
				show.setText(text);
				System.out.println("Clean");

			}
			if (arg0.getSource()== b5 ) 
			{

				switch(indice)
				{
				case 1: 
				{
					res = val1 + Double.parseDouble(text);
					break;
				}
				case 2: 
				{

					res = val1 - Double.parseDouble(text);
					break;
				}
				case 3: 
				{
					res = val1 * Double.parseDouble(text);
					break;
				}
				case 4: 
				{
					res = val1 / Double.parseDouble(text);
					break;
				}

				default : break;
				}


				text = String.valueOf(res);
				show.setText(text);
				System.out.println("Resultat");

			}

		}

		private void Calculatrice(String charact) {
			// TODO Auto-generated method stub

		}
	}


	/**** MAIN ****/
	public static void main (String args[])
	{

		Calculatrice Cal1;
		Cal1 = new Calculatrice();
		Cal1.setVisible(true);


	}
}
