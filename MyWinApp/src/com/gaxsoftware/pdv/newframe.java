package com.gaxsoftware.pdv;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class newframe extends JFrame {

public static void main(String[] args) {
newframe frameTabel = new newframe();
}

JLabel welcome = new JLabel("Welcome to a New Frame");
JPanel panel = new JPanel();

newframe(){
super("Welcome");
setSize(300,200);
setLocation(500,280);
panel.setLayout (null); 

welcome.setBounds(70,50,150,60);

panel.add(welcome);

getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}

}

