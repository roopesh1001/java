package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField displaybox;
	private int s[];
	private int size;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 651);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("STACK DATA STRUCTURE");
		heading.setForeground(new Color(0, 0, 255));
		heading.setFont(new Font("Algerian", Font.BOLD, 20));
		heading.setBounds(299, 22, 246, 27);
		contentPane.add(heading);
		
		JLabel ENTER = new JLabel("ENTER THE STACK SIZE");
		ENTER.setForeground(new Color(128, 0, 64));
		ENTER.setFont(new Font("Constantia", Font.BOLD, 17));
		ENTER.setBounds(39, 106, 246, 27);
		contentPane.add(ENTER);
		
		length = new JTextField();
		length.setBounds(358, 106, 139, 22);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton create = new JButton("CREATE STACK");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//stack creation code
				size=Integer.valueOf(length.getText());
				s=new int [size];
				String message="stack of size"+size+ "created";
				JOptionPane.showMessageDialog(contentPane, message);
			
			}
		});
		create.setFont(new Font("Constantia", Font.BOLD, 14));
		create.setBounds(207, 167, 197, 27);
		contentPane.add(create);
		
		JLabel iblelement = new JLabel("ENTER AN ELEMENT");
		iblelement.setForeground(new Color(128, 0, 64));
		iblelement.setFont(new Font("Constantia", Font.BOLD, 17));
		iblelement.setBounds(39, 230, 246, 27);
		contentPane.add(iblelement);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(368, 219, 139, 22);
		contentPane.add(element);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//push code here

				int elem;
				if (top==size-1)
			
				JOptionPane.showMessageDialog(contentPane, "push not possible");
				else
				{
					 elem=Integer.valueOf(element.getText());
					++top;
					s[top]=elem;
					JOptionPane.showMessageDialog(contentPane, "push successfull");
					element.setText("");
				}
			}
		});
		push.setFont(new Font("Constantia", Font.BOLD, 14));
		push.setBounds(524, 219, 139, 22);
		contentPane.add(push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//pop code write here
				if(top==-1)
				JOptionPane.showMessageDialog(contentPane, "pop not possible");
				else
				{
					String message="element deleted is" + s[top];
					JOptionPane.showMessageDialog(contentPane, message);
					--top;
				}
				}
		});
		pop.setFont(new Font("Constantia", Font.BOLD, 14));
		pop.setBounds(235, 332, 139, 22);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display code here
				String msg="";
				if (top==-1)
				{
					JOptionPane.showMessageDialog(contentPane, "display not possible");
					
				}
				else
				{
					for(int i=top;i>=0;i--)
					{
						msg=msg+" "+s[i];
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(235, 423, 139, 22);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(100, 525, 458, 38);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
