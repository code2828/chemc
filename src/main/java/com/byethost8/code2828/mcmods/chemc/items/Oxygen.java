package com.byethost8.code2828.mcmods.chemc.items;

import net.minecraft.item.Item;

public class Oxygen extends Item {
    private ChemProperties chemProperties = new ChemProperties(1.432, false, 0, 0, 1, (byte)2);
    public Oxygen(Properties itemProperties, double molnumm) {
        super(itemProperties);
        chemProperties.setMolNumber(molnumm);
        // TODO Auto-generated constructor stub
    }
    public Oxygen(Properties itemProperties) {
        super(itemProperties);
        // TODO Auto-generated constructor stub
    }
    public Oxygen(Properties itemProperties, ChemProperties chemProperties_) {
        super(itemProperties);
        chemProperties=chemProperties_;
        // TODO Auto-generated constructor stub
    }
    
}
