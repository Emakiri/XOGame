package ru.manasarovar;

import java.util.Scanner;

/**
 * Created by Emakiri on 19.04.2014.
 */

public class Move {
    private final int AMCELLS, AMROW;
    private final char PL1, PL2;
    private int ndxCell, ndxRow;
    private char[][] cells;


    public Move(int AMCELLS) {
        this.AMCELLS = this.AMROW = AMCELLS;
        cells = new char[AMCELLS][AMROW];

        //ВЫБОР Х или О
        System.out.println("Если играешь, X - жми 1, иначе будешь играть - O");
        Scanner p1 = new Scanner(System.in);
        if (p1.nextInt()==1){
            PL1 ='X'; PL2 ='O'; System.out.println("Играешь - "+ PL1);}
        else{
            PL1 = 'O';
            PL2 ='X'; System.out.println("Играешь - "+ PL1);}
        }

    public char getpl1() {
        return PL1;
    }
    public char getpl2() {
        return PL2;
    }
    public void newMove(char sign) {    // ХОДИМ
        System.out.println("ХОДИТ - "+sign);
        System.out.println("Введи номер Строки (0 - " + (AMCELLS - 1) + ")");
        Scanner in = new Scanner(System.in);
        ndxRow = in.nextInt();
            if (ndxRow >= 0 & ndxRow < AMROW) {
                System.out.println("Введи номер Столбца (0 - " + (AMROW - 1) + ")");
                Scanner in1 = new Scanner(System.in);
                ndxCell = in1.nextInt();
                if (ndxCell >=0 & ndxCell< AMCELLS){
                    move(ndxCell, ndxRow, sign);
                }
            }else {System.out.println("Ввод некорректен, попробуй еще раз!"); newMove(sign);}
    }

    private void move(int ndxCell, int ndxRow, char sign) {
        if (cells[ndxCell][ndxRow] == '\u0000' ) { //если свободна
            cells[ndxCell][ndxRow] = sign;
            System.out.println("ХОД сделан!");
        }else{
            System.out.println("Эта ячейка не свободна! Выбери другую.");
            newMove(sign);
        }
    }

    public int getNdxCell() {
        return ndxCell;
    }

    public int getNdxRow() {
        return ndxRow;
    }

    public char getMove() {
        return cells[ndxCell][ndxRow];

    }
}
