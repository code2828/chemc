package com.byethost8.code2828.mcmods.chemc.items;

import net.minecraft.item.Item;

public class Lithium extends Item {
    private ChemProperties chemProperties = new ChemProperties(535, false, 0, 0, 1, (byte) 0);

    public Lithium(Properties itemProperties, double molnumm) {
        super(itemProperties);
        chemProperties.setMolNumber(molnumm);
    }

    public Lithium(Properties itemProperties) {
        super(itemProperties);
    }

    public Lithium(Properties itemProperties, ChemProperties chemProperties_) {
        super(itemProperties);
        chemProperties = chemProperties_;
    }
}
