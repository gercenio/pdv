package com.gaxsoftware.pdv;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Shell;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.gaxsoftware.pdv.dao.UserDao;
import com.gaxsoftware.pdv.model.User;
import com.gaxsoftware.pdv.util.CustomDialog;
import com.gaxsoftware.pdv.util.HibernateUtil;



public class MainWindow {

	//protected Shell shell;
	private Shell shell;
	public static LoginForm loginWindow;
	JFrame mainFrame;
    JTextField usernameTxt;
    JPasswordField passwordTxt;
    JInternalFrame loginFrame;

	@SuppressWarnings("unused")
	public MainWindow()
	{
	        Display display = new Display();
	        loginWindow = new LoginForm(display);
	        SplashWindow splashWindow = new SplashWindow(display);
	        while((Display.getCurrent().getShells().length != 0)
	                 && !Display.getCurrent().getShells()[0].isDisposed())
	        {
	             if(!display.readAndDispatch())
	             {
	                 display.sleep();
	             }
	        }       
	 }
	
	/**
	 * Launch the application.
	 * @param args
	 * @throws java.text.ParseException 
	 */
	public static void main(String[] args) throws java.text.ParseException {
		
		

		
		/*SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		UserDao dao = new UserDao();

		// Add new user
		User user = new User();
		user.setFirstName("Daniel");
		user.setLastName("NikoJdbc");
		try {
			Date dob = Util.convertJavaDateToSqlDate(new SimpleDateFormat("yyyy-MM-dd").parse("2014-05-13"));
		user.setDob(dob);
		} catch (ParseException e) {
		e.printStackTrace();
		}
		user.setEmail("prateek@example.com");
		dao.addUser(user);
		System.out.println("User is added successfully into DB");

		user.setEmail("prateek@itcompany.com");
		user.setUserid(1);
		dao.updateUser(user);
		System.out.println("User is updated successfully");
		
		// Delete user
		//dao.deleteUser(2);

		// Get all users
		for (User iter : dao.getAllUsers()) {
		System.out.println(iter);
		}

		// Get user by id
		System.out.println(dao.getUserById(8));

		session.getTransaction().commit();
		session.save(user);
		session.close();
		
		//session.beginTransaction();
		
		StatusDao statusDao = new StatusDao();
		
		Status status = new Status();
		status.setStatusds("FATURADO");
		
		statusDao.addStatus(status);
		System.out.println("User is added successfully into DB");
		
		// Get all users
		for (Status st : statusDao.getAllStatus()) {
				System.out.println(st);
		}*/
		
		//session.getTransaction().commit();
		//session.save(status);
		//session.close();
		
		
		try {
			MainWindow window = new MainWindow();
			window.open();
			//window.createContent();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContent();
		//shell.open();
		//shell.layout();
		//while (!shell.isDisposed()) {
		//	if (!display.readAndDispatch()) {
		//		display.sleep();
		//	}
		//}
		
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
	}
	
	protected void createContent(){
		
        mainFrame = new JFrame("Main");
        mainFrame.setSize(1000,600);
        loginFrame = new JInternalFrame("Login");
        loginFrame.setSize(400,200);
        mainFrame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);
        JDesktopPane mainPanel = new JDesktopPane();
        JPanel loginPanel = new JPanel();
        
        JTextArea textArea = new JTextArea(25,25);
        usernameTxt = new JTextField(25);   
        passwordTxt = new JPasswordField(25);
        JLabel usernameLbl = new JLabel("Username: ");
        JLabel passwordLbl = new JLabel("Password: ");
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new loginButtonListener());
 
        mainPanel.add(textArea);
        mainPanel.add(loginFrame);
        loginPanel.add(usernameLbl);
        loginPanel.add(usernameTxt);
        loginPanel.add(passwordLbl);
        loginPanel.add(passwordTxt);
        loginPanel.add(loginButton);
         
        loginFrame.getContentPane().add(BorderLayout.CENTER,loginPanel);
        mainFrame.getContentPane().add(BorderLayout.CENTER,mainPanel);
        loginFrame.setVisible(true);                    
        mainFrame.setVisible(true);
        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        //login center
        Dimension desktopSize = mainFrame.getSize();
        Dimension jInternalFrameSize = loginFrame.getSize();
        loginFrame.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
            (desktopSize.height- jInternalFrameSize.height)/2);
                
        shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
 
    }

	public class loginButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent ev)
        {
        	
        	if(usernameTxt.getText().length() == 0)
        	{
        	
        		CustomDialog msg = new CustomDialog();
        		msg.setTitle("Gax Software");
        		msg.setOptions(new String[] { "OK"});
            	msg.addMessageText("Preencha os dados corretamente...");
            	msg.show();
            	
        	}
        	else if(passwordTxt.getText().length() == 0)
        	{
        	
        		CustomDialog msg = new CustomDialog();
        		msg.setTitle("Gax Software");
        		msg.setOptions(new String[] { "OK"});
            	msg.addMessageText("Preencha os dados corretamente...");
            	msg.show();
            	
        	}else if(passwordTxt.getText().length() !=0 && usernameTxt.getText().length() !=0)
        	{
        		SessionFactory sf = HibernateUtil.getSessionFactory();
        		Session session = sf.openSession();
        		session.beginTransaction();
        		
        		UserDao dao = new UserDao();
        		User user = dao.getUserByName(usernameTxt.getText());
        		if(user != null)
        		{
        			//pb2.setVisible(false);
        			//aqui quando o usuario existe na base
        			loginFrame.setVisible(false);
        			EventQueue.invokeLater(new Runnable() {
        	            @Override
        	            public void run() {
        	                try {
        	                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        	                } catch (ClassNotFoundException ex) {
        	                } catch (InstantiationException ex) {
        	                } catch (IllegalAccessException ex) {
        	                } catch (UnsupportedLookAndFeelException ex) {
        	                }
        	                mainFrame.add(new ClockPane());
        	                mainFrame.pack();
        	                mainFrame.setVisible(true);
        	                mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        	            }
        	        });
        			
        			
        		}else{
        	
        			CustomDialog msg = new CustomDialog();
            		msg.setTitle("Gax Software");
            		msg.setOptions(new String[] { "OK"});
                	msg.addMessageText("Usuario não encontrado...");
                	msg.show();
        		}
        		session.close();
        		
        	}
        	
        		
            //if username and password is good hide child window
        	//if(usernameTxt.getText().toString() == null)
        	//{
        			
            	//usernameTxt.setFocusTraversalPolicyProvider(true);
        	//}
        	//else{
        		
        		//loginFrame.setVisible(false);
        	//}
        	
        	//if(usernameTxt.getText().toString() != null && passwordTxt.getPassword().toString() !=null)
        	//{
        	//	loginFrame.setVisible(false);
        		
        	//}else{
        	//	CustomDialog msg = new CustomDialog();
        	//	msg.addMessageText("Preencha os dados corretamente");
        	//	msg.show();
        		
        	//}
            
        }
    }

    public class ClockPane extends JPanel {

        private JLabel clock;

        public ClockPane() {
            setLayout(new BorderLayout());
            clock = new JLabel();
            clock.setHorizontalAlignment(JLabel.CENTER);
            clock.setFont(UIManager.getFont("Label.font").deriveFont(Font.BOLD, 48f));
            tickTock();
            add(clock);

            Timer timer = new Timer(500, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tickTock();
                }
            });
            timer.setRepeats(true);
            timer.setCoalesce(true);
            timer.setInitialDelay(0);
            timer.start();
        }

        public void tickTock() {
            clock.setText(DateFormat.getDateTimeInstance().format(new Date()));
        }
    }
}


