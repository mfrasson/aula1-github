package section8.application;

import java.util.Date;

import section8.entities.Order;
import section8.enums.OrderStatus;

public class Program {
	
	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDIND_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.err.println(os1);
		System.err.println(os2);
	}
}
