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

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField displaybox;
	private int cq[];
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 712);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 160));
		contentPane.setBackground(new Color(255, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("CIRCULAR QUEUE DATA STRUCTURE");
		heading.setForeground(new Color(255, 255, 0));
		heading.setFont(new Font("Algerian", Font.BOLD, 20));
		heading.setBounds(206, 10, 349, 27);
		contentPane.add(heading);
		
		JLabel enterqsize = new JLabel("ENTER QUEUE SIZE");
		enterqsize.setForeground(new Color(0, 0, 160));
		enterqsize.setFont(new Font("Constantia", Font.BOLD, 16));
		enterqsize.setBounds(63, 107, 176, 18);
		contentPane.add(enterqsize);
		
		length = new JTextField();
		length.setBounds(320, 97, 150, 27);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton create = new JButton("CREATE QUEUE");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//write code to create q
				size=Integer.valueOf(length.getText());
				cq=new int [size];
				String message="circular queue of size"+size+"is created";
				JOptionPane.showMessageDialog(contentPane, message);

			}
		});
		create.setFont(new Font("Constantia", Font.BOLD, 16));
		create.setBounds(228, 188, 201, 27);
		contentPane.add(create);
		
		JLabel enterelem = new JLabel("ENTER AN ELEMENT");
		enterelem.setForeground(new Color(0, 0, 160));
		enterelem.setFont(new Font("Constantia", Font.BOLD, 16));
		enterelem.setBounds(63, 279, 176, 18);
		contentPane.add(enterelem);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(285, 267, 150, 27);
		contentPane.add(element);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//write code to insert
				int ele;
				if (count==size)
				{
					JOptionPane.showMessageDialog(contentPane, "insertion not possible");
					
				}
				else{
					ele=Integer.valueOf(element.getText());
				
					r=(r+1)%size;
					cq [r]=ele;
					++count;
					JOptionPane.showMessageDialog(contentPane, "successfully inserted");
					element.setText("");
				}
			}
		});
		insert.setFont(new Font("Constantia", Font.BOLD, 16));
		insert.setBounds(481, 267, 129, 27);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//write code to delete

				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane, "deletion not possible");
					
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "element deleted is " +cq[f]);
					f=(f+1)%size;
					--count;
				}
			}
		});
		delete.setFont(new Font("Constantia", Font.BOLD, 16));
		delete.setBounds(250, 370, 129, 27);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//write code to display
				String msg="";
				int f1=f;
				if (count==0)
				{
					JOptionPane.showMessageDialog(contentPane, "display not possible");
					
				}
				else
				{
					for(int i=1;i<=count;i++)
					{
						
						f1=(f1+1)%size;
						msg=msg+" " +cq[i];
						
					}
					displaybox.setText(msg);
			}
		}});
		display.setFont(new Font("Constantia", Font.BOLD, 16));
		display.setBounds(250, 455, 129, 27);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setColumns(10);
		displaybox.setBounds(115, 553, 440, 36);
		contentPane.add(displaybox);
	}

}
