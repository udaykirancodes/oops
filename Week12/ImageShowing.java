import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;
 
class ImageShowing
{
    public static void main(String[] args)
    {  
        JFrame f=new JFrame();
        ImageIcon icon = new ImageIcon("androidBook.jpg");
        JLabel label = new JLabel(icon);
        JButton b=new JButton("Push");
        b.setBounds(180,220,100,30);
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                f.add(label);
            }

        } );
        f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f.setSize(400,400);
        f.setLayout(null);  
        f.setVisible(true);  
    }
}