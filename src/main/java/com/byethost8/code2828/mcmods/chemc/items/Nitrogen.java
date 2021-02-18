package com.byethost8.code2828.mcmods.chemc.items;

import net.minecraft.item.Item;

public class Nitrogen extends Item {
    private ChemProperties chemProperties = new ChemProperties(1.2506, false, 0, 0, 1, (byte) 2);

    public Nitrogen(Properties itemProperties, double molnumm) {
        super(itemProperties);
        chemProperties.setMolNumber(molnumm);
    }

    public Nitrogen(Properties itemProperties) {
        super(itemProperties);
    }

    public Nitrogen(Properties itemProperties, ChemProperties chemProperties_) {
        super(itemProperties);
        chemProperties = chemProperties_;
    }
}
