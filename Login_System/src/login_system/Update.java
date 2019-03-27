
package login_system;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;

public class Update extends JFrame implements ActionListener

{
    JLabel id_label=new JLabel("Enter ID     : ");
    JLabel num_label=new JLabel("Enter contact_num:");
    JTextField taext_id=new JTextField(15);
    JTextField taext_num=new JTextField(15);
    JButton okb=new JButton(" Ok ");
    JButton back=new JButton(" Back ");
    
    JLabel name,dept,year,lbook_code,mobile_no,present_add,email_add;
    JTextField taname,tadept,tayear,tabook_code,tamobile_no,tapresent_add,taemail_add;
   
    JPanel panal=new JPanel();
    Connection conn;
    Statement sta = null;//help access to the database
    ResultSet rss;
   
    Update(Connection conn)
    {
        super("Upadate of Donor");
        this.conn=conn;
        panal.setLayout(null);
        panal.setBackground(Color.white);
        add(panal);
        setSize(500,400);
        setVisible(true);
        setResizable(false);
        setLocation(200,200);
        lax_tfild();
        
        
    }
    void lax_tfild()
    {
        /*line_label.setBounds(50, 5, 350, 40);
        line_label.setForeground(Color.green);
        panal.add(line_label);*/
        
        id_label.setBounds(80,50,100,30);
        id_label.setForeground(Color.BLACK);
        panal.add(id_label);
        
        taext_id.setBounds(220,50,100,30);
        panal.add(taext_id); 
        
        num_label.setBounds(80,100,150,30);
        num_label.setForeground(Color.BLACK);
        panal.add(num_label);
       
        taext_num.setBounds(220, 100, 100, 30);
        panal.add(taext_num);
        
        okb.setBounds(100, 170, 80, 40); 
        okb.setForeground(Color.white);
        okb.setBackground(Color.BLUE);
        okb.addActionListener(this);
        panal.add(okb);
        
        back.setBounds(230, 170, 80, 40);
        back.setForeground(Color.white);
        back.setBackground(Color.BLUE); 
        back.addActionListener(this);
        panal.add(back);
       
    }

    public void actionPerformed(ActionEvent exx)
    {
       if(exx.getSource()==okb)
           
       {
           if(taext_id.getText().equals("")||taext_num.getText().equals(""))
           {
               JOptionPane.showMessageDialog(null, "Please enter correct book code");
               
           }
           
           else
           {
            try
            {
   /*UPDATE Customers
SET ContactName='Alfred Schmidt', City='Hamburg'
WHERE CustomerName='Alfreds Futterkiste';      */      
                
                
                Statement sta = conn.createStatement();
                //PreparedStatement ps=c.prepareStatement ("Update Directory set  Date=?,Name=?,Class=?,Shift=?,Progress=?,Address=?,City=?,Permenent_Address=?,PhoneNo=?,eaddress=?  where Id="+id.getText());
                PreparedStatement ps= conn.prepareStatement("Update donor_list set contact_num='"+taext_num.getText()+"' where id=" + taext_id.getText());
                //PreparedStatement ps= con.prepareStatement("Update student_record set Name=?, Dept=?, Date=?, Bcode=?, MobileN=?, Padd=?,Email=? where Id=" + text_id.getText());
                
                ps.executeUpdate();
                
              //jp.showMessageDialog(this, "Record Updated Successfully", "SUCCESS");
               
               JOptionPane.showMessageDialog(null,"Update Successfully");
               taext_id.setText("");
               taext_num.setText("");
                     
            }
            catch(Exception ex)
            {
                
                JOptionPane.showMessageDialog(null,"The quere is wrong\n");
                
            }
           }     
       }
       if(exx.getSource()==back)
       {
           //new Main(conn);
           dispose();
       }        
    }

}
   /* class Min
    {
        public static void main(String args[])
        {
          // Update_Student o=new Update_Student(con);
            
        }
    }*/


    


