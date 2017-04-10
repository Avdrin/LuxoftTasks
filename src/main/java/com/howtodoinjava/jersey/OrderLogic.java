package com.howtodoinjava.jersey;

import java.util.logging.Logger;

/**
 * Created by Katz on 08.04.2017.
 */

public class OrderLogic {

    // Инициализация логера
    private static final Logger log = Logger.getLogger(String.valueOf(OrderLogic.class));

    public void doOrder(){
        // какае-то логика
        System.out.println("Заказ оформлен!");
        // логируем инфо
        log.info("Это информационное сообщение!");
//        addToCart();
    }

//    private void addToCart() {
//        // добавление товара в корзину
//        System.out.println("Товар добавлен в корзину");
//        // логируем ошибку
//        log.error("Это сообщение ошибки");
//    }

}
