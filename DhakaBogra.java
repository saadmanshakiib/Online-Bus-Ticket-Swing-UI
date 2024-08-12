package src;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class DhakaBogra extends JFrame implements ActionListener,MouseListener {
    DhakaBogra(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setLocationRelativeTo(null);
        this.setTitle("DhakaBogra");
        this.setBackground(Color.LIGHT_GRAY);
        this.setResizable(false);

        
        Container c = new Container();
        c = this.getContentPane();
        c.setLayout(null);

        Font f = new Font("Arial",Font.BOLD,18);
        Font f2 = new Font("Arial",Font.BOLD,30);
        Font f3 = new Font("Arial",Font.BOLD,25);


        Color lightblue = new Color(51,204,255);

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
                    Route r = new Route();
                    r.setVisible(true);
                    setVisible(false);
                }
                    
            });

            JLabel bn = new JLabel();
            bn.setText("BUS NAME");
            bn.setBounds(70,130,200,40);
            bn.setFont(f2);
            bn.setForeground(lightblue);
            c.add(bn);
            JLabel br = new JLabel();
            br.setText("BUS ROUTE");
            br.setBounds(330,130,200,40);
            br.setFont(f2);
            br.setForeground(lightblue);
            c.add(br);
            JLabel bt = new JLabel();
            bt.setText("BUS TIME");
            bt.setBounds(640,130,200,40);
            bt.setFont(f2);
            bt.setForeground(lightblue);
            c.add(bt);
            JLabel Greenline = new JLabel();
            Greenline.setText("GREEN LINE");
            Greenline.setBounds(80,200,160,40);
            Greenline.setFont(f3);
            Greenline.setForeground(Color.BLACK);
            c.add(Greenline);
            JLabel Greenline_route = new JLabel();
            Greenline_route.setText("Dhaka -> Bogra");
            Greenline_route.setBounds(300,200,280,40);
            Greenline_route.setFont(f3);
            Greenline_route.setForeground(Color.BLACK);
            c.add(Greenline_route);
            JLabel Greenline_time = new JLabel();
            Greenline_time.setText("6:00 AM");
            Greenline_time.setBounds(650,200,100,40);
            Greenline_time.setFont(f3);
            Greenline_time.setForeground(Color.BLACK);
            c.add(Greenline_time);
            JButton details = new JButton();
            details.setText("Details");
            details.setBounds(840,200,120,40);
            details.setFont(f3);
            details.setBackground(lightblue);
            details.setForeground(Color.BLACK);
            c.add(details);
            details.addMouseListener(new MouseListener() {

                @Override
                public void mouseClicked(MouseEvent e){}
    
                @Override
                public void mousePressed(MouseEvent e) {}
    
                @Override
                public void mouseReleased(MouseEvent e) {}
    
                @Override
                public void mouseEntered(MouseEvent e) {
                    details.setBackground(Color.BLACK);
                    details.setForeground(Color.WHITE);
                }
    
                @Override
                public void mouseExited(MouseEvent e) {
                    details.setBackground(lightblue);
                    details.setForeground(Color.BLACK);
                }
                
            });
            details.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent a){
                        GreenLine_DB g = new GreenLine_DB();
                        g.setVisible(true);
                    setVisible(false);
                }
            });//clear

            //bus 2
        JLabel hanif = new JLabel();
        hanif.setText("EKOTA");
        hanif.setBounds(120,280,120,40);
        hanif.setFont(f3);
        hanif.setForeground(Color.BLACK);
        c.add(hanif);
        JLabel hanif_route = new JLabel();
        hanif_route.setText("Dhaka -> Bogra");
        hanif_route.setBounds(300,280,280,40);
        hanif_route.setFont(f3);
        hanif_route.setForeground(Color.BLACK);
        c.add(hanif_route);
        JLabel hanif_time = new JLabel();
        hanif_time.setText("8:00 AM");
        hanif_time.setBounds(650,280,100,40);
        hanif_time.setFont(f3);
        hanif_time.setForeground(Color.BLACK);
        c.add(hanif_time);
        JButton details2 = new JButton();
        details2.setText("Details");
        details2.setBounds(840,280,120,40);
        details2.setFont(f3);
        details2.setBackground(lightblue);
        details2.setForeground(Color.BLACK);
        c.add(details2);
        details2.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e){}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                details2.setBackground(Color.BLACK);
                details2.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                details2.setBackground(lightblue);
                details2.setForeground(Color.BLACK);
            }

        });
        details2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                Ekota h = new Ekota();
                h.setVisible(true);
                setVisible(false);
            }
        });
        //bus3
        JLabel SA = new JLabel();
        SA.setText("SHAH FATEH ALI ");
        SA.setBounds(50,360,320,40);
        SA.setFont(f3);
        SA.setForeground(Color.BLACK);
        c.add(SA);
        JLabel sa_route = new JLabel();
        sa_route.setText("Dhaka -> Bogra");
        sa_route.setBounds(300,360,280,40);
        sa_route.setFont(f3);
        sa_route.setForeground(Color.BLACK);
        c.add(sa_route);
        JLabel sa_time = new JLabel();
        sa_time.setText("10:00 AM");
        sa_time.setBounds(650,360,120,40);
        sa_time.setFont(f3);
        sa_time.setForeground(Color.BLACK);
        c.add(sa_time);
        JButton details3 = new JButton();
        details3.setText("Details");
        details3.setBounds(840,360,120,40);
        details3.setFont(f3);
        details3.setBackground(lightblue);
        details3.setForeground(Color.BLACK);
        c.add(details3);
        details3.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e){}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                details3.setBackground(Color.BLACK);
                details3.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                details3.setBackground(lightblue);
                details3.setForeground(Color.BLACK);
            }

        });
        details3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                SFA sa = new SFA();
                sa.setVisible(true);
                setVisible(false);
            }
        });
        //bus4
        JLabel UNIQUE = new JLabel();
        UNIQUE.setText("UNIQUE");
        UNIQUE.setBounds(100,440,120,40);
        UNIQUE.setFont(f3);
        UNIQUE.setForeground(Color.BLACK);
        c.add(UNIQUE);
        JLabel u_route = new JLabel();
        u_route.setText("Dhaka -> Bogra");
        u_route.setBounds(300,440,280,40);
        u_route.setFont(f3);
        u_route.setForeground(Color.BLACK);
        c.add(u_route);
        JLabel u_time = new JLabel();
        u_time.setText("3:00 PM");
        u_time.setBounds(650,440,100,40);
        u_time.setFont(f3);
        u_time.setForeground(Color.BLACK);
        c.add(u_time);
        JButton details4 = new JButton();
        details4.setText("Details");
        details4.setBounds(840,440,120,40);
        details4.setFont(f3);
        details4.setBackground(lightblue);
        details4.setForeground(Color.BLACK);
        c.add(details4);
        details4.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e){}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                details4.setBackground(Color.BLACK);
                details4.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                details4.setBackground(lightblue);
                details4.setForeground(Color.BLACK);
            }

        });
        details4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                Unique_DB u = new Unique_DB();
                u.setVisible(true);
                setVisible(false);
            }
        });
        //bus5
        JLabel ena = new JLabel();
        ena.setText("ENA");
        ena.setBounds(120,520,80,40);
        ena.setFont(f3);
        ena.setForeground(Color.BLACK);
        c.add(ena);
        JLabel ena_route = new JLabel();
        ena_route.setText("Dhaka -> Bogra");
        ena_route.setBounds(300,520,280,40);
        ena_route.setFont(f3);
        ena_route.setForeground(Color.BLACK);
        c.add(ena_route);
        JLabel ena_time = new JLabel();
        ena_time.setText("5:00 AM");
        ena_time.setBounds(650,520,100,40);
        ena_time.setFont(f3);
        ena_time.setForeground(Color.BLACK);
        c.add(ena_time);
        JButton details5 = new JButton();
        details5.setText("Details");
        details5.setBounds(840,520,120,40);
        details5.setFont(f3);
        details5.setBackground(lightblue);
        details5.setForeground(Color.BLACK);
        c.add(details5);
        details5.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e){}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                details5.setBackground(Color.BLACK);
                details5.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                details5.setBackground(lightblue);
                details5.setForeground(Color.BLACK);
            }

        });
        details5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                Ena_DB e = new Ena_DB();
                e.setVisible(true);
                setVisible(false);
            }
        });
        ///bus6
        JLabel shaymoli = new JLabel();
        shaymoli.setText("SHAYMOLI");
        shaymoli.setBounds(80,600,140,40);
        shaymoli.setFont(f3);
        shaymoli.setForeground(Color.BLACK);
        c.add(shaymoli);
        JLabel shaymoli_route = new JLabel();
        shaymoli_route.setText("Dhaka -> Bogra");
        shaymoli_route.setBounds(300,600,280,40);
        shaymoli_route.setFont(f3);
        shaymoli_route.setForeground(Color.BLACK);
        c.add(shaymoli_route);
        JLabel shaymoli_time = new JLabel();
        shaymoli_time.setText("8:00 AM");
        shaymoli_time.setBounds(650,600,100,40);
        shaymoli_time.setFont(f3);
        shaymoli_time.setForeground(Color.BLACK);
        c.add(shaymoli_time);
        JButton details6 = new JButton();
        details6.setText("Details");
        details6.setBounds(840,600,120,40);
        details6.setFont(f3);
        details6.setBackground(lightblue);
        details6.setForeground(Color.BLACK);
        c.add(details6);
        details6.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e){}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                details6.setBackground(Color.BLACK);
                details6.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                details6.setBackground(lightblue);
                details6.setForeground(Color.BLACK);
            }

        });
        details6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                Shaymoli_DB e = new Shaymoli_DB();
                e.setVisible(true);
                setVisible(false);
            }
        });

    }
    public static void main(String[] a){
        DhakaBogra dc = new DhakaBogra();
        dc.setVisible(true);
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