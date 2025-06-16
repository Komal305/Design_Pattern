package com.main;

import com.context.OrderContext;

public class ECommerceOrderDemo {
    public static void main(String[] args) {
        OrderContext order = new OrderContext();

        order.printStatus();  // Order placed. Awaiting packing.
        order.next();         // -> Order is now Packed.

        order.printStatus();// -> Order is packed and ready to ship.
        order.next();       // Order is now Shipped.  

        order.printStatus();
        order.cancel();       // Too late to cancel

        order.next();         // -> Delivered
        order.printStatus();
        order.next();
    }
}
/************************************************************************************************
+----------------------+
|    <<interface>>     |
|      OrderState      |
+----------------------+
| + next(ctx)          |
| + cancel(ctx)        |r 
| + printStatus()      |
+----------+-----------+
           ▲
+----------------+-----------------------------+-----------------------------------------------
|                |             |               |                 |                    |
+----------------+ +----------------+ +----------------+ +----------------+ +------------------+
| NewOrderState  | |  PackedState   | | ShippedState   | | DeliveredState | | CancelledState   |
+----------------+ +----------------+ +----------------+ +----------------+ +------------------+
| + next(ctx)    | | + next(ctx)    | | + next(ctx)    | | + next(ctx)    | | + next(ctx)      |
| + cancel(ctx)  | | + cancel(ctx)  | | + cancel(ctx)  | | + cancel(ctx)  | | + cancel(ctx)    |
| + printStatus()| | + printStatus()| | + printStatus()| | + printStatus()| | + printStatus()  |
+----------------+ +----------------+ +----------------+ +----------------+ +------------------+

           ▲
           |
+-------------+-------------+
|      OrderContext         |
+---------------------------+
| - state: OrderState       |
+---------------------------+
| + setState(state)         |
| + next()                  |
| + cancel()                |
| + printStatus()           |
+---------------------------+
*/