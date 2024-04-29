package com.app.core;
/*1. 
A company StyleWithPen sells stylish Pens online. 
Company needs an interface for site admin to manage stocks.

Write a console-based menu driven java program for site ADMIN to perform
 following operations: 

1. Add new Pen
i/p : Brand ,Color,InkColor,Material ,Stock,Stock Listing Date 
(Stock Update Date 
 will be same as listing date while adding a pen) , price . 
 You can skip the discount
  while adding a pen : default value 0.0

2. Update stock of aPen
i/p : brand | material | color | Ink color and new quantity

3.Set discount of 20% for all the pens which are not at all sold in
 last 3 months
In this you can set the discount value for all such pens OR apply 
discount n update
 price as well

4. Remove Pens which are never sold once listed in 9 months

You can define a class Pen with the following fields – 
a.	ID (unique identifier for each Pen, should be generated automatically)
b.	Brand (Example:  Cello, Parker, Reynolds etc.)
c.	Color
d.	InkColor
e.	Material (Example: Plastic, Alloy Steel, Metal etc.)
f.	Stock (Available quantity)
g.	Stock Update Date (it changed every time when admin update stock or user 
order executed)
h.	Stock Listing Date (date on which product is added to site for sale)
i.	Price (in INR) 
j.	Discounts (in percentage)

Note: You can use java collection to store items in memory. */

import java.time.LocalDate;


public class Pen {
	
	private static int penId=1;
	private Brand brandName;
	private String penColor;
	private String inkColor;
	private Material materialName;
	private int stockQty;
	private LocalDate stockUpdateDate;
	private LocalDate stockListingDate;
	private double penPrice;
	private double discounts=0.0;
	int penid;
	
	public Pen(Brand brandName, String penColor, String inkColor, Material materialName, int stockQty,
			LocalDate stockListingDate, double penPrice) {
		super();
		penid = this.penId;
		this.brandName = brandName;
		this.penColor = penColor;
		this.inkColor = inkColor;
		this.materialName = materialName;
		this.stockQty = stockQty;
		this.stockUpdateDate = LocalDate.now();
		this.stockListingDate = stockListingDate;
		this.penPrice = penPrice;
		penId++;
	}
	
	
	public Pen(int penID) {
		super();
		penid = penID;
		penId--;
	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof Pen) {
			Pen p = (Pen)o;
			System.out.println(this.penId + " "+p.penId);
			System.out.println("puuu" +penid);
			return this.penId==penid;
		}
		return false;	
	}


	@Override
	public String toString() {
		return "Pen [penId=" + penid + ", brandName=" + brandName + ", penColor=" + penColor + ", inkColor=" + inkColor
				+ ", materialName=" + materialName + ", stockQty=" + stockQty + ", stockUpdateDate=" + stockUpdateDate
				+ ", stockListingDate=" + stockListingDate + ", penPrice=" + penPrice + ", discounts=" + discounts
				+ "]";
	}

	public int getPenId() {
		return penId;
	}

	public void setPenId(int penId) {
		this.penId = penId;
	}

	public Brand getBrandName() {
		return brandName;
	}

	public void setBrandName(Brand brandName) {
		this.brandName = brandName;
	}

	public String getPenColor() {
		return penColor;
	}

	public void setPenColor(String penColor) {
		this.penColor = penColor;
	}

	public String getInkColor() {
		return inkColor;
	}

	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}

	public Material getMaterialName() {
		return materialName;
	}

	public void setMaterialName(Material materialName) {
		this.materialName = materialName;
	}

	public int getStockQty() {
		return stockQty;
	}

	public void setStockQty(int stockQty) {
		this.stockQty = stockQty;
	}

	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}

	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}

	public LocalDate getStockListingDate() {
		return stockListingDate;
	}

	public void setStockListingDate(LocalDate stockListingDate) {
		this.stockListingDate = stockListingDate;
	}

	public double getPenPrice() {
		return penPrice;
	}

	public void setPenPrice(double penPrice) {
		this.penPrice = penPrice;
	}

	public double getDiscounts() {
		return discounts;
	}

	public void setDiscounts(double discounts) {
		this.discounts = discounts;
	}
	
	
	
}
