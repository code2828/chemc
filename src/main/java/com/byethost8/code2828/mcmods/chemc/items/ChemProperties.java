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

    public ChemProperties(double dens, boolean doo, int oxisp, int oxiage, double mn, byte stt) {
        density = dens;
        doOxidation = doo;
        oxidationSpeed = oxisp;
        oxidationAge = oxiage;
        mn = molNumber;
        state = stt;
    }

    public void setMolNumber(double moln) {
        molNumber = moln;
    }

    public double getDensity() {
        return this.density;
    }

    public double getMolNumber() {
        return this.molNumber;
    }

    public String getMolNumberString() {
        switch ((int) molNumber * 160) {
            case 10:
                return "sixteenth";
            case 16:
                return "tenth";
            case 20:
                return "eighth";
            case 32:
                return "fifth";
            case 40:
                return "quarter";
            case 80:
                return "half";
            case 160:
                return "one";
            case 240:
                return "one and a half";
            case 320:
                return "double";
            case 480:
                return "triple";
            case 800:
                return "five";
            case 1600:
                return "ten";
            default:
                return "unknown mol number";
        }
    }

    public Xation getOxidation() {
        return new Xation(doOxidation, oxidationSpeed, oxidationAge);
    }

    public byte getState() {
        return state;
    }

    public String getStateString() {
        if (state == 0)
            return "solid";
        if (state == 1)
            return "liquid";
        if (state == 2)
            return "gas";
        return "unknown state";
    }

}
