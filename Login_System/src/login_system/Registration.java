
package login_system;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;


public class Registration extends JFrame implements ActionListener
{
    JPanel panel=new JPanel();

    JLabel label=new JLabel("Name:");
    JLabel plabel=new JLabel("Password:");

     JLabel jlb3=new JLabel("BLOOD DONOR REGISTRATION");
    JLabel jlb4=new JLabel("One of the best service for existing blood donor");

    Font f1=new Font("Arial",Font.BOLD,30);
    Font f2=new Font("Arial",Font.BOLD,20);

    JTextField jtf=new JTextField(15);

    JPasswordField ptf=new JPasswordField(15);
     // Dimension dim1=Toolkit.getDefaultToolkit().getScreenSize();

    JButton button=new JButton("Save");
    JButton reg=new JButton("Back");

     JLabel jlb5,jlb6,jlb7,jlb8,jlb9,jlb10,jlb11;

     JTextArea jta=new JTextArea(300,300);
     Font f3=new Font("Arial",Font.ITALIC,15);


     ImageIcon image;
   //JLabel imglabel=new JLabel();
//Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
    Connection con;
    Statement st;

    Registration(Connection con)
    {
        super("Registration");
        this.con=con;
        panel.setLayout(null);
        add(panel);
        setSize(500,400);
        setVisible(true);
        setLocation(200,200);
        setResizable(true);
        add_component();
        add_registration_imge();
        //sql_connection();
       // setLocation(200, 300);
        use_font1();
      password_field();
       use_font2();
    }


      void use_font1()
    {
         panel.setBackground(Color.WHITE);
           label.setForeground(Color.red);
    label.setBounds(20,120,150,30);
    jtf.setBounds(100,120,150,30);
    jtf.setBackground(Color.WHITE);
    jtf.setForeground(Color.BLUE);
    panel.add(label);
    panel.add(jtf);
    jlb3.setFont(f1);
    jlb3.setForeground(Color.BLACK);
    jlb3.setBounds(20,20,500,30);
    panel.add(jlb3);
    }

void password_field()
    {
   // panel.setBackground(Color.BLACK);
    plabel.setForeground(Color.red);
    plabel.setBounds(20,170,150,30);
    ptf.setBounds(100,170,150,30);
    ptf.setBackground(Color.WHITE);
    ptf.setForeground(Color.blue);
    panel.add(plabel);
    panel.add(ptf);
}
  void use_font2()
    {
    jlb4.setFont(f2);
    jlb4.setForeground(Color.red);
    jlb4.setBounds(20,45,500,20);
    panel.add(jlb4);


    }
void add_registration_imge()
    {
 image=new ImageIcon("index01.jpg");
JLabel imglabel=new JLabel(image);
imglabel.setBounds(280,120,100,120);
panel.add(imglabel);
}


    void add_component()
    {
        label.setBounds(20, 20, 80, 40);
        jtf.setBounds(110, 20, 80, 40);
        panel.add(plabel);
        panel.add(jtf);

        plabel.setBounds(20, 70, 80, 40);
        ptf.setBounds(110, 70, 80, 40);
        panel.add(label);
        panel.add(ptf);

        button.setBounds(20,240,100, 30);
        button.setBackground(Color.BLUE);
        button.setForeground(Color.WHITE);
        button.addActionListener(this);
        panel.add(button);

        reg.setBounds(130, 240, 100, 30);
        reg.setBackground(Color.BLUE);
        reg.setForeground(Color.WHITE);
        reg.addActionListener(this);
        panel.add(reg);


    }
    void sql_connection()
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Login_System","root","");
        System.out.println("Connection Successfull");
        }
        catch(Exception e)
        {
             System.out.println("Connection Failed");

        }

    }

    public void actionPerformed(ActionEvent ee)
    {
        if(ee.getSource()==button)
        {

            if(jtf.getText().equals("")||ptf.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please enter correct name and password");
            }
          else{
            try
            {
                String str="insert into Registration(Name,Password)"
                        + "values('"+jtf.getText()+"','"+ptf.getText()+"')";
                st=con.createStatement();
                st.execute(str);
                JOptionPane.showMessageDialog(null, "Save Successfull");


            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Wrong");
            }


        }
        }
        if(ee.getSource()==reg)
        {
            new Login();
            dispose();
        }


    }

}
