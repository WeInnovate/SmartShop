package com.smartshop.pojo;

public class Item {

	private long itemId;
	private String itemName;
	private String itemDesc;
	private int quantity;
	private double price;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(long itemId, String itemName, String itemDesc, int qunaity,
			double price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemDesc = itemDesc;
		this.quantity = qunaity;
		this.price = price;
	}
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int qunaity) {
		this.quantity = qunaity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Item [itemId=");
		builder.append(itemId);
		builder.append(", itemName=");
		builder.append(itemName);
		builder.append(", itemDesc=");
		builder.append(itemDesc);
		builder.append(", qunaity=");
		builder.append(quantity);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((itemDesc == null) ? 0 : itemDesc.hashCode());
		result = prime * result + (int) (itemId ^ (itemId >>> 32));
		result = prime * result
				+ ((itemName == null) ? 0 : itemName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + quantity;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (itemDesc == null) {
			if (other.itemDesc != null)
				return false;
		} else if (!itemDesc.equals(other.itemDesc))
			return false;
		if (itemId != other.itemId)
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}
	
	
	
}
