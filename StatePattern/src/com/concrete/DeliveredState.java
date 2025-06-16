package com.concrete;

import com.context.OrderContext;
import com.state.OrderState;

public class DeliveredState implements OrderState {
    public void next(OrderContext ctx) {
        System.out.println("Order already delivered. No further transitions.");
    }

    public void cancel(OrderContext ctx) {
        System.out.println("Cannot cancel. Order already delivered.");
    }

    public void printStatus() {
        System.out.println("Order delivered to customer.");
    }
}
