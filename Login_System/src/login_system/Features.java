
package login_system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Features extends JFrame
{
    JPanel panel=new JPanel();
    JLabel l=new JLabel();
    JLabel l1=new JLabel("=> Our service is a innovative and community-conscious organization.");    
    JLabel l2=new JLabel("=> We convey information clearly and succinctly both orally and in writing.");
    JLabel l3=new JLabel("=> We actively listen to others and remain fully present in the conversation");
    JLabel l4=new JLabel("=> We engage in open dialogue with others, promoting information flow across ");
    JLabel l5=new JLabel("      the organization.");
    JLabel l6=new JLabel("=> We share knowledge and express viewpoints openly and respectfully.");
    JLabel l7=new JLabel("=> We adapt communication to the needs of the audience.");
    JLabel l8=new JLabel("=> We seek to understand others’ viewpoints and ask questions to clarify understanding.");
    JLabel l9=new JLabel("=> Our service is responsible for strategically leveraging the goals of blood management");
    JLabel l10=new JLabel("=> Our system and our expert staff is versatile and driven by challenges.");
    JLabel l11=new JLabel("=> Our service locations are involved  public service endeavours.");
    JLabel l12=new JLabel("=> Our staff are actively encouraged to gain new skills through career development ");
    JLabel l13=new JLabel("      opportunities such as training.");
    JLabel l14=new JLabel();
    JLabel l15=new JLabel();
    JLabel l16=new JLabel();
    JLabel l17=new JLabel();
    JLabel l18=new JLabel();
    JLabel l19=new JLabel();
    JLabel l20=new JLabel();
    
    Font ft1=new Font("BOLD",Font.BOLD,20);
    
    Features()
    {
        super("Features");
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
          l=new JLabel("Features of our Blood Donation Management");
          l.setForeground(Color.BLUE);
          l.setFont(ft1);
          l.setBounds(30,10,1000,50);
          panel.add(l);
          
    l1.setBackground(Color.BLACK);
    l1.setBounds(50,60,1000,30);
    panel.add(l1);
    
    l2.setBackground(Color.BLACK);
    l2.setBounds(50,85,1000,30);
    panel.add(l2);
    
    l3.setBackground(Color.BLACK);
    l3.setBounds(50,110,1000,30);
    panel.add(l3);
    
    l4.setBackground(Color.BLACK);
    l4.setBounds(50,135,1000,30);
    panel.add(l4);
    
    l5.setBackground(Color.BLACK);
    l5.setBounds(50,160,1000,30);
    panel.add(l5);
    
    l6=new JLabel();
    //l6.setForeground(Color.BLUE);
          //lb.setFont(ft2);
    l6.setBounds(10,185,1000,30);
    panel.add(l6);
      
    
    l7.setBackground(Color.BLACK);
    l7.setBounds(50,180,1000,30);
    panel.add(l7);
    
    l8.setBackground(Color.BLACK);
    l8.setBounds(50,210,1000,30);
    panel.add(l8);
    
    l9.setBackground(Color.BLACK);
    l9.setBounds(50,235,1000,30);
    panel.add(l9);
    
    l10.setBackground(Color.BLACK);
    l10.setBounds(50,260,1000,30);
    panel.add(l10);
    
    // health=new JLabel("HEALTH");
      //    health.setForeground(Color.BLUE);
        //  health.setFont(ft3);
          //health.setBounds(10,290,1000,50);
     //     panel.add(health);
          
    l11.setBackground(Color.BLACK);
    l11.setBounds(50,285,1000,30);
    panel.add(l11);
    
    l12.setBackground(Color.BLACK);
    l12.setBounds(50,310,1000,30);
    panel.add(l12);
    
    l13.setBackground(Color.BLACK);
    l13.setBounds(50,335,1000,30);
    panel.add(l13);
    
    l14.setBackground(Color.BLACK);
    l14.setBounds(50,360,1000,30);
    panel.add(l14);
    
    l15.setBackground(Color.BLACK);
    l15.setBounds(50,385,1000,30);
    panel.add(l15);
    
    l16.setBackground(Color.BLACK);
    l16.setBounds(50,410,1000,30);
    panel.add(l16);
    
    l17.setBackground(Color.BLACK);
    l17.setBounds(50,435,1000,30);
    panel.add(l17);
    
    l18.setBackground(Color.BLACK);
    l18.setBounds(50,460,1000,30);
    panel.add(l18);
    }
    
    public static void main(String args[])
    {
   //     new Features();
    }
}
