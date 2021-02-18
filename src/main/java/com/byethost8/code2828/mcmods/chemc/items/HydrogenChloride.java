package com.byethost8.code2828.mcmods.chemc.items;

import net.minecraft.item.Item;

public class HydrogenChloride extends Item {
    private ChemProperties chemProperties = new ChemProperties(1.639, false, 0, 0, 1, (byte) 2);

    public HydrogenChloride(Properties itemProperties, double molnumm) {
        super(itemProperties);
        chemProperties.setMolNumber(molnumm);
    }

    public HydrogenChloride(Properties itemProperties) {
        super(itemProperties);
    }

    public HydrogenChloride(Properties itemProperties, ChemProperties chemProperties_) {
        super(itemProperties);
        chemProperties = chemProperties_;
    }
}
