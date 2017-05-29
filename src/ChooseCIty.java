import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChooseCIty implements ActionListener
{
	JFrame f ;
	JPanel p11 , p22 , p33 , p44 , p55 , p66 , information ;
	JLabel l1 , l2 , l3 , l4 , l5 , l6 ;
	JLabel location , name , movie_name  , rating , release , rdate ;
	JLabel text_area ;
	String city[] = new String[] {"GURGAON","FARIDABAD","DELHI","NOIDA","JAIPUR","HYDERABAD"} ;
	JComboBox < String > c = new JComboBox<>(city) ;
	JButton  i1 , i2 , i3 , i4 , i5 , i6 , logout ;
	JButton  b[] = new JButton[6] ;
	String signed_user ;
	String text = " The biggest film of the year Baahubali 2: The Conclusion has released. And as expected, it is wreaking havoc at the box-office. The audience has given a warm reception to the film. It already set plenty of records before its release and the kind of response the film has received, there are many more to come. ";
	void Choose(String cuser)
	{
		signed_user = cuser ;
		f = new JFrame() ;
		f.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		f.setLayout(null);
		f.setContentPane(new JLabel(new ImageIcon("/home/lakshay/Desktop/b/cp3.jpg")));
		
		p11 = new JPanel();
		f.add(p11);
		p11.setBackground(Color.LIGHT_GRAY);
		p11.setBounds(10, 205 , 220, 400);
		p11.setLayout(null);
		p11.setBorder(BorderFactory.createLineBorder(Color.WHITE,2,true));;
		
		
		l1 = new JLabel(new ImageIcon("/home/lakshay/Desktop/b/smurfs_small.jpg"));
		p11.add(l1);
		l1.setBounds(10, 3 , 200, 298);
		i1 = new JButton(new ImageIcon("/home/lakshay/Desktop/b/info"));
		p11.add(i1);
		i1.setBounds(70, 320, 76, 76);
		i1.addActionListener(this);
		i1.setContentAreaFilled(false);
		i1.setFocusPainted(false);
		i1.setBorderPainted(false);

		p11.setVisible(true);
		
		
		
		
		p22 = new JPanel();
		f.add(p22);
		p22.setBackground(Color.LIGHT_GRAY);
		p22.setBounds(235, 205 , 220, 400);
		p22.setLayout(null);
		p22.setBorder(BorderFactory.createLineBorder(Color.WHITE,2,true));;
		
		
		l2 = new JLabel(new ImageIcon("/home/lakshay/Desktop/b/baby_small.jpg"));
		p22.add(l2);
		l2.setBounds(10, 3 , 200, 298);
		i2 = new JButton(new ImageIcon("/home/lakshay/Desktop/b/info"));
		p22.add(i2);
		i2.setBounds(70, 320, 76, 76);
		i2.setContentAreaFilled(false);
		i2.setFocusPainted(false);
		i2.setBorderPainted(false);
		i2.addActionListener(this);
		
		p22.setVisible(true);
		
		p33 = new JPanel();
		f.add(p33);
		p33.setBackground(Color.LIGHT_GRAY);
		p33.setBounds(460, 205 , 220, 400);
		p33.setLayout(null);
		p33.setBorder(BorderFactory.createLineBorder(Color.WHITE,2,true));;
		
		
		l3 = new JLabel(new ImageIcon("/home/lakshay/Desktop/b/noor_small.jpg"));
		p33.add(l3);
		l3.setBounds(10, 3 , 200, 298);
		i3 = new JButton(new ImageIcon("/home/lakshay/Desktop/b/info"));
		p33.add(i3);
		i3.setBounds(70, 320, 76, 76);
		i3.setContentAreaFilled(false);
		i3.setFocusPainted(false);
		i3.setBorderPainted(false);
		i3.addActionListener(this);
		p33.setVisible(true);
		
		p44 = new JPanel();
		f.add(p44);
		p44.setBackground(Color.LIGHT_GRAY);
		p44.setBounds(685, 205 , 220, 400);
		p44.setLayout(null);
		p44.setBorder(BorderFactory.createLineBorder(Color.WHITE,2,true));;
		
		
		l4 = new JLabel(new ImageIcon("/home/lakshay/Desktop/b/shabana_small.jpg"));
		p44.add(l4);
		l4.setBounds(10, 3 , 200, 298);
		i4 = new JButton(new ImageIcon("/home/lakshay/Desktop/b/info"));
		p44.add(i4);
		i4.setBounds(70, 320, 76, 76);
		i4.setContentAreaFilled(false);
		i4.setFocusPainted(false);
		i4.setBorderPainted(false);
		i4.addActionListener(this);
		
		p44.setVisible(true);
		
		p55 = new JPanel();
		f.add(p55);
		p55.setBackground(Color.LIGHT_GRAY);
		p55.setBounds(910, 205 , 220, 400);
		p55.setLayout(null);
		p55.setBorder(BorderFactory.createLineBorder(Color.WHITE,2,true));;
		
		
		l5 = new JLabel(new ImageIcon("/home/lakshay/Desktop/b/bahubali_small.jpg"));
		p55.add(l5);
		l5.setBounds(10, 3 , 200, 298);
		i5 = new JButton(new ImageIcon("/home/lakshay/Desktop/b/info"));
		p55.add(i5);
		i5.setBounds(70, 320, 76, 76);
		i5.setContentAreaFilled(false);
		i5.setFocusPainted(false);
		i5.setBorderPainted(false);
		i5.addActionListener(this);
		p55.setVisible(true);
		
		p66 = new JPanel();
		f.add(p66);
		p66.setBackground(Color.LIGHT_GRAY);
		p66.setBounds(1135, 205 , 220, 400);
		p66.setLayout(null);
		p66.setBorder(BorderFactory.createLineBorder(Color.WHITE,2,true));;
		
		
		l6 = new JLabel(new ImageIcon("/home/lakshay/Desktop/b/ff8_small.jpg"));
		p66.add(l6);
		l6.setBounds(10, 3 , 200, 298);
		i6 = new JButton(new ImageIcon("/home/lakshay/Desktop/b/info"));
		p66.add(i6);
		i6.setBounds(70, 320, 76, 76);
		i6.setContentAreaFilled(false);
		i6.setFocusPainted(false);
		i6.setBorderPainted(false);
		i6.addActionListener(this);
		p66.setVisible(true);
		
		information = new JPanel();
		f.add(information);
		information.setBackground(Color.LIGHT_GRAY);
		information.setBounds(10, 10 , 1342, 184);
		information.setLayout(null);
		information.setBorder(BorderFactory.createLineBorder(Color.ORANGE,2,true));
		
		
		
		information.add(c);
		c.setBounds(70, 20 , 200, 36);
		
		location = new JLabel(new ImageIcon("/home/lakshay/Desktop/b/location"));
		information.add(location);
		location.setBounds(10, 10, 60, 60);
		
		
		name = new JLabel("Welcome "+" "+ cuser);
		name.setFont(new Font("Serif", Font.BOLD, 18));
		information.add(name);
		name.setBounds(1000, 20, 200, 40);
		
		logout = new JButton(new ImageIcon("/home/lakshay/Desktop/b/logout"));
		information.add(logout);
		logout.setBounds(1220, 15, 65, 65);
		logout.setContentAreaFilled(false);
		logout.setFocusPainted(false);
		logout.setBorderPainted(false);
		logout.addActionListener(this);
		
		movie_name = new JLabel("BAAHUBALI : 2");
		movie_name.setFont(new Font("Serif", Font.BOLD, 18)) ;
		information.add(movie_name);
		movie_name.setBounds(400,20,850,40);
		
		text_area = new JLabel("<html>" + text + "</html>");
		text_area.setFont(new Font("Baskerville",Font.BOLD,12));
		text_area.setBounds(40,40, 800, 100);
		information.add(text_area);
		
		release = new JLabel("RELEASE DATE :") ;
		information.add(release);
		release.setBounds(50,130, 120, 40);
		
		rdate = new JLabel("2017-04-28");
		information.add(rdate);
		rdate.setBounds(190, 130, 100, 40);
	
	
		
		
		information.setVisible(true);
		
		for(int i = 0 ; i < 6 ; i++)
		{
			b[i] = new JButton(new ImageIcon("/home/lakshay/Desktop/b/booknow.png"));
			f.add(b[i]);
			b[i].setBounds(10 + i*225, 615, 220,83);
			b[i].setContentAreaFilled(false);
			b[i].setFocusPainted(false);
			b[i].setBorderPainted(false);
			b[i].addActionListener(this);
		}
		
		f.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == i1)
		{
			try{
			  Class.forName("com.mysql.jdbc.Driver");
	           java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost/your_ticket","root","password");
	    	   String qry = "select * from movie where movie = 'SMURFS'"  ;
	           
	           java.sql.Statement s1 = con.createStatement();
	           	ResultSet rs = s1.executeQuery(qry);
	           	
	           	rs.next();
	            movie_name.setText(rs.getString(1));
	            text_area.setText("<html>"+rs.getString(2)+"</html>");
	            rdate.setText(rs.getString(3));
	        
	       }catch(Exception e1){
	       	e1.printStackTrace();
	       }
	        
			
			
		}
		if(e.getSource() == i2)
		{
			try{
			  Class.forName("com.mysql.jdbc.Driver");
	           java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost/your_ticket","root","password");
	    	   String qry = "select * from movie where movie = 'BOSS-BABY'"  ;
	           
	           java.sql.Statement s1 = con.createStatement();
	           	ResultSet rs = s1.executeQuery(qry);
	           	
	           	rs.next();
	            movie_name.setText(rs.getString(1));
	            text_area.setText("<html>"+rs.getString(2)+"</html>");
	            rdate.setText(rs.getString(3));
	        
	       }catch(Exception e1){
	       	e1.printStackTrace();
	       }
	        
			
			
		}
		if(e.getSource() == i3)
		{
			try{
			  Class.forName("com.mysql.jdbc.Driver");
	           java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost/your_ticket","root","password");
	    	   String qry = "select * from movie where movie = 'NOOR'"  ;
	           
	           java.sql.Statement s1 = con.createStatement();
	           	ResultSet rs = s1.executeQuery(qry);
	           	
	           	rs.next();
	            movie_name.setText(rs.getString(1));
	            text_area.setText("<html>"+rs.getString(2)+"</html>");
	            rdate.setText(rs.getString(3));
	        
	       }catch(Exception e1){
	       	e1.printStackTrace();
	       }
	        
			
			
		}
		if(e.getSource() == i4)
		{
			try{
			  Class.forName("com.mysql.jdbc.Driver");
	           java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost/your_ticket","root","password");
	    	   String qry = "select * from movie where movie = 'NAAM - SHABANA'"  ;
	           
	           java.sql.Statement s1 = con.createStatement();
	           	ResultSet rs = s1.executeQuery(qry);
	           	
	           	rs.next();
	            movie_name.setText(rs.getString(1));
	            text_area.setText("<html>"+rs.getString(2)+"</html>");
	            rdate.setText(rs.getString(3));
	        
	       }catch(Exception e1){
	       	e1.printStackTrace();
	       }
	        
			
			
		}
		if(e.getSource() == i5)
		{
			try{
			  Class.forName("com.mysql.jdbc.Driver");
	           java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost/your_ticket","root","password");
	    	   String qry = "select * from movie where movie = 'BAAHUBALI : 2'"  ;
	           
	           java.sql.Statement s1 = con.createStatement();
	           	ResultSet rs = s1.executeQuery(qry);
	           	
	           	rs.next();
	            movie_name.setText(rs.getString(1));
	            text_area.setText("<html>"+rs.getString(2)+"</html>");
	            rdate.setText(rs.getString(3));
	        
	       }catch(Exception e1){
	       	e1.printStackTrace();
	       }
	        
			
			
		}
		if(e.getSource() == i6)
		{
			try{
			  Class.forName("com.mysql.jdbc.Driver");
	           java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost/your_ticket","root","password");
	    	   String qry = "select * from movie where movie = 'FAST & FURIOUS 8'"  ;
	           
	           java.sql.Statement s1 = con.createStatement();
	           	ResultSet rs = s1.executeQuery(qry);
	           	
	           	rs.next();
	            movie_name.setText(rs.getString(1));
	            text_area.setText("<html>"+rs.getString(2)+"</html>");
	            rdate.setText(rs.getString(3));
	        
	       }catch(Exception e1){
	       	e1.printStackTrace();
	       }
	        
			
			
		}
		
		if(e.getSource() == b[0])
		{
			f.dispose();
			new AvailabilityList().Availability("SMURFS",String.valueOf(c.getSelectedItem()),signed_user);
		}
		if(e.getSource() == b[1])
		{
			f.dispose();
			new AvailabilityList().Availability("BOSS-BABY",String.valueOf(c.getSelectedItem()),signed_user);
		}
		if(e.getSource() == b[2])
		{
			f.dispose();
			new AvailabilityList().Availability("NOOR",String.valueOf(c.getSelectedItem()),signed_user);
		}
		if(e.getSource() == b[3])
		{
			f.dispose();
			new AvailabilityList().Availability("NAAM - SHABANA",String.valueOf(c.getSelectedItem()),signed_user);
		}
		if(e.getSource() == b[4])
		{
			f.dispose();
			new AvailabilityList().Availability("BAAHUBALI : 2",String.valueOf(c.getSelectedItem()),signed_user);
		}
		if(e.getSource() == b[5])
		{
			f.dispose();
			new AvailabilityList().Availability("FAST & FURIOUS 8",String.valueOf(c.getSelectedItem()),signed_user);
		}
		
		if(e.getSource() == logout)
		{
			
			new FrontPage() ;
			f.dispose();
		}
		
	}
	
	

}
