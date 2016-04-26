package classsource;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;

public class About extends JInternalFrame {


 		JLabel label = new JLabel("Running environment : Windows");
		JLabel labe2 = new JLabel("Develop language : JAVA");
		JLabel labe3 = new JLabel("Database : Sqlite");
		public About(){
	        setTitle("About");
	 	    Container con=getContentPane();
            con.setLayout(new GridLayout(4,1));
            con.add(label);
            con.add(labe2);
            con.add(labe3);
            con.setBackground(Color.lightGray);
	 	    setResizable(false);
	 	    setSize(380,220);
	 	    setVisible(true);
	 	    setClosable(true);
			}

	}
