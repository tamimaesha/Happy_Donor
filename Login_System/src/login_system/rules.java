
package login_system;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.*;

public class rules extends JFrame
{
    JPanel panel=new JPanel();
    ImageIcon ic=new ImageIcon("picture.jpg");
    JLabel l=new JLabel(ic);
    //Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
    Font ft1=new Font("BOLD",Font.BOLD,20);
    Font ft2=new Font("BOLD",Font.BOLD,15);
    Font ft3=new Font("BOLD",Font.BOLD,15);
    
    JLabel health=new JLabel();
    JLabel lb=new JLabel();
    JLabel lb1=new JLabel();
    JLabel lb2=new JLabel(" Giving blood is an excellent way to support people in need,even");
    JLabel lb3=new JLabel(" if you don't have the means to do so financially.In some areas,");
    JLabel lb4=new JLabel(" you may also be able to make money by donating blood.Whatever");
    JLabel lb5=new JLabel(" your motives,it is important to understand blood donation regu-");
    JLabel lb6=new JLabel(" lations before you begin");
    
    JLabel lb7=new JLabel(" The minimum legal age to donate blood in most states is 17 years");
    JLabel lb8=new JLabel(" of age.Some states may allow 16-year-olds to donate with parental");
    JLabel lb9=new JLabel(" consent.Donors over the age of 18 must weigh at least 110 pounds;");
    JLabel lb10=new JLabel(" additional weight limitations apply to high school students.");
    
    JLabel lb11=new JLabel(" Blood donors must not have any illnesses or diseases that could");
    JLabel lb12=new JLabel(" be transmitted through the donated blood; they must also be in ");
    JLabel lb13=new JLabel(" good health, and keep conditions such as: ");
    JLabel lb14=new JLabel("=>Diabetes under control");
    JLabel lb15=new JLabel("=>HIV under control");
    JLabel lb16=new JLabel("=>Hepatitis under control");
    JLabel lb17=new JLabel("=>Pregnancy");
    JLabel lb18=new JLabel("=>Fever undre control.");
    rules()
    {
    super("Rules");
    panel.setLayout(null);
    add(panel);
    panel.setBackground(Color.WHITE);
    //setSize(dim);
    setSize(600,540);
    setLocation(100,20);
    setVisible(true);
    setResizable(false);
    method();
    }
    
    void method()
    {
    
    
          lb1=new JLabel("RULES & REGULATION of BLOOD DONATE");
          lb1.setForeground(Color.red);
          lb1.setFont(ft1);
          lb1.setBounds(10,10,1000,50);
          panel.add(lb1);
          

          l.setBounds(430,0, 100,180);
          panel.add(l);
          
    lb2.setBackground(Color.BLACK);
    lb2.setBounds(50,50,1000,30);
    panel.add(lb2);
    
       lb3.setBackground(Color.BLACK);
    lb3.setBounds(50,70,1000,30);
    panel.add(lb3);
    
       lb4.setBackground(Color.BLACK);
    lb4.setBounds(50,90,1000,30);
    panel.add(lb4);
    
       lb5.setBackground(Color.BLACK);
    lb5.setBounds(50,110,1000,30);
    panel.add(lb5);
    
       lb6.setBackground(Color.BLACK);
    lb6.setBounds(50,130,1000,30);
    panel.add(lb6);
    
                    lb=new JLabel("MINIMUM REQUIREMENTS");
          lb.setForeground(Color.BLUE);
          lb.setFont(ft2);
          lb.setBounds(10,160,1000,50);
          panel.add(lb);
      
    
       lb7.setBackground(Color.BLACK);
    lb7.setBounds(50,200,1000,30);
    panel.add(lb7);
       lb8.setBackground(Color.BLACK);
    lb8.setBounds(50,220,1000,30);
    panel.add(lb8);
       lb9.setBackground(Color.BLACK);
    lb9.setBounds(50,240,1000,30);
    panel.add(lb9);
       lb10.setBackground(Color.BLACK);
    lb10.setBounds(50,260,1000,30);
    panel.add(lb10);
    
     health=new JLabel("HEALTH");
          health.setForeground(Color.BLUE);
          health.setFont(ft3);
          health.setBounds(10,290,1000,50);
          panel.add(health);
          
             lb11.setBackground(Color.BLACK);
    lb11.setBounds(50,330,1000,30);
    panel.add(lb11);
    
       lb12.setBackground(Color.BLACK);
    lb12.setBounds(50,350,1000,30);
    panel.add(lb12);
    
       lb13.setBackground(Color.BLACK);
    lb13.setBounds(50,370,1000,30);
    panel.add(lb13);
    
       lb14.setBackground(Color.BLACK);
    lb14.setBounds(50,390,1000,30);
    panel.add(lb14);
    
       lb15.setBackground(Color.BLACK);
    lb15.setBounds(50,410,1000,30);
    panel.add(lb15);
    
       lb16.setBackground(Color.BLACK);
    lb16.setBounds(50,430,1000,30);
    panel.add(lb16);
    
       lb17.setBackground(Color.BLACK);
    lb17.setBounds(50,450,1000,30);
    panel.add(lb17);
    
       lb18.setBackground(Color.BLACK);
    lb18.setBounds(50,470,1000,30);
    panel.add(lb18);
    
    }
    public static void main(String args[])
    {
    new rules();
    }
}
