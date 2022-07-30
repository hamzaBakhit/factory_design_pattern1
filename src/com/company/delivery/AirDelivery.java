package com.company.delivery;

public class AirDelivery implements DeliveryMethod {
    @Override
    public float calcDeliveryPrice(Item item) {
        return item.getWeight() * 50;
    }
}
