package com.predicate.examples;

import java.util.function.Predicate;

public class PromotionsService {
	
		private Customer customer = new Customer();
		public void sendPromotion(Predicate<Customer> p) {
			if(p.test(customer)) {
				// send promotional mailing
			}
		}
		public static void main(String[] args) {
			
			PromotionsService ps = new PromotionsService();
			ps.sendPromotion(customer -> customer.getAge() >=18);
		}
}
