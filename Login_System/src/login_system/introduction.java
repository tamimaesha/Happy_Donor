

package login_system;


import java.awt.*;
import javax.swing.*;


public class introduction  extends JFrame {
JFrame jf=new JFrame();
JPanel jp=new JPanel();
ImageIcon image1,image2,image3,image4,image5;
JLabel jlb1,jlb2,jlb3,jlb4,jlb5,jlb6,jlb7,jlb8,jlb9,jlb10,jlb11,jlb12,jlb13,jlb14,jlb15
 ,jlb16,jlb17,jlb18;

JTextArea jta=new JTextArea(90,10);

Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();

Font f1=new Font("Arial",Font.BOLD,60);
Font f2=new Font("Arial",Font.ITALIC,30);
Font f3=new Font("Arial",Font.ROMAN_BASELINE,30);
Font f4=new Font("SANS_SERIF",Font.PLAIN,30);

Scrollbar bar1=new Scrollbar();
Scrollbar bar2=new Scrollbar();


introduction()
    {
  setTitle("Home");
  jp.setLayout(null);
  add(jp);
  setVisible(true);
  setSize(dim);

  scrol();
  use_font();

    image();
   area_label();
   use_font2();
   image2();
   add_for_image2();
   use_font3();
   }

void scrol()
    {
  bar1=new Scrollbar(Scrollbar.VERTICAL);
   jp.add(bar1);
  add("East",bar1);


   bar2=new Scrollbar(Scrollbar.HORIZONTAL);
   jp.add(bar2);
   add("South",bar2);



}

void use_font()
    {

    jlb2=new JLabel("What Is Blood?");
jlb2.setForeground(Color.red);
    jlb2.setFont(f1);
jlb2.setBounds(10,0,500,100);
jp.add(jlb2);


}


void use_font2()
    {
   jlb10=new JLabel("One Unit Of Blood Can Be Separated into the Following Components....");
    jlb10.setFont(f2);
   jlb10.setForeground(Color.red);
    jlb10.setBounds(10,260,1000,40);
    jp.add(jlb10);

}


 void  area_label()

  {

  jlb4=new JLabel("Blood is the red fluid that"
        + " circulates in our blood vessels,");
  jlb4.setForeground(Color.RED);
  jlb4.setBounds(10,100,400,30);
  jp.add(jlb4);

  jlb5=new JLabel (" i.e.veins and arteries. The main function of blood is to act as the");
  jlb5.setForeground(Color.BLUE);
  jlb5.setBounds(10,120,500,30);
  jp.add(jlb5);

 jlb6=new JLabel  (" body’s transport system, but it al so has a major role in the body’s defense");
 jlb6.setForeground(Color.red);
 jlb6.setBounds(10, 140,700,30);
 jp.add(jlb6);

 jlb7=new JLabel("against infection. There is no substitute for blood. It cannot be made ");
 jlb7.setForeground(Color.BLUE);
 jlb7.setBounds(10,160,900,30);
 jp.add(jlb7);

 jlb8 =new JLabel( "or manufactured. Donors are the only source of ");
 jlb8.setForeground(Color.red);

 jlb8.setBounds(10,180,900,30);

 jp.add(jlb8);



 jlb9=new  JLabel ("blood for patients who need it.") ;
 jlb9.setForeground(Color.BLUE);
 jlb9.setBounds(10,200,900,30);
 jp.add(jlb9);

  jta.setBounds(10,100,500,140);
  jta.setBackground(Color.WHITE);
//jta.setForeground(Color.BLUE);4e
  jp.add(jta);



}


void image()
    {
    jp.setBackground(Color.GRAY);
    image1=new ImageIcon("index3.png");
    jlb1=new JLabel(image1);
    jlb1.setBounds(800,40,750,200);
    jp.add(jlb1);

}
void image2()
    {
    jp.setBackground(Color.BLACK);
 image2=new ImageIcon("index5.jpg");
 jlb11=new JLabel(image2);
jlb11.setBounds(10,290 ,700,400);
jp.add(jlb11);


}
void add_for_image2()
    {
jlb12=new JLabel(" In the following picture Nearly half the volume of blood consists of cells,"
        + " which include red blood cells, white blood cells, and platelets.");
 jlb13=new JLabel( " The remainder is a fluid called plasma.");
        
   jlb12.setForeground(Color.magenta);
   jlb12.setBounds(20,300,800,50);
   jp.add(jlb12);


   jlb13.setForeground(Color.MAGENTA);
   jlb13.setBounds(20,320,400,50);
   jp.add(jlb13);

}
 void use_font3()
    {
 jlb14=new JLabel("Blood cell is Produced in bone maro");
 jlb14.setForeground(Color.WHITE);
 jlb14.setBounds(10,600 ,400,50);
 jp.add(jlb14);


 }


void add_for_image3()
    {



}
/*void label()
    {

 jlb2=new JLabel("What is Blood?");
jlb2.setForeground(Color.red);
 jlb2.setBounds(20,200,500,60);
jp.add(jlb2);
} */
public static void main(String args[])
        {
    introduction mh=new introduction();

}
}
