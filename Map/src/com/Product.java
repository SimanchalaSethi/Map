package com;

public class Product {
	    String productId;
	    String name;
	    Product(String productId, String name){
	    	this.productId = productId;
	    	this.name=name;
	    }
		@Override
		public String toString() {
			return "[productId=" + productId + ", name=" + name + "]";
		}
}
