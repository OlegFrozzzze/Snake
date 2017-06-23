package com.company;


import javax.swing.*;
import java.awt.*;

/**
 * Created by ОЛЕГ on 22.06.2017.
 */


public class SnakeGameMain extends JPanel {

    public static JFrame jFrame;
    public static final int SCALE = 32;
    public static final int WIDTH = 20;
    public static final int HEIGHT = 20;


    public void SnakeGameMain(){

    }

    public void paint(Graphics g){
        g.setColor(Color.black);
        g.fillRect(0,0,WIDTH*SCALE, HEIGHT*SCALE);

        for (int x = 0; x < WIDTH*SCALE; x+=SCALE){
            g.setColor(Color.green);
            g.drawLine(x,0,x,HEIGHT*SCALE);
        }

        for (int y=0; y<HEIGHT*SCALE; y +=SCALE){
            g.setColor(Color.green);
            g.drawLine(0,y,WIDTH*SCALE,y);
    }
}

    public static void main(String[] args) {
        jFrame = new JFrame ("Title");
        jFrame.setSize(WIDTH*SCALE+7, HEIGHT*SCALE+4);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        jFrame.add(new SnakeGameMain());
        jFrame.setVisible(true);


    }
}
