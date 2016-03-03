package com.gaxsoftware.pdv;

//import java.sql.Date;
//import java.sql.SQLException;
//import java.text.SimpleDateFormat;


import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;

//import com.gaxsoftware.pdv.dao.StatusDao;
//import com.gaxsoftware.pdv.dao.UserDao;
//import com.gaxsoftware.pdv.model.Status;
//import com.gaxsoftware.pdv.model.User;
//import com.gaxsoftware.pdv.util.HibernateUtil;
//import com.gaxsoftware.pdv.util.Util;
//import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;


public class MainWindow {

	protected Shell shell;
	public static LoginForm loginWindow;
	
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
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");

	}

}
