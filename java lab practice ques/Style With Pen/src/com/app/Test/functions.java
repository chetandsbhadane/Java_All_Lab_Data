package com.app.Test;

import java.time.LocalDate;
import java.util.List;

import com.app.core.Brand;
import com.app.core.Material;
import com.app.core.Pen;
import com.app.exceptions.penIdNotFoundException;

public class functions {
	
	public static Pen findById(int penId,List<Pen> pList) throws penIdNotFoundException {
		Pen pId = new Pen(penId);
		int index = pList.indexOf(pId);
		if(index==-1) {
			pId.setPenId(pId.getPenId()+1);
			throw new penIdNotFoundException("Pen id is not found");
		}
		System.out.println("get at index - " + pList.get(index));
		
		return pList.get(index);
	}
	
	public static Pen updateData(List<Pen> pList,int penId,Brand brandNm, Material materialNm , String penColor, String inkColor, int newQty) throws penIdNotFoundException {
		Pen p = findById(penId,pList);
		if(!(p.getBrandName().equals(brandNm) && p.getPenColor().equals(penColor))) {

			throw new penIdNotFoundException("not matching with previous one..");
			
		}
		p.setStockQty(newQty);
		return new Pen(brandNm, penColor, inkColor, materialNm, newQty, p.getStockUpdateDate(), p.getPenPrice());
	}
	
	public static void setDiscountToPens(int penId,List<Pen> pList) throws penIdNotFoundException {
		Pen p3 = findById(penId, pList);
		
		LocalDate threeMonthsAgo = LocalDate.now().minusMonths(3);
		double dis = 0.20;
		if(p3.getStockListingDate().isBefore(threeMonthsAgo)) {
			p3.setDiscounts(dis * p3.getPenPrice());
			p3.setPenPrice(p3.getPenPrice() - p3.getDiscounts());
		}
	}
}
