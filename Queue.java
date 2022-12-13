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

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JLabel lblNewLabel;
	private JTextField element;
	private JTextField displaybox;
	private int q[];
	private int size;
	private int r=-1;
	private int f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 714);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("QUEUE DATA STRUCTURE");
		heading.setForeground(new Color(0, 0, 128));
		heading.setFont(new Font("Algerian", Font.BOLD, 20));
		heading.setBounds(230, 24, 245, 27);
		contentPane.add(heading);
		
		JLabel enterqdatastructure = new JLabel("ENTER QUEUE SIZE");
		enterqdatastructure.setForeground(new Color(128, 0, 64));
		enterqdatastructure.setFont(new Font("Constantia", Font.BOLD, 14));
		enterqdatastructure.setBounds(32, 109, 245, 27);
		contentPane.add(enterqdatastructure);
		
		length = new JTextField();
		length.setBounds(287, 109, 188, 21);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton create = new JButton("CREATE QUEUE");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//write code to create queue
				size=Integer.valueOf(length.getText());
				q=new int [size];
				String message="queue of size"+size+"is created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		create.setForeground(new Color(0, 128, 0));
		create.setFont(new Font("Constantia", Font.BOLD, 14));
		create.setBounds(230, 195, 188, 27);
		contentPane.add(create);
		
		lblNewLabel = new JLabel("ENTER AN ELEMENT");
		lblNewLabel.setForeground(new Color(64, 0, 64));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel.setBounds(36, 288, 143, 18);
		contentPane.add(lblNewLabel);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(219, 285, 188, 21);
		contentPane.add(element);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//write code to insert 
				int elem;
				if (r==size-1)
				{
					JOptionPane.showMessageDialog(contentPane, "insertion not possible");
					
				}
				else
				{
					
					elem=Integer.valueOf(element.getText());
					++r;
					q[r]=elem;
					JOptionPane.showMessageDialog(contentPane, "successfully inserted");
					element.setText("");
				}
			}
		});
		insert.setForeground(new Color(0, 128, 0));
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		insert.setBounds(428, 285, 137, 21);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//write code to delete
				if (r==-1||f>r)
				{
				JOptionPane.showMessageDialog(contentPane, "deletion not possible");
				
					
				}
				else
				{
				JOptionPane.showMessageDialog(contentPane, "element deleted is " +q[f]);
					++f;
				}
			}
		});
		delete.setForeground(new Color(0, 128, 0));
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		delete.setBounds(260, 378, 113, 21);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//write code to display
				String msg="";
				if (r==-1||f>r)
				{
					JOptionPane.showMessageDialog(contentPane, "display not possible");
				}
				else
				{
					for (int i=f;i<=r;i++)
						msg=msg+" " +q[i];
					
				}
				displaybox.setText(msg);
			}
		});
		display.setForeground(new Color(0, 128, 0));
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(260, 447, 113, 21);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(132, 530, 382, 33);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}

}
