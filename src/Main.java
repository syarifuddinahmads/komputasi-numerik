
import calculation.DataRegresi;
import calculation.Regresi;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author udin
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int zX;
        do {
            menu();
            System.out.print("Masukkan menu : ");
            int menu = input.nextInt();
            switch (menu) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    Regresi calcRegresi = new Regresi();
                    ArrayList<DataRegresi> dataRegresi = new ArrayList<>();
                    System.out.print("Input Jumlah n(node) : ");
                    int n = input.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Data Ke - " + (i + 1));
                        System.out.print("Input X : ");
                        int x = input.nextInt();
                        System.out.print("Input Y : ");
                        int y = input.nextInt();
                        dataRegresi.add(new DataRegresi(x, y));
                    }
                    
                    DataRegresi regresi = new DataRegresi(dataRegresi);
                    
                    calcRegresi.setC(n, regresi.getzY(), regresi.getzX2(), regresi.getzX(), regresi.getzXY(), regresi.getzXX2()); // n, zY, zX2, zX, zXY, zXX2
                    System.out.println("HASIL C = " + calcRegresi.getC());
                    calcRegresi.setM(n, regresi.getzY(), regresi.getzX2(), regresi.getzX(), regresi.getzXY(), regresi.getzXX2()); // n, zY, zX2, zX, zXY, zXX2
                    System.out.println("HASIL M = " + calcRegresi.getM());
                    System.out.print("Input Test : ");
                    int test = input.nextInt();
                    calcRegresi.setFy(calcRegresi.getM(), test, calcRegresi.getC());
                    System.out.println("HASIL = " + calcRegresi.getFy());

                    break;
                case 5:
                    break;
            }

        } while (true);
    }

    static void menu() {
        System.out.println("1. Tabulasi\n2. Bolzano\n3. Regula Falsi\n4. Regresi Linier\n5. Interpolasi Linier");
    }
}


//calcRegresi.setC(n, regresi.getzY(), regresi.getzX2(), regresi.getzX(), regresi.getzXY(), regresi.getzXX2()); // n, zY, zX2, zX, zXY, zXX2
//                    System.out.println("HASIL C === " + calcRegresi.getC());
//                    calcRegresi.setM(n, regresi.getzY(), regresi.getzX2(), regresi.getzX(), regresi.getzXY(), regresi.getzXX2()); // n, zY, zX2, zX, zXY, zXX2
//                    System.out.println("HASIL M === " + calcRegresi.getM());
//                    calcRegresi.setFy(calcRegresi.getM(), 2, calcRegresi.getC());
//                    System.out.println("HASIL === " + calcRegresi.getFy());
//
//
//calcRegresi.setC(6, 24, 187, 31, 148, 961); // n, zY, zX2, zX, zXY, zXX2
//                    System.out.println("HASIL C === " + calcRegresi.getC());
//                    calcRegresi.setM(6, 24, 187, 31, 148, 961); // n, zY, zX2, zX, zXY, zXX2
//                    System.out.println("HASIL M === " + calcRegresi.getM());
//                    calcRegresi.setFy(calcRegresi.getM(), 2, calcRegresi.getC());
//                    System.out.println("HASIL === " + calcRegresi.getFy());
