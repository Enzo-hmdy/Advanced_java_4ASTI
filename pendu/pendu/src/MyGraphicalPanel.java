package hangman;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


import javax.swing.*;

class MyGraphicalPanel extends GameInterface {
    String SecretWord ="";
    String daches;
    int numguesses=2;
    Boolean won =false;
    JPanel jp = new JPanel();
    
    @Override
     public void paintComponent(Graphics g) {
        super.paintComponent(g); 
        g.setFont(new Font("sansserif",Font.PLAIN,18));
        g.drawString("Welcome to HangMan, GoodLuck!",10,20);
        g.setFont(new Font("sansserif",Font.PLAIN+Font.BOLD,18));
        g.setColor(Color.BLACK);
        g.drawString("Secret word:",10,317);
        paintPendulum(g);
      } 
      public void paintPendulum(Graphics g){
           g.setColor(Color.GRAY);
           g.fillRect(10, 270, 130, 10);
           g.fillRect(40,70,10,200);
           g.fillRect(40,70,60,10);
           g.fillRect(95,70,5,25);
           g.setColor(Color.BLACK);
           for(int j=0; j<SecretWord.length();j++){
               if(!Character.isWhitespace(SecretWord.charAt(j))){
                    g.drawLine(140+15*j, 315, 150+15*j, 315);
                    g.drawLine(140+15*j, 316, 150+15*j, 316);
               }
                 
           }
           
           //cette boucle avec secret word marche
           for(int j=0; j<SecretWord.length(); j++){
                    String dach;
                    StringBuffer sb = new StringBuffer(40); 
                    char a;
                    a=(daches.charAt(j));
                    dach= sb.append((daches.charAt(j))).toString();
                    if(daches.charAt(j)==((char)(73))){
                        g.drawString(dach,143+15*j,310);
                    }
                    else
                        g.drawString(dach,139+15*j,310);
                    // g.drawString(((SecretWord.charAt(j))).toString(),125+15*j,310);// we cannot draw a character it shoul be tranformed into a string
         }
           if(won){
               g.setColor(Color.RED);
               g.setColor(Color.RED);
                for(int j=0; j<SecretWord.length(); j++){
                    String dach;
                    StringBuffer sb = new StringBuffer(40); 
                    char a;
                    a=(SecretWord.charAt(j));
                    dach= sb.append((SecretWord.charAt(j))).toString();
                    if(SecretWord.charAt(j)==((char)(73))){
                        g.drawString(dach,143+15*j,310);
                    }
                   
                    else
                        g.drawString(dach,139+15*j,310);
                    // g.drawString(((SecretWord.charAt(j))).toString(),125+15*j,310);// we cannot draw a character it shoul be tranformed into a string
         }
               g.setFont(new Font("TimesRoman",Font.BOLD + Font.ITALIC,30));
               g.drawString("congratulation!",230,200);
          }
         
           
         g.setFont(new Font("sansserif",Font.PLAIN+Font.BOLD,18));
         g.setColor(new Color(240,0,0));
         if (numguesses >=1 ){
                g.fillOval(82,95,30,30);
         }
         if (numguesses >=2 ){
                g.fillRect(95,125,7,70);
         }
         if (numguesses >=3 ){
                g.drawLine(67,130,96,150);
                g.drawLine(67,131,96,151);
                g.drawLine(67,132,96,152);
                g.drawLine(67,133,96,153);
                g.drawLine(67,134,96,154);
         }  
         if (numguesses >=4 ){
                g.drawLine(100,150,123,130);
                g.drawLine(100,151,123,131);
                g.drawLine(100,152,123,132);
                g.drawLine(100,153,123,133);
                g.drawLine(100,154,123,134);
         } 
         if (numguesses >=5 ){
                g.drawLine(67,211,96,191);
                g.drawLine(67,212,96,192);
                g.drawLine(67,213,96,193);
                g.drawLine(67,214,96,194);
                g.drawLine(67,215,96,195);
         }
         if (numguesses >=6 ){
                g.drawLine(100,191,124,210);
                g.drawLine(100,192,124,211);
                g.drawLine(100,193,124,212);
                g.drawLine(100,194,124,213);
                g.drawLine(100,195,124,214);
                g.setColor(Color.RED);
                for(int j=0; j<SecretWord.length(); j++){
                    String dach;
                    StringBuffer sb = new StringBuffer(40); 
                    char a;
                    a=(SecretWord.charAt(j));
                    dach= sb.append((SecretWord.charAt(j))).toString();
                    if(SecretWord.charAt(j)==((char)(73))){
                        g.drawString(dach,143+15*j,310);
                    }
                   
                    else
                        g.drawString(dach,139+15*j,310);
                    // g.drawString(((SecretWord.charAt(j))).toString(),125+15*j,310);// we cannot draw a character it shoul be tranformed into a string
         }
                g.setFont(new Font("TimesRoman",Font.BOLD + Font.ITALIC,35));
                g.drawString("Game Over!",220,120);
                
         }
    }
}


