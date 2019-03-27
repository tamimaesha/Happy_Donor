package login_system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Help extends JFrame
{
    JPanel panel=new JPanel();
    
    Font font1=new Font("BOLD",Font.BOLD,20);
    Font font2=new Font("BOLD",Font.BOLD,15);
    Font font3=new Font("BOLD",Font.BOLD,15);
    Font font4=new Font("BOLD",Font.BOLD,20);
    Font font5=new Font("BOLD",Font.BOLD,15);
    
    JLabel lb1=new JLabel("Follow the steps to get help");
    JLabel lb2=new JLabel("1) If you are a new donor");
    JLabel lb3=new JLabel(" > You must login here.");
    JLabel lb4=new JLabel(" > If you login here,at first you collect an ID card.");
    JLabel lb5=new JLabel(" > You login with your name,id,blood group,sex,contact number,age.");
    JLabel lb6=new JLabel(" > After saving all information you are a register member of our site");
    JLabel lb7=new JLabel("2) If you are a register donor of our site");
    JLabel lb8=new JLabel(" > You will come here with ur ID card otherwish not allow");
    JLabel lb9=new JLabel(" > You can't give blood within three months");
    JLabel lb10=new JLabel("Only for emergency");
    JLabel lb11=new JLabel("Please call this number:");
    JLabel lb12=new JLabel("01828464343");
    JLabel lb13=new JLabel("01836057503");
    
    Help()
    {
    super("Help");
    panel.setLayout(null);
    add(panel);panel.setBackground(Color.WHITE);
    setSize(500,500);
    setLocation(300, 100);
    setVisible(true);
    setResizable(false);
    method();
    }
    
    void method()
    {
    lb1.setForeground(Color.BLUE);
    lb1.setFont(font1);
    lb1.setBounds(20, 20, 500, 40);
    panel.add(lb1);
    
    lb2.setForeground(Color.BLACK);
    lb2.setFont(font2);
    lb2.setBounds(20, 50, 500, 30);
    panel.add(lb2);
    
    lb3.setForeground(Color.BLACK);
    lb3.setBounds(20, 80, 500, 20);
    panel.add(lb3);
    
    lb4.setForeground(Color.BLACK);
    lb4.setBounds(20, 100, 500, 20);
    panel.add(lb4);
    
    lb5.setForeground(Color.BLACK);
    lb5.setBounds(20, 120, 500, 20);
    panel.add(lb5);
    
    lb6.setForeground(Color.BLACK);
    lb6.setBounds(20, 140, 500, 20);
    panel.add(lb6);
    
    lb7.setForeground(Color.BLACK);
    lb7.setFont(font3);
    lb7.setBounds(20, 160, 500, 30);
    panel.add(lb7);
    
    lb8.setForeground(Color.BLACK);
    lb8.setBounds(20, 190, 500, 20);
    panel.add(lb8);
    
    lb9.setForeground(Color.BLACK);
    lb9.setBounds(20, 210, 500, 20);
    panel.add(lb9);
    
    lb10.setForeground(Color.BLUE);
    lb10.setFont(font4);
    lb10.setBounds(20, 230, 500, 40);
    panel.add(lb10);
    
    lb11.setForeground(Color.BLACK);
    lb11.setFont(font5);
    lb11.setBounds(20, 260, 500, 20);
    panel.add(lb11);
    
    lb12.setForeground(Color.BLUE);
    lb12.setFont(font2);
    lb12.setBounds(20, 280, 500, 30);
    panel.add(lb12);
    
    lb13.setForeground(Color.BLUE);
    lb13.setFont(font2);
    lb13.setBounds(20, 300, 500, 30);
    panel.add(lb13);
    
    }
    public static void main(String args[])
    {
    new Help();
    }
}
