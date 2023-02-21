import javax.swing.*;

class MenuExample
{
	public static void main(String[] args)
	{
		JFrame f=new JFrame("Menu Example");
		JMenuBar mb=new JMenuBar();
		JMenu menu=new JMenu("Menu");
		JMenu submenu=new JMenu("submenu");
		JMenuItem i1,i2,i3,i4;
		i1=new JMenuItem("item1");i2=new JMenuItem("item2");
		i3=new JMenuItem("item3");i4=new JMenuItem("item4");
		menu.add(i1);menu.add(i2);
		submenu.add(i3);submenu.add(i4);
		menu.add(submenu);
		mb.add(menu);
		f.setJMenuBar(mb);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}
}