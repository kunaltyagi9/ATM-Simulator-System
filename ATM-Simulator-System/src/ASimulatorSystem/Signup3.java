
package ASimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Signup3 extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JRadioButton r1,r2,r3,r4;
    JButton b1,b2;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JTextField t1;
    
    
    
    
    Signup3(){
        
        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("NEW ACCOUNT APPLICATION FORM - PAGE 3");
        int y = fm.stringWidth(" ");
        int z = getWidth()/2 - (x/2);
        int w = z/y;
        String pad ="";
        //for (int i=0; i!=w; i++) pad +=" ";   
        pad = String.format("%"+w+"s", pad);
        setTitle(pad+"NEW ACCOUNT APPLICATION FORM - PAGE 3");
    
        
        l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        
        l2 = new JLabel("Account Type:");
        l2.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l3 = new JLabel("Card Number:");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l4 = new JLabel("XXXX-XXXX-XXXX-4184");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l5 = new JLabel("(Your 16-digit Card number)");
        l5.setFont(new Font("Raleway", Font.BOLD, 12));
        
        l6 = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
        l6.setFont(new Font("Raleway", Font.BOLD, 12));
        
        l7 = new JLabel("PIN:");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l8 = new JLabel("XXXX");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
    
        l9 = new JLabel("(4-digit password)");
        l9.setFont(new Font("Raleway", Font.BOLD, 12));
    
        l10 = new JLabel("Services Required:");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l11 = new JLabel("Form No:");
        l11.setFont(new Font("Raleway", Font.BOLD, 14));
        
        
        b1 = new JButton("Submit");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("Cancel");
        b2.setFont(new Font("Raleway", Font.BOLD, 14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c7 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.",true);
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
         
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 12));
        
        
        
        
        setLayout(null);
        
        l11.setBounds(700,10,70,30);
        add(l11);
        
        t1.setBounds(770,10,40,30);
        add(t1);
        
        l1.setBounds(280,50,400,40);
        add(l1); 
        
        l2.setBounds(100,140,200,30);
        add(l2);
        
        r1.setBounds(100,180,150,30);
        add(r1);
        
        r2.setBounds(350,180,300,30);
        add(r2);
        
        r3.setBounds(100,220,250,30);
        add(r3);
        
        r4.setBounds(350,220,250,30);
        add(r4);
        
        l3.setBounds(100,300,200,30);
        add(l3);
        
        l4.setBounds(330,300,250,30);
        add(l4);
        
        l5.setBounds(100,330,200,20);
        add(l5);
        
        l6.setBounds(330,330,500,20);
        add(l6);
        
        l7.setBounds(100,370,200,30);
        add(l7);
        
        l8.setBounds(330,370,200,30);
        add(l8);
        
        l9.setBounds(100,400,200,20);
        add(l9);
        
        l10.setBounds(100,450,200,30);
        add(l10);
        
        c1.setBounds(100,500,200,30);
        add(c1);
        
        c2.setBounds(350,500,200,30);
        add(c2);
        
        c3.setBounds(100,550,200,30);
        add(c3);
        
        c4.setBounds(350,550,200,30);
        add(c4);
        
        c5.setBounds(100,600,200,30);
        add(c5);
        
        c6.setBounds(350,600,200,30);
        add(c6);
        
        c7.setBounds(100,680,600,20);
        add(c7);
        
        b1.setBounds(300,720,100,30);
        add(b1);
        
        b2.setBounds(420,720,100,30);
        add(b2);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,850);
        setLocation(500,90);
        setVisible(true);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        
        String a = null;
        if(r1.isSelected()){ 
            a = "Saving Account";
        }
        else if(r2.isSelected()){ 
            a = "Fixed Deposit Account";
        }
        else if(r3.isSelected()){ 
            a = "Current Account";
        }else if(r4.isSelected()){ 
            a = "Recurring Deposit Account";
        }
        
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        long first8 = Math.abs(first7);
        
        long first3 = (ran.nextLong() % 9000L) + 1000L;
        long first4 = Math.abs(first3);
        
        String b = "";
        if(c1.isSelected()){ 
            b = b+" ATM Card";
        }
        if(c2.isSelected()){ 
            b = b+" Internet Banking";
        }
        if(c3.isSelected()){ 
            b = b+" Mobile Banking";
        }
        if(c4.isSelected()){ 
            b = b+" EMAIL Alerts";
        }
        if(c5.isSelected()){ 
            b = b+" Cheque Book";
        }
        if(c6.isSelected()){ 
            b = b+" E-Statement";
        }
        
        String c = t1.getText();
        
        
        try{
            
            if(ae.getSource()==b1){
                
                if(b.equals("")){
                
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                
                }else{
                
                    
                    conn c1 = new conn();
                    String q1 = "insert into signup3 values('"+a+"','"+first8+"','"+first4+"','"+b+"','"+c+"')";  
                    String q2 = "insert into login values('"+first8+"','"+first4+"')";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + first8 + "\n Pin:"+ first4);
                    
                    new Deposit().setVisible(true);
                    setVisible(false);
                }
            
            }else if(ae.getSource()==b2){
                System.exit(0);
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
    public static void main(String[] args){
        new Signup3().setVisible(true);
    }
    
}


