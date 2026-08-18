/** page 589
 * 
 */
package part5;

import java.awt.*;
import java.awt.event.*;
//import java.applet.*;
import java.beans.PropertyChangeListener;
import java.util.*;
import java.sql.*;


import javax.swing.Action;

/**
 * @author bumerang
 *
 */
//public class JdbcApplet extends Applet implements Action, Runnable {
public class JdbcApplet implements Action, Runnable {

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TextField tf1, tf2, tf3;
	private TextArea ta;
	private Button b1;
	
	Connection connection = null;
	private String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
	private String URL = "jdbc:derby:/home/bumerang/MyDBHABIBBULIN",
				login = "scott",
				password = "tiger",
				query = "SELECT * FROM dept";
	private Thread th;
	@SuppressWarnings("rawtypes")
	private Vector results;
	
	public void init() {
//		setBackground(Color.white);
		
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL);
		} catch (SQLException e) {
			System.err.println(e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		setLayout(null);
//		setFont(new Font("Serif", Font.PLAIN, 14));
		Label l1 = new Label("base's URL:", Label.RIGHT);
		l1.setBounds(20, 30, 70, 25);
//		add(l1);
//		Label l2 = new Label("Name:", Label.RIGHT);
//		l2.setBounds(20, 60, 70, 25);
//		add(l2);
//		Label l3 = new Label("Password:", Label.RIGHT);
//		l3.setBounds(20, 90, 70, 25);
//		add(l3);
//		tf1 = new TextField(URL, 30);
//		tf1.setBounds(100, 30, 280, 25);
//		add(tf1);
//		tf2 = new TextField(login, 30);
//		tf2.setBounds(100, 60, 280, 25);
//		add(tf2);
//		tf3 = new TextField(password, 30);
//		tf3.setBounds(100, 90, 280, 25);
//		add(tf3);
//		tf3.setEchoChar('*');
//		Label l4 = new Label("Query:", Label.LEFT);
//		l4.setBounds(10, 120, 70, 25);
//		add(l4);
//		ta = new TextArea(query, 5, 50, TextArea.SCROLLBARS_NONE);
//		ta.setBounds(10, 150, 370, 100);
//		add(ta);
//		b1 = new Button("Submit");
//		b1.setBounds(280, 260, 100, 30);
//		add(b1);
		b1.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		URL = tf1.getText();
		login = tf2.getText();
		password = tf3.getText();
		query = ta.getText();
		
		if(th == null) {
			th = new Thread(this);
			th.start();
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void run() {
		try {
			Connection con = DriverManager.getConnection(URL, login, password);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			ResultSetMetaData rsmd = rs.getMetaData();
			
			int n = rsmd.getColumnCount();
			results = new Vector<Object>();
			
			while (rs.next()) {
				String s = "	";
				for(int i = 1; i <= n; i++) {
					s += "	" + rs.getObject(i);
				}
				results.addElement(s);
			}
			rs.close();
			st.close();
			con.close();
//			repaint();
		} catch (Exception e) {
			System.err.println(e);
		}
//		repaint();
	}

	/* (non-Javadoc)
	 * @see javax.swing.Action#getValue(java.lang.String)
	 */
	@Override
	public Object getValue(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see javax.swing.Action#putValue(java.lang.String, java.lang.Object)
	 */
	@Override
	public void putValue(String arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setEnabled(boolean b) {

	}

	@Override
	public boolean isEnabled() {
		return false;
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {

	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {

	}

	/**
	 * @param args
	 */
	public void paint(Graphics g) {
		if(results == null) {
			g.drawString("Can't execute the query", 5, 30);
			return;
		}
		
		int y = 30, n = results.size();
		
		for(int i = 0; i < n; i++) {
			g.drawString((String)results.elementAt(i), 5, y += 20);
		}
	}
}