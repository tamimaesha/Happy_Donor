package login_system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.text.*;
import java.sql.*;
import javax.swing.*;

public class donor_list extends JFrame implements ActionListener
{

    JPanel panel = new JPanel();
    JMenuBar br = new JMenuBar();
    JMenu menu1 = new JMenu("Donar list");
    JButton b1 = new JButton("Save");
    JButton b2 = new JButton("Back");
    JLabel l1 = new JLabel("Name:");
    JLabel l2 = new JLabel("ID:");
    JLabel l3 = new JLabel("Blood group:");
    JLabel l4 = new JLabel("Sex:");
    JLabel l5 = new JLabel("Contact num :");
    JLabel l6 = new JLabel("Age:");
    JLabel l7 = new JLabel("Mail:");
    JLabel l8 = new JLabel("Occupation:");
    JLabel l9 = new JLabel("Address:");
    
    
    
    JComboBox box;
    JTextField f1 = new JTextField(20);
    JTextField f2 = new JTextField(20);
    JTextField f3 = new JTextField(20);
    JTextField f4 = new JTextField(20);
    JTextField f5 = new JTextField(20);
    JTextField f6=  new JTextField(20);
    JTextField f7=  new JTextField(20);
    JTextField f8=  new JTextField(20);
    
    ImageIcon img=new ImageIcon("Windows_Vista(1).jpg");
    ImageIcon img2=new ImageIcon("Windows_Vista(2).jpg");
    ImageIcon img3=new ImageIcon("Windows_Vista(3).jpg");
    JLabel lbimg=new JLabel(img);
    JLabel lbimg2=new JLabel(img2);
    JLabel lbimg3=new JLabel(img3);
    
    Connection con;
    Statement st = null;
    ResultSet rs;

    donor_list(Connection con)
    {
        this.con = con;
        setTitle("Donor list");
        //super("DONOR LIST");
        panel.setLayout(null);
        add(panel);
        setSize(500, 500);
        setLocation(300, 200);
        setResizable(true);
        setVisible(true);

        method();
    }
    void method()
    {
        panel.setBackground(Color.white);
        menu1.setForeground(Color.WHITE);
        br.add(menu1);
        br.setBackground(Color.BLUE);
        setJMenuBar(br);

        String ob[] = {"Select", "Male", "Female"};
        box = new JComboBox(ob);
        box.setBounds(150, 100, 100, 20);
        box.setBackground(Color.white);
        box.setForeground(Color.BLACK);
        panel.add(box);

        l1.setBounds(55, 10, 80, 20);
        l1.setForeground(Color.BLACK);
        panel.add(l1);
        f1.setBounds(150, 10, 100, 20);
        panel.add(f1);

        l2.setBounds(55, 40, 80, 20);
        l2.setForeground(Color.RED);
        panel.add(l2);
        f2.setBounds(150, 40, 100, 20);
        panel.add(f2);

        l3.setBounds(55, 70, 80, 20);
        l3.setForeground(Color.BLACK);
        panel.add(l3);
        f3.setBounds(150, 70, 100, 20);
        panel.add(f3);

        l4.setBounds(55, 100, 80, 20);
        l4.setForeground(Color.RED);
        panel.add(l4);
        //f1.setBounds(70,10,50,20);
        //panel.add(f1);

        l5.setBounds(55, 130, 80, 20);
        l5.setForeground(Color.BLACK);
        panel.add(l5);
        f4.setBounds(150, 130, 100, 20);
        panel.add(f4);

        l6.setBounds(55, 160, 80, 20);
        l6.setForeground(Color.RED);
        panel.add(l6);
        f5.setBounds(150, 160, 100, 20);
        panel.add(f5);
        
        l7.setBounds(55, 190, 80, 20);
        l7.setForeground(Color.BLACK);
        panel.add(l7);
        f6.setBounds(150, 190, 100, 20);
        panel.add(f6);
        
        l8.setBounds(55, 220, 80, 20);
        l8.setForeground(Color.RED);
        panel.add(l8);
        f7.setBounds(150, 220, 100, 20);
        panel.add(f7);
        
        l9.setBounds(55, 250, 80, 20);
        l9.setForeground(Color.BLACK);
        panel.add(l9);
        f8.setBounds(150, 250, 100, 20);
        panel.add(f8);
        
        b1.setBounds(150, 280, 100, 20);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        panel.add(b1);
        
        //lbimg.setBounds(250,10,200,200);
        //lbimg.setBackground(Color.white);
        //panel.add(lbimg);
        //lbimg2.setBounds(300,150,200,200);
        //panel.add(lbimg2);
        //lbimg3.setBounds(300,200,200,200);
       // panel.add(lbimg3);
    
        b2.setBounds(150, 300, 100, 20);
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        panel.add(b2);
    }

    public void actionPerformed(ActionEvent eat)
    {
        if (eat.getSource() == b1)
        {
            if (f1.getText().equals("") || f2.getText().equals("") || f3.getText().equals("") || f4.getText().equals("") || f5.getText().equals("") || f6.getText().equals("")||f7.getText().equals("") ||f8.getText().equals("")) 
            
            {
                JOptionPane.showMessageDialog(null, "Please Enter Correct Name,Id and Contract no.");
            } 
            else {

                try {

                    String sqlx = "insert into donor_list(name,id,blood_group,sex,contact_num,age,mail,occupation,address)"
                            + "values('" + f1.getText() + "','" + f2.getText() + "','" + f3.getText() + "','" +
                            box.getSelectedItem() + "','" + f4.getText() + "','" + f5.getText() + "','" + f6.getText() +
                            "','" + f7.getText() + "','" + f8.getText() + "')";

                    st = con.createStatement();
                    st.execute(sqlx);

                    JOptionPane.showMessageDialog(null, "Record inserted successfully");
                    f1.setText("");
                    f2.setText("");
                    f3.setText("");
                    f4.setText("");
                    f5.setText("");
                    f6.setText("");
                    f7.setText("");
                    f8.setText("");

                }
                catch (SQLException esql)
                {

                    JOptionPane.showMessageDialog(null, "Sorry the record you have entered already exists");

                }
            }
        }

        if(eat.getSource()==b2)
        {
        new Main(con);
        dispose();
        }
      }
}
