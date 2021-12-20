package com.projectflowershpo.model;

import java.util.Objects;

public class orders {
	private Product flowerName;
	private int quantity;
	private double totalPrice;
	
	
	
	
	
	public orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public orders(Product flowerName, int quantity, double totalPrice) {
		super();
		this.flowerName = flowerName;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
	}
	public Product getFlowerName() {
		return flowerName;
	}
	public void setFlowerName(Product flowerName) {
		this.flowerName = flowerName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "orders [flowerName=" + flowerName + ", quantity=" + quantity + ", totalPrice=" + totalPrice + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(flowerName, quantity, totalPrice);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		orders other = (orders) obj;
		return Objects.equals(flowerName, other.flowerName) && quantity == other.quantity
				&& Double.doubleToLongBits(totalPrice) == Double.doubleToLongBits(other.totalPrice);
	}
	
	
	
	
	

}
