package com.nicolas;


/**
 * Shifumi enumerator can select Rock, Paper, Scissor.
 */
public enum ShifuEnum {
    /**
     * Rock enum.
     */
    ROCK(0),
    /**
     * Paper enum.
     */
    PAPER(1),
    /**
     * Scissor enum.
     */
    SCISSOR(2);
    
    /** 
     * Enum value.
     */
    private int value;
    
    
    /**
     * Constructor.
     * @param value enum value
     */
    private ShifuEnum(int value) {
        this.value = value;
    }
    
    /**
     * Get Enum value.
     * @return value {@link Integer}
     */
    public int getValue() {
        return this.value;
    }
    
    public static ShifuEnum ConvertValue(String value) {
        ShifuEnum result = null;
        
        if (value.equals("FEUILLE")) {
            result = ShifuEnum.PAPER;
        } else if (value.equals("CISEAUX")) {
            result = ShifuEnum.SCISSOR;
        } else if (value.equals("PIERRE")) {
            result = ShifuEnum.ROCK;
        }
        
        return result;
    }
}
