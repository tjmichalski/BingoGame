package bingogame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Card {
    private final static Integer ROWS_COUNT = 5;
    private final static Integer COLUMNS_COUNT = 5;
    
    private final String[][] card;
    
    public Card() {
        card = new String[ROWS_COUNT][COLUMNS_COUNT];
        List<Integer>[] listArray = new List[5];
        
        for(int i = 0; i < listArray.length; i++) {
            listArray[i] = new ArrayList();
        }
        
        for(int i = 0; i < listArray.length; i++) {
            for(int j = 1; j <= 15; j++) {
                listArray[i].add(j + (i * 15));
            }
        }
        
        for(int i = 0; i < COLUMNS_COUNT; i++) {
            for(int j = 0; j < ROWS_COUNT; j++) {
                int randomIndex = new Random().nextInt(listArray[i].size());
                card[i][j] = listArray[i].remove(randomIndex).toString();                
            }
        }
        
        card[2][2] = "F";
    }

    public String[][] getCard() {
        return card;
    }
    
    
    
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        
        for(int i = 0; i < COLUMNS_COUNT; i++) {
            for(int j = 0; j < ROWS_COUNT; j++) {
                stringBuilder
                    .append("[")
                    .append(card[j][i])
                    .append("] ");
            }
            stringBuilder.append("\n");
        }
        
        return stringBuilder.toString();
    }
}
