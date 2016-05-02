package classsource;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.*;
import java.util.*;
import java.sql.*;

import javax.swing.table.TableColumn;

import javax.swing.table.AbstractTableModel;


public class EmployeeManagement extends JInternalFrame{
		EmployeeManagement() throws SQLException{
			JTable table;
			EmployeeTable dtm;
   		    
   			
   			ResultSet rs;
   			//JPanel pane =  new JPanel(new GridLayout());
   			JPanel pane =  new JPanel();
   			JFrame frame = null;
   			JButton clean_btn = null, add_btn = null, save_btn = null;
   			frame = new JFrame("Employee Management");
   			pane = new JPanel();
   			clean_btn = new JButton("Clean Data");
   			clean_btn.addActionListener(new ActionListener() {
   		   public void actionPerformed(ActionEvent e) {
   		    //removeData();
   		   }
   		  });
   		  add_btn = new JButton("Add Data");
   		  add_btn.addActionListener(new ActionListener() {
   		   public void actionPerformed(ActionEvent e) {
   		    //addData();
   		   }
   		  });
   		  save_btn = new JButton("Save");
   		  save_btn.addActionListener(new ActionListener() {
   		   public void actionPerformed(ActionEvent e) {
   		    //saveData();
   		   }
   		  });
   		  	DBMethods methods = new DBMethods();
   			//rs = methods.getAllPeps();
   			
   			if(rs == null){
   				System.out.println("null is rs");
   			}
   			dtm = new EmployeeTable(rs);
   			table = new JTable(dtm);
   			
   			String[] status ={"100%","50%", "Sjuk", "VAB", "Studier", "Semester"}; 
   			String[] schedule = {"MF", "LS", "S"};
   			String[] license = {"A", "AA", "B", "BB","C", "CC", "CCC", "K"};
   			
   			JComboBox comboStatus = new JComboBox (status);
   			//comboStatus.setEditable(true);
   			JComboBox comboSchedule = new JComboBox (schedule);
   			//comboSchedule.setEditable(true);
   			JComboBox comboLicense = new JComboBox (license);
   			//comboLicense.setEditable(true);
   			
   			table.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(comboLicense));    
   			table.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(comboStatus));    
   			table.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(comboSchedule));   
   			
   			
   			table.setBounds(100, 100, 580, 260);
   			pane.add((new JScrollPane(dtm.getWholeTable(rs))), BorderLayout.CENTER);
   			pane.add(add_btn, BorderLayout.WEST);
	   		pane.add(save_btn, BorderLayout.CENTER);
	   		  
	   		pane.add(clean_btn, BorderLayout.EAST);
	   		
			frame.add(pane);
   			frame.setSize(800,600);
   			frame.pack();
   	        frame.setVisible(true);
   	        rs.close();
   	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   		}
}