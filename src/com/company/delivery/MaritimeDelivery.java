package com.company.delivery;

public class MaritimeDelivery implements DeliveryMethod{
    @Override
    public float calcDeliveryPrice(Item item) {
        return  (item.getWeight() * 10) + ((item.getHeight()* item.getWidth()/100) *30);
    }
}
