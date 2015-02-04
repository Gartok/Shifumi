package com.nicolas;

/**
 * Program enter class.
 */
public class MainActivity {

    /**
     * Program enter method.
     * @param args {@link String}
     */
    public static void main(String[] args) {
        MainActivity main = new MainActivity();
        main.init();
    }
    
    /**
     * Init Shifumi Game.
     */
    public void init() {
        Welcome welcome = new Welcome();
        welcome.init();
    }
}

