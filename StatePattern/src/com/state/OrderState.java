package com.state;

import com.context.OrderContext;

public interface OrderState {
    void next(OrderContext ctx);
    void cancel(OrderContext ctx);
    void printStatus();
}
