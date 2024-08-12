package src;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class cna extends JFrame implements ActionListener,MouseListener {
    cna(){
        Font f = new Font("Arial",Font.BOLD,22);
        Font bf = new Font("Arial",Font.BOLD+Font.ITALIC,28);
        Font mf = new Font("Roboto",Font.BOLD,14);
        Color lightblue = new Color(51,204,255);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800,600);
        this.setBackground(Color.BLACK);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        Container c;
        c = new Container();
        c = this.getContentPane();
        c.setLayout(null);

        JButton back = new JButton();
            back.setText("<-Back");
            back.setFont(f);
            back.setBounds(10,0,120,40);
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
                    login r = new login();
                    r.setVisible(true);
                    setVisible(false);
                }
                    
            });

        ImageIcon i = new ImageIcon("src\\cnp.png");
        JLabel img = new JLabel(i);
        img.setBounds(0,50,400,400);
        c.add(img);

        JLabel headline = new JLabel();
        headline.setText("JOIN WITH US!");
        headline.setBounds(420,20,250,40);
        headline.setFont(bf);
        c.add(headline);

        JLabel headline2 = new JLabel();
        headline2.setText("SIGN UP!");
        headline2.setBounds(450,70,250,40);
        headline2.setFont(bf);
        c.add(headline2);

        JLabel n = new JLabel();
        n.setText("NAME  : ");
        n.setBounds(450,150,120,40);
        n.setFont(f);
        c.add(n);
        JTextField nf = new JTextField();
        nf.setBounds(560,150,200,40);
        nf.setFont(f);
        nf.setHorizontalAlignment(JTextField.CENTER);
        c.add(nf);

        JLabel p = new JLabel();
        p.setText("CONTACT  : ");
        p.setBounds(405,200,160,40);
        p.setFont(f);
        c.add(p);
        JTextField pf = new JTextField();
        pf.setBounds(560,200,200,40);
        pf.setFont(f);
        pf.setHorizontalAlignment(JTextField.CENTER);
        c.add(pf);
        //pass
        JLabel pass = new JLabel();
        pass.setText("PASSWORD   : ");
        pass.setBounds(398,250,200,40);
        pass.setFont(f);
        c.add(pass);

        JPasswordField PF = new JPasswordField();
        PF.setBounds(560,250,200,40);
        PF.setFont(f);
        PF.setHorizontalAlignment(JTextField.CENTER);
        c.add(PF);

        JLabel C = new JLabel();
        C.setText("AREA   : ");
        C.setBounds(450,300,140,40);
        C.setFont(f);
        c.add(C);

        String area[] = new String[]{" ","DHAKA","CHITTAGONG","RAJSHAHI","MYMENSINGH","RANGPUR","KHULNA","BARISHAL"};

        JComboBox AREA = new JComboBox(area);
        AREA.setBounds(570,300,80,40);
        c.add(AREA);

        JLabel g = new JLabel();
        g.setText("GENDER   : ");
        g.setBounds(420,350,140,40);
        g.setFont(f);
        c.add(g);

        JRadioButton male = new JRadioButton();
        male.setBounds(570,350,100,40);
        male.setText("MALE");
        male.setFont(mf);
        c.add(male);

        JRadioButton female = new JRadioButton();
        female.setBounds(670,350,100,40);
        female.setText("FEMALE");
        female.setFont(mf);
        c.add(female);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        JButton signin = new JButton();
        signin.setBounds(420,430,130,40);
        signin.setText("SIGN IN");
        signin.setBackground(Color.GREEN);
        signin.setFont(f);
        c.add(signin);

        JButton exit = new JButton();
        exit.setBounds(580,430,130,40);
        exit.setText("EXIT");
        exit.setBackground(Color.RED);
        exit.setFont(f);
        c.add(exit);

        signin.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                String contact=pf.getText();
                String password=PF.getText();
                Account account = new Account(contact,password);
                if(!account.checkAccount(contact,password)){
                account.addAccount();
                JOptionPane.showMessageDialog(null,"New Account Has Been Created");
                setVisible(false);
                login h = new login();
                h.setVisible(true);
            }
            else if(account.checkAccount(contact, password)){
                JOptionPane.showMessageDialog(null,"ACCOUNT ALREADY EXISTS");
                login l = new login();
                l.setVisible(true);
            }
        }
        });

        signin.addMouseListener(new MouseListener(){
                public void mousePressed(MouseEvent a){}
                public void mouseReleased(MouseEvent a){}
                public void mouseClicked(MouseEvent a){}
                public void mouseEntered(MouseEvent a){
                    signin.setBackground(Color.BLACK);
                    signin.setForeground(Color.WHITE);
                }
                public void mouseExited(MouseEvent a){
                    signin.setBackground(Color.GREEN);
                    signin.setForeground(Color.BLACK);
                }
        });
        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                System.exit(0);
            }
        });
        exit.addMouseListener(new MouseListener(){
            public void mousePressed(MouseEvent a){}
            public void mouseReleased(MouseEvent a){}
            public void mouseClicked(MouseEvent a){}
            public void mouseEntered(MouseEvent a){
                exit.setBackground(Color.BLACK);
                exit.setForeground(Color.WHITE);
            }
            public void mouseExited(MouseEvent a){
                exit.setBackground(Color.RED);
                exit.setForeground(Color.BLACK);
            }
    });


            
        }
    public static void main(String[] a){
        cna n = new cna();
        n.setVisible(true);
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
