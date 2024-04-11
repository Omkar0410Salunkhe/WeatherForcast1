package MyPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfname;
	private JLabel lbWelcome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbname = new JLabel("   name");
		lbname.setBounds(35, 26, 211, 14);
		contentPane.add(lbname);
		
		tfname = new JTextField();
		tfname.setBounds(49, 51, 366, 20);
		contentPane.add(tfname);
		tfname.setColumns(10);
		
		 lbWelcome = new JLabel("Welcome");
		lbWelcome.setBounds(61, 122, 353, 14);
		contentPane.add(lbWelcome);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=tfname.getName();
				lbWelcome.setText("hello"+s);
			}
		});
		btnOk.setBounds(242, 209, 89, 23);
		contentPane.add(btnOk);
	}
}
