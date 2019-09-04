package bingogame;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String firstName;
    private String lastName;
    private List<Card> cards;
    
    public Player(String firstName, 
            String lastName, Integer cardCount) {
        this.firstName = firstName;
        this.lastName = lastName;
        cards = new ArrayList();
        
        for(int i = 0; i < cardCount; i++) {
            cards.add(new Card());
        }
    }
    
    public String[][] getCard(int cardNumber){
        return cards.get(cardNumber).getCard();
    }
    
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        
        stringBuilder.append(firstName)
                .append(" ").append(lastName);
        
        return stringBuilder.toString();
    }
}
