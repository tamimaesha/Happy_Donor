package login_system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.text.*;
import java.sql.*;
import javax.swing.*;

public class donated_list extends JFrame implements ActionListener
{

    JPanel panel = new JPanel();
    JMenuBar br = new JMenuBar();
    JMenu menu1 = new JMenu("Donated list");
    JButton b1 = new JButton("Save");
    JButton b2 = new JButton("Back");

    JLabel l2 = new JLabel("ID:");
    JLabel l1 = new JLabel("Date:");
    JLabel l3 = new JLabel("Blood group:");

    JComboBox box;
    JTextField f1 = new JTextField(20);
    JTextField f2 = new JTextField(20);
    JTextField f3 = new JTextField(20);

    Connection con;
    Statement st = null;
    ResultSet rs;

    donated_list(Connection con)
    {
        this.con = con;
        setTitle("Donated list");
        //super("DONOR LIST");
        panel.setLayout(null);
        panel.setBackground(Color.white);
        add(panel);
        setSize(500, 400);
        setLocation(300, 200);
        setVisible(true);
        setResizable(true);
        method();
    }

    void method()
    {
        panel.setBackground(Color.white);
        menu1.setForeground(Color.WHITE);
        br.add(menu1);
        br.setBackground(Color.BLUE);
        setJMenuBar(br);


        /*String ob[] = {"Select", "Male", "Female"};
        box = new JComboBox(ob);
        box.setBounds(100, 100, 100, 20);
        panel.add(box);*/



        l2.setBounds(55, 40, 50, 20);
        l2.setForeground(Color.RED);
        panel.add(l2);
        f2.setBounds(150, 40, 100, 20);
        panel.add(f2);



        l1.setBounds(55, 10, 50, 20);
        l1.setForeground(Color.BLACK);
        panel.add(l1);
        f1.setBounds(150, 10, 100, 20);
        panel.add(f1);


        l3.setBounds(55, 70, 80, 20);
        l3.setForeground(Color.BLACK);
        panel.add(l3);
        f3.setBounds(150, 70, 100, 20);
        panel.add(f3);

        b1.setBounds(150, 120, 100, 20);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        panel.add(b1);


        b2.setBounds(150, 150, 100, 20);
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        panel.add(b2);


    }

    public void actionPerformed(ActionEvent eat) {
        if (eat.getSource() == b1) {


            if (f1.getText().equals("") || f2.getText().equals("") || f3.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter Correct Name,Id and Contract no.");
            } else {

                try {
                   /* if(f2.getText().equals("")<3 month)
                    {
                    JOptionPane.showMessageDialog(null,"not allow");
                    }*/
                   //else {
                    String sqlx = "insert into donated_list1(id,date,blood_group) "
                            + "values('"+f2.getText()+"','"+f1.getText()+"','"+f3.getText()+"')";

                    st = con.createStatement();
                    st.execute(sqlx);
                    
                    JOptionPane.showMessageDialog(null, "Record inserted successfully");
                    f1.setText("");
                    f2.setText("");
                    f3.setText("");
                  //}

                } catch (SQLException esql) {

                    JOptionPane.showMessageDialog(null, "Sorry! You have already donated.");

                }
            }
        }
        if(eat.getSource()==b2)
        {
       // new Main(con);
        dispose();
        }
    }
}
