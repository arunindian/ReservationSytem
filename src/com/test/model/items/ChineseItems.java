package com.test.model.items;

import java.math.BigDecimal;
import java.util.List;

public class ChineseItems implements Item {

	List<Item> items;
	
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public ItemType getItemType() {
		return ItemType.CHINEASE;
	}

	@Override
	public String itemName() {
		return null;
	}

	@Override
	public BigDecimal getItemBasePrice() {
		BigDecimal basePrice = BigDecimal.ZERO;
		for(Item item : items) {
			basePrice.add(item.getItemBasePrice());
		}
		return basePrice;
	}

}
