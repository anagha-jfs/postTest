package com.tracking;

public class NormalOrder extends Orders {
	
		public NormalOrder(String custId, String custName, int orderId, String orderName, int orderQuantity) {
		super(custId, custName, orderId, orderName, orderQuantity);
	}

		public void dispatch() {
			System.out.println("Order dispatched on time");
		}
		
			public void receive() {
				System.out.println("Order received");
			}
	}