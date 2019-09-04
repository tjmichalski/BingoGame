package bingogame;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Machine machine;
    private List<Player> players;
    
    public Game(Integer playerCount, Integer cardCount) {
        machine = new Machine();
        players = new ArrayList();
        for(int i = 0; i < playerCount; i++) {
            players.add(new Player("Player", "" + (i+1), cardCount));
        }
    }

    public List<Player> getPlayers() {
        return players;
    }
    
    public String[][] getCard(int playerNumber, int cardNumber){
        return players.get(playerNumber).getCard(cardNumber);
    }
    
    public void reset(){
        machine.reset();
    }
    
    public Ball drawBall() {
        return this.machine.getRandomBall();
    }
}
