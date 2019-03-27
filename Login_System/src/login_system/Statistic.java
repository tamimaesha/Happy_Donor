
package login_system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class Statistic extends JFrame implements ActionListener 
{
    Object stringSend[]=new Object[10];

    JTable table;
    private TableModel tm;
    JPanel panel = new JPanel();
    
    Vector vector[]=new Vector[10];
    
   
            
    String[] str = {"name","id","blood_group","sex","contact_num","age","mail","occupation","address","date"};
    private JScrollPane pane;
    
    Statement st;
    Connection con;
    ResultSet res;
    
    
    JPanel npanel=new JPanel();
    JLabel nlabel=new JLabel("Enter id :");
    JTextField nfield=new JTextField(15);
    JButton nokb=new JButton("Ok");
    JTableHeader header;
    

    Statistic(Connection con)
    {
        super("View all information");

        this.con = con;

        for (int i = 0; i < 10; i++) 
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

                return 10;
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
                    case 3:
                        return vector[3].elementAt(rowIndex);
                    case 4:
                        return vector[4].elementAt(rowIndex);
                    case 5:
                        return vector[5].elementAt(rowIndex);
                    case 6:
                        return vector[6].elementAt(rowIndex);
                    case 7:
                        return vector[7].elementAt(rowIndex);
                      case 8:
                      return vector[8].elementAt(rowIndex);
                     case 9:
                      return vector[9].elementAt(rowIndex);
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

    void data() {

        try {
            

            String sql = "select donor_list.name,donor_list.id,donor_list.blood_group,donor_list.sex,donor_list.contact_num,donor_list.age,donor_list.mail,donor_list.occupation,donor_list.address,donated_list1.date from donor_list,donated_list1 where donor_list.id=donated_list1.id";
// String sqlstr="select  Name,Referred_id,District,Age,Sex,Test_name,Amount,Receive_date,Delivery_date from addmember,test_entry where addmember.ID=test_entry.ID";
            
            
            
 //  String sql = "select name,id,cont,combo,date,position,bsalary,bonous from employee_info5,employee_pay where employee_info5.sl_no=employee_pay.sl_no";          
            
            st = con.createStatement();

            res = st.executeQuery(sql);

            while (res.next()) {

                for (int i = 0; i < 10; i++) {

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

          if(ev.getSource()==nokb)//nokb
          {
              int row=table.getSelectedRow();//table
              stringSend[0]=table.getValueAt(row, 0); //table   //viewall hate name sabe nie aser janna
              stringSend[1]=table.getValueAt(row, 1);    //viewall hate referred id sabe nie aser janna
              stringSend[2]=table.getValueAt(row, 2);
              stringSend[3]=table.getValueAt(row, 3);
              stringSend[4]=table.getValueAt(row, 4);
              stringSend[5]=table.getValueAt(row, 5);
              stringSend[6]=table.getValueAt(row, 6);
              stringSend[7]=table.getValueAt(row, 7);
              stringSend[8]=table.getValueAt(row, 8);
              stringSend[9]=table.getValueAt(row, 9);
             // stringSend[8]=table.getValueAt(row, 8);
            //  new Emp_Info_Frame,Emp_Payroll_Frame(con,stringSend);

          }
        
        
    }
}