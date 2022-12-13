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

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField INSERPOSITION;
	private JTextField DELETEPOSITION;
	private JTextField ELEMENT;
	private JTextField DISPLAYBOX;
private int arr[];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 613);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 128, 192));
		contentPane.setBackground(new Color(255, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel.setBounds(195, 10, 251, 27);
		contentPane.add(lblNewLabel);
		
		JLabel EnterArrayLength = new JLabel("ENTER ARRAY LENGTH");
		EnterArrayLength.setForeground(new Color(64, 0, 64));
		EnterArrayLength.setFont(new Font("Constantia", Font.BOLD, 16));
		EnterArrayLength.setBounds(37, 71, 190, 35);
		contentPane.add(EnterArrayLength);
		
		length = new JTextField();
		length.setBounds(371, 71, 184, 35);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton CREATE = new JButton("CREATE ARRAY");
		CREATE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE TO CREATE ARRAY
				//String len=	length.getText();
				//int l=Integer.valueOf(len);
				int len=Integer.valueOf(length.getText());
				arr=new int [len];
			String message="Array of lenth" +len+"created";
			JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		CREATE.setFont(new Font("Constantia", Font.BOLD, 16));
		CREATE.setBackground(new Color(255, 255, 255));
		CREATE.setBounds(232, 152, 214, 29);
		contentPane.add(CREATE);
		
		JLabel EnterArrayLength_1 = new JLabel("INSERT AN INTEGER ELEMENT");
		EnterArrayLength_1.setForeground(new Color(64, 0, 64));
		EnterArrayLength_1.setFont(new Font("Constantia", Font.BOLD, 16));
		EnterArrayLength_1.setBounds(10, 230, 238, 20);
		contentPane.add(EnterArrayLength_1);
		
		INSERPOSITION = new JTextField();
		INSERPOSITION.setColumns(10);
		INSERPOSITION.setBounds(437, 212, 46, 27);
		contentPane.add(INSERPOSITION);
		
		JButton CREATE_1 = new JButton("INSERT");
		CREATE_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE TO INSERT ARRAY
				int elem=Integer.valueOf(ELEMENT.getText());
			int pos=Integer.valueOf(INSERPOSITION.getText());
			arr[pos]=elem;
			String mrssage="element "+elem+"inserted @ positiion"+pos;
			JOptionPane.showMessageDialog(contentPane, mrssage);
			ELEMENT.setText("");
			INSERPOSITION.setText("");
			}
		});
		CREATE_1.setFont(new Font("Constantia", Font.BOLD, 16));
		CREATE_1.setBackground(new Color(255, 255, 255));
		CREATE_1.setBounds(504, 213, 151, 29);
		contentPane.add(CREATE_1);
		
		JButton CREATE_2 = new JButton("DELETE");
		CREATE_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE TO DELETION
				int pos=Integer.valueOf(DELETEPOSITION.getText());
				arr[pos]=0;
				String message="element delted @the position"+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				DELETEPOSITION.setText("");
			}
		});
		CREATE_2.setFont(new Font("Constantia", Font.BOLD, 16));
		CREATE_2.setBackground(new Color(255, 255, 255));
		CREATE_2.setBounds(448, 303, 151, 29);
		contentPane.add(CREATE_2);
		
		DELETEPOSITION = new JTextField();
		DELETEPOSITION.setColumns(10);
		DELETEPOSITION.setBounds(275, 302, 96, 27);
		contentPane.add(DELETEPOSITION);
		
		JLabel EnterArrayLength_1_1 = new JLabel("DELETE POSITION");
		EnterArrayLength_1_1.setForeground(new Color(64, 0, 64));
		EnterArrayLength_1_1.setFont(new Font("Constantia", Font.BOLD, 16));
		EnterArrayLength_1_1.setBounds(37, 307, 238, 20);
		contentPane.add(EnterArrayLength_1_1);
		
		ELEMENT = new JTextField();
		ELEMENT.setColumns(10);
		ELEMENT.setBounds(271, 212, 54, 27);
		contentPane.add(ELEMENT);
		
		JLabel EnterArrayLength_1_1_1 = new JLabel("POSITION");
		EnterArrayLength_1_1_1.setForeground(new Color(64, 0, 64));
		EnterArrayLength_1_1_1.setFont(new Font("Constantia", Font.BOLD, 16));
		EnterArrayLength_1_1_1.setBounds(335, 225, 81, 20);
		contentPane.add(EnterArrayLength_1_1_1);
		
		JButton DISPLAY = new JButton("DISPLAY");
		DISPLAY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DISPLAY
				String msg="";
				for(int i=0;i<=arr.length-1;i++)
				{
					msg=msg+" "+arr[i];
				}
				DISPLAYBOX.setText(msg);
			}
		});
		DISPLAY.setForeground(new Color(0, 128, 255));
		DISPLAY.setFont(new Font("Constantia", Font.BOLD, 16));
		DISPLAY.setBackground(new Color(255, 255, 255));
		DISPLAY.setBounds(232, 395, 151, 29);
		contentPane.add(DISPLAY);
		
		DISPLAYBOX = new JTextField();
		DISPLAYBOX.setColumns(10);
		DISPLAYBOX.setBounds(45, 474, 554, 27);
		contentPane.add(DISPLAYBOX);
	}
}
