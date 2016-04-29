package com.scarlett.bowling;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by scarlettxu on 16-3-16.
 */
public class GameTest {

    private Game game;
    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void should_return_8_when_hit_6_2(){
        game.hit(6);
        game.hit(2);
        int score = game.score();
        Assert.assertEquals(8,score);
    }


    @Test
    public void should_return_17_when_hit_6_2_5_4(){

        game.hit(6);
        game.hit(2);
        game.hit(5);
        game.hit(4);
        int score = game.score();
        Assert.assertEquals(17,score);
    }

@Test
    public void should_return_24_when_hit_6_4_5_4(){
        game.hit(6);
        game.hit(4);
        game.hit(5);
        game.hit(4);
        Assert.assertEquals(24,game.score());
    }

    @Test
    public void should_return_28_when_hit_10_5_4(){
        game.hit(10);
        game.hit(5);
        game.hit(4);
        int score = game.score();
        Assert.assertEquals(28,score);
    }
    @Test
    public void should_return_55_when_hit_10_10_7_2(){
        game.hit(10);
        game.hit(10);
        game.hit(7);
        game.hit(2);
        int score = game.score();
        Assert.assertEquals(55,score);
    }
@Test
    public void should_return_300_when_all_strike(){
        for (int i=0;i<12;i++){
            game.hit(10);}
        int score = game.score();
        Assert.assertEquals(300,score);
    }


    @Test
    public void should_return_133_when_hit_10_frame(){
        game.hit(1);
        game.hit(4);
        game.hit(4);
        game.hit(5);
        game.hit(6);
        game.hit(4);
        game.hit(5);
        game.hit(5);
        game.hit(10);
        game.hit(0);
        game.hit(1);
        game.hit(7);
        game.hit(3);
        game.hit(6);
        game.hit(4);
        game.hit(10);
        game.hit(2);
        game.hit(8);
        game.hit(6);

        int score = game.score();
        Assert.assertEquals(133,score);
    }

}