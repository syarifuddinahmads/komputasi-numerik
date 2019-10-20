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
public class Regresi {
    float c;
    float m;
    float fy;

    public void setC(int n,int zY,int zX2,int zX,int zXY, int zXX2) {
        float a = (zY * zX2) - (zX * zXY);
        float b = n * zX2 - zXX2;
        float dc = a/b;
        this.c = dc;
    }

    public void setM(int n,int zY,int zX2,int zX,int zXY, int zXX2) {
        float a = n * zXY - (zX * zY);
        float b = n * zX2 - zXX2;
        float dc = a/b;
        this.m = dc;
    }

    public float getC() {
        return c;
    }

    public float getM() {
        return m;
    }

    public void setFy(float m, int x, float c) {
        float y = m * x + c;
        this.fy = y;
    }

    public float getFy() {
        return fy;
    }
    
}
