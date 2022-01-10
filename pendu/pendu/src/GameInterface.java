package hangman;

import java.io.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.*;
//import javax.swing.border.EtchedBorder;
//import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

import java.io.*;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.Graphics;



public class GameInterface extends JComponent{

    JFrame frame = new JFrame("HangMan");
    JPanel GlobalPanel = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel KeyboardPanel;
    String SecretWord = "TomTom";
    String daches;
    int numguesses=2;

    public void GameWindow() {
        
        createPanel1();
        createPanel2();
        KeyboardPanel = createKeyboardPanel();
        frame.add(panel2);
        frame.add(panel1);
        frame.add(KeyboardPanel);
        //frame.add(panel2);
        frame.add(new MyGraphicalPanel());
        //frame.add(GlobalPanel);

        frame.setVisible(true);
        frame.setSize(650,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setResizable(false);
    }

    public void createPanel1() {
        panel1.setBounds(350,0,100,100);
        panel1.setLayout(new FlowLayout());
        panel1.setBorder(BorderFactory.createLineBorder(Color.blue));
    }

    public void createPanel2() {
        panel2.setBounds(20,250,500,200);
        panel2.setLayout(new FlowLayout());
        panel2.setBorder(BorderFactory.createLineBorder(Color.red));
    }

    public JPanel createKeyboardPanel(){
        JPanel jpanel = new JPanel();
        jpanel.setBounds(10,400,620,120);
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        jpanel.setLayout(gbl);
        jpanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED), "Choose a letter"));

        JButton[] keyboard=new JButton[26];
        for(int i=0; i<26; i++){
            int buttonNumber=i;
            char letter = (char)(i+65);
            keyboard[i]=new JButton(Character.toString(letter));
            keyboard[i].setFont(new Font("Monospaced",Font.BOLD,20));
            keyboard[i].setBackground(Color.GRAY);
            keyboard[i].setForeground(Color.BLACK);
            keyboard[i].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){   
                keyboard[buttonNumber].setBackground(Color.LIGHT_GRAY);
                keyboard[buttonNumber].setEnabled(false); 
                CheckLetter(letter);
              }
            }); 
            if(i<13){ gbc.gridx = i; gbc.gridy=0;}
            else{gbc.gridx = i-13; gbc.gridy=1;}

            jpanel.add(keyboard[i], gbc);
        }
        gbc.fill=GridBagConstraints.HORIZONTAL;
        return jpanel;
    }

    public void CheckLetter(char letter) {
        System.out.println(letter);
        repaint();//appel paintComponent(Graphics g) de nouveau;
    }

 }

