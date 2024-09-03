package quiz;

public class Player {
    private int correctQuizNum;

    public Player() {
        this.correctQuizNum = 0;
    }
    
    public void setCorrectQuizNum(int correctQuizNum) {
        this.correctQuizNum = correctQuizNum;
    }

    public int getCorrectQuizNum() {
        return this.correctQuizNum;
    }
}
