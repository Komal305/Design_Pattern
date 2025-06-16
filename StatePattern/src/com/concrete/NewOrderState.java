package com.concrete;

import com.context.OrderContext;
import com.state.OrderState;

public class NewOrderState implements OrderState {

	    public void next(OrderContext ctx) {
	        ctx.setState(new PackedState());
	        System.out.println("Order is now Packed.");
	    }

	    public void cancel(OrderContext ctx) {
	        ctx.setState(new CancelledState());
	        System.out.println("Order has been Cancelled.");
	    }

	    public void printStatus() {
	        System.out.println("Order placed. Awaiting packing.");
	    }


}
