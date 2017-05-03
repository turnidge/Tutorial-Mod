package org.marscolony.tutorialmod.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by turnidge on 5/3/17.
 */
public class CreativeTabTutorial extends CreativeTabs {
    public CreativeTabTutorial(int index, String label) {
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return Items.EMERALD;
    }
}
