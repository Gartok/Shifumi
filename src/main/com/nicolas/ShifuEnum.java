package com.nicolas;


/**
 * 
 * @author Nicolas
 *
 */
public enum ShifuEnum {
    ROCK(0),
    PAPER(1),
    SCISSOR(2);
    
    /** 
     * Enum value.
     */
    private int value;
    
    
    /**
     * Constructor.
     * @param value
     * @param name
     */
    private ShifuEnum(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public static ShifuEnum ConvertValue(String value)
    {
        if (value.equals("FEUILLE")) {
            return ShifuEnum.PAPER;
        }
        else if (value.equals("CISEAUX")) {
            return ShifuEnum.SCISSOR;
        }
        else if (value.equals("PIERRE")) {
            return ShifuEnum.ROCK;
        }
        
        return null;
    }
}
