package com.davis.array;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<String> rows = new HashSet<>();

        for(int i=0;i<board.length;i++){
            for(int j=0; j< board[0].length;j++){
                char elem = board[i][j];
                if(!rows.add(elem+" R "+i) &&
                    !rows.add(elem+" C "+j) &&
                    !rows.add(elem+" B "+i/3+ j/3) ){
                    return false;
                }
            }
        }
        return true;
    }
}
