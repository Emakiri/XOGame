package ru.manasarovar;

import java.util.Scanner;

/**
 * Created by Emakiri on 09.04.2014.
 */

public class Field {

    private static final char DEFAULTCELL = ' ';
    private static final int MAX_AMOUNT_CELLS = 100;
    private static final int MIN_AMOUNT_CELLS = 3;
    private static final int DEFAULT_AMOUNT_CELLS = 3;
    private final int AMOUNTCELLS, AMOUNTROW;
    private final char[][] cells;


    public Field() {
        this(DEFAULT_AMOUNT_CELLS);
    }

      public Field(int size) {
        System.out.println("Создаю поле по умолчанию 3x3 или " +
                "введите размерность своего поля:");
        Scanner in = new Scanner(System.in);
        AMOUNTCELLS = AMOUNTROW = in.nextInt();
        cells = new char[AMOUNTCELLS][AMOUNTROW];
        System.out.println("Создаю игровое поле: " + AMOUNTCELLS + " на "
                + AMOUNTROW);
}

    public int getAMOUNTCELLS() {
        return this.AMOUNTCELLS;
    }

    public char[][] getCells() {
        return cells;
    }

    public void setCells(int x, int y, char value){
    cells [x][y] = value;
    }

    public void erasecells() {
        for (int j = 0; j < AMOUNTROW; j++) {
            eraseline(j);
        }
    }

    private void eraseline(int lineNumber) {
        for (int i = 0; i < AMOUNTCELLS; i++) {
            cells[i][lineNumber] = DEFAULTCELL;
        }
    }

    public void showcells() {
        for (int j = 0; j < AMOUNTROW; j++) {
            showLine(j);
            System.out.println();
        }
    }

    private void showLine(int rowNumber) {
        for (int i = 0; i < AMOUNTCELLS; i++) {
            showcell(i, rowNumber);
        }
    }

    private void showcell(int lineNumber, int rowNumber) {
        System.out.print("[" + cells[lineNumber][rowNumber] + "]");
    }
}