package com.company;


import com.company.Classes.Parallelogram;
import com.company.Classes.Parallelogram_List;
import com.company.Classes.Quadrilateral;
import com.company.Classes.Quadrilateral_List;

public class Main {

    public static void main(String[] args) {


        int N = 5;
        int M = 10;

        int X1, X2, X3,X4;
        int Y1, Y2, Y3,Y4;

        Quadrilateral_List quadrilateral_list=new Quadrilateral_List();
        Parallelogram_List parallelogram_list=new Parallelogram_List();


        for (int i = 0; i < N; i++) {                                                                                                                                                                                                     //    (Math.random() * 11)
            while (!Quadrilateral.isQuadliteralExists(X1 = (int) (Math.random() * 11), X2 = (int) (Math.random() * 11), X3 = (int) (Math.random() * 11), Y1 = (int) (Math.random() * 11), Y2 = (int) (Math.random() * 11), Y3 = (int) (Math.random() * 11), X4 = (int) (Math.random() * 11), Y4 = (int) (Math.random() * 11))) {
            }
            quadrilateral_list.add(new Quadrilateral(X1,X2,X3,X4,Y1,Y2,Y3,Y4));
        }
        for (int i = 0; i < M; i++) {
            while (!Parallelogram.isQuadliteralExists(X1 = (int) (Math.random() * 11), X2 = (int) (Math.random() * 11), X3 = (int) (Math.random() * 11), Y1 = (int) (Math.random() * 11), Y2 = (int) (Math.random() * 11), Y3 = (int) (Math.random() * 11), X4 = (int) (Math.random() * 11), Y4 = (int) (Math.random() * 11))) {
            }
            parallelogram_list.add(new Parallelogram(X1,X2,X3,X4,Y1,Y2,Y3,Y4));
        }
        System.out.println(quadrilateral_list+System.lineSeparator());
        System.out.println(parallelogram_list+System.lineSeparator());

        System.out.println("Average square: "+quadrilateral_list.findAverageArea());
        System.out.println("Parallelogram with minimal square: " + parallelogram_list.findParallelogram_List_MinSquare());
        System.out.println("Parallelogram with maximal square: " +parallelogram_list.findParallelogram_List_MaxSquare());




    }
}
