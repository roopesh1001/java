package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE A DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(0, 0, 160));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(81, 10, 278, 27);
		contentPane.add(lblNewLabel);
		
		JButton AR = new JButton("ARRAY");
		AR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE ARRAY WINDOW OPENING CODE HERE
//              Array a=new Array();
//              a.setVisible(true);
				new Array().setVisible(true);

				
			}
		});
		AR.setForeground(new Color(255, 0, 0));
		AR.setFont(new Font("Constantia", Font.BOLD, 12));
		AR.setBounds(159, 45, 85, 21);
		contentPane.add(AR);
		
		JButton ST = new JButton("STACK");
		ST.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE STACK WINDOW OPENING CODE HERE
				new Stack().setVisible(true);
			}
		});
		ST.setForeground(new Color(0, 64, 0));
		ST.setFont(new Font("Constantia", Font.BOLD, 12));
		ST.setBounds(20, 92, 85, 23);
		contentPane.add(ST);
		
		JButton Q = new JButton("QUEUE");
		Q.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE QUEUE WINDOW OPENING CODE HERE
				new Queue().setVisible(true);
			}
		});
		Q.setForeground(new Color(128, 0, 0));
		Q.setFont(new Font("Constantia", Font.BOLD, 12));
		Q.setBounds(344, 92, 85, 21);
		contentPane.add(Q);
		
		JButton CQ = new JButton("CIRCULAR QUEUE");
		CQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE CQ WINDOW OPENING CODE HERE
				new CircularQueue().setVisible(true);
			}
		});
		CQ.setActionCommand("CIRCULAR QUEUE");
		CQ.setForeground(new Color(255, 0, 128));
		CQ.setFont(new Font("Constantia", Font.BOLD, 12));
		CQ.setBounds(20, 136, 170, 23);
		contentPane.add(CQ);
		
		JButton SLL = new JButton("SINGLY LINKED LIST");
		SLL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE SLL WINDOW OPENING CODE HERE
				new SinglyLinkedList().setVisible(true);
			}
		});
		SLL.setForeground(new Color(255, 0, 255));
		SLL.setFont(new Font("Constantia", Font.BOLD, 12));
		SLL.setBounds(232, 136, 175, 23);
		contentPane.add(SLL);
		
		JButton DLL = new JButton("DOUBLY LIKED LIST");
		DLL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE DLL WINDOW OPENING CODE HERE
				new DoublyLinkedList().setVisible(true);
			}
		});
		DLL.setForeground(Color.RED);
		DLL.setFont(new Font("Constantia", Font.BOLD, 12));
		DLL.setBounds(99, 185, 189, 23);
		contentPane.add(DLL);
	}
}
