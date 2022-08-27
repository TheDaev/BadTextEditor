import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;

public class Credit extends JFrame implements ActionListener{
	
	
	JLabel creditText;
	JLabel c2;
	
	Credit(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Credit");
		this.setSize(300,300);
		this.setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		
		
		creditText = new JLabel("By Me");
		c2 = new JLabel("\r For me.");
		
		
		
		this.add(creditText);
		this.add(c2);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
