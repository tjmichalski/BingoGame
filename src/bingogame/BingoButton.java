package bingogame;

import java.awt.*;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class BingoButton extends JButton implements ActionListener{
    
    private boolean clicked = false;
    private boolean drawnNumber = false;
    private Character letter;
    private Integer number;
    private String check;
    
    public BingoButton(String number){
        if(!"F".equals(number)){
            this.number = Integer.valueOf(number);
        }
        else{
            this.number = 3700;
        }
        setText(number);
        addActionListener(this);
        setBackground(Color.WHITE);
        setLetter();
        check = createCheck();
    }
    public String getCheck(){
        return check;
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(clicked == false){
            setBackground(Color.RED);
            clicked = true;
        }
        else{
            setBackground(Color.WHITE);
            clicked = false;
        }
    }
    private String createCheck(){
        return "" +this.letter + "-" + this.number;
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
        } else if (this.number == 3700) {
          this.letter = 'F';
        } else {
            throw new RuntimeException("Ball only accepts number 1 --> 75");
        }
    }

    public boolean getClicked() {
        return clicked;
    }
}

