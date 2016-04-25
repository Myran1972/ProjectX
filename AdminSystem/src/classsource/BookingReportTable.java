package classsource;

import java.awt.BorderLayout;
import java.awt.Container;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class BookingReportTable extends JFrame{

	void printBookingReport(ResultSet rs) throws SQLException{
	      // Create Vectors and copy over elements from ArrayLists to them
	      // better solution is to create a custom defined class which inherits from the AbstractTableModel class
		   
	  ArrayList columnNames = new ArrayList();
	  ArrayList data = new ArrayList();
	  
	  ResultSetMetaData md = rs.getMetaData();
      int columns = md.getColumnCount();

         //  Get column names
         for (int i = 1; i <= columns; i++){
             columnNames.add( md.getColumnName(i) );
         }

         //  Get row data
         while (rs.next()){
             ArrayList row = new ArrayList(columns);

             for (int i = 1; i <= columns; i++){
                 row.add( rs.getObject(i) );
             }
             data.add(row);

             Vector columnNamesVector = new Vector();
             Vector dataVector = new Vector();

             for (int i = 0; i < data.size(); i++)
             {
                 ArrayList subArray = (ArrayList)data.get(i);
                 Vector subVector = new Vector();
                 for (int j = 0; j < subArray.size(); j++)
                 {
                     subVector.add(subArray.get(j));
                 }
                 dataVector.add(subVector);
             }

             for (int i = 0; i < columnNames.size(); i++ )
                 columnNamesVector.add(columnNames.get(i));

             //  Create table with database data    
             JTable table = new JTable(dataVector, columnNamesVector){
                 public Class getColumnClass(int column){
                     for (int row = 0; row < getRowCount(); row++){
                         Object o = getValueAt(row, column);

                         if (o != null){
                             return o.getClass();
                         }
                     }

                     return Object.class;
                 }
             };

        
        JScrollPane scrollPane = new JScrollPane(table);
        
   	    //Container con = getContentPane();
   	    getContentPane().add(scrollPane);

   	    JPanel buttonPanel = new JPanel();
   	    getContentPane().add( buttonPanel, BorderLayout.SOUTH );
   	}
	}}