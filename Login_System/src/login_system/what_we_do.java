package login_system;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.*;

 public class what_we_do extends JFrame {
 JPanel panel=new JPanel();
 JPanel npanel=new JPanel();
//Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
 JLabel jlb1=new JLabel("Our mission");
 Font font1=new Font("Arial",Font.BOLD,20);

JLabel jlb2=new JLabel("To help member who need blood for their sevicing comunities");
JLabel jlb3=new JLabel("Our Core Values");
JLabel jlb4=new JLabel("In addition to the mission statement above, our service adopted ");
JLabel jlb5=new JLabel("four guiding principles that define our role and value to independent");
JLabel jlb6=new JLabel("community blood centers: Innovation, Data Integration,Education, and Advocacy.");
JLabel jlb7=new JLabel("These core values can always be applied to the work we do, regardless of new changes");
JLabel jlb8=new JLabel("and challenges will arise within the emergency.. We are always committed to serving people");
JLabel jlb9 =new  JLabel("community blood centers, donors, and hospitals.");

JLabel jlb10=new JLabel("Helping Blood donor Serve Communities");
Font font2=new Font("Bold",Font.BOLD,30);
JLabel jlb11=new JLabel();

JTextArea jta=new JTextArea(300,200);

ImageIcon img1=new ImageIcon("index15.jpg");
JLabel jlb12=new JLabel(img1);

JLabel jlb13=new JLabel("Blood donors are essential to the blood supply.It is services by our member");
JLabel jlb14= new JLabel("blood centers rely on donors like you to help save lives.");

JLabel jlb15=new JLabel("Who will Help?");
JLabel jlb16=new JLabel("Donors");

     what_we_do()
     {
    setTitle("what we do");
    panel.setLayout(null);
    panel.setBackground(Color.white);
    add(panel);
    setSize(700,600);
    setVisible(true);
    setLocation(200,00);
    setResizable(false);
    label();
    label2();
    Using_panel();
    image();
    donor_info();
    }
     
    void label()
     {
     jlb1.setFont(font1);
     jlb1.setBounds(10,200,2000,50);
     jlb1.setForeground(Color.RED);
     panel.add(jlb1);
     jlb2.setBounds(10,220,2000,50);
     panel.add(jlb2);

    }
    
    void label2()
     {
     jlb3.setFont(font1);
     jlb3.setBounds(10,260,2000,50);
     jlb3.setForeground(Color.red);
     panel.add(jlb3);
     
     jlb4.setBounds(10,280 ,2000,50);
     panel.add(jlb4);
     jlb5.setBounds(10,300,2000,50);
     panel.add(jlb5);
     
     jlb6.setBounds(10,320,2000,50);
     panel.add(jlb6);
     jlb7.setBounds(10,340,2000,50);
     panel.add(jlb7);

     jlb8.setBounds(10,360,2000,50);
     panel.add(jlb8);

     jlb9.setBounds(10,380,2000,50);
     panel.add(jlb9);
    }

    void Using_panel()
     {
     panel.add(jta);
     jta.setBounds(0,0,2000,200);
     jta.setBackground(Color.red);
     panel.add(jta);
     jlb10.setForeground(Color.white);
     jlb10.setBounds(30,50,2000,90);
     jlb10.setFont(font2);
     jta.add(jlb10);
     }

    void image()
     {
     jlb12.setBackground(Color.red);
     jlb12.setBounds(510,0,200,200);
     panel.add(jlb12);
    }
    
    void donor_info()
     {
    jlb15.setFont(font1);
    jlb15.setBounds(10,420,2000,20);
    panel.add(jlb15);

    jlb16.setFont(font1);
    jlb16.setBounds(10,440,2000,20);
    jlb16.setForeground(Color.RED);
    panel.add(jlb16);

    jlb13.setBounds(10,460,2000,20);
    panel.add(jlb13);

    jlb13.setBounds(10,480,2000,20);
    panel.add(jlb13);
    jlb14.setBounds(10,500,2000,20);
    panel.add(jlb14);
    }
    
    public static void main(String args[])
    {

    what_we_do wd=new what_we_do();

    }
}
