

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculadora extends JFrame {
/**
	 * tela da calculadora
	 */
	JTextField tela = new JTextField();

	public Calculadora(){
		super("Calculadora");
		Font f = new Font("serife",Font.PLAIN,32);
		tela.setFont(f);
		
		
		Container a = new JPanel();
		a.setLayout(new GridLayout(4,4,5,5));
	   
		a.add(new JButton("7"));
		a.add(new JButton("8"));
		a.add(new JButton("9"));
		a.add(new JButton("/"));
		a.add(new JButton("4"));
		a.add(new JButton("5"));
		a.add(new JButton("6"));
		a.add(new JButton("*"));
		a.add(new JButton("1"));
		a.add(new JButton("2"));
		a.add(new JButton("3"));
		a.add(new JButton("-"));
		a.add(new JButton("0"));
		a.add(new JButton("."));
		a.add(new JButton("="));
		a.add(new JButton("+"));
		
		Container b = getContentPane();
	    b.setLayout(new BorderLayout());
	   
	    
	    b.add(BorderLayout.CENTER,a);
	    b.add(BorderLayout.NORTH,tela);
	    
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Calculadora();

	}

}
