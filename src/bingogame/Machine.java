package bingogame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Machine {
    
    private final List<Ball> ballList;
    
    public Machine() {
        this.ballList = new ArrayList();
        initialize();
    }
               
    public Ball getRandomBall() {
        if(ballList.isEmpty()) {
            throw new RuntimeException("Machine is Empty!");
        }
        int index = new Random().nextInt(ballList.size());
        return this.ballList.remove(index);
    }
    
    public void reset() {
        this.initialize();
    }
    
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Machine Size: ")
                .append(ballList.size());
        
        for(int i = 0; i < ballList.size(); i++) {
            if(i % 15 == 0) {
                stringBuilder.append("\n");
            }
            stringBuilder.append(ballList.get(i))
                    .append(" ");
        }
        
        return stringBuilder.toString();
    }
    
    private void initialize() {
        this.ballList.clear();
        for(int i = 1; i <= 75; i++) {
            ballList.add(new Ball(i));
        }
    }
}
