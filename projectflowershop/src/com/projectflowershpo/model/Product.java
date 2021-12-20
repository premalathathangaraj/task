package com.projectflowershpo.model;

import java.util.Objects;

public class Product {
	private String flowerId;
	private String flowerDescription;
	private String flowerName;
	private String color;
	private double retailPrice;
	private String catName;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String flowerId, String flowerDescription, String flowerName, String color, double retailPrice,
			String catName) {
		super();
		this.flowerId = flowerId;
		this.flowerDescription = flowerDescription;
		this.flowerName = flowerName;
		this.color = color;
		this.retailPrice = retailPrice;
		this.catName = catName;
	}
	
	public String getFlowerId() {
		return flowerId;
	}
	public void setFlowerId(String flowerId) {
		this.flowerId = flowerId;
	}
	public String getFlowerDescription() {
		return flowerDescription;
	}
	public void setFlowerDescription(String flowerDescription) {
		this.flowerDescription = flowerDescription;
	}
	public String getFlowerName() {
		return flowerName;
	}
	public void setFlowerName(String flowerName) {
		this.flowerName = flowerName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}
	public String getCartId() {
		return catName;
	}
	public void setCartId(String catName) {
		this.catName = catName;
	}
	

	@Override
	public String toString() {
		return "Product [flowerId=" + flowerId + ", flowerDescription=" + flowerDescription + ", flowerName="
				+ flowerName + ", color=" + color + ", retailPrice=" + retailPrice + ", cartId=" + catName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(catName, color, flowerDescription, flowerId, flowerName, retailPrice);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(catName, other.catName) && Objects.equals(color, other.color)
				&& Objects.equals(flowerDescription, other.flowerDescription)
				&& Objects.equals(flowerId, other.flowerId) && Objects.equals(flowerName, other.flowerName)
				&& Double.doubleToLongBits(retailPrice) == Double.doubleToLongBits(other.retailPrice);
	}

}
