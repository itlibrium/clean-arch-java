package com.itlibrium.cooldomain.model;

class Dog {
    void takeOrder(String order) {
        if("DO_A_BARREL_ROLL".equalsIgnoreCase(order)) {
            //roll the barrel
            return;
        }
        throw new UnsupportedOperationException();
    }
}
