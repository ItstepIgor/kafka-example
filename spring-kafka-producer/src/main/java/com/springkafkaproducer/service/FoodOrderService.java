package com.springkafkaproducer.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.springkafkaproducer.entity.FoodOrder;
import com.springkafkaproducer.service.producer.Producer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FoodOrderService {
    private final Producer producer;

    @Autowired
    public FoodOrderService(Producer producer) {
        this.producer = producer;
    }

    public String createFoodOrder(FoodOrder foodOrder) throws JsonProcessingException {
        return producer.sendMessage(foodOrder);
    }

//    Cсконфигурить подключение кафки через апликатиоон ямл
//    Сделать билдить образ через докер коппоуз сервисов
//    Добавить а аплие ямдл  возможность кофигурации через  переменную окрожение адрес кафки
//    Настроить проброс адреса подключеня кафки в докер крмпоуз


}
