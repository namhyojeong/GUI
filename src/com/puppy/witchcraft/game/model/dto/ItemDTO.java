package com.puppy.witchcraft.game.model.dto;

public class ItemDTO {
	
	private int itemNo;
	private String itemType;
	private String itemName;
	private String itemInfo;
	private int itemSell;
	private int itemBuy;
	private int imageNo;	//이미지 테이블 참조
	private int itemCount;
	
	public ItemDTO() {}

	public int getItemNo() {
		return itemNo;
	}

	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemInfo() {
		return itemInfo;
	}

	public void setItemInfo(String itemInfo) {
		this.itemInfo = itemInfo;
	}

	public int getItemSell() {
		return itemSell;
	}

	public void setItemSell(int itemSell) {
		this.itemSell = itemSell;
	}

	public int getItemBuy() {
		return itemBuy;
	}

	public void setItemBuy(int itemBuy) {
		this.itemBuy = itemBuy;
	}

	public int getImageNo() {
		return imageNo;
	}

	public void setImageNo(int imageNo) {
		this.imageNo = imageNo;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	@Override
	public String toString() {
		return "ItemDTO [itemNo=" + itemNo + ", itemType=" + itemType + ", itemName=" + itemName + ", itemInfo="
				+ itemInfo + ", itemSell=" + itemSell + ", itemBuy=" + itemBuy + ", imageNo=" + imageNo + ", itemCount="
				+ itemCount + "]";
	}

}