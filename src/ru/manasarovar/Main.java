package ru.manasarovar;

/**
 * Created by Emakiri on 18.04.2014.
 */
public class Main {
    public static void main(String[] args) {

        Field cells = new Field();                      // Field

        Win win = new Win(cells.getAMOUNTCELLS());      // Win mark

        cells.erasecells();
        cells.showcells();

        Move move = new Move(cells.getAMOUNTCELLS());   //MOVE


        int countCells = cells.getAMOUNTCELLS()*cells.getAMOUNTCELLS();
        for (int k=1; k<countCells; k++){
            char signpl1 = move.getpl1();
            char signpl2 = move.getpl2();
            if (k%2==0){move.newMove(signpl2);}else{move.newMove(signpl1);}
            int x =move.getNdxCell();
            int y = move.getNdxRow();
            char val = move.getMove();
         cells.setCells(x,y,val);
         cells.showcells();

         win.setCells(cells.getCells());
            if (k%2==0){win.checkWin(signpl2);}else{win.checkWin(signpl1);}
         }
    }
}
