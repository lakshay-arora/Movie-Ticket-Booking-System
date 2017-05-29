import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class AvailabilityList implements ActionListener
{
	JFrame f ;
	JPanel p1 , p2 , p3 , p4   ;
	JLabel l1 , l2 , l3 , l4 , user , logo ;
	JButton b1 , b2 , b3 , b4 , b5 , b6 , b7 , b8  , back ;
	JButton day[] = new JButton[3] ;
	String mo_name , ci_name , sign;
	String s[] = new String[8] ;
	Timer to ;
	int pi ;
	JLabel d1 , d2 , d3 ;
	int seat = 0 ;
	ButtonGroup bob ;
	
	void setb(JButton l , String se)
	{
		try
        {
			seat = 0 ;
     	   Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost/your_ticket","root","password");  // replace root with mysql username and your_ticket with database name
     	    String qry = "select count(*) from seats_booked where show_id = '"+se+"'" ;
            
                java.sql.Statement s1 = con.createStatement();
            	ResultSet rs = s1.executeQuery(qry);
            	rs.next();
            	 seat = seat + rs.getInt(1);
            	if(seat > 30 && seat < 40)
            	{
            		l.setBackground(Color.YELLOW);
            	}
            	else if(seat <= 30)
            	{
            		l.setBackground(Color.GREEN);
            	}
            	else
            	{
            		l.setBackground(Color.RED);
            	}
            	       	
          
         
        }catch(Exception e1){
        	e1.printStackTrace();
        }
	}
	
	
	void Availability(String movie_name , String city_name,String cuser)
	{
		sign = cuser ;
		mo_name = movie_name ;
		ci_name = city_name ;
		f = new JFrame() ;
		ImageIcon icon = new ImageIcon("/home/lakshay/Desktop/b/myicon") ;
		f.setIconImage(icon.getImage());
		f.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		f.setLayout(null);
		f.setContentPane(new JLabel(new ImageIcon("/home/lakshay/Desktop/b/ba2.jpg")));
		
		user = new JLabel(cuser + "  CHOOSE SHOW TIME");
		f.add(user);
		user.setBounds(1000, 20, 300, 40);
		
		
		logo = new JLabel(new ImageIcon("/home/lakshay/Desktop/b/logo"));
		f.add(logo);
		logo.setBounds(1000, 270, 250, 250);
		
		back = new JButton(new ImageIcon("/home/lakshay/Desktop/b/back"));
		f.add(back);
		back.setBounds(1260, 10, 64, 64);
		back.addActionListener(this);
		back.setContentAreaFilled(false);
		back.setFocusPainted(false);
		back.setBorderPainted(false);
		
		d1 = new JLabel("1 MAY");
		f.add(d1);
		d1.setBounds(32, 110, 70, 40);
		d2 = new JLabel("2 MAY");
		f.add(d2);
		d2.setBounds(112, 110, 70, 40);
		d3 = new JLabel("3 MAY");
		f.add(d3);
		d3.setBounds(192, 110, 70, 40);
		day[0] = new JButton(new ImageIcon("/home/lakshay/Desktop/b/mon"));
		f.add(day[0]);
		day[0].setBounds(20, 140, 70, 70);
		day[0].addActionListener(this);
		day[0].setContentAreaFilled(false);
		day[0].setFocusPainted(false);
		day[0].setBorderPainted(false);
		day[1] = new JButton(new ImageIcon("/home/lakshay/Desktop/b/tue"));
		f.add(day[1]);
		day[1].setBounds(100, 140, 70, 70);
		day[1].addActionListener(this);
		day[1].setContentAreaFilled(false);
		day[1].setFocusPainted(false);
		day[1].setBorderPainted(false);
		day[2] = new JButton(new ImageIcon("/home/lakshay/Desktop/b/wed"));
		f.add(day[2]);
		day[2].setBounds(180, 140, 70, 70);
		day[2].addActionListener(this);
		day[2].setContentAreaFilled(false);
		day[2].setFocusPainted(false);
		day[2].setBorderPainted(false);
		
		p1 = new JPanel();
		f.add(p1);
		p1.setBackground(Color.LIGHT_GRAY);
		p1.setBounds(20, 222 , 780, 105);
		p1.setBorder(BorderFactory.createLineBorder(Color.WHITE,2,true));
		
		l1 = new JLabel("THEATRE NAME");
		p1.add(l1);
		p1.setLayout(new GridLayout());
		
		
		b1 = new JButton("TIMING");
		
        p1.add(b1);
        
        b2 = new JButton("TIMING");
        p1.add(b2);
        p1.setVisible(true);
		
		p2 = new JPanel();
		f.add(p2);
		p2.setBackground(Color.LIGHT_GRAY);
		p2.setBounds(20, 338, 780, 105);
		p2.setBorder(BorderFactory.createLineBorder(Color.WHITE,2,true));
		l2 = new JLabel("THEATRE NAME");
		p2.add(l2);
		p2.setLayout(new GridLayout());
		b3 = new JButton("TIMING");
        p2.add(b3);
        
        b4 = new JButton("TIMING");
        p2.add(b4);
		p2.setVisible(true);
		
		p3 = new JPanel();
		f.add(p3);
		p3.setBackground(Color.LIGHT_GRAY);
		p3.setBounds(20, 456, 780, 105);
		p3.setBorder(BorderFactory.createLineBorder(Color.WHITE,2,true));
		l3 = new JLabel("THEATRE NAME");
		p3.add(l3);
		p3.setLayout(new GridLayout());
		b5 = new JButton("TIMING");
        p3.add(b5);
        
        b6 = new JButton("TIMING");
        p3.add(b6);
		p3.setVisible(true);
		
		p4 = new JPanel();
		f.add(p4);
		p4.setBackground(Color.LIGHT_GRAY);
		p4.setBounds(20,574, 780, 105);
		p4.setBorder(BorderFactory.createLineBorder(Color.WHITE,2,true));
		l4 = new JLabel("THEATRE NAME");
		p4.add(l4);
		p4.setLayout(new GridLayout());
		b7 = new JButton("TIMING");
        p4.add(b7);
        
        b8 = new JButton("TIMING");
        p4.add(b8);
		p4.setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		
	       try
	       {
	    	   Class.forName("com.mysql.jdbc.Driver");
	           java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost/your_ticket","root","password");
	    	   String qry = "select theatre_name from theatre where city ="+ "'"+city_name+"' group by theatre_name" ;

	           
	           java.sql.Statement s1 = con.createStatement();
	           	ResultSet rs = s1.executeQuery(qry);
	           	rs.next();
	           	l1.setText(rs.getString(1));
	           	rs.next();
	           	l2.setText(rs.getString(1));
	           	rs.next();
	           	l3.setText(rs.getString(1));
	           	rs.next();
	           	l4.setText(rs.getString(1));
	           	
	           	
	           	
	                   	
	         
	        
	       }catch(Exception e1){
	       	e1.printStackTrace();
	       }
		
	
		
		pi = 1 ;
		to = new Timer(1000, new ActionListener()
		{
	

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
				if(pi == 1)
				{
					p1.setBackground(Color.GRAY);
					p4.setBackground(Color.LIGHT_GRAY);
				    pi++ ;
				}
				else if( pi == 2)
				{
					p1.setBackground(Color.LIGHT_GRAY);
					p2.setBackground(Color.GRAY);
					pi++ ;
				}
				else if( pi == 3)
				{
					p2.setBackground(Color.LIGHT_GRAY);
					p3.setBackground(Color.GRAY);
					pi++ ;
				}
				else if( pi == 4)
				{
					p3.setBackground(Color.LIGHT_GRAY);
					p4.setBackground(Color.GRAY);
					pi = 1 ;
				}
				
			}
	
		}) ;
        to.start();
		
		
		
		f.setVisible(true);
	}
	
	
	
	
	
	public static void main(String args[])
	{
		AvailabilityList a = new AvailabilityList() ;
		a.Availability("","","");
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 3 ; i++)
		{
		if(e.getSource() == day[i])
		{
			
			try
		       {
		    	   Class.forName("com.mysql.jdbc.Driver");
		           java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost/your_ticket","root","password");
		    	   String qry =  "select show_id,start_time from shows where show_id in (select show_id from movie_show where movie_name = "+"'"+mo_name+"' and show_id in(select show_id from shows where date_of_show = '2017-05-0"+(i+1)+"' and theatre_id in(select theatre_id from theatre where theatre_name = '"+l1.getText()+"')))" ;
		           
		           java.sql.Statement s1 = con.createStatement();
		           	ResultSet rs = s1.executeQuery(qry);
		           	
		           rs.next();
		           s[0] = rs.getString(1);
		           b1.setText(rs.getInt(2)+" : 00");
		           rs.next();
		           s[1] = rs.getString(1) ;
		           b2.setText(rs.getInt(2)+" : 00");
		           
                   qry =  "select show_id,start_time from shows where show_id in (select show_id from movie_show where movie_name = "+"'"+mo_name+"' and show_id in(select show_id from shows where date_of_show = '2017-05-0"+(i+1)+"' and theatre_id in(select theatre_id from theatre where theatre_name = '"+l2.getText()+"')))" ;
		           
		           java.sql.Statement s2 = con.createStatement();
		           	ResultSet rs2 = s2.executeQuery(qry);
		           	
		           rs2.next();
		           s[2] = rs2.getString(1);
		           b3.setText(rs2.getInt(2)+" : 00");
		           rs2.next();
		           s[3] = rs2.getString(1);
		           b4.setText(rs2.getInt(2)+" : 00");
		           
		           
                   qry =  "select show_id,start_time from shows where show_id in (select show_id from movie_show where movie_name = "+"'"+mo_name+"' and show_id in(select show_id from shows where date_of_show = '2017-05-0"+(i+1)+"' and theatre_id in(select theatre_id from theatre where theatre_name = '"+l3.getText()+"')))" ;
		           
		           java.sql.Statement s3 = con.createStatement();
		           	ResultSet rs3 = s3.executeQuery(qry);
		           	
		           rs3.next();
		           s[4] = rs3.getString(1);
		           b5.setText(rs3.getInt(2)+" : 00");
		           rs3.next();
		           s[5] =rs3.getString(1);
		           b6.setText(rs3.getInt(2)+" : 00");
		           
                   qry =  "select show_id,start_time from shows where show_id in (select show_id from movie_show where movie_name = "+"'"+mo_name+"' and show_id in(select show_id from shows where date_of_show = '2017-05-0"+(i+1)+"' and theatre_id in(select theatre_id from theatre where theatre_name = '"+l4.getText()+"')))" ;
		           
		           java.sql.Statement s4 = con.createStatement();
		           	ResultSet rs4 = s4.executeQuery(qry);
		           	
		           rs4.next();
		           s[6] = rs4.getString(1);
		           b7.setText(rs4.getInt(2)+" : 00");
		           rs4.next();
		           s[7] = rs4.getString(1);
		           b8.setText(rs4.getInt(2)+" : 00");
		           
		            setb(b1,s[0]);
					setb(b2,s[1]);
					setb(b3,s[2]);
					setb(b4,s[3]);
					setb(b5,s[4]);
					setb(b6,s[5]);
					setb(b7,s[6]);
					setb(b8,s[7]);
		           
		        
		       }catch(Exception e1){
		       	e1.printStackTrace();
		       }
		}
			
			
		
			
			
			  
			
		
		}
		
		if(e.getSource() == b1)
		{
			
		           new theatre(s[0],sign);
		           f.dispose();
	
			
		}
		

	    if(e.getSource() == b2)
		{
			
		           new theatre(s[1],sign);
		           f.dispose();
	
			
		}

		if(e.getSource() == b3)
		{
			
		           new theatre(s[2],sign);
		           f.dispose();
			
		}

		if(e.getSource() == b4)
		{
			
		           new theatre(s[3],sign);
		           f.dispose();
			
		}

		if(e.getSource() == b5)
		{
			
		           new theatre(s[4],sign);
		           f.dispose();
			
		}

		if(e.getSource() == b6)
		{
			
		           new theatre(s[5],sign);
		           f.dispose();
			
		}

	    if(e.getSource() == b7)
		{
			
		           new theatre(s[6],sign);
		           f.dispose();
			
		}

		if(e.getSource() == b8)
		{
			
		           new theatre(s[7],sign);
		           f.dispose();
			
		}
		if(e.getSource() == back )
		{
			new ChooseCIty().Choose(sign) ;
			f.dispose();
		}
		
		}
		
				
	}

