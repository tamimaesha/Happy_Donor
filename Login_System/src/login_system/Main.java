package login_system;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.*;

public class Main extends JFrame implements ActionListener
{
    JFrame jf = new JFrame();
    JPanel jp = new JPanel();
    ImageIcon ic;
    //String allpost[]={"All Blood Groups","A+ (A Positibe) ","A- (A Negative)","B+ (B Positve)","B- (B Positve)","AB+ (AB Positive)","AB- (AB Negative)","O+ (O Positive)","O- (O Negative)"};
    //JComboBox jcb=new JComboBox(allpost);
    Font font = new Font("Arial", Font.ITALIC, 70);
    Font font1 = new Font("Bold", Font.BOLD, 30);
    Font font2 = new Font("Bold", Font.PLAIN, 20);
    Font font3 = new Font("Bold", Font.PLAIN, 20);
    Font font4=new Font("Bold",Font.BOLD,15);
    
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    JLabel jlb1, jlb2, jlb3, jlb4, jlb5, jlb6, jlb7, jlb8, jlb9, jlb10, jlb11, jlb12,jlb13,jlb14,jlb15,jlb16,jlb17,jlb18,jlb19,jlb20;
    JTextField jt = new JTextField(20);
    JTextField jt2 = new JTextField(40);
    ImageIcon img = new ImageIcon("blood.png");
    ImageIcon img2 = new ImageIcon("index2.jpg");
    ImageIcon img3=new ImageIcon("index15.jpg");
    ImageIcon img4=new ImageIcon("index15.jpg");
    ImageIcon img5=new ImageIcon("index15.jpg");
    ImageIcon img6=new ImageIcon("index15.jpg");
    ImageIcon img7=new ImageIcon("index15.jpg");
    ImageIcon img8=new ImageIcon("index15.jpg");

JButton Add_donor=new JButton("Add_Donor");
JButton Add_donate=new JButton("Add_Donate");
JButton View_donor=new JButton("View_Donor");
JButton View_donate=new JButton("View_Donate");
JButton Recent_donate=new JButton("Recent_Donate");
JButton Search=new JButton("Search");
JButton delete=new JButton("Delete");
JButton update=new JButton("Update");
JButton left=new JButton("");
JButton right=new JButton("");
JButton top=new JButton("");
JButton bottom=new JButton("");
JButton right_side=new JButton("");
JButton left_side=new JButton("");
JButton statistic=new JButton("Statistics");
 
    JLabel lbimg = new JLabel(img);
    JLabel lbimg2 = new JLabel(img2);
    JLabel lbimg3=new JLabel(img3);
    JLabel lbimg4=new JLabel(img4);
    JLabel lbimg5=new JLabel(img5);
    JLabel lbimg6=new JLabel(img6);
    JLabel lbimg7=new JLabel(img7);
    JLabel lbimg8=new JLabel(img8);
    
    JLabel lb4=new JLabel();
    
    JMenu home=new JMenu("          HOME");
    JMenu life_saver=new JMenu("          LIFE SAVER");
    JMenu tips=new JMenu("          TIPs");
    JMenu features=new JMenu("          FEATUREs");
    JMenu rules=new JMenu("          RULEs");
    JMenu facts_figures=new JMenu("          FACTs & FIGUREs");
    JMenu about=new JMenu("          ABOUT");
    JMenu help=new JMenu("          HELP");
    JMenu print=new JMenu("          PRINT");

    JMenuItem item_home,item_life_saver,item_tips,item_features,item_rules,item_facts_figures,item_about,item_help,item_print;
    JMenuBar jmb = new JMenuBar();
    
    JTextArea area=new JTextArea();
    
    Scrollbar bar1, bar2;
    Connection con;
    Statement st;
    ResultSet rs;
    
