/**
 * 
 */
package com.nicolas;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.Random;

import org.junit.Test;

import com.nicolas.GamePlay;
import com.nicolas.ShifuEnum;

/**
 * @author Nicolas
 *
 */
public class ShifuTest {

    @Test
    public void testRockvsScissor() {
        GamePlay gamePlay = new GamePlay();
        
        int result = gamePlay.checkResult(ShifuEnum.ROCK, ShifuEnum.SCISSOR);
        
        assertEquals(1, result);
    }
    
    @Test
    public void testRockvsPaper() {
        GamePlay gamePlay = new GamePlay();
        
        int result = gamePlay.checkResult(ShifuEnum.ROCK, ShifuEnum.PAPER);
        
        assertEquals(-1, result);
    }
    
    @Test
    public void testRockvsRock() {
        GamePlay gamePlay = new GamePlay();
        
        int result = gamePlay.checkResult(ShifuEnum.ROCK, ShifuEnum.ROCK);
        
        assertEquals(0, result);
    }
    
    @Test
    public void testPapervsScissor() {
        GamePlay gamePlay = new GamePlay();
        
        int result = gamePlay.checkResult(ShifuEnum.PAPER, ShifuEnum.SCISSOR);
        
        assertEquals(-1, result);
    }

    @Test
    public void testPapervsPaper() {
        GamePlay gamePlay = new GamePlay();
        
        int result = gamePlay.checkResult(ShifuEnum.PAPER, ShifuEnum.PAPER);
        
        assertEquals(0, result);
    }
    
    @Test
    public void testPapervsRock() {
        GamePlay gamePlay = new GamePlay();
        
        int result = gamePlay.checkResult(ShifuEnum.PAPER, ShifuEnum.ROCK);
        
        assertEquals(1, result);
    }
    
    @Test
    public void testScissorvsScissor() {
        GamePlay gamePlay = new GamePlay();
        
        int result = gamePlay.checkResult(ShifuEnum.SCISSOR, ShifuEnum.SCISSOR);
        
        assertEquals(0, result);
    }
    
    @Test
    public void testScissorvsRock() {
        GamePlay gamePlay = new GamePlay();
        
        int result = gamePlay.checkResult(ShifuEnum.SCISSOR, ShifuEnum.ROCK);
        
        assertEquals(-1, result);
    }
    
    @Test
    public void testScissorvsPaper() {
        GamePlay gamePlay = new GamePlay();
        
        int result = gamePlay.checkResult(ShifuEnum.SCISSOR, ShifuEnum.PAPER);
        
        assertEquals(1, result);
    }
}
