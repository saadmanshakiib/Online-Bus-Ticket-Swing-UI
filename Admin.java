package src;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Admin extends JFrame implements ActionListener,MouseListener {
    Admin(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setTitle("Admin");
        this.setBackground(Color.LIGHT_GRAY);
        this.setResizable(false);
        
        Container c = new Container();
        c = this.getContentPane();
        c.setLayout(null);

        Font f = new Font("Arial",Font.BOLD,18);
        Font f2 = new Font("Arial",Font.BOLD,30);
        Color lightblue = new Color(51,204,255);

        JLabel headline = new JLabel();
        headline.setText("Select Your Route ");
        headline.setFont(f2);
        headline.setBounds(260,50,420,40);
        headline.setForeground(Color.BLACK);
        c.add(headline);


            JButton back = new JButton();
            back.setText("<-Back");
            back.setFont(f);
            back.setBounds(50,50,100,40);
            back.setBackground(lightblue);
            c.add(back);

            back.addMouseListener(new MouseListener() {

                @Override
                public void mouseClicked(MouseEvent e){}
    
                @Override
                public void mousePressed(MouseEvent e) {}
    
                @Override
                public void mouseReleased(MouseEvent e) {}
    
                @Override
                public void mouseEntered(MouseEvent e) {
                    back.setBackground(Color.BLACK);
                    back.setForeground(Color.WHITE);
                }
    
                @Override
                public void mouseExited(MouseEvent e) {
                    back.setBackground(lightblue);
                    back.setForeground(Color.BLACK);
                }
                
            });
            back.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null,"Logging Out");
                    login q = new login();
                    q.setVisible(true);
                }
                    
            });
            

        JButton d2c = new JButton();
        d2c.setText("DHAKA TO CTG");
        d2c.setBounds(250,150,260,50);
        d2c.setBackground(lightblue);
        d2c.setFont(f);
        d2c.setForeground(Color.BLACK);
        c.add(d2c);
        d2c.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                DhakaChittagong dc = new DhakaChittagong();
                dc.setVisible(true);
            }
        });
        d2c.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e){}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                d2c.setBackground(Color.BLACK);
                d2c.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                d2c.setBackground(lightblue);
                d2c.setForeground(Color.BLACK);
            }
            
        });

        JButton d2k = new JButton();
        d2k.setText("DHAKA TO KHULNA");
        d2k.setBounds(250,230,260,50);
        d2k.setBackground(lightblue);
        d2k.setFont(f);
        d2k.setForeground(Color.BLACK);
        c.add(d2k);
        d2k.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a){
                DhakaKhulna dk = new DhakaKhulna();
                dk.setVisible(true);
            }
        });
        d2k.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e){}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                d2k.setBackground(Color.BLACK);
                d2k.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                d2k.setBackground(lightblue);
                d2k.setForeground(Color.BLACK);
            }
            
        });

        JButton d2r = new JButton();
        d2r.setText("DHAKA TO RAJSHAHI");
        d2r.setBounds(250,310,260,50);
        d2r.setBackground(lightblue);
        d2r.setFont(f);
        d2r.setForeground(Color.BLACK);
        c.add(d2r);
        d2r.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a){
                DhakaRajshahi dr = new DhakaRajshahi();
                dr.setVisible(true);
            }
        });
        d2r.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e){}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                d2r.setBackground(Color.BLACK);
                d2r.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                d2r.setBackground(lightblue);
                d2r.setForeground(Color.BLACK);
            }
            
        });

         JButton d2b = new JButton();
        d2b.setText("DHAKA TO BOGRA");
        d2b.setBounds(250,390,260,50);
        d2b.setBackground(lightblue);
        d2b.setFont(f);
        d2b.setForeground(Color.BLACK);
        c.add(d2b);
        d2b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a){
                DhakaBogra db = new DhakaBogra();
                db.setVisible(true);
            }
        });
        d2b.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e){}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                d2b.setBackground(Color.BLACK);
                d2b.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                d2b.setBackground(lightblue);
                d2b.setForeground(Color.BLACK);
            }
            
        });

    }

    public static void main(String[] z){
        Route r = new Route();
        r.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