    Main(Connection con)
    {
        this.con=con;
        setTitle("blood donate");
        jp.setBackground(Color.WHITE);
        jp.setLayout(null);
        add(jp);
        setSize(dim);
        setVisible(true);
        add_menu();
        add_method();
        scroll();
        line();
        add_button();
        body();
        image();
    }
    void image()
    {
    lbimg.setBounds(20,3,70,128);
    jp.add(lbimg);
    lbimg2.setBounds(670,0, 840, 130);
    jp.add(lbimg2);
    lbimg3.setBounds(0,0,265,135);
    jp.add(lbimg3);
    lbimg4.setBounds(265,0,265,135);
    jp.add(lbimg4);
    lbimg5.setBounds(530,0,265,135);
    jp.add(lbimg5);
    lbimg6.setBounds(795,0,265,135);
    jp.add(lbimg6);
    lbimg7.setBounds(1060,0,265,135);
    jp.add(lbimg7);
    lbimg8.setBounds(1160,0,265,135);
    jp.add(lbimg8);
    }
void add_button()
{
Add_donor.setBounds(0, 170, 150, 50);
Add_donor.setBackground(Color.RED);
Add_donor.setForeground(Color.BLACK);
Add_donor.addActionListener(this);
jp.add(Add_donor);

Add_donate.setBounds(150, 170, 150, 50);
Add_donate.setBackground(Color.WHITE);
Add_donate.setForeground(Color.BLACK);
Add_donate.addActionListener(this);
jp.add(Add_donate);

View_donor.setBounds(300, 170, 150, 50);
View_donor.setBackground(Color.RED);
View_donor.setForeground(Color.BLACK);
View_donor.addActionListener(this);
jp.add(View_donor);

View_donate.setBounds(440, 170, 150, 50);
View_donate.setBackground(Color.WHITE);
View_donate.setForeground(Color.BLACK);
View_donate.addActionListener(this);
jp.add(View_donate);

Recent_donate.setBounds(590, 170, 150, 50);
Recent_donate.setBackground(Color.RED);
Recent_donate.setForeground(Color.BLACK);
Recent_donate.addActionListener(this);
jp.add(Recent_donate);

Search.setBounds(740, 170, 150, 50);
Search.setBackground(Color.WHITE);
Search.setForeground(Color.BLACK);
Search.addActionListener(this);
jp.add(Search);

delete.setBounds(890, 170, 150, 50);
delete.setBackground(Color.RED);
delete.setForeground(Color.BLACK);
delete.addActionListener(this);
jp.add(delete);

update.setBounds(1040, 170, 150, 50);
update.setBackground(Color.WHITE);
update.setForeground(Color.BLACK);
update.addActionListener(this);
jp.add(update);

statistic.setBounds(1190, 170, 150, 50);
statistic.setBackground(Color.red);
statistic.setForeground(Color.BLACK);
statistic.addActionListener(this);
jp.add(statistic);

left.setBounds(300, 280, 5, 250);
left.setBackground(Color.WHITE);
jp.add(left);

right.setBounds(1000, 280, 5, 250);
right.setBackground(Color.WHITE);
jp.add(right);

top.setBounds(300, 280, 700, 5);
top.setBackground(Color.WHITE);
jp.add(top);

bottom.setBounds(300, 530, 705, 5);
bottom.setBackground(Color.WHITE);
jp.add(bottom);

/*right_side.setBounds(1125, 230,5, 450);
right_side.setBackground(Color.WHITE);
jp.add(right_side);

left_side.setBounds(165, 230,5, 450);
left_side.setBackground(Color.WHITE);
jp.add(left_side);

area.setBounds(0,0, 2000, 130);
area.setBackground(Color.YELLOW);
area.setForeground(Color.BLACK);
jp.add(area);

print.setBounds(1140, 250, 120, 50);
print.setBackground(Color.gray);
print.setForeground(Color.BLACK);
print.addActionListener(this);
jp.add(print);*/

}
    void scroll() 
    {
        bar1 = new Scrollbar(Scrollbar.VERTICAL);jp.add(bar1);add("East", bar1);
        bar2 = new Scrollbar(Scrollbar.HORIZONTAL);jp.add(bar2);add("South", bar2);
    }
    
