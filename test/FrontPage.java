import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.regex.Pattern;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.Timer;

public class FrontPage  implements ActionListener
{
	
	JFrame f ;
	Timer t ;
	JLabel poster , uname , password ,logo , mail , cnt ;
	JButton signin , signup , submit ;
	JTextField em , email ,  contact ;  /** em will take the user-name 
	                                       
	                                          email will take e-mail address
	                                       contact will take contact no   */
	JPasswordField pass ;
	static int  po , pop = 0 ;
	String pcheck =  "^[0-9]{10}$" , mcheck = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"  + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"; ;
	String ema , un ;
	FrontPage()
	{
		pop = 0 ;
		f = new JFrame("WELCOME TO YOUR TICKET-Book seats of your choice") ;
		ImageIcon icon = new ImageIcon("/home/lakshay/Desktop/b/myicon") ;
		f.setIconImage(icon.getImage());
		f.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		f.setLayout(null);
		f.setContentPane(new JLabel(new ImageIcon("/home/lakshay/Desktop/b/ba2.jpg")));
		
		
		logo = new JLabel(new ImageIcon("/home/lakshay/Desktop/b/logo"));
	  	f.add(logo);
	  	logo.setBounds(60, 5, 250, 250);
		
	  
		
		uname = new JLabel(new ImageIcon("/home/lakshay/Desktop/popo.png")) ;   
        f.add(uname) ;
   	    uname.setBounds(500, 30 ,100, 100);
   	   
	    em = new JTextField();
	    f.add(em);
	    em.setBounds(600, 65, 240, 40);
	    em.setFont(new Font("Baskerville",Font.BOLD,16));
	    em.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 4));
	   
	
   	    
   	    
   	    password = new JLabel(new ImageIcon("/home/lakshay/Desktop/b/lockf"));
	    f.add(password);
	    password.setBounds(507, 110, 90, 90);
	    
	    pass = new JPasswordField();
	    f.add(pass);
	    pass.setBounds(600, 135, 240, 40);
	    pass.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 4));
	    
	    
	    mail = new JLabel(new ImageIcon("/home/lakshay/Desktop/b/mailf"));
	    f.add(mail);
	    mail.setBounds(870, 40, 90, 90);
	    mail.setVisible(false);
	    
	    email = new JTextField();
	    f.add(email);
	    email.setBounds(960, 65, 240, 40);
	    email.setFont(new Font("Baskerville",Font.BOLD,16));
	    email.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 4));
	    email.setVisible(false);
	    
	    
	    cnt = new JLabel(new ImageIcon("/home/lakshay/Desktop/b/phonef"));
	    f.add(cnt);
	    cnt.setBounds(870, 110, 90, 90);
	    cnt.setVisible(false);
	    
	    contact = new JTextField();
	    f.add(contact);
	    contact.setBounds(960, 135, 240, 40);
	    contact.setFont(new Font("Baskerville",Font.BOLD,16));
	    contact.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 4));
	    contact.setVisible(false);
	    
	      
	    signin = new JButton("LOGIN") ;
	    f.add(signin);
	    signin.setBackground(Color.gray);
	    signin.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 2));
	    signin.setBounds(604, 190, 108, 33);
	    signin.addActionListener(this);
	    
	    signup = new JButton("REGISTER") ;
	    f.add(signup);
	    signup.setBackground(Color.gray);
	    signup.setBounds(730,190,108,33);
	    signup.setBorder(BorderFactory.createLineBorder(Color.orange, 2));
	    signup.addActionListener(this);
		
	    
	    submit = new JButton("SUBMIT") ;
	    f.add(submit);
	    submit.setBackground(Color.gray);
	    submit.setBounds(962,190,108,33);
	    submit.setBorder(BorderFactory.createLineBorder(Color.orange, 2));
	    submit.addActionListener(this);
	    submit.setVisible(false);
	    
	    
	    
	    
		
		poster = new JLabel(new ImageIcon("/home/lakshay/Desktop/b/mirza.jpg"));
		f.add(poster);
		poster.setBounds(0, 160, 1370,500);
	
	
		
		po = 1 ;
		t = new Timer(3000, new ActionListener()
				{
			

					@Override
					public void actionPerformed(ActionEvent e) {
						
						// TODO Auto-generated method stub
						if(po == 1)
						{
							poster.setIcon(new ImageIcon("/home/lakshay/Desktop/b/baby.jpg"));
							po++ ;
						}
						else if(po == 2)
						{
							poster.setIcon(new ImageIcon("/home/lakshay/Desktop/b/mirza.jpg"));
							po++ ;
							
						}
						else if(po == 3)
						{
							poster.setIcon(new ImageIcon("/home/lakshay/Desktop/b/smurfs.jpg"));
							po++ ;
							
						}
						else if(po == 4)
						{
							poster.setIcon(new ImageIcon("/home/lakshay/Desktop/b/noor.jpg"));
							po++ ;
							
						}
						else if(po == 5)
						{
							poster.setIcon(new ImageIcon("/home/lakshay/Desktop/b/ff8.jpg"));
							po = 1 ;
							
						}
						
					}
			
				}) ;
		t.start();
		
		
	   
		f.setVisible(true);
		
				
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		if(e.getSource() == signup)  // signup is the register button
		{
		    mail.setVisible(true);
		    email.setVisible(true);
		    cnt.setVisible(true);
		    submit.setVisible(true);
		    contact.setVisible(true);
		    signup.setVisible(false);
		    signin.setVisible(false);
		    em.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2));
			pass.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2));
			email.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2));
			contact.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2));
       	}
       	
		
		
		if(e.getSource() == signin)
		{
			
			 em.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
			 pass.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
			 
			 try
		       {
		    	   Class.forName("com.mysql.jdbc.Driver");
		           java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost/your_ticket","root","password");
		    	   String qry = "select username,password from customer where username = " + "'"+em.getText()+"'"+ "and password ="+"'"+pass.getText()+"'";
		           
		           java.sql.Statement s1 = con.createStatement();
		           	ResultSet rs = s1.executeQuery(qry);
		           	if(rs.next())
		           	{
		           	    
		           		new ChooseCIty().Choose(em.getText()) ;
		           		f.dispose();
		           	}
		           	else
		           	{
		           		em.setText("");
		           		pass.setText("");
		           		em.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		   			    pass.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		           	}
		         
		        
		       }catch(Exception e1)
			 {
		       	e1.printStackTrace();
		      }
			
		}
		
		
	    if(e.getSource() == submit)
	    {
	    	Pattern ma = Pattern.compile(mcheck);
            Pattern ph = Pattern.compile(pcheck);	    	
	    	if(ma.matcher(email.getText()).matches() && ph.matcher(contact.getText()).matches())
	    	{
	    		
	    		try
		        {
		        	Class.forName("com.mysql.jdbc.Driver");
		            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost/your_ticket","root","password");
		            java.sql.PreparedStatement ps2 = con.prepareStatement("insert into customer values(?,?,?,?)");
		            ps2.setString(1, em.getText());
		            ps2.setString(2, pass.getText());
		            ps2.setString(3, email.getText());
		            ps2.setString(4, contact.getText());
		            ps2.executeUpdate() ;
		            
		            mail.setVisible(false);
				    email.setVisible(false);
				    cnt.setVisible(false);
				    submit.setVisible(false);
				    contact.setVisible(false);
				    signup.setVisible(true);
				    signin.setVisible(true);
				    
				    String msg = "Thank You " + em.getText()+" for using Your Ticket . We will try to make your experience of booking movie tickets much better than before . " ;
					String sub = "WELCOME TO YOUR-TICKET" ;
					String from = "abc@gmail.com" ;  // enter your e-mail id here
					String to = email.getText() ;
					String password = "icandoit" ;   // enter your password 
  					Properties properties = new Properties(); 
					properties.put("mail.smtp.host","smtp.gmail.com");
					properties.put("mail.smtp.socketFactory.port","465");
					properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
					properties.put("mail.smtp.auth","true");
					properties.put("mail.smtp.port","465");
				 
					
					Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator(){
						protected PasswordAuthentication getPasswordAuthentication(){
							return new PasswordAuthentication(from,password);
						}
					});
					// default session 
					try { 
						MimeMessage message = new MimeMessage(session); // email message 
				 
						message.addRecipient(Message.RecipientType.TO, new InternetAddress(to)); 
						message.setSubject(sub); // subject line 
					 
						message.setText(msg);
					
						Transport.send(message);
						
						} 
				catch (MessagingException mex)
						{
						mex.printStackTrace();
						}
					   
		          
		         
		        }catch(Exception e1){
		        	e1.printStackTrace();
		        }
	    			
	    		
	    	}
	    	if(ma.matcher(email.getText()).matches() == false)
	    	{
	    		  email.setText("");
	    		  email.setBorder(BorderFactory.createLineBorder(Color.RED, 4));
	    		
	    	}
	    	if(ph.matcher(contact.getText()).matches() == false)
	    	{
	    		  contact.setText("");
	    		  contact.setBorder(BorderFactory.createLineBorder(Color.RED, 4));
	    	}
	    	
	    		
	    }
		
		
	}
	
	public static void main(String args[])
	{
		new FrontPage();
		
		

}
	}
