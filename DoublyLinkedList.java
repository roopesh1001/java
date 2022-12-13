package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField elementrear;
	private JTextField elementfront;
	private JTextField displaybox;
	  class Node
	    {
	    	Node preLink;
	    	int data;
	    	Node nextLink;
	    	
	    }
	    private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 717);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("DoublyLinkedList data structure");
		heading.setFont(new Font("Algerian", Font.BOLD, 20));
		heading.setBounds(176, 10, 371, 27);
		contentPane.add(heading);
		
		JLabel lblNewLabel = new JLabel("enter the element");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 15));
		lblNewLabel.setBounds(50, 109, 152, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("enter the element");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 15));
		lblNewLabel_1.setBounds(50, 173, 152, 18);
		contentPane.add(lblNewLabel_1);
		
		elementrear = new JTextField();
		elementrear.setBounds(218, 108, 132, 19);
		contentPane.add(elementrear);
		elementrear.setColumns(10);
		
		elementfront = new JTextField();
		elementfront.setBounds(218, 172, 132, 19);
		contentPane.add(elementfront);
		elementfront.setColumns(10);
		
		JButton btnNewButton = new JButton("InsertRear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code to insert rear
		    	Node temp;
		    int elem=Integer.valueOf(elementrear.getText());
		    JOptionPane.showMessageDialog(contentPane, "element inserted rear successfully");
		    	Node newnode=new Node();
		    	newnode.data=elem;
		    	newnode.preLink=null;
		    	newnode.nextLink=null;
		    	if (first==null){
		    		first =newnode;
		    		
		    	}
		    	else
		    	{
		    		temp=first;
		    		while(temp.nextLink!=null)
		    		{
		    			temp=temp.nextLink;
		    			
		    		}
		    		temp.nextLink=newnode;
		    		newnode.preLink=temp;
		    	}
		    	elementrear.setText("");
			}
		});
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton.setBounds(397, 107, 126, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("insertFront");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem;
		    	elem=Integer.valueOf(elementfront.getText());
		    	JOptionPane.showMessageDialog(contentPane, "element inserted in front succesfuly");
		    	Node newnode =new Node();
		    	newnode.data=elem;
		    	newnode.preLink=null;
		    	newnode.nextLink=null;
		    	if (first==null){
		    		first =newnode;
		    		
		    	}
		    	else
		    	{
		    		newnode.nextLink=first;
		    		first.preLink=newnode;
		    		first=newnode;
		    	}
		    		
		    	elementfront.setText("");
				
			}
		});
		btnNewButton_1.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton_1.setBounds(397, 171, 126, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_2 = new JButton("deleteFront");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (first==null)
		    	{
		    		JOptionPane.showMessageDialog(contentPane, "deletion not possible");
		    	}
		    	else if(first.nextLink==null)
		    	{
		    		JOptionPane.showMessageDialog(contentPane, "elemnt deleted is "+ first.data);
		    		first=null;
		    		
		    	}
		    	else
		    	{
		    		JOptionPane.showMessageDialog(contentPane, "element deleted is " +first.data);
		    		first=first.nextLink;
		    		first.preLink=null;
		    	}
			}
		});
		btnNewButton_1_2.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton_1_2.setBounds(218, 340, 126, 21);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_2 = new JButton("deleteRear");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
		    	if (first==null)
		    	{
		    		JOptionPane.showMessageDialog(contentPane, "deletion not possible");
		    	}
		    	else if(first.nextLink==null)
		    	{
		    		JOptionPane.showMessageDialog(contentPane, "elemnt deleted is "+ first.data);
		    		first=null;
		    		
		    	}
		    	else
		    	{
		    		temp=first;
		    		while(temp.nextLink.nextLink!=null) {
		    			temp=temp.nextLink;
		    		}
		    		JOptionPane.showMessageDialog(contentPane, "element deleted is "+ temp.nextLink.data);
		    	temp.nextLink=null;
		    	
		    	}
			}
		});
		btnNewButton_2.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton_2.setBounds(218, 278, 126, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("displayF");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
			    String mes=" ";
		    	if (first==null)
		    	{
		    	JOptionPane.showMessageDialog(contentPane, "display not possible");
		    
		    	}
		    	else if(first.nextLink==null)
		    	{
		    		JOptionPane.showMessageDialog(contentPane, first.data);
		    }
		    	else
		    	{
		    		temp=first;
		    		while(temp!=null)
		    		{
		    			mes=mes+ " "+temp.data;
		    			JOptionPane.showMessageDialog(contentPane, temp.data+" ");
		    			temp=temp.nextLink;
		    		}
		    		
		    	}
displaybox.setText(mes);
		    	
		    				}
		});
		btnNewButton_3.setFont(new Font("Constantia", Font.PLAIN, 16));
		btnNewButton_3.setBounds(74, 457, 172, 33);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("display reverse");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
			    String mes=" ";
		    	if (first==null)
		    	{
		    		JOptionPane.showMessageDialog(contentPane, "display not possible");
		    	}
		    	else if(first.nextLink==null)
		    	{
		    		JOptionPane.showMessageDialog(contentPane, first.data);
		    }
		    	else
		    	{
		    		temp=first;
		    		while(temp.nextLink!=null)
		    		{
		    			mes=mes+" "+temp.data;
		    			temp=temp.nextLink;
		    		}
		    		
		    		}
		    		StringBuilder sb=new StringBuilder(mes);
		    		sb.reverse();
		    		displaybox.setText(sb.toString());
		    	}
			
			
		});
		btnNewButton_3_1.setFont(new Font("Constantia", Font.PLAIN, 16));
		btnNewButton_3_1.setBounds(407, 457, 172, 33);
		contentPane.add(btnNewButton_3_1);
		
		displaybox = new JTextField();
		displaybox.setBounds(136, 542, 361, 27);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}

}
