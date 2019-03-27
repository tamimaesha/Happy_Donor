
package login_system;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class View extends JFrame implements ActionListener
{
    JPanel panel=new JPanel();
    JLabel lb1=new JLabel();
    JTextField f1=new JTextField("search(id)",20);
    JButton b1=new JButton("Search");
    
    View()
    {
        super("Search page");
        panel.setLayout(null);
        add(panel);
        panel.setBackground(Color.WHITE);
        setSize(600,540);
        setLocation(100,20);
        setVisible(true);
        setResizable(false);
        method();
    }
    
    void method()
            
    {
        f1.setBounds(200, 100, 100, 50);
        f1.setEditable(true);
        panel.add(f1);
        
        b1.setBounds(200, 200, 100, 50);
        //b1.setEditable(true);
        add(b1);
        b1.setEnabled(true);
        panel.add(b1);
        b1.addActionListener(this);
        
    }
    
    public static void main(String args[])
    {
        new View();
    }

    public void actionPerformed(ActionEvent e)
    {
       
    }
}
