package com.byethost8.code2828.mcmods.chemc.items;

import net.minecraft.item.Item;

public class Chlorine extends Item {
    private ChemProperties chemProperties = new ChemProperties(3.214, false, 0, 0, 1, (byte) 2);

    public Chlorine(Properties itemProperties, double molnumm) {
        super(itemProperties);
        chemProperties.setMolNumber(molnumm);
    }

    public Chlorine(Properties itemProperties) {
        super(itemProperties);
    }

    public Chlorine(Properties itemProperties, ChemProperties chemProperties_) {
        super(itemProperties);
        chemProperties = chemProperties_;
    }
}