    void body()
    {
     lb4.setBounds(150,200,1000,200);
     jp.add(lb4);

    jlb13=new JLabel("WHO NEED BLOOD the need of blood is great.On any given day an average");
    jlb13.setFont(font4);
    jlb13.setForeground(Color.RED);
    jlb13.setBounds(370,300,1000,30);
    jp.add(jlb13);

    jlb14=new JLabel("of 34,000 units of blood are needed to save precious human life from accident ");
    jlb14.setFont(font4);
    jlb14.setForeground(Color.RED);
    jlb14.setBounds(370,320,1000,30);
    jp.add(jlb14);

    jlb15=new JLabel("and burns,heart surgury.organ transplants and patients recieving treatment for");
    jlb15.setFont(font4);
    jlb15.setForeground(Color.RED);
    jlb15.setBounds(370,340,1000,30);
    jp.add(jlb15);


    jlb16=new JLabel("luiekemia ,cancer & other diseases");
    jlb16.setFont(font4);
    jlb16.setForeground(Color.RED);
    jlb16.setBounds(370,360,1000,30);
    jp.add(jlb16);


    jlb17=new JLabel("Blood...it runs it our veins and plays a vital role in the body mechanism.But ");
    jlb17.setFont(font4);
    jlb17.setForeground(Color.RED);
    jlb17.setBounds(370,400,1000,30);
    jp.add(jlb17);


    jlb18=new JLabel("have you ever spared a thought for those who are fighting with some diseases ");
    jlb18.setFont(font4);
    jlb18.setForeground(Color.RED);
    jlb18.setBounds(370,420,1000,30);
    jp.add(jlb18);


    jlb19=new JLabel(" and need blood urgently.Act now and donate your blood without any worry.it won't" );
    jlb19.setFont(font4);
    jlb19.setBounds(370,440,1000,30);
    jlb19.setForeground(Color.RED);
    jp.add(jlb19);

    jlb20=new JLabel("cost you a thing but could bring back the smile onsomeone face");
    jlb20.setFont(font4);
    jlb20.setBounds(370,460,1000,30);
    jlb20.setForeground(Color.RED);
    jp.add(jlb20);

    }
  
