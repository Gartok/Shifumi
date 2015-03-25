/**
 * Welcome.java
 * @author Nicolas
 */
package com.nicolas;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * Welcome class.
 *
 */
public class Welcome {

    /**
     * Launch the game.
     */
    public void init() {
        String result = "r";
        
        while (result == "r") {
            this.play();

            System.out.print("\n Rejouer ? (Pour rejouer faites le r"
                    + " sinon appuyer sur n'importe quelle touche. \n");

            Scanner scan = new Scanner(System.in);
            String inputResult = scan.next();
            scan.close();

            result = inputResult;
        }
    }

    /**
     * Start party.
     */
    private void play() {
        System.out.print("PIERRE FEUILLE OU CISEAUX \n");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        scanner.close();

        GamePlay gamePlay = new GamePlay();

        Random random = new Random(new Date().getTime());
        int randomResult = random.nextInt(2);

        ShifuEnum botShifu = ShifuEnum.values()[randomResult];

        gamePlay.checkResult(ShifuEnum.ConvertValue(value), botShifu);
    }
}
