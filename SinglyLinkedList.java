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

public class SinglyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField elementrear;
	private JTextField elementfront;
	private JTextField Displaybox;

		class node{
			int data;
			node link;
		}
		private node first;

		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 706, 474);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("SinglyLinkedList Data Structure");
		heading.setForeground(new Color(0, 0, 160));
		heading.setFont(new Font("Algerian", Font.BOLD, 20));
		heading.setBounds(169, 10, 365, 27);
		contentPane.add(heading);
		
		JLabel enter = new JLabel("Enter the element");
		enter.setFont(new Font("Constantia", Font.BOLD, 15));
		enter.setBounds(48, 78, 145, 19);
		contentPane.add(enter);
		
		JLabel enter_1 = new JLabel("Enter the element");
		enter_1.setFont(new Font("Constantia", Font.BOLD, 15));
		enter_1.setBounds(48, 148, 163, 19);
		contentPane.add(enter_1);
		
		elementrear = new JTextField();
		elementrear.setBounds(221, 77, 163, 19);
		contentPane.add(elementrear);
		elementrear.setColumns(10);
		
		elementfront = new JTextField();
		elementfront.setBounds(221, 147, 163, 19);
		contentPane.add(elementfront);
		elementfront.setColumns(10);
		
		JButton btnNewButton = new JButton("InsertRear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code to insert rear
				node temp;
				int elem;
				elem=Integer.valueOf(elementrear.getText());
				
				node newnode=new node();
				newnode.data=elem;
				newnode.link=null;
				if (first==null)
				{
					first=newnode;
				}
				else{
					temp=first;
					while(temp.link!=null)
					{
						temp=temp.link;
					}
					temp.link=newnode;
					JOptionPane.showMessageDialog(contentPane, "successfully rear inserted");
					elementrear.setText("");
				}
			}
		});
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(449, 76, 126, 27);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("InsertFront");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code to insert front
				
				int elem=Integer.valueOf(elementfront.getText());
				
				node newnode=new node();
				newnode.data=elem;
				newnode.link=null;
				if (first==null)
				{
					first=newnode;
					
				}
				else{
					newnode.link=first;
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "element succesfully inserted at front");
					elementfront.setText("");
				}
			}
		});
		btnNewButton_1.setFont(new Font("Constantia", Font.BOLD, 15));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(449, 146, 126, 27);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("DeleteFront");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code to delete front
				if (first==null)
				{
					JOptionPane.showMessageDialog(contentPane,  "deletion not possible");
				}
				else if(first.link==null)
				{
					JOptionPane.showMessageDialog(contentPane, "element deleted is "+first.data);
					first =null;
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "element deleted is "+first.data);
					first=first.link;
				}
			}
		});
		btnNewButton_1_1.setFont(new Font("Constantia", Font.BOLD, 15));
		btnNewButton_1_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1_1.setBounds(251, 241, 154, 27);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Deleterear");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code to delete rear
				node temp;
				if (first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "deletion  not possible");
					
				}
				else if (first.link==null)
				{
					JOptionPane.showMessageDialog(contentPane, "elemnt deleted is "+ first.data);
					first=null;
				}
				else
				{
					temp=first;
					while(temp.link.link!=null)
					{
						temp=temp.link;
						
					}
					JOptionPane.showMessageDialog(contentPane, "element deleted is "+ temp.link.data);
					temp.link=null;
				}
			}
		});
		btnNewButton_1_2.setFont(new Font("Constantia", Font.BOLD, 15));
		btnNewButton_1_2.setBackground(new Color(255, 255, 255));
		btnNewButton_1_2.setBounds(251, 204, 111, 27);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Display");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code to display
				node temp;
				String msg=" ";
				if (first==null)
				
				JOptionPane.showMessageDialog(contentPane, "display not possible");
				
				else if (first.link==null)
				{
				String	message=" "+first.data;
				
				}
				else
				{
					temp=first;
					while (temp!=null)
					{
						
						
						msg=msg+temp.data+ " ";
						String dis=temp.data + " ";
						temp=temp.link;
					}
					
				}
				Displaybox.setText(msg);
				}
			
		});
		btnNewButton_1_3.setFont(new Font("Constantia", Font.BOLD, 15));
		btnNewButton_1_3.setBackground(new Color(255, 255, 255));
		btnNewButton_1_3.setBounds(251, 280, 111, 27);
		contentPane.add(btnNewButton_1_3);
		
		Displaybox = new JTextField();
		Displaybox.setBounds(104, 358, 400, 27);
		contentPane.add(Displaybox);
		Displaybox.setColumns(10);
	}
}
