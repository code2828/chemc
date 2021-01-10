package com.byethost8.code2828.mcmods.chemc.items;

public class ChemProperties {

    private double density;
    private boolean doOxidation = false;
    private int oxidationSpeed = 7;
    private int oxidationAge;
    // private boolean doNitration = false;
    // pricate int nitrationSpeed = 7;
    // private int nitrationAge;
    private double molNumber;
    private byte state = 0;

    public ChemProperties(double dens, boolean doo, int oxisp, int oxiage, double mn, byte stt)
    {
        density=dens;
        doOxidation=doo;
        oxidationSpeed=oxisp;
        oxidationAge=oxiage;
        mn=molNumber;
        state=stt;
    }
    public void setMolNumber(double moln)
    {
        molNumber=moln;
    }
    public double getDensity() {
        return this.density;
    }
    public double getMolNumber() {
        return this.molNumber;
    }
    // public String getMolNumberString() {
    //     switch (molNumber) {
    //         case 0.0625:    return "sixteenth";break;
    //         case 0.1:       return "tenth";break;
    //         case 0.125:     return "eighth";break;
    //         case 0.2:       return "fifth";break;
    //         case 0.25:      return "quarter";break;
    //         case 0.5:       return "half";break;
    //         case 1:         return "one";break;
    //         case 1.5:       return "one and a half";break;
    //         case 2:         return "double";break;
    //         case 3:         return "triple";break;
    //         case 5:         return "five";break;
    //         case 10:        return "ten";break;
    //         default:        return "unknown mol number";break;
    //     }
    // }
    public Xation getOxidation()
    {
        return new Xation(doOxidation,oxidationSpeed,oxidationAge);
    }
    public byte getState()
    {
        return state;
    }
    public String getStateString()
    {
        if(state==0)return "solid";
        if(state==1)return "liquid";
        if(state==2)return "gas";
        return "unknown state";
    }

}
