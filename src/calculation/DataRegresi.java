/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation;

import java.util.ArrayList;

/**
 *
 * @author udin
 */
public class DataRegresi {
    
    int x;
    int y;
    int zY;
    int zX2;
    int zX;
    int zXY;
    int zXX2;
    ArrayList<DataRegresi> data;

    public DataRegresi(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public DataRegresi(ArrayList<DataRegresi> data) {
        this.data = data;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }  

    public int getzY() {
        for (int i = 0; i < data.size(); i++) {
            this.zY += data.get(i).getY();
        }
        return zY;
    }

    public int getzX2() {
        for (int i = 0; i < data.size(); i++) {
            this.zX2 += data.get(i).getX() * data.get(i).getX() ;
        }
        return zX2;
    }

    public int getzX() {
        for (int i = 0; i < data.size(); i++) {
            this.zX += data.get(i).getX();
        }
        return zX;
    }

    public int getzXY() {
        for (int i = 0; i < data.size(); i++) {
            this.zXY += data.get(i).getX() * data.get(i).getY() ;
        }
        return zXY;
    }

    public int getzXX2() {
        for (int i = 0; i < data.size(); i++) {
            this.zXX2 += data.get(i).getX();
        }
        return (zXX2 * zXX2);
    }
    
    
    
}
