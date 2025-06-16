package com.concrete;

import com.context.OrderContext;
import com.state.OrderState;

public class ShippedState implements OrderState {
    public void next(OrderContext ctx) {
        ctx.setState(new DeliveredState());
        System.out.println("Order is now Delivered.");
    }

    public void cancel(OrderContext ctx) {
        System.out.println("Cannot cancel. Order already shipped.");
    }

    public void printStatus() {
        System.out.println("Order has been shipped.");
    }
}

