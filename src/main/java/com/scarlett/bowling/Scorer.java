package com.scarlett.bowling;

/**
 * Created by scarlettxu on 16-4-1.
 */
public class Scorer {
    private int[] itsThrows = new int[21];
    private int currentThrow = 0;
    private int ball = 0;

    public void addThrow(int pins){
        itsThrows[currentThrow++]=pins;
    }

    public int scoreForFrame(int theFrame){
        int score = 0;
        ball =0;
        for (int currentFrame=0;currentFrame<theFrame;currentFrame++){
            int frameScore =0;
            if (strike()){
                frameScore = 10 + nextTwoBallsForStrike();
                ball++;
            }
            else if (spare()){
                frameScore = 10+ nextBallForSpare();
                ball+=2;
            }
            else {
                frameScore = twoBallsInFrame();
                ball+=2;
            }
            score+=frameScore;
        }
        return score;
    }

    private int nextTwoBallsForStrike(){
        return itsThrows[ball+1]+itsThrows[ball+2];
    }

    private int nextBallForSpare(){
        return itsThrows[ball+2];
    }

    private int twoBallsInFrame(){
        return itsThrows[ball]+itsThrows[ball+1];
    }

    private boolean strike(){
        return itsThrows[ball] == 10;
    }

    private boolean spare(){
        return (itsThrows[ball]<10 && itsThrows[ball]+itsThrows[ball+1]==10);
    }
}
