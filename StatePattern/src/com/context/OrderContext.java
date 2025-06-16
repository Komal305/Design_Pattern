package com.context;

import com.concrete.NewOrderState;
import com.state.OrderState;

public class OrderContext {
	    private OrderState state;

	    public OrderContext() {
	        state = new NewOrderState(); // initial state
	    }

	    public void setState(OrderState state) {
	        this.state = state;
	    }

	    public void next() {
	        state.next(this);
	    }

	    public void cancel() {
	        state.cancel(this);
	    }

	    public void printStatus() {
	        state.printStatus();
	    }
	}