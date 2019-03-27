

package login_system;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.*;
public class tips extends JFrame{
JPanel panel=new JPanel();

   Font font1=new Font("BOLD",Font.BOLD,20);
   Font font2=new Font("BOLD",Font.BOLD,20);
   Font font3=new Font("BOLD",Font.BOLD,20);

   ImageIcon ic=new ImageIcon("tips.jpg");
   JLabel l=new JLabel(ic);

   //Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
   JLabel lb1=new JLabel("Before Your Donation");
   JLabel lb2=new JLabel(">>Maintain a healthy iron level in your diet by eat-");
   JLabel lb3=new JLabel("     ing iron rich foods, such as red meat, fish, poul-");
   JLabel lb4=new JLabel("     try, beans, spinach, iron-fortified cereals and raisins.");
   JLabel lb5=new JLabel(">>Get a good night's sleep.");
   JLabel lb6=new JLabel(">>Drink an extra 16 oz. of water or nonalcoholic flu-");
   JLabel lb7=new JLabel("     ids before the donation");
   JLabel lb8=new JLabel(">>Eat a healthy meal before your donation. Avoid fatty");
   JLabel lb9=new JLabel("     foods,such as hamburgers,fries or ice cream before donating");
   JLabel lb10=new JLabel(">>Remember to bring your donor card");

   JLabel lb11=new JLabel("During Your Donation");
   JLabel lb12=new JLabel(">>Wear clothing with sleeves that can be raised above the elbow.");
   JLabel lb13=new JLabel(">>Let the person taking your blood know if you have a preferred arm and show them any good");
   JLabel lb14=new JLabel("    veins that have been used successfully in the past to draw blood.");
   JLabel lb16=new JLabel(">>Relax, listen to music, talk to other donors or read during the donation process.");
   JLabel lb18=new JLabel(">>Take the time to enjoy a snack and a drink in the refreshments area immediately after donating.");
   JLabel lb20=new JLabel("After Your Donation");
   JLabel lb21=new JLabel(">>Drink an extra four (8 ounce) glasses of liquids and avoid alcohol over the next 24 hours.");
   JLabel lb23=new JLabel(">>Remove the wrap bandage within the next hour.");
   JLabel lb24=new JLabel(">>Do not do any heavy lifting or vigorous exercise for the rest of the day.");
   JLabel lb26=new JLabel(">>Avoid driving if you feel the least bit faint");
   JLabel lb27=new JLabel(">>If you feel unwell at any stage after giving blood,call the blood service or see your doctor.");

   tips()
   {
   super("Tips for a Successful Donation");
   panel.setLayout(null);
   add(panel);
   panel.setBackground(Color.WHITE);
   setSize(700,590);
   setVisible(true);
   setLocation(200,100);
   setResizable(false);
   method();
   }

   void method()
   {

    lb1.setForeground(Color.BLUE);
    lb1.setFont(font1);
    lb1.setBounds(50,0,1000,50);
    panel.add(lb1);


    l.setBounds(440,0, 300,200);
    panel.add(l);

    lb2.setBackground(Color.BLACK);
    lb2.setBounds(50,40,1000,30);
    panel.add(lb2);

    lb3.setBackground(Color.BLACK);
    lb3.setBounds(50,60,1000,30);
    panel.add(lb3);

    lb4.setBackground(Color.BLACK);
    lb4.setBounds(50,80,1000,30);
    panel.add(lb4);

    lb5.setBackground(Color.BLACK);
    lb5.setBounds(50,100,1000,30);
    panel.add(lb5);

    lb6.setBackground(Color.BLACK);
    lb6.setBounds(50,120,1000,30);
    panel.add(lb6);

    lb7.setBackground(Color.BLACK);
    lb7.setBounds(50,140,1000,30);
    panel.add(lb7);


    lb8.setBackground(Color.BLACK);
    lb8.setBounds(50,160,1000,30);
    panel.add(lb8);
    lb9.setBackground(Color.BLACK);
    lb9.setBounds(50,180,1000,30);
    panel.add(lb9);
    lb10.setBackground(Color.BLACK);
    lb10.setBounds(50,200,1000,30);
    panel.add(lb10);

    lb11.setForeground(Color.BLUE);
    lb11.setFont(font2);
    lb11.setBounds(50,230,1000,30);
    panel.add(lb11);

     lb12.setBackground(Color.BLACK);
     lb12.setBounds(50,260,1000,30);
     panel.add(lb12);

     lb13.setBackground(Color.BLACK);
     lb13.setBounds(50,280,1000,30);
     panel.add(lb13);

     lb14.setBackground(Color.BLACK);
     lb14.setBounds(50,300,1000,30);
     panel.add(lb14);

     lb16.setBackground(Color.BLACK);
     lb16.setBounds(50,320,1000,30);
     panel.add(lb16);

     lb18.setBackground(Color.BLACK);
     lb18.setBounds(50,340,1000,30);
     panel.add(lb18);

     lb20.setForeground(Color.BLUE);
     lb20.setFont(font3);
     lb20.setBounds(50,370,1000,30);
     panel.add(lb20);

     lb21.setBackground(Color.BLACK);
     lb21.setBounds(50,400,1000,30);
     panel.add(lb21);

     lb23.setBackground(Color.BLACK);
     lb23.setBounds(50,420,1000,30);
     panel.add(lb23);

          lb24.setBackground(Color.BLACK);
     lb24.setBounds(50,440,1000,30);
     panel.add(lb24);

          lb26.setBackground(Color.BLACK);
     lb26.setBounds(50,460,1000,30);
     panel.add(lb26);

          lb27.setBackground(Color.BLACK);
     lb27.setBounds(50,480,1000,30);
     panel.add(lb27);

   }

   public static void main(String args[])
   {
   new tips();
}
}
