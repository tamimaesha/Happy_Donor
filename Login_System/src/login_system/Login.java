package login_system;

import com.sun.org.apache.bcel.internal.util.Class2HTML;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;


public class Login extends JFrame implements ActionListener 
{

    JPanel panel = new JPanel();
    JLabel l = new JLabel();
    JLabel label = new JLabel("Name:");
    JLabel plabel = new JLabel("Password:");
    JTextField jtf = new JTextField(20);
    JPasswordField ptf = new JPasswordField(20);
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    Font font1 = new Font("Bold", Font.BOLD, 40);
    ImageIcon icon1 = new ImageIcon("mora.gif");
    ImageIcon icon2 = new ImageIcon("index7.jpg");
    ImageIcon icon3 = new ImageIcon("index7.jpg");
    ImageIcon icon5 = new ImageIcon("index7.jpg");
    JLabel imag1 = new JLabel(icon1);
    JLabel imag2 = new JLabel(icon2);
    JLabel imag3 = new JLabel(icon3);
    JLabel imag5 = new JLabel(icon5);
    JButton b3 = new JButton();
    JLabel l3 = new JLabel("System Design & Developed by......");
    JLabel l4 = new JLabel("TAMIMA NAYAM ESHA    &    JULIA SULTANA");
    JTextArea a = new JTextArea(700, 400);
    Font font2 = new Font("Bold", Font.BOLD, 28);
    Font font3 = new Font("Bold", Font.ITALIC, 28);
    JLabel jlb3 = new JLabel("Give Blood!!!!!");
    Font font4 = new Font("Arial", Font.ITALIC, 40);
    JLabel jlb1 = new JLabel("cse,CU 11th Batch ");
    JButton button = new JButton("Login");
    JButton reg = new JButton("Registration");
    Connection con;
    Statement st;
    ResultSet rs;

    Login() {
        panel.setLayout(null);

        panel.setBackground(Color.BLACK);
        setSize(dim);
        add(panel);
        setVisible(true);
        //setLocation(500,200);

        add_component();
        sql_connection();
    }

    void add_component() {
        imag1.setBounds(0, 10, 200, 130);
        //imag1.setBackgrou(Color.BLUE);
        //imag1.setForeground(Color.yellow);
        panel.add(imag1);
        imag2.setBounds(0, 200, 410, 300);
        panel.add(imag2);
        imag3.setBounds(470, 200, 410, 300);
        panel.add(imag3);
        // imag4.setBounds(810,200,410,300);
        // panel.add(imag4);
        imag5.setBounds(960, 200, 410, 300);
        panel.add(imag5);
        l = new JLabel("The Need is Constant.The Gratifiction is instant.");
        l.setForeground(Color.WHITE);

        l.setFont(font1);
        l.setBounds(100, 30, 1500, 50);
        panel.add(l);
        jlb3.setFont(font4);
        jlb3.setForeground(Color.RED);
        jlb3.setBounds(1000, 30, 1500, 50);
        panel.add(jlb3);

        label.setBounds(800, 100, 50, 20);
        label.setForeground(Color.WHITE);
        panel.add(plabel);

        jtf.setBounds(800, 130, 150, 25);
        panel.add(jtf);

        plabel.setBounds(960, 100, 90, 20);
        plabel.setForeground(Color.WHITE);
        panel.add(label);
        ptf.setBounds(960, 130, 150, 25);
        panel.add(ptf);

        button.setBounds(1120, 130, 70, 25);
        button.addActionListener(this);
        button.setBackground(Color.BLUE);
        button.setForeground(Color.WHITE);
        panel.add(button);

        reg.setBounds(1200, 130, 120, 25);
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
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login_System", "root", "");
            System.out.println("Connection Successfull");
        } 
        catch (Exception e)
        {
            System.out.println("Connection Failed");

        }

    }

    public static void main(String[] args)
    {
        Login ob = new Login();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {

            boolean c = false;
            if (jtf.getText().equals("") || ptf.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter correct name and password");
            } else {
                try {
                    String str1 = "select * from Registration where Name='" + jtf.getText() + "'"
                            + "&& Password='" + ptf.getText() + "'";
                    st = con.createStatement();
                    rs = st.executeQuery(str1);
                    rs.next();
                    String name = rs.getString("Name");
                    String pass = rs.getString("Password");


                    if (jtf.getText().equals(name) && ptf.getText().equals(pass)) {
                        c = true;
                        new Main(con);
                        dispose();
                    }


                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Wrong");
                }


            }



        }
        if (e.getSource() == reg)
        {
            new Registration(con);
            dispose();
        }
    }
}
