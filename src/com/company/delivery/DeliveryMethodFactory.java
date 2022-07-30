package com.company.delivery;

public class DeliveryMethodFactory {
    public static DeliveryMethod createDeliveryMethod(int id) {
        if (id == 1) {
            return new LandDelivery();
        } else if (id == 2) {
            return new MaritimeDelivery();
        } else if (id == 3) {
            return new AirDelivery();
        } else if (id == 4) {
            return new DroneDelivery();
        } else {
            throw new IllegalArgumentException("invalid id number");
        }
    }
}
