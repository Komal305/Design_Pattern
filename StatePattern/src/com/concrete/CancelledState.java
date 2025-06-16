package com.concrete;

import com.context.OrderContext;
import com.state.OrderState;

public class CancelledState implements OrderState {
    public void next(OrderContext ctx) {
        System.out.println("Order is cancelled. No next step.");
    }

    public void cancel(OrderContext ctx) {
        System.out.println("Order is already cancelled.");
    }

    public void printStatus() {
        System.out.println("Order has been cancelled.");
    }
}
