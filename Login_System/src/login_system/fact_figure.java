
package login_system;

 import java.awt.*;
 import java.awt.*;
 import java.awt.Image;
 import javax.swing.*;

public class fact_figure extends JFrame {
    JPanel jp=new JPanel();
    JLabel jlb1,jlb2,jlb3,jlb4,jlb5,jlb6,jlb7,jlb8,jlb9,jlb10;

    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    JLabel jlb11=new JLabel("Facts & Figures");
    Font f1=new Font("Arial",Font.BOLD,50);

    JLabel jlb12=new JLabel("Here are a few interesting statistics & facts about blood: ");
    Font f2=new Font("Arial",Font.BOLD,30);
    JLabel jlb13=new JLabel("_____________________________________________________________________________________________");

    
    fact_figure()
    {
    setTitle("Facts & Figure");
    jp.setLayout(null);
    add(jp);
    setSize(dim);
    setVisible(true);
    setResizable(false);
    Title();
    title2();
    add_all_image();
    }
void Title()
    {
  jp.setBackground(Color.WHITE);
  jlb11.setFont(f1);
  jlb11.setBounds(300,20,2000,60);
  jp.add(jlb11);

  //ImageIcon image1=new ImageIcon("fact_index.jpg");
  //jlb1=new JLabel(image1);

}
void title2()
   {
   jlb12.setFont(f2);
   jlb12.setForeground(Color.red);
   jlb12.setBounds(20,60 ,1000,60);
   jp.add(jlb12);
 jlb13.setFont(f2);
 jlb13.setBounds(20,75,2000,40);
 jp.add(jlb13);

}

void add_all_image()
    {
   ImageIcon image1=new ImageIcon("fact_index1.jpg");
   jlb1=new JLabel(image1);
   jlb1.setBounds(20,105,300,300);
   jp.add(jlb1);

ImageIcon image2=new ImageIcon("fact_index2.jpg");
jlb2=new JLabel(image2);
jlb2.setBounds(320,105,300,300);
jp.add(jlb2);

ImageIcon image3=new ImageIcon("fact_index3.jpg");
jlb3=new JLabel(image3);
jlb3.setBounds(650,105,300,300);
jp.add(jlb3);

ImageIcon image4=new ImageIcon("fact_index4.jpg");
jlb4=new JLabel(image4);
jlb4.setBounds(990,105,300,300);
jp.add(jlb4);

ImageIcon image5=new ImageIcon("fact_index5.jpg");
jlb5=new JLabel(image5);
jlb5.setBounds(20,400,300 ,300);
jp.add(jlb5);

ImageIcon image6=new ImageIcon("fact_index6.jpg");
jlb6=new JLabel(image6);
jlb6.setBounds(320,400,300,300);
jp.add(jlb6);

ImageIcon image7=new ImageIcon("fact_index7.jpg");
jlb7=new JLabel(image7);
jlb7.setBounds(990,400,300,300);
jp.add(jlb7);

ImageIcon image8=new ImageIcon("fact_index8.jpg");
jlb8=new JLabel(image8);
jlb8.setBounds(650,400,300,300);
jp.add(jlb8);
}



    public static void main(String args[])
    {

    fact_figure fg=new fact_figure();

    }


}


