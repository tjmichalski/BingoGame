package bingogame;

public class Ball {
    private Integer number;
    private Character letter;
    
    public Ball(Integer number) {
        this.number = number;
        setLetter();
    }
    
    public Integer getNumber() {
        return this.number;
    }
    
    public Character getLetter() {
        return this.letter;
    }
    
    @Override
    public String toString() {
        return "" + this.letter + "-" + this.number;
    }
    
    private void setLetter() {
        if(this.number >= 1 && this.number <= 15) {
            this.letter = 'B';
        } else if (this.number >= 16 && this.number <= 30) {
            this.letter = 'I';
        } else if (this.number >= 31 && this.number <= 45) {
            this.letter = 'N';
        } else if (this.number >= 46 && this.number <= 60) {
            this.letter = 'G';
        } else if (this.number >= 61 && this.number <= 75) {
            this.letter = 'O';
        } else {
            throw new RuntimeException("Ball only accepts number 1 --> 75");
        }
    }
}
