package edu.wofford;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class GuiMain extends JFrame implements ActionListener {
/*
    private JButton button0;
    private JButton button1;
    private JButton button2;

    private JButton button3;
    private JButton button4;
    private JButton button5;

    private JButton button6;
    private JButton button7;
    private JButton button8;
*/
    JButton b[] = new JButton[9];
    int value = 0;
    String[] letters = new String[9];


    public void actionPerformed(ActionEvent event) {
        //if (event.getSource() == button0){
        //    setMark(event);
        //}
    }

//build button array of 9 buttons

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

/*

        button0 = new JButton( " ");
        button0.addActionListener(this);
        add(button0);

        button1 = new JButton( " ");
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton( " ");
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton( " ");
        button3.addActionListener(this);
        add(button3);

        button4 = new JButton( " ");
        button4.addActionListener(this);
        add(button4);

        button5 = new JButton( " ");
        button5.addActionListener(this);
        add(button5);

        button6 = new JButton( " ");
        button6.addActionListener(this);
        add(button6);

        button7 = new JButton( " ");
        button7.addActionListener(this);
        add(button7);

        button8 = new JButton( " ");
        button8.addActionListener(this);
        add(button8);
*/
        pack();
    }

    
	public static void main(String[] args) {
	    GuiMain window = new GuiMain();
        window.setVisible(true);

	}
}