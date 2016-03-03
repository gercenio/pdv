package com.gaxsoftware.pdv;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;


public class LoginForm extends JFrame {

	private Display display;
    private Shell shell;
    private JInternalFrame loginFrame;
    private JTextField usernameTxt;
    private JPasswordField passwordTxt;
    
    /**
     * @wbp.parser.entryPoint
     */
    public LoginForm(Display display) {
        this.display = display; 
		//this.frame = new JFrame();    
    }

    JButton blogin = new JButton("Login");
    JPanel panel = new JPanel();
    JTextField txuser = new JTextField(15);
    JPasswordField pass = new JPasswordField(15);
    
    LoginForm(){
    	super("Login Autentification");
    	setSize(300,200);
    	setLocation(500,280);
    	panel.setLayout (null); 


    	txuser.setBounds(70,30,150,20);
    	pass.setBounds(70,65,150,20);
    	blogin.setBounds(110,100,80,20);

    	panel.add(blogin);
    	panel.add(txuser);
    	panel.add(pass);

    	getContentPane().add(panel);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setVisible(true);
    	actionlogin();
    }
    
    
    public void initWindow() {
        //shell = new Shell(display, SWT.CLOSE | SWT.MIN);
        //shell.setText("Login - PDV");
        
        //shell.open();
        //shell.pack();
 
        //Rectangle splashRect = shell.getBounds();
        //Rectangle displayRect = display.getBounds();
        //int x = (displayRect.width - splashRect.width) / 2;
        //int y = (displayRect.height - splashRect.height) / 2;
        //shell.setLocation(x, y);
        //shell.setSize(450, 300);
        
        //this.Go();
    }
 
    private void Go(){
    	
    	 
    	
    	//JFrame mainFrame = new JFrame("Main");
        this.setSize(420,250);
        loginFrame = new JInternalFrame("Login");
        loginFrame.setSize(400,200);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
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
        this.getContentPane().add(BorderLayout.CENTER,mainPanel);
 
        loginFrame.setVisible(true);                    
        this.setVisible(true);     
    	
    } 
    
    public class loginButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            //if username and password is good hide child window
                 
             
        }
         
    }
    
    public void destroyWindow() {
        shell.close();
        shell.dispose();
    }
    
    public void actionlogin(){
    	blogin.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent ae) {
    	String puname = txuser.getText();
    	String ppaswd = pass.getText();
    	if(puname.equals("test") && ppaswd.equals("12345")) {
    	newframe regFace =new newframe();
    	regFace.setVisible(true);
    	dispose();
    	} else {

    	JOptionPane.showMessageDialog(null,"Wrong Password / Username");
    	txuser.setText("");
    	pass.setText("");
    	txuser.requestFocus();
    	}

    	}
    	});
    }
    	
}
