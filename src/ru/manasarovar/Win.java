package ru.manasarovar;

import java.util.Scanner;

/**
 * Created by Emakiri on 19.04.2014.
 */

public class Win {
    private final int WIN;
    private final int AMCELLS, AMROW;
    private char[][] cells;

    public Win(int AMCELLS) {
        this.AMCELLS = this.AMROW = AMCELLS;
        WIN= AMCELLS;
        System.out.println("играем до " + WIN + " Х/О");
    }

    public void setCells (char newCells[][]){
        this.cells = newCells;
    }
    public void checkWin(char sign) {
        winLine(sign);
        winRow(sign);
        winDiagonal(sign);
    }

    private void winLine(char sign) {    //Проверка Строк на победу
        for (int i = 0; i < AMCELLS; i++) {
            checkCellsLine(i, sign);
        }
    }

    private void checkCellsLine(int lineNumber, char sign) {
        int line=0;
        for (int j = 0; j < AMROW; j++) {
            if (cells [lineNumber][j] == sign) {
                line = line + 1;
                if (line == WIN) {
                    System.out.println("YOU WINNN!ROW="+line);
                    System.exit(0);
                }
            }
            else{line=0;}
        }
    }

    private void winRow(char sign) {    //Проверка Столбцов на победу
        for (int j = 0; j < AMROW; j++) {
            checkCellsRow(j, sign);
        }
    }

    private void checkCellsRow(int rowNumber,char sign) {
        int row=0;
        for (int i = 0; i < AMCELLS; i++) {
            if (cells [i][rowNumber] == sign) {
                row = row + 1;
                if (row == WIN) {
                    System.out.println("YOU WINNN!LINE="+row);
                    System.exit(0);
                }
            }
            else{row=0;}
        }
    }

    private void winDiagonal(char sign) {    //Проверка Диагоналей на победу
                int diag =0;
        for (int i=0; i < AMROW; i++) {
            if (cells [i][i] ==  sign) {
                diag = diag + 1;
                if (diag == WIN) {
                    System.out.println("YOU WINNN!Diag="+diag);
                    System.exit(0);
                }
            }
            else{diag=0;}
        }
    }
}