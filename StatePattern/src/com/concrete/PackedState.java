package com.concrete;

import com.context.OrderContext;
import com.state.OrderState;

public class PackedState implements OrderState {
    public void next(OrderContext ctx) {
        ctx.setState(new ShippedState());
        System.out.println("Order is now Shipped.");
    }

    public void cancel(OrderContext ctx) {
        ctx.setState(new CancelledState());
        System.out.println("Packed order has been Cancelled.");
    }

    public void printStatus() {
        System.out.println("Order is packed and ready to ship.");
    }
}
