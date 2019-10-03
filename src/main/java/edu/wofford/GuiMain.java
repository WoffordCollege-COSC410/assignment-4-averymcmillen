package edu.wofford;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class GuiMain extends JFrame implements ActionListener {

    private JButton b[][];
    private JLabel result;


    public void actionPerformed(ActionEvent event) {
        //if (event.getSource() == button0){
        //    setMark(event);
        //}
    }


    public GuiMain() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b = new JButton[3][3];

        setLayout(new GridLayout(4, 3));

        setTitle("Tic Tac Toe");
        JLabel label0 = new JLabel("Tic", SwingConstants.CENTER);
        label0.setVerticalAlignment(SwingConstants.CENTER);
        add(label0);
        result = new JLabel("Tac", SwingConstants.CENTER);
        result.setVerticalAlignment(SwingConstants.CENTER);
        result.setName("result");
        add(result);
        JLabel label2 = new JLabel("Toe", SwingConstants.CENTER);
        label2.setVerticalAlignment(SwingConstants.CENTER);
        add(label2);

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                b[row][col] = new JButton();
                b[row][col].addActionListener(this);
                b[row][col].setName("location" + row + col);
                add(b[row][col]);
            }
        }

        pack();
    }

    
	public static void main(String[] args) {
	    GuiMain window = new GuiMain();
        window.setVisible(true);

	}
}