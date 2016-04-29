package com.scarlett.bowling;

/**
 * Created by scarlettxu on 16-3-16.
 */
public class Game {

    private int currentFrame=1;
    private boolean firstThrowInFrame = true;
    private Scorer scorer = new Scorer();

    private int scoreForFrame(int theFrame) {

        return scorer.scoreForFrame(theFrame);
    }


    public void hit(int pins){
        scorer.addThrow(pins);
        adjustCurrentFrame(pins);
    }

    private void adjustCurrentFrame(int pins){
        if (lastBallInFrame(pins)) {
            advanceFrame();
            firstThrowInFrame = true;
        }
        else firstThrowInFrame = false;
    }

    private void advanceFrame(){
        currentFrame = Math.min(10,currentFrame+1);
    }

    private boolean strike(int pins){
        return firstThrowInFrame == true && pins==10;
    }

    private boolean lastBallInFrame(int pins){
        return strike(pins) || firstThrowInFrame == false;
    }
    public int score(){
        return scoreForFrame(currentFrame);
    }
}
