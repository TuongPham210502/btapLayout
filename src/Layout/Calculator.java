/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layout;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class Calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0,2));
        FlowLayout flCongtru328 = new FlowLayout();
        flCongtru328.setAlignment(FlowLayout.RIGHT);
        JPanel congtru328 = new JPanel(flCongtru328);
        
        FlowLayout flNhanchia328 = new FlowLayout();
        flNhanchia328.setAlignment(FlowLayout.LEFT);
        JPanel nhanchia328 = new JPanel(flNhanchia328);
        
        frame.setTitle("Calculator");
        JLabel lbStn328 = new JLabel("Số thứ nhất");
        JLabel lbSth328 = new JLabel("Số thứ hai");
        JLabel lbKQ328 = new JLabel("Kết quả");
        
        
        
        JTextField tfStn328 = new JTextField("5");
        JTextField tfSth328 = new JTextField("5");
        JTextField tfKQ328 = new JTextField("10");
        
        JButton btCong328 = new JButton("+");
        JButton btTru328 = new JButton("-");
        JButton btNhan328 = new JButton("*");
        JButton btChia328 = new JButton("/");
        congtru328.add(btCong328);
        congtru328.add(btTru328);
        nhanchia328.add(btNhan328);
        nhanchia328.add(btChia328);
        
        panel.add(lbStn328);
        panel.add(tfStn328);
        panel.add(lbSth328);
        panel.add(tfSth328);
        panel.add(tfSth328);
        panel.add(lbKQ328);
        panel.add(tfKQ328);
        panel.add(congtru328);
        panel.add(nhanchia328);
        
        
        
        
        frame.add(panel);
        frame.setSize(500,300);
        frame.setVisible(true);
        
    }
}
