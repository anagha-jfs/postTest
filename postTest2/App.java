package com.tracking;


public class App {
public static void main(String[] args) {
	usingSpecialOrder();
	System.out.println("*********");
	usingNormalOrder();
	System.out.println("*********");
}

private static void usingNormalOrder() {
	Orders order2 = new NormalOrder(null,"laptop",1, null, 0);
	order2.confirm();
	order2.close();
	order2.dispatch();
	order2.receive();
}

private static void usingSpecialOrder() {
	Orders order1 = new SpecialOrder(null, null, 0, null, 0);
	order1.confirm();
	order1.close();
	order1.dispatch();
}
}