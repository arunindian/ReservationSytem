package com.test.model.items;

import java.math.BigDecimal;

public class ChineseItem implements Item {

	String itemName;
	
	public String itemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	@Override
	public ItemType getItemType() {
		return ItemType.CHINEASE;
	}

	@Override
	public BigDecimal getItemBasePrice() {
		return new BigDecimal(2);
	}

}
