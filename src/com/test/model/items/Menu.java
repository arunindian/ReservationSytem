package com.test.model.items;

import java.util.List;
import java.util.Map;

public class Menu implements MenuIt
{
	
	List<Item> items;
	Map<ItemType,List<Item>> itemTypeToItem;
	
	
	public Map<ItemType, List<Item>> getItemTypeToItem() {
		return itemTypeToItem;
	}

	public void setItemTypeToItem(Map<ItemType, List<Item>> itemTypeToItem) {
		this.itemTypeToItem = itemTypeToItem;
	}

	public void showItems(){
		if(itemTypeToItem != null) {
			for(Map.Entry<ItemType, List<Item>> entry : itemTypeToItem.entrySet()) {
				ItemType itemType = entry.getKey();
				List<Item> items = entry.getValue();
				System.out.println("Item Type :"+itemType.toString()); 
				for(Item item : items) {
					System.out.println(item.itemName());
				}
			}
		}
	}
	
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}

}
