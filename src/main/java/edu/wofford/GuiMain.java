package edu.wofford;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class GuiMain extends JFrame implements ActionListener {

    JButton b[] = new JButton[9];
    int value = 0;
    String[] letters = new String[9];


    public void actionPerformed(ActionEvent event) {
        //if (event.getSource() == button0){
        //    setMark(event);
        //}
    }


    public GuiMain() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(4, 3));

        setTitle("Tic Tac Toe");
        JLabel label0 = new JLabel("Tic", SwingConstants.CENTER);
        label0.setVerticalAlignment(SwingConstants.CENTER);
        add(label0);
        JLabel label1 = new JLabel("Tac", SwingConstants.CENTER);
        label1.setVerticalAlignment(SwingConstants.CENTER);
        add(label1);
        JLabel label2 = new JLabel("Toe", SwingConstants.CENTER);
        label2.setVerticalAlignment(SwingConstants.CENTER);
        add(label2);

        for (int i = 0; i < 9; i++) {
            letters[i] = "";
        }
        for (int i = 0; i < 9; i++) {
            b[i] = new JButton();
            add(b[i]);
        }
        for (int i = 0; i < 9; i++) {
            b[i].addActionListener(this);
        }

        pack();
    }

    
	public static void main(String[] args) {
	    GuiMain window = new GuiMain();
        window.setVisible(true);

	}
}