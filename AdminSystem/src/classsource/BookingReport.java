package classsource;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class BookingReport extends JInternalFrame {

	JLabel lb_print = new JLabel("Print Booking Report");
   	//Container con = getContentPane();
   	JPanel p = new JPanel();	
   	public BookingReport(){
   		setTitle("Print booking report");	
   		p.add(lb_print);
   		BookingReportPanel panel = new BookingReportPanel();
   		Container contentPane = getContentPane();
   	    contentPane.add(p,"North");
   	    contentPane.add(panel,"Center");

   	    setBounds(100, 100, 280, 260);
   	    this.setClosable(true);
   	    setVisible(true);
   	}
   
}  	
class BookingReportPanel extends JPanel{

	JLabel lb_FromDate = new JLabel("From: ");
	JLabel lb_ToDate = new JLabel("To: ");	
		
		
	   	JTextField TF_FromDate = new JTextField(20);
	   	JTextField TF_ToDate = new JTextField(20);
	  
	   	JButton printBtn=new JButton("Print report");
	   	public BookingReportPanel(){
	
		add(lb_FromDate);
		lb_FromDate.setBounds(16,80,80,25);
		add(TF_FromDate);
   	    TF_FromDate.setBounds(100,80,120,25);
   	    add(lb_ToDate);   	    
		lb_ToDate.setBounds(16,115,80,25);
		add(TF_ToDate);		
		TF_ToDate.setBounds(100,115,120,25);
		add(printBtn);
   	    printBtn.setBounds(130,160,120,30);   	    
   	 
   	    setLayout(null);
		
		printBtn.addActionListener(new ActionListener(){
	   		public void actionPerformed(ActionEvent event){
	   			ResultSet rs;
	   			BookingReportTable table = new BookingReportTable();
	   			
	   			DBMethods method = new DBMethods();
	   			method.getReport(TF_FromDate.getText(), TF_ToDate.getText());
				//table.printBookingReport(rs);
				

	   			BookingReportTable frame = new BookingReportTable();
	   	        //frame.setDefaultCloseOperation( EXIT_ON_CLOSE );
	   	        frame.pack();
	   	        frame.setVisible(true);
	   		}
	   		});
	

	   	}

	
}