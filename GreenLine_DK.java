package src;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GreenLine_DK extends JFrame implements ActionListener,MouseListener {
    private static boolean s1_disabled = false;
    private static boolean s2_disabled = false;
    private static boolean s3_disabled = false;
    private static boolean s4_disabled = false;
    private static boolean s5_disabled = false;
    private static boolean s6_disabled = false;
    private static boolean s7_disabled = false;
    private static boolean s8_disabled = false;
    private static boolean s9_disabled = false;
    private static boolean s10_disabled = false;
    private static boolean s11_disabled = false;
    private static boolean s12_disabled = false;
    private static boolean s13_disabled = false;
    private static boolean s14_disabled = false;
    private static boolean s15_disabled = false;
    private static boolean s16_disabled = false;
    private static boolean s17_disabled = false;
    private static boolean s18_disabled = false;
    private static boolean s19_disabled = false;
    private static boolean s20_disabled = false;
    private static boolean s21_disabled = false;
    private static boolean s22_disabled = false;
    private static boolean s23_disabled = false;
    private static boolean s24_disabled = false;
    private static boolean s25_disabled = false;
    private static boolean s26_disabled = false;
    private static boolean s27_disabled = false;
    private static boolean s28_disabled = false;


    GreenLine_DK() {

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setTitle("GreenLine_DK");
        this.setBackground(Color.LIGHT_GRAY);
        this.setResizable(false);

        Container c = new Container();
        c = this.getContentPane();
        c.setLayout(null);

        Font f = new Font("Arial", Font.BOLD, 20);
        Font f2 = new Font("Arial", Font.BOLD, 25);
        Color lightblue = new Color(51, 204, 255);

        JButton back = new JButton();
        back.setText("<-Back");
        back.setFont(f);
        back.setBounds(30, 10, 100, 40);
        back.setBackground(lightblue);
        c.add(back);

        back.addMouseListener(new MouseListener() {

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
                DhakaKhulna q = new DhakaKhulna();
                q.setVisible(true);
                setVisible(false);
            }
        });


        JLabel bn = new JLabel();
        bn.setText("GREEN LINE");
        bn.setBounds(50, 200, 190, 40);
        bn.setForeground(Color.BLACK);
        bn.setFont(f2);
        c.add(bn);
        JLabel bdn = new JLabel();
        bdn.setText("Driver Name : SADAT");
        bdn.setBounds(50, 240, 400, 40);
        bdn.setForeground(Color.BLACK);
        bdn.setFont(f);
        c.add(bdn);
        JLabel s = new JLabel();
        s.setText("Starting Point : Abdullahpur");
        s.setBounds(50, 280, 400, 40);
        s.setForeground(Color.BLACK);
        s.setFont(f);
        c.add(s);
        JLabel st = new JLabel();
        st.setText("Starting Time : 6:00 Am");
        st.setBounds(50, 320, 400, 40);
        st.setForeground(Color.BLACK);
        st.setFont(f);
        c.add(st);
        JLabel e = new JLabel();
        e.setText("Ending Point : KHULNA GATE ");
        e.setBounds(50, 360, 400, 40);
        e.setForeground(Color.BLACK);
        e.setFont(f);
        c.add(e);
        JLabel et = new JLabel();
        et.setText("Ending Time : 12:00 Pm");
        et.setBounds(50, 400, 400, 40);
        et.setForeground(Color.BLACK);
        et.setFont(f);
        c.add(et);
        JLabel C = new JLabel();
        C.setText("Contact : 01726906511");
        C.setBounds(50, 440, 400, 40);
        C.setForeground(Color.BLACK);
        C.setFont(f);
        c.add(C);
        JPanel p = new JPanel();
        p.setBounds(350, 0, 450, 600);
        p.setBackground(Color.DARK_GRAY);
        p.setLayout(null);
        c.add(p);

        JLabel d = new JLabel();
        d.setText("Driver");
        d.setBounds(350, 20, 80, 50);
        d.setFont(f);
        d.setForeground(lightblue);
        p.add(d);
        JLabel door = new JLabel();
        door.setText("Door");
        door.setBounds(70, 20, 80, 40);
        door.setFont(f);
        door.setForeground(lightblue);
        p.add(door);
        JButton one = new JButton();
        one.setText("1");
        one.setBounds(70, 100, 60, 30);
        one.setBackground(lightblue);
        one.setFont(f);
        one.setForeground(Color.BLACK);
        p.add(one);
        one.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a) {
                JOptionPane.showMessageDialog(null, "Please Pay 500Tk to Confirm Your Booking");
                Payment pay = new Payment(500);
                pay.setVisible(true);
                one.setBackground(Color.RED);
                one.setEnabled(false);
                s1_disabled = true;
            }
        });
        if(s1_disabled){
            one.setEnabled(false);
            one.setBackground(Color.RED);
        }
        JButton two = new JButton();
        two.setText("2");
        two.setBounds(140, 100, 60, 30);
        two.setBackground(lightblue);
        two.setFont(f);
        two.setForeground(Color.BLACK);
        p.add(two);
        two.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a) {
                JOptionPane.showMessageDialog(null, "Please Pay 500Tk to Confirm Your Booking");
                Payment pay = new Payment(500);
                pay.setVisible(true);
                two.setBackground(Color.RED);
                two.setEnabled(false);
                s2_disabled=true;
            }
        });
        if(s2_disabled){
            two.setEnabled(false);
            two.setBackground(Color.RED);
        }

        JButton three = new JButton();
        three.setText("3");
        three.setBounds(280, 100, 60, 30);
        three.setBackground(lightblue);
        three.setFont(f);
        three.setForeground(Color.BLACK);
        p.add(three);
        three.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a) {
                JOptionPane.showMessageDialog(null, "Please Pay 500Tk to Confirm Your Booking");
                Payment pay = new Payment(500);
                pay.setVisible(true);
                three.setBackground(Color.RED);
                three.setEnabled(false);
                s3_disabled=true;
            }
        });
        if(s3_disabled){
            three.setEnabled(false);
            three.setBackground(Color.RED);
        }


        JButton four = new JButton();
        four.setText("4");
        four.setBounds(350, 100, 60, 30);
        four.setBackground(lightblue);
        four.setFont(f);
        four.setForeground(Color.BLACK);
        p.add(four);
        four.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a) {
                JOptionPane.showMessageDialog(null, "Please Pay 500Tk to Confirm Your Booking");
                Payment pay = new Payment(500);
                pay.setVisible(true);
                four.setBackground(Color.RED);
                four.setEnabled(false);
                s4_disabled=true;
            }
        });
        if(s4_disabled){
            four.setEnabled(false);
            four.setBackground(Color.RED);
        }


        JButton five = new JButton();
        five.setText("5");
        five.setBounds(70, 150, 60, 30);
        five.setBackground(lightblue);
        five.setFont(f);
        five.setForeground(Color.BLACK);
        p.add(five);
        five.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a) {
                JOptionPane.showMessageDialog(null, "Please Pay 500Tk to Confirm Your Booking");
                Payment pay = new Payment(500);
                pay.setVisible(true);
                five.setBackground(Color.RED);
                five.setEnabled(false);
                s5_disabled=true;
            }
        });
        if(s5_disabled){
            five.setEnabled(false);
            five.setBackground(Color.RED);
        }

        JButton six = new JButton();
        six.setText("6");
        six.setBounds(140, 150, 60, 30);
        six.setBackground(lightblue);
        six.setFont(f);
        six.setForeground(Color.BLACK);
        p.add(six);
        six.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a) {
                JOptionPane.showMessageDialog(null, "Please Pay 500Tk to Confirm Your Booking");
                Payment pay = new Payment(500);
                pay.setVisible(true);
                six.setBackground(Color.RED);
                six.setEnabled(false);
                s6_disabled=true;
            }
        });
        if(s6_disabled){
            six.setEnabled(false);
            six.setBackground(Color.RED);
        }

        JButton seven = new JButton();
        seven.setText("7");
        seven.setBounds(280, 150, 60, 30);
        seven.setBackground(lightblue);
        seven.setFont(f);
        seven.setForeground(Color.BLACK);
        p.add(seven);
        seven.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a) {
                JOptionPane.showMessageDialog(null, "Please Pay 500Tk to Confirm Your Booking");
                Payment pay = new Payment(500);
                pay.setVisible(true);
                seven.setBackground(Color.RED);
                seven.setEnabled(false);
                s7_disabled=true;
            }
        });
        if(s7_disabled){
            seven.setEnabled(false);
            seven.setBackground(Color.RED);
        }


        JButton eight = new JButton();
        eight.setText("8");
        eight.setBounds(350, 150, 60, 30);
        eight.setBackground(lightblue);
        eight.setFont(f);
        eight.setForeground(Color.BLACK);
        p.add(eight);
        eight.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a) {
                JOptionPane.showMessageDialog(null, "Please Pay 500Tk to Confirm Your Booking");
                Payment pay = new Payment(500);
                pay.setVisible(true);
                eight.setBackground(Color.RED);
                eight.setEnabled(false);
                s8_disabled=true;
            }
        });
        if(s8_disabled){
            eight.setEnabled(false);
            eight.setBackground(Color.RED);
        }
        //
        JButton nine = new JButton();
        nine.setText("9");
        nine.setBounds(70, 200, 60, 30);
        nine.setBackground(lightblue);
        nine.setFont(f);
        nine.setForeground(Color.BLACK);
        p.add(nine);
        nine.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a) {
                JOptionPane.showMessageDialog(null, "Please Pay 500Tk to Confirm Your Booking");
                Payment pay = new Payment(500);
                pay.setVisible(true);
                nine.setBackground(Color.RED);
                nine.setEnabled(false);
                s9_disabled=true;
            }
        });
        if(s9_disabled){
            nine.setEnabled(false);
            nine.setBackground(Color.RED);
        }
        JButton ten = new JButton();
        ten.setText("10");
        ten.setBounds(140, 200, 60, 30);
        ten.setBackground(lightblue);
        ten.setFont(f);
        ten.setForeground(Color.BLACK);
        p.add(ten);
        ten.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a) {
                JOptionPane.showMessageDialog(null, "Please Pay 500Tk to Confirm Your Booking");
                Payment pay = new Payment(500);
                pay.setVisible(true);
                ten.setBackground(Color.RED);
                ten.setEnabled(false);
                s10_disabled=true;
            }
        });
        if(s10_disabled){
            ten.setEnabled(false);
            ten.setBackground(Color.RED);
        }

        JButton eleven = new JButton();
        eleven.setText("11");
        eleven.setBounds(280, 200, 60, 30);
        eleven.setBackground(lightblue);
        eleven.setFont(f);
        eleven.setForeground(Color.BLACK);
        p.add(eleven);
        eleven.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a) {
                JOptionPane.showMessageDialog(null, "Please Pay 500Tk to Confirm Your Booking");
                Payment pay = new Payment(500);
                pay.setVisible(true);
                eleven.setBackground(Color.RED);
                eleven.setEnabled(false);
                s11_disabled=true;
            }
        });
        if(s11_disabled){
            eleven.setEnabled(false);
            eleven.setBackground(Color.RED);
        }

        JButton tw = new JButton();
        tw.setText("12");
        tw.setBounds(350, 200, 60, 30);
        tw.setBackground(lightblue);
        tw.setFont(f);
        tw.setForeground(Color.BLACK);
        p.add(tw);
        tw.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a) {
                JOptionPane.showMessageDialog(null, "Please Pay 500Tk to Confirm Your Booking");
                Payment pay = new Payment(500);
                pay.setVisible(true);
                tw.setBackground(Color.RED);
                tw.setEnabled(false);
                s12_disabled=true;
            }
        });
        if(s12_disabled){
            tw.setEnabled(false);
            tw.setBackground(Color.RED);
        }


        JButton th = new JButton();
        th.setText("13");
        th.setBounds(70, 250, 60, 30);
        th.setBackground(lightblue);
        th.setFont(f);
        th.setForeground(Color.BLACK);
        p.add(th);
        th.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a) {
                JOptionPane.showMessageDialog(null, "Please Pay 500Tk to Confirm Your Booking");
                Payment pay = new Payment(500);
                pay.setVisible(true);
                th.setBackground(Color.RED);
                th.setEnabled(false);
                s13_disabled=true;
            }
        });
        if(s13_disabled){
            th.setEnabled(false);
            th.setBackground(Color.RED);
        }

        JButton ft = new JButton();
        ft.setText("14");
        ft.setBounds(140, 250, 60, 30);
        ft.setBackground(lightblue);
        ft.setFont(f);
        ft.setForeground(Color.BLACK);
        p.add(ft);
        ft.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a) {
                JOptionPane.showMessageDialog(null, "Please Pay 500Tk to Confirm Your Booking");
                Payment pay = new Payment(500);
                pay.setVisible(true);
                ft.setBackground(Color.RED);
                ft.setEnabled(false);
                s14_disabled=true;
            }
        });
        if(s14_disabled){
            ft.setEnabled(false);
            ft.setBackground(Color.RED);
        }


        JButton fft = new JButton();
        fft.setText("15");
        fft.setBounds(280, 250, 60, 30);
        fft.setBackground(lightblue);
        fft.setFont(f);
        fft.setForeground(Color.BLACK);
        p.add(fft);
        fft.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a) {
                JOptionPane.showMessageDialog(null, "Please Pay 500Tk to Confirm Your Booking");
                Payment pay = new Payment(500);
                pay.setVisible(true);
                fft.setBackground(Color.RED);
                fft.setEnabled(false);
                s15_disabled=true;
            }
        });
        if(s15_disabled){
            fft.setEnabled(false);
            fft.setBackground(Color.RED);
        }

        JButton sixteen = new JButton();
        sixteen.setText("16");
        sixteen.setBounds(350, 250, 60, 30);
        sixteen.setBackground(lightblue);
        sixteen.setFont(f);
        sixteen.setForeground(Color.BLACK);
        p.add(sixteen);
        sixteen.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a) {
                JOptionPane.showMessageDialog(null, "Please Pay 500Tk to Confirm Your Booking");
                Payment pay = new Payment(500);
                pay.setVisible(true);
                sixteen.setBackground(Color.RED);
                sixteen.setEnabled(false);
                s16_disabled=true;
            }
        });
        if(s16_disabled){
            sixteen.setEnabled(false);
            sixteen.setBackground(Color.RED);
        }


        JButton seventeen = new JButton();
        seventeen.setText("17");
        seventeen.setBounds(70, 300, 60, 30);
        seventeen.setBackground(lightblue);
        seventeen.setFont(f);
        seventeen.setForeground(Color.BLACK);
        p.add(seventeen);
        seventeen.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a) {
                JOptionPane.showMessageDialog(null, "Please Pay 500Tk to Confirm Your Booking");
                Payment pay = new Payment(500);
                pay.setVisible(true);
                seventeen.setBackground(Color.RED);
                seventeen.setEnabled(false);
                s17_disabled=true;
            }
        });
        if(s17_disabled){
            seventeen.setEnabled(false);
            seventeen.setBackground(Color.RED);
        }

        JButton eighteen = new JButton();
        eighteen.setText("18");
        eighteen.setBounds(140, 300, 60, 30);
        eighteen.setBackground(lightblue);
        eighteen.setFont(f);
        eighteen.setForeground(Color.BLACK);
        p.add(eighteen);
        eighteen.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a) {
                JOptionPane.showMessageDialog(null, "Please Pay 500Tk to Confirm Your Booking");
                Payment pay = new Payment(500);
                pay.setVisible(true);
                eighteen.setBackground(Color.RED);
                eighteen.setEnabled(false);
                s18_disabled=true;
            }
        });
        if(s18_disabled){
            eighteen.setEnabled(false);
            eighteen.setBackground(Color.RED);
        }

        JButton nineteen = new JButton();
        nineteen.setText("19");
        nineteen.setBounds(280, 300, 60, 30);
        nineteen.setBackground(lightblue);
        nineteen.setFont(f);
        nineteen.setForeground(Color.BLACK);
        p.add(nineteen);
        nineteen.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a) {
                JOptionPane.showMessageDialog(null, "Please Pay 500Tk to Confirm Your Booking");
                Payment pay = new Payment(500);
                pay.setVisible(true);
                nineteen.setBackground(Color.RED);
                nineteen.setEnabled(false);
                s19_disabled=true;
            }
        });
        if(s19_disabled){
            nineteen.setEnabled(false);
            nineteen.setBackground(Color.RED);
        }


        JButton twenty = new JButton();
        twenty.setText("20");
        twenty.setBounds(350, 300, 60, 30);
        twenty.setBackground(lightblue);
        twenty.setFont(f);
        twenty.setForeground(Color.BLACK);
        p.add(twenty);
        twenty.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a) {
                JOptionPane.showMessageDialog(null, "Please Pay 500Tk to Confirm Your Booking");
                Payment pay = new Payment(500);
                pay.setVisible(true);
                twenty.setBackground(Color.RED);
                twenty.setEnabled(false);
                s20_disabled=true;
            }
        });
        if(s20_disabled){
            twenty.setEnabled(false);
            twenty.setBackground(Color.RED);
        }

        JButton twenty1 = new JButton();
        twenty1.setText("21");
        twenty1.setBounds(70, 350, 60, 30);
        twenty1.setBackground(lightblue);
        twenty1.setFont(f);
        twenty1.setForeground(Color.BLACK);
        p.add(twenty1);
        twenty1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a) {
                JOptionPane.showMessageDialog(null, "Please Pay 500Tk to Confirm Your Booking");
                Payment pay = new Payment(500);
                pay.setVisible(true);
                twenty1.setBackground(Color.RED);
                twenty1.setEnabled(false);
                s21_disabled=true;
            }
        });
        if(s21_disabled){
            twenty1.setEnabled(false);
            twenty1.setBackground(Color.RED);
        }
        JButton twenty2 = new JButton();
        twenty2.setText("22");
        twenty2.setBounds(140, 350, 60, 30);
        twenty2.setBackground(lightblue);
        twenty2.setFont(f);
        twenty2.setForeground(Color.BLACK);
        p.add(twenty2);
        twenty2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a) {
                JOptionPane.showMessageDialog(null, "Please Pay 500Tk to Confirm Your Booking");
                Payment pay = new Payment(500);
                pay.setVisible(true);
                twenty2.setBackground(Color.RED);
                twenty2.setEnabled(false);
                s22_disabled=true;
            }
        });
        if(s22_disabled){
            twenty2.setEnabled(false);
            twenty2.setBackground(Color.RED);
        }


        JButton tw3 = new JButton();
        tw3.setText("23");
        tw3.setBounds(280, 350, 60, 30);
        tw3.setBackground(lightblue);
        tw3.setFont(f);
        tw3.setForeground(Color.BLACK);
        p.add(tw3);
        tw3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a) {
                JOptionPane.showMessageDialog(null, "Please Pay 500Tk to Confirm Your Booking");
                Payment pay = new Payment(500);
                pay.setVisible(true);
                tw3.setBackground(Color.RED);
                tw3.setEnabled(false);
                s23_disabled=true;
            }
        });
        if(s23_disabled){
            tw3.setEnabled(false);
            tw3.setBackground(Color.RED);
        }


        JButton tw4 = new JButton();
        tw4.setText("24");
        tw4.setBounds(350, 350, 60, 30);
        tw4.setBackground(lightblue);
        tw4.setFont(f);
        tw4.setForeground(Color.BLACK);
        p.add(tw4);
        tw4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a) {
                JOptionPane.showMessageDialog(null, "Please Pay 500Tk to Confirm Your Booking");
                Payment pay = new Payment(500);
                pay.setVisible(true);
                tw4.setBackground(Color.RED);
                tw4.setEnabled(false);
                s24_disabled=true;
            }
        });
        if(s24_disabled){
            tw4.setEnabled(false);
            tw4.setBackground(Color.RED);
        }
        JButton t5 = new JButton();
        t5.setText("25");
        t5.setBounds(70, 400, 60, 30);
        t5.setBackground(lightblue);
        t5.setFont(f);
        t5.setForeground(Color.BLACK);
        p.add(t5);
        t5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a) {
                JOptionPane.showMessageDialog(null, "Please Pay 500Tk to Confirm Your Booking");
                Payment pay = new Payment(500);
                pay.setVisible(true);
                t5.setBackground(Color.RED);
                t5.setEnabled(false);
                s25_disabled=true;
            }
        });
        if(s25_disabled){
            t5.setEnabled(false);
            t5.setBackground(Color.RED);
        }

        JButton t6 = new JButton();
        t6.setText("26");
        t6.setBounds(140, 400, 60, 30);
        t6.setBackground(lightblue);
        t6.setFont(f);
        t6.setForeground(Color.BLACK);
        p.add(t6);
        t6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a) {
                JOptionPane.showMessageDialog(null, "Please Pay 500Tk to Confirm Your Booking");
                Payment pay = new Payment(500);
                pay.setVisible(true);
                t6.setBackground(Color.RED);
                t6.setEnabled(false);
                s26_disabled=true;
            }
        });
        if(s26_disabled){
            t6.setEnabled(false);
            t6.setBackground(Color.RED);
        }


        JButton tw7 = new JButton();
        tw7.setText("27");
        tw7.setBounds(280, 400, 60, 30);
        tw7.setBackground(lightblue);
        tw7.setFont(f);
        tw7.setForeground(Color.BLACK);
        p.add(tw7);
        tw7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a) {
                JOptionPane.showMessageDialog(null, "Please Pay 500Tk to Confirm Your Booking");
                Payment pay = new Payment(500);
                pay.setVisible(true);
                tw7.setBackground(Color.RED);
                tw7.setEnabled(false);
                s27_disabled=true;
            }
        });
        if(s27_disabled){
            tw7.setEnabled(false);
            tw7.setBackground(Color.RED);
        }


        JButton tw8 = new JButton();
        tw8.setText("28");
        tw8.setBounds(350, 400, 60, 30);
        tw8.setBackground(lightblue);
        tw8.setFont(f);
        tw8.setForeground(Color.BLACK);
        p.add(tw8);
        tw8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a) {
                JOptionPane.showMessageDialog(null, "Please Pay 500Tk to Confirm Your Booking");
                Payment pay = new Payment(500);
                pay.setVisible(true);
                tw8.setBackground(Color.RED);
                tw8.setEnabled(false);
                s28_disabled=true;
            }
        });
        if(s28_disabled){
            tw8.setEnabled(false);
            tw8.setBackground(Color.RED);
        }
        JLabel t = new JLabel();
        t.setText("Red");
        t.setBounds(80,450,60,40);
        t.setForeground(Color.RED);
        t.setFont(f);
        p.add(t);
        JLabel t1 = new JLabel();
        t1.setText(": Booked");
        t1.setBounds(130,450,100,40);
        t1.setFont(f);
        t1.setForeground(Color.WHITE);
        p.add(t1);
        JLabel t2 = new JLabel();
        t2.setText("Blue");
        t2.setBounds(80,500,60,40);
        t2.setForeground(lightblue);
        t2.setFont(f);
        p.add(t2);
        JLabel t3 = new JLabel();
        t3.setText(": Available");
        t3.setBounds(130,500,100,40);
        t3.setFont(f);
        t3.setForeground(Color.WHITE);
        p.add(t3);
    }


    public static void main(String[] a)
    {
        GreenLine_DK p = new GreenLine_DK();
        p.setVisible(true);
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
