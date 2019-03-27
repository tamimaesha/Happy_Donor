

package login_system;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Recent_donate implements ActionListener
{

   JFrame frame1,frame2;
    JTextField textbox;
    JLabel label;
    JButton button,button2;
    JPanel panel, panel1;
    JTable table;
    String[] columnNames = {"id", "date","blood_group"};
    Connection con;
    Statement st;
    ResultSet rs;
      Recent_donate(Connection con)
    {
        this.con=con;
        frame1=new JFrame("Search Recent Donated by Date");
        frame1.setLayout(null);
        frame1.setResizable(false);
        frame1.setBackground(Color.white);
        textbox = new JTextField();
        textbox.setBounds(170, 40, 150, 40);
        label = new JLabel("Enter date_of_donate:");
        label.setBounds(40, 40, 130, 40);
        button = new JButton("Search");
        button.setBackground(Color.BLUE);
        button.setForeground(Color.white);
        button.setBounds(75, 130, 130, 30);
        button.addActionListener(this);
        button2 = new JButton("Back");
        button2.setBackground(Color.BLUE);
        button2.setForeground(Color.white);
        button2.setBounds(210, 130, 130, 30);
        button2.addActionListener(this);
        frame1.add(textbox);
        frame1.add(label);
        frame1.add(button);
        frame1.add(button2);
        frame1.setVisible(true);
        frame1.setSize(500, 500);
        frame1.setLocation(480, 180);
    }
 public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==button)
        {
            showTableData();

        }
          else
            {
              
            //new Main(con);
           frame1.dispose();
            }
       // button = (JButton) ae.getSource();
       // System.out.println("Showing Table Data.......");
      //  showTableData();

    }

    public void showTableData()
    {

       frame2=new JFrame("Database search result");
       frame2.setLayout(new BorderLayout());
       frame2.setSize(200, 200);

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);

        table = new JTable();
        table.setModel(model);

        JScrollPane scroll = new JScrollPane(table);

        String textvalue = textbox.getText();
        String name = "";
        //String reli = "";
        //String dis = "";
        //String mar = "";
        String id= "";
        String date="";
        String blood_group="";
        //String sex="";
        //String cont="";
        //String age="";
       // String sala= "";
        //String se= "";
       // String da= "";
       // String po= "";

        try {

     String sql = "select * from donated_list1 where date ='"+textvalue+"'";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int i = 0;
            for (rs.first();!rs.isAfterLast();rs.next()) {
                //name = rs.getString("name");
               // reli = rs.getString("Religion");
                //dis = rs.getString("District");
               // mar = rs.getString("Marid");
                id = rs.getString("id");
                date=rs.getString("date");
                blood_group=rs.getString("blood_group");
                //sex=rs.getString("sex");
                //cont = rs.getString("contact_num");
                //age=rs.getString("age");
               // sala = rs.getString("BSalary");
                //se = rs.getString("Sex");
               // da = rs.getString("Date");
                //po = rs.getString("Position");


                model.addRow(new Object[]{id,date, blood_group});
                i++;
            }
            if (i < 1) {
                JOptionPane.showMessageDialog(null, "No Record Found", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
            if (i == 1) {
                System.out.println(i + " Record Found");
            } else {
                System.out.println(i + " Records Found");
            }
            textbox.setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);//
        }

          
        frame2.add(scroll);//
        frame2.setVisible(true);//
        frame2.setSize(1350, 780);//
        frame2.setLocation(10, 10);
    }

}
