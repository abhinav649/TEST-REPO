package pong;

/*
 @author abhinav singh
 */
import java.awt.*;
import javax.swing.*;
import java.util.*;
public class GameFrame extends JFrame{
    GamePanel panel;
    
    public GameFrame(){
    panel = new GamePanel();
    this.setTitle("Pong Game");
    this.setResizable(false);
    this.add(panel);
    this.setBackground(Color.BLACK);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
    this.setLocationRelativeTo(null);
    }
}