    void add_menu()
    {
        home.setForeground(Color.BLUE);
        home.addActionListener(this);
        
        life_saver.setForeground(Color.BLUE);
        life_saver.addActionListener(this);
        
        tips.setForeground(Color.BLUE);
        tips.addActionListener(this);
        
        features.setForeground(Color.BLUE);
        features.addActionListener(this);
        
        rules.setForeground(Color.BLUE);
        rules.addActionListener(this);
        
        facts_figures.setForeground(Color.BLUE);
        facts_figures.addActionListener(this);
        
        about.setForeground(Color.BLUE);
        about.addActionListener(this);
        
        help.setForeground(Color.BLUE);
        help.addActionListener(this);
        
        //print.setForeground(Color.BLUE);
        //print.addActionListener(this);
        
        item_home=new JMenuItem("          Introduction");
        item_home.setBackground(Color.WHITE);
        item_home.setForeground(Color.BLUE);
        item_home.addActionListener(this);
        home.add(item_home);
        
        item_life_saver=new JMenuItem("          Life_saver");
        item_life_saver.setBackground(Color.WHITE);
        item_life_saver.setForeground(Color.BLUE);
        item_life_saver.addActionListener(this);
        life_saver.add(item_life_saver);
        
        item_tips=new JMenuItem("          Tips");
        item_tips.setBackground(Color.WHITE);
        item_tips.setForeground(Color.BLUE);
        item_tips.addActionListener(this);
        tips.add(item_tips);
        
        item_features=new JMenuItem("          Features");
        item_features.setBackground(Color.WHITE);
        item_features.setForeground(Color.BLUE);
        item_features.addActionListener(this);
        features.add(item_features);
        
        item_rules=new JMenuItem("          Rules");
        item_rules.setBackground(Color.WHITE);
        item_rules.setForeground(Color.BLUE);
        item_rules.addActionListener(this);
        rules.add(item_rules);
        
        item_facts_figures=new JMenuItem("          Facts & Figures");
        item_facts_figures.setBackground(Color.WHITE);
        item_facts_figures.setForeground(Color.BLUE);
        item_facts_figures.addActionListener(this);
        facts_figures.add(item_facts_figures);
        
        item_about = new JMenuItem("          What we Do", new ImageIcon("Help.gif"));
        item_about.setBackground(Color.WHITE);
        item_about.setForeground(Color.BLUE);
        item_about.addActionListener(this); 
        about.add(item_about);
        
        item_help=new JMenuItem("          Instruction");
        item_help.setBackground(Color.WHITE);
        item_help.setForeground(Color.BLUE);
        item_help.addActionListener(this);
        help.add(item_help);
        
        //item_print=new JMenuItem("          Print");
        //item_print.setBackground(Color.WHITE);
        //item_print.setForeground(Color.BLUE);
        //item_print.addActionListener(this);
        //print.add(item_print);
        
        jmb.add(home);
        jmb.add(life_saver);
        jmb.add(tips);
        jmb.add(features);
        jmb.add(rules);
        jmb.add(facts_figures);
        jmb.add(about);
        jmb.add(help);
        //jmb.add(print);
        
        setJMenuBar(jmb);
    }

    void line()
    {
        jlb12 = new JLabel("_________________________________________________________________________________");
        jlb12.setForeground(Color.WHITE);
        jlb12.setFont(font1);
        jlb12.setBounds(0, 90, 2000, 50);
        jp.add(jlb12);
    }
    void add_method()
    {
        jlb2 = new JLabel("DONATE BLOOD");
        jlb2.setForeground(Color.red);
        jlb2.setFont(font);
        jlb2.setBounds(250, 30, 1000, 50);
        jp.add(jlb2);
        jlb1 = new JLabel("Save People And Be Saved........");
        jlb1.setForeground(Color.WHITE);
        jlb1.setFont(font1);
        jlb1.setBounds(250, 60, 1000, 70);
        jp.add(jlb1);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == item_home)
        {
        introduction mh = new introduction();
        }
        if(e.getSource()== item_life_saver)
        {
        life_saver lie=new life_saver();
        }
        if(e.getSource()== item_tips)
        {
        tips tip=new tips();
        }
        if(e.getSource()==item_features)
        {
        Features fear=new Features();
        }
        if(e.getSource()==item_rules)
        {
        rules rule=new rules();
        }
        if(e.getSource()==item_facts_figures)
        {
        fact_figure figure=new fact_figure();
        }
        if(e.getSource()==Add_donate)
        {
        new donated_list(con);
        }
        if (e.getSource() ==Add_donor)
        {
        new donor_list(con);
        }
        if(e.getSource()==item_about)
        {
        what_we_do wt=new what_we_do();
        }
        if(e.getSource()==View_donor)
        {
        new view_for_donor_list(con);
        }
        if(e.getSource()==View_donate)
        {
        new view_for_donated_list(con);
        }
        if(e.getSource()==item_help)
        {
        new Help();
        }
        if(e.getSource()==Search)
        {
        new Search(con);
        }
        if(e.getSource()==delete)
        {
        new Delete(con);
        }
        if(e.getSource()==update)
        {
        new Update(con);
        }
        if(e.getSource()==Recent_donate)
        {
        new Recent_donate(con);
        }
        if(e.getSource()==item_print)
        {
        new Print();
        }
        if(e.getSource()==statistic)
        {
        new Statistic(con);
        }
    }
}