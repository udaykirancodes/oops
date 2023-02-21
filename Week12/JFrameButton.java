import java.awt.event.*;
import javax.swing.*;

class JFrameButton implements ActionListener
{
	JFrameButton()
	{
		JFrame f=new JFrame("JButton Example");
		JButton b=new JButton("Close");
		b.setBounds(180,220,100,30);
		b.addActionListener(this);
		f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
	{
		System.exit(0);
	}

	public static void main(String[] args)
	{
		new JFrameButton();	
	}
}