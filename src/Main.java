
import calculation.DataInterpolasi;
import calculation.DataRegresi;
import calculation.Interpolasi;
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
                    System.out.println("Progress !");
                    break;
                case 2:
                    System.out.println("Progress !");
                    break;
                case 3:
                    System.out.println("Progress !");
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
                    System.out.print("Input Nilai Test : ");
                    int nilaiTest = input.nextInt();
                    calcRegresi.setFy(calcRegresi.getM(), nilaiTest, calcRegresi.getC());
                    System.out.println("HASIL = " + calcRegresi.getFy());

                    break;
                case 5:

                    ArrayList<DataInterpolasi> dataInterpolasi = new ArrayList<>();
                    System.out.print("Input Jumlah n(node) : ");
                    int nI = input.nextInt();
                    for (int i = 0; i < nI; i++) {
                        System.out.println("Data Ke - " + (i + 1));
                        System.out.print("Input X : ");
                        int x = input.nextInt();
                        System.out.print("Input Y : ");
                        int y = input.nextInt();
                        dataInterpolasi.add(new DataInterpolasi(x, y));
                    }

                    System.out.println("=== Data Interpolasi ===");
                    System.out.println("NO | X | Y ");
                    for (int i = 0; i < dataInterpolasi.size(); i++) {
                        System.out.println(" " + (i + 1) + " | " + dataInterpolasi.get(i).getX() + " | " + dataInterpolasi.get(i).getY());
                    }
                    System.out.println("=== ====== ===");
                    System.out.print("Input X1 : ");
                    int x1 = input.nextInt();
                    System.out.print("Input Y1 : ");
                    int y1 = input.nextInt();
                    System.out.println("------------");
                    System.out.print("Input X2 : ");
                    int x2 = input.nextInt();
                    System.out.print("Input Y2 : ");
                    int y2 = input.nextInt();
                    Interpolasi calcInterpolasi = new Interpolasi(x1, x2, y1, y2);
                    System.out.println("Input Nilai Test : ");
                    int x = input.nextInt();
                    System.out.println("Hasil : " + calcInterpolasi.calculateXY(x));
                    break;
                case 6:
                    System.out.println("Exit !!!");
                    System.exit(0);
                    break;
            }

        } while (true);
    }

    static void menu() {
        System.out.println("1. Tabulasi\n2. Bolzano\n3. Regula Falsi\n4. Regresi Linier\n5. Interpolasi Linier\n6. Exit");
    }
}
