package src;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class UserDetails extends JFrame implements ActionListener,MouseListener {
    private String contact;
    private String password;

    Font f = new Font("Arial",Font.BOLD,18);
        Font f2 = new Font("Arial",Font.BOLD,30);
        Color lightblue = new Color(51,204,255);

    UserDetails(String contact,String password){
        this.contact = contact;
        this.password=password;
    }
    public void setContact(String contact){
        this.contact=contact;
    }
    public void setPassword(String password){
        this.password=password;  
    }

    public String getcontact(){return contact;}
    public String getpassword(){return password;}

        UserDetails(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
        
        Container c = new Container();
        c = getContentPane();
        c.setLayout(null);

        JLabel con = new JLabel();
        con.setText("contact : "+getcontact());
        con.setBounds(200,100,180,40);
        con.setFont(f);
        con.setBackground(lightblue);
        c.add(con);
        JLabel pass = new JLabel();
        pass.setText("Password : "+getpassword());
        pass.setBounds(200,150,180,40);
        pass.setFont(f);
        pass.setBackground(lightblue);
        c.add(pass);



            }

        @Override
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        }


        }


