package src;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class login extends JFrame implements ActionListener,MouseListener{
    login(){
        Font f = new Font("Arial",Font.BOLD,18);
        Font bf = new Font("Arial",Font.BOLD+Font.ITALIC,28);
        Font mf = new Font("Roboto",Font.BOLD,12);
        Font f2 = new Font("Sherif",Font.BOLD,14);
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

        ImageIcon img = new ImageIcon("src\\bt.jpg");
        JLabel i = new JLabel(img);
        i.setBounds(40,60,400,400);
        c.add(i);

        JLabel headline = new JLabel();
        headline.setText("ONLINE");
        headline.setBounds(500,20,150,40);
        headline.setFont(bf);
        headline.setForeground(lightblue);
        c.add(headline);

        JLabel headline2 = new JLabel();
        headline2.setText("MOBILE");
        headline2.setBounds(540,65,150,40);
        headline2.setFont(bf);
        headline2.setForeground(lightblue);
        c.add(headline2);

        JLabel headline3 = new JLabel();
        headline3.setText("TICKETING");
        headline3.setBounds(580,110,190,40);
        headline3.setFont(bf);
        headline3.setForeground(lightblue);
        c.add(headline3);

        JLabel l  = new JLabel();
        l.setText("*CONTACT");
        l.setForeground(Color.RED);
        l.setBounds(500,160,100,30);
        l.setFont(f);
        c.add(l);

        JTextField cf = new JTextField();
        cf.setBounds(500,190,200,40);
        cf.setHorizontalAlignment(JTextField.CENTER);
        cf.setFont(f);
        c.add(cf);
        
        JLabel p  = new JLabel();
        p.setText("*PASSWORD");
        p.setForeground(Color.RED);
        p.setFont(f);
        p.setBounds(500,240,160,30);
        c.add(p);

        JPasswordField pf = new JPasswordField();
        pf.setBounds(500,270,200,40);
        pf.setHorizontalAlignment(JTextField.CENTER);
        pf.setFont(mf);
        c.add(pf);

        JButton log = new JButton();
        log.setText("LOGIN");
        log.setBounds(500,320,120,40);
        log.setFont(f);
        log.setBackground(Color.GREEN);
        c.add(log);
        log.addActionListener(new ActionListener() {

            @SuppressWarnings("deprecation")
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(cf.getText().isEmpty()==false && pf.getText().isEmpty()==false){
                    String contact = cf.getText();
                    String password = pf.getText();
                    Account account = new Account();
                    if(account.checkAccount(contact, password)==true){
                        String contact2 = cf.getText();
                        String password2 = pf.getText();

                        JOptionPane.showMessageDialog(null,"Login Successfull");

                        UserDetails user_details = new UserDetails();
                        user_details.setContact(contact2);
                        user_details.setPassword(password2);

                        Route h = new Route();
                        h.setVisible(true);
                        setVisible(false);

                        cf.setText("");
                        pf.setText("");
                    }
                    else if(cf.getText().equals("admin") && pf.getText().equals("admin")){
                        Admin admin = new Admin();
                        admin.setVisible(true);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"NO MATCHED ACCOUNT FOUND");
                        cf.setText("");
                       pf.setText("");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"ENTER THE DETAILS CORRECTLY");
                    cf.setText("");
                    pf.setText("");
                }

            }
            
        });

        log.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e){}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                log.setBackground(Color.BLACK);
                log.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                log.setBackground(Color.GREEN);
                log.setForeground(Color.BLACK);
            }
            
        });
        JButton exit = new JButton();
        exit.setText("EXIT");
        exit.setBounds(640,320,120,40);
        exit.setFont(f);
        exit.setBackground(Color.RED);
        c.add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
            
        });
        exit.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                exit.setBackground(Color.BLACK);
                exit.setForeground(Color.WHITE);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                exit.setBackground(Color.RED);
                exit.setForeground(Color.BLACK);
            }

        });


        JLabel dhac = new JLabel();
        dhac.setText("Doesnt Have An Account?");
        dhac.setForeground(Color.BLACK);
        dhac.setBounds(500,360,220,40);
        dhac.setFont(mf);
        dhac.setToolTipText("Click The Create New Account Button");
        c.add(dhac);

        JButton newaccountButton = new JButton();
        newaccountButton.setText("CREATE NEW ACCOUNT");
        newaccountButton.setBounds(500,400,230,40);
        newaccountButton.setBackground(lightblue);
        newaccountButton.setFont(f2);
        c.add(newaccountButton);
        newaccountButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                    cna c = new cna();
                    c.setVisible(true);
                    setVisible(false);
            }
            
        });
        newaccountButton.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                newaccountButton.setBackground(Color.BLACK);
                newaccountButton.setForeground(Color.WHITE);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                newaccountButton.setBackground(lightblue);
                newaccountButton.setForeground(Color.BLACK);
            }

        });    
    }
    public static void main(String[] a){
        login l = new login();
        l.setVisible(true);
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
