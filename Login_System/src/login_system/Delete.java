package login_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;

public class Delete extends JFrame implements ActionListener{

    JPanel panel = new JPanel();
    JLabel lb1 = new JLabel("ID:");
    JTextField jf1 = new JTextField(20);
    JButton jb1 = new JButton("OK");
    JButton jb2 = new JButton("BACK");
    Font ft1 = new Font("BOLD", Font.BOLD, 20);
    Connection conn;
    Statement sta = null;//help access to the database
    ResultSet rss;

    Delete(Connection conn) {
        super("DELETE DONOR");
        this.conn = conn;
        panel.setLayout(null);
        add(panel);
        panel.setBackground(Color.WHITE);
        setSize(500, 400);
        setVisible(true);
        setLocation(200, 200);
        setResizable(false);
        method();
    }

    void method() {
        lb1.setBounds(150, 50, 50, 30);
        lb1.setFont(ft1);
        panel.add(lb1);

        jf1.setBounds(220, 50, 100, 30);
        panel.add(jf1);

        jb1.setBounds(100, 100, 100, 30);
        jb1.setBackground(Color.BLUE);
        jb1.setForeground(Color.white);
        jb1.addActionListener(this);
        panel.add(jb1);

        jb2.setBounds(220, 100, 100, 30);
        jb2.setBackground(Color.BLUE);
        jb2.setForeground(Color.white);
        jb2.addActionListener(this);
        panel.add(jb2);


    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jb1) {

            if (jf1.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Please enter correct ID");

            } else {

                try {

                    PreparedStatement ps = conn.prepareStatement("Delete from donated_list1 where id=" + jf1.getText());

                    ps.executeUpdate();


                    JOptionPane.showMessageDialog(null, "Delete successfully");
                    jf1.setText("");

                }
                catch (Exception et) {
                    JOptionPane.showMessageDialog(null, "It's already delete");

                }

            }

        }

        if (e.getSource() == jb2) {
            //new Main(conn);
            dispose();
        }

    }
}
