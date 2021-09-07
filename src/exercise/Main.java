package exercise;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
@SuppressWarnings("serial")
public class Main extends JFrame {
    Container c;
    JLabel lblFt, lblln, lblHT;
    @SuppressWarnings("rawtypes")
	JComboBox cbFt, cbln;
    JPanel p1, p2, p3;
    JButton btnSubmit;

    @SuppressWarnings({ "unchecked", "rawtypes" })
	Main() {
        c = getContentPane();
        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
        p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        c.add(p1);
        p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        String[] ft = {"1", "2", "3", "4", "5", "6", "7"};
        String[] in = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
        lblHT = new JLabel("Height");
        cbFt = new JComboBox(ft);
        cbln = new JComboBox(in);
        lblFt = new JLabel("Foot");
        lblln = new JLabel("Inch");
        p2.add(lblHT);
        p2.add(lblFt);
        p2.add(lblln);
        p2.add(cbFt);
        p2.add(cbln);
        c.add(p2);

        p3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        btnSubmit = new JButton("Calculate");
        p2.add(btnSubmit);
        c.add(p3);
        btnSubmit.addActionListener(new L1());
    }


class L1 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
                    Object ftitem = cbFt.getSelectedItem();
                    String ft = (String) ftitem;
                    int foot = Integer.parseInt(ft);

                    Object lnitem = cbln.getSelectedItem();
                    String ln = (String) ftitem;
                    int Inches = Integer.parseInt(ln);


                    //convert FT to inches
                    while (foot > 0) {
                        Inches += 12;
                        foot--;
                    }
                    @SuppressWarnings("unused")
					double height = Inches * 2.54;
                    NumberFormat nf = NumberFormat.getInstance();
                    nf.setMaximumFractionDigits(2);
                    cbFt.setSelectedItem("1");
                    cbln.setSelectedItem("0");
                }
            }
    public static void main(String[] args) {
        Main b= new Main();
        b.setSize(300,250);
        b.setVisible(true);
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.setLocation(300,300);
        b.setResizable(false);
    }
    }