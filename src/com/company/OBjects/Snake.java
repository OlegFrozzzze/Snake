package com.company.Objects;

import com.company.SnakeGameMain;

/**
 * Created by ОЛЕГ on 22.06.2017.
 */
public class Snake {
    public int length = 2;
    public int direction = 0;

    public int sX [] = new int [300];
    public int sY [] = new int [300];

    public Snake(int x1, int y1, int x2, int y2){
        sX[0]=x1;
        sX[1]=x2;
        sY[0]=y1;
        sY[1]=y2;
    }

    public void move (){

        for(int l = length; l > 0; l--){
            sX[l]=sX[l-l];
            sY[l]=sY[l-l];
        }

        //up
        if(direction==0) sY[0]--;
        //down
        if(direction==3) sY[0]++;
        //right
        if(direction==1) sX[0]++;
        //left
        if(direction==2) sX[0]--;
    }
}
