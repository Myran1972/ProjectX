package classsource;
import javax.swing.table.AbstractTableModel;
import java.text.SimpleDateFormat;
import java.util.*;


//http://diyland.biz/index.php?opt=detail&topic=67&id=11433


class EmployeeTable extends AbstractTableModel {

    String defaultStatus = "available";
    String bookedStatus = "booked";
    
    Object[][] p = {
    		//{now(), defaultStatus, defaultStatus, defaultStatus},
    		//{oneDayFrom(1), defaultStatus, defaultStatus, defaultStatus},
    		{1,"Susan","Williams","A","MF","100%"},
    		{2,"Diane","Elliott","AA","MF","100%"},
    		{3,"Janet","Richards","B","MF","100%"},
    		{4,"Harold","Howell","BB","MF","100%"}
    		};
    
    String[] columnNames = {"Employee ID", "First Name", "Last Name", "License", "Schedule", "Status"};
    
    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return columnNames.length;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        return p[row][col];
    }
   
 public Class getColumnClass(int c) {
         return getValueAt(0, c).getClass();
    }
 
 public boolean isCellEditable(int rowIndex, int columnIndex) {
	 if(columnIndex == 0) return false;
  return true;
    }
   
 public void setValueAt(Object value, int row, int col) {
         p[row][col] = value;
         fireTableCellUpdated(row, col);
    }
   
    public void mySetValueAt(Object value, int row, int col) {
     p[row][col] = value;
    }
    
}