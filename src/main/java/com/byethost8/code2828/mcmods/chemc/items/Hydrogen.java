package com.byethost8.code2828.mcmods.chemc.items;

import net.minecraft.item.Item;

public class Hydrogen extends Item {
    private ChemProperties chemProperties = new ChemProperties(0.089, false, 0, 0, 1, (byte)2);
    public Hydrogen(Properties itemProperties, double molnumm) {
        super(itemProperties);
        chemProperties.setMolNumber(molnumm);
        // TODO Auto-generated constructor stub
    }
    public Hydrogen(Properties itemProperties) {
        super(itemProperties);
        // TODO Auto-generated constructor stub
    }
    public Hydrogen(Properties itemProperties, ChemProperties chemProperties_) {
        super(itemProperties);
        chemProperties=chemProperties_;
        // TODO Auto-generated constructor stub
    }
}
