package com.company.delivery;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Item item = new Item();
        item.setPrice(100);
        item.setHeight(5);
        item.setWidth(100);
        item.setHeight(200);

        Scanner s = new Scanner(System.in);
        System.out.println("choose delivery method: \n 1.land 2.maritime 3.Air 4.drone");
        int choice = s.nextInt();
        int deliveryPrice = 0;
        DeliveryMethod d = DeliveryMethodFactory.createDeliveryMethod(deliveryPrice);


        System.out.println("Deliver price=" + deliveryPrice);
    }
}
