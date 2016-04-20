package classsource;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;

public class BookingReport extends JInternalFrame {


	JLabel label = new JLabel("Kaj ");
	JLabel labe2 = new JLabel("From ");
	JLabel labe3 = new JLabel("Till");
	JLabel labe4 = new JLabel("Development Team");
	
	public BookingReport(){
        setTitle("BookingReport");
 	    Container con=getContentPane();
        con.setLayout(new GridLayout(4,1));
        con.add(label);
        con.add(labe2);
        con.add(labe3);
        con.add(labe4);
        con.setBackground(Color.lightGray);


 	    setResizable(false);
 	    setSize(380,220);
 	    setVisible(true);
 	    setClosable(true);
		}

}
