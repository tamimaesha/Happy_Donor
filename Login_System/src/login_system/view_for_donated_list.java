
package login_system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class view_for_donated_list extends JFrame implements ActionListener
{
    Object stringSend[]=new Object[3];

    JTable table;
    private TableModel tm;
    JPanel panel = new JPanel();

    Vector vector[]=new Vector[3];



    String[] str = { "Id", "Date", "Group"};
    private JScrollPane pane;

    Statement st;
    Connection con;
    ResultSet res;


    JPanel npanel=new JPanel();
    JLabel nlabel=new JLabel("Enter id :");
    JTextField nfield=new JTextField(15);
    JButton nokb=new JButton("Ok");
    JTableHeader header;


    view_for_donated_list(Connection con)
    {
        super("View_Al_Donated");

        this.con = con;

        for (int i = 0; i < 3; i++)
        {

           vector[i] = new Vector();

        }

        tm = new AbstractTableModel()
        {
            public int getRowCount()
            {

                return vector[0].size();
            }

            public int getColumnCount() {

                return 3;
            }

            public String getColumnName(int colum)
            {
                return str[colum];
            }

            public Object getValueAt(int rowIndex, int columnIndex)
            {


                switch (columnIndex)
                {

                    case 0:
                        return vector[0].elementAt(rowIndex);
                    case 1:
                        return vector[1].elementAt(rowIndex);
                    case 2:
                        return vector[2].elementAt(rowIndex);

                    //  case 8:
                    //  return vector[8].elementAt(rowIndex);
                    // case 9:
                    //  return vector[9].elementAt(rowIndex);
                }
                return "";
            }
        };


        table = new JTable(tm);
        header=table.getTableHeader();
        header.setBackground(Color.PINK);


        pane = new JScrollPane(table);

        add(pane, BorderLayout.CENTER);

        setSize(1300, 700);

        setVisible(true);

        setLocation(50, 20);

        data();
        //add_n_Button_And_Textfield();

    }

    void add_n_Button_And_Textfield()
    {
        nokb.addActionListener(this);
        npanel.setLayout(new FlowLayout());
        npanel.add(nlabel);
        npanel.add(nfield);
        npanel.add(nokb);
        add(npanel,BorderLayout.NORTH);


    }

   /* public static void main(String[] args)
    {


    }*/

    void data() {

        try {


            String sql = "select  * from donated_list1";
// String sqlstr="select  Name,Referred_id,District,Age,Sex,Test_name,Amount,Receive_date,Delivery_date from addmember,test_entry where addmember.ID=test_entry.ID";



 //  String sql = "select name,id,cont,combo,date,position,bsalary,bonous from employee_info5,employee_pay where employee_info5.sl_no=employee_pay.sl_no";

            st = con.createStatement();

            res = st.executeQuery(sql);

            while (res.next()) {

                for (int i = 0; i < 3; i++) {

                    vector[i].addElement(res.getString(i + 1));

                }

            }


        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "The quere is wrong");
        }

    }

    public void actionPerformed(ActionEvent ev)
    {
         if(ev.getSource()==nfield)//nfield
          {
              Object obj=nfield.getText();//nfield

              if(vector[0].contains(obj))
              {
                  table.setRowSelectionAllowed(true);//table
                  int row=vector[0].indexOf(obj);
                  table.setRowSelectionInterval(row, row);//table
                  nfield.setText("");//nfield
              }
              else
              {
                  table.setRowSelectionAllowed(false);//table
                  nfield.setText("");//nfield
              }

          }



    }
}
