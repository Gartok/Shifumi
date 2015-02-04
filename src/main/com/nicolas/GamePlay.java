/**
 * 
 */
package com.nicolas;

import java.lang.reflect.Constructor;

/**
 * @author Nicolas
 *
 */
public class GamePlay {

    /**
     * {@link Constructor}
     */
    public GamePlay() {
        
    }
    
    /**
     * Check if player has win.
     * @param playerShifu Player answer
     * @param botShifu Bot answer
     * @return return 1 if player has win else return 0 if tie else return -1
     */
    public int checkResult(ShifuEnum playerShifu, ShifuEnum botShifu)
    {
        int result = 0;
        
        if (playerShifu == ShifuEnum.PAPER) {
            result = checkPaperResult(playerShifu, botShifu);
        }
        else if (playerShifu == ShifuEnum.SCISSOR) {
            result = checkScissorResult(playerShifu, botShifu);
        }
        else if (playerShifu == ShifuEnum.ROCK) {
            result = checkRockResult(playerShifu, botShifu);
        }
        
        return result;
        
    }
    
    /**
     * Check if player has win.
     * @param playerShifu Player answer
     * @param botShifu Bot answer
     * @return return 1 if player has win else return 0 if tie else return -1
     */
    public int checkPaperResult(ShifuEnum playerShifu, ShifuEnum botShifu)
    {
        int result = 0;
        
        if (playerShifu == botShifu) {
            System.out.print("Egaliter Vous : " + playerShifu.name() + " BOT : " + botShifu.name());
            return 0;
        }
        else if (botShifu == ShifuEnum.ROCK) {
            System.out.print("Gagner Vous : " + playerShifu.name() + " BOT : " + botShifu.name());
            return 1;
        }
        else if (botShifu == ShifuEnum.SCISSOR) {
            System.out.print("Perdu Vous : " + playerShifu.name() + " BOT : " + botShifu.name());
            return -1;
        }
        
        return result;
    }
    
    /**
     * Check if player has win.
     * @param playerShifu Player answer
     * @param botShifu Bot answer
     * @return return 1 if player has win else return 0 if tie else return -1
     */
    public int checkRockResult(ShifuEnum playerShifu, ShifuEnum botShifu)
    {
        int result = 0;
        
        if (playerShifu == botShifu) {
            System.out.print("Egaliter Vous : " + playerShifu.name() + " BOT : " + botShifu.name());
            return 0;
        } else if (botShifu == ShifuEnum.SCISSOR) {
            System.out.print("Gagner Vous : " + playerShifu.name() + " BOT : " + botShifu.name());
            return 1;
        } else if (botShifu == ShifuEnum.PAPER) {
            System.out.print("Perdu Vous : " + playerShifu.name() + " BOT : " + botShifu.name());
            return -1;
        }
        
        return result;
    }
    
    /**
     * Check if player has win.
     * @param playerShifu Player answer
     * @param botShifu Bot answer
     * @return return 1 if player has win else return 0 if tie else return -1
     */
    public int checkScissorResult(ShifuEnum playerShifu, ShifuEnum botShifu)
    {
        int result = 0;
        
        if (playerShifu == botShifu) {
            System.out.print("Egaliter Vous : " + playerShifu.name() + " BOT : " + botShifu.name());
            return 0;
        } else if (botShifu == ShifuEnum.PAPER) {
            System.out.print("Gagner Vous : " + playerShifu.name() + " BOT : " + botShifu.name());
            return 1;
        } else if (botShifu == ShifuEnum.ROCK) {
            System.out.print("Perdu Vous : " + playerShifu.name() + " BOT : " + botShifu.name());
            return -1;
        }
        
        return result;
    }
}
