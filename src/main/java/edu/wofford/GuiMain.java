package edu.wofford;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class GuiMain extends JFrame implements ActionListener {

    private JButton[][] b;
    private JLabel result;
    private TicTacToeModel model;


    public void actionPerformed(ActionEvent event) {
        int brow = -1;
        int bcol = -1;
        String clickedButtonName = ((JButton) event.getSource()).getName();

        for (int row = 0; brow < 0 && row < 3; row++){
            for (int col = 0; bcol < 0 && col < 3; col++){
                if (b[row][col].getName().equals(clickedButtonName)){
                    brow = row;
                    bcol = col;
                }
            }
        }

        model.setMarkAt(brow, bcol);
        switch (model.getMarkAt(brow, bcol)){
            case EMPTY:
                break;
            case XMARK:
                b[brow][bcol].setText("X");
                break;
            case OMARK:
                b[brow][bcol].setText("O");
                break;
        }

        switch (model.getResult()){
            case XWIN:
                result.setText("X wins");
                break;
            case OWIN:
                result.setText("O wins");
                break;
            case TIE:
                result.setText("Tie");
                break;
            case NONE:
                break;
        }



    }


    public GuiMain() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b = new JButton[3][3];
        model = new TicTacToeModel();

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