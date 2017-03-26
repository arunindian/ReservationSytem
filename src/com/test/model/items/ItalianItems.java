package com.test.model.items;

import java.math.BigDecimal;
import java.util.List;

public class ItalianItems implements Item {

	List<Item> items;
	
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public ItemType getItemType() {
		return ItemType.ITALIAN;
	}

	@Override
	public String itemName() {
		return null;
	}

	@Override
	public BigDecimal getItemBasePrice() {
		// TODO Auto-generated method stub
		return new BigDecimal(1);
	}

}
