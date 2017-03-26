package com.test.model.items;

import java.math.BigDecimal;

public class ItalianItem implements Item {

    String itemName;
	
	public String itemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	@Override
	public ItemType getItemType() {
		return ItemType.ITALIAN;
	}

	@Override
	public BigDecimal getItemBasePrice() {
		return new BigDecimal(2);
	}

}
