
package login_system;

import java.awt.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.*;
import sun.font.Font2D;

public class life_saver extends JFrame {

    JPanel jp=new JPanel();
    JLabel jlb1,jlb2,jlb3,jlb4,jlb5,jlb6,jlb7,jlb8,jlb9,jlb10,jlb11,jlb12,j1b13,jlb14;




    JLabel jlb15=new JLabel("HOW BLOOD SAVE LIFE");
    JLabel jlb16=new JLabel("_______________________");

    Font f1=new Font("Arial",Font.BOLD,10);

    Font f2=new Font("Arial",Font.PLAIN,30);

    Font f3=new Font("Arial",Font.PLAIN,30);

    life_saver()
    {
    setTitle("Be Donor");
    jp.setLayout(null);
    add(jp);
    setSize(600,540);
    setVisible(true);
    setLocation(100,20);
    setResizable(false);
    title();
    Add_Donor();


    }
    void title()
    {
    jlb15.setForeground(Color.RED);
    jlb15.setFont(f2);
    jlb15.setBounds(20,30, 1500,50);
    jp.add(jlb15);

    jlb16.setForeground(Color.red);
    jlb16.setFont(f3);
    jlb16.setBounds(20,40,1500,50);
    jp.add(jlb16);

    }

    void Add_Donor()
    {
        jp.setBackground(Color.white);

    jlb1=new JLabel("Life Saver is basically an idea to spread awareness about");
   // jlb1.setFont(f1);
    jlb1.setForeground(Color.BLACK);
    jlb1.setBounds(40,100,1000 ,20 );
    jp.add(jlb1);
    
   jlb2=new JLabel( "blood donation. Its a common fact that, many people do not know");
  // jlb2.setFont(f1);
   jlb2.setForeground(Color.BLACK);
   jlb2.setBounds(40,130,1000,20);
   jp.add(jlb2);
   
   jlb3 =new  JLabel("about the importance of blood donation and equal number of people");
  // jlb3.setFont(f1);
   jlb3.setForeground(Color.BLACK);
   jlb3.setBounds(40,160,1000,20);
   jp.add(jlb3);
   
   jlb4 =new JLabel("who are aware about it,");
   //jlb4.setFont(f1);
   jlb4.setForeground(Color.BLACK);
   jlb4.setBounds(40,190,1000,20);
   jp.add(jlb4);
   
   jlb5=new JLabel("are unaware about the chances when and where they can donate.This");
  // jlb5.setFont(f1);
   jlb5.setForeground(Color.BLACK);
   jlb5.setBounds(40,220,2000,20);
   jp.add(jlb5);
   
   jlb6 =new JLabel("website serves to 5 kinds of people. The unaware people, people who are");
   //jlb6.setFont(f1);
   jlb6.setForeground(Color.BLACK);
   jlb6.setBounds(40,250,2000,20);
   jp.add(jlb6);
   
   jlb7 =new  JLabel("willing to donate but do not know when and where to donate, hospital managements");
   //jlb7.setFont(f1);
   jlb7.setForeground(Color.BLACK);
   jlb7.setBounds(40,280,2000 ,20);
   jp.add(jlb7);
   
   
   jlb8= new JLabel("who blindly search through network for a blood donor during emergency cases,");
  // jlb8.setFont(f1);
   jlb8.setForeground(Color.BLACK);
   jlb8.setBounds(40,310,2000,20);
   jp.add(jlb8);
   
   jlb9= new  JLabel("blood donation camps and doctors who want to spread awareness.");
  // jlb9.setFont(f1);
   jlb9.setForeground(Color.BLACK);
   jlb9.setBounds(40,340,2000,20);
   //jlb9.setBounds(40,,500,20);
   jp.add(jlb9);


    }

public static void main(String args[])
    {
//life_saver lf=new life_saver();
}
}