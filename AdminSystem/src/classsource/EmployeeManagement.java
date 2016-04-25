package classsource;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;

import java.awt.event.*;
import java.sql.*;

public class EmployeeManagement extends JInternalFrame{

    	String schema[]={"MF", "LS", "S"};
    	String Status[]={"100%", "50%", "Sjuk", "VAB", "Studier", "Semester"};
    	String license[]={"A" ,"AA", "B", "BB", "C", "CC", "CCC", "K"};
    	
        JButton save_btn = new JButton("save");
        JButton exit_btn = new JButton("exit");
        JButton append_btn = new JButton("add");
        JButton delete_btn= new JButton("delete");
        JButton change_btn = new JButton("change");
        
       	JTable table;
       	AbstractTableModel dtm;

    public EmployeeManagement() {

    	setTitle("Employee basic info");
		dtm = new EmployeeTable();
    	//dtm = new BookingTable();
    	table = new JTable(dtm);

        JScrollPane sl = new JScrollPane(table);
        getContentPane().setLayout(null);

        
		String defaultStatus = "available";
		String bookedStatus = "booked";
		JComboBox c1 = new JComboBox();
		c1.addItem(defaultStatus);
		c1.addItem(bookedStatus);
		JComboBox c2 = new JComboBox();
		c2.addItem(defaultStatus);
		c2.addItem(bookedStatus);
		JComboBox c3 = new JComboBox();
		c3.addItem(defaultStatus);
		c3.addItem(bookedStatus);
		       
		table.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(c1));    
		table.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(c2));    
		table.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(c3));   
        
        
        Font f=new Font("italic",Font.PLAIN,12);
        //save_btn.setFont(f);

        getContentPane().add(save_btn);
        save_btn.setBounds(210, 390, 70, 25);
       
        getContentPane().add(exit_btn);
        exit_btn.setBounds(410, 390, 70,25);

        getContentPane().add(append_btn);
        append_btn.setBounds(110, 390, 70, 25);

        getContentPane().add(delete_btn);
        delete_btn.setBounds(310, 390, 70, 25);

        getContentPane().add(change_btn);
        change_btn.setBounds(20, 390, 80, 25);
        
		sl.setBounds(20,60,425,290);
		getContentPane().add(sl);
     
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-558)/2, (screenSize.height-477)/2, 558, 455);
        this.setClosable(true);
        this.setMaximizable(true);
        setVisible(true);
    }
}
