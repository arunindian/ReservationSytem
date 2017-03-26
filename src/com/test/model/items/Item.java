package com.test.model.items;

import java.math.BigDecimal;

public interface Item {
	
	BigDecimal getItemBasePrice();
	String itemName();
	ItemType getItemType();

}
