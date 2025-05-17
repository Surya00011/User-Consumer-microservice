package com.microservice.userservice.userservice.consumer;

import com.microservice.userservice.userservice.config.RabbitMqConfig;
import com.microservice.userservice.userservice.dto.UserDto;
import com.microservice.userservice.userservice.service.UserService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class UserConsumer {
    private final UserService userService;

    public UserConsumer(UserService userService) {
        this.userService = userService;
    }

    @RabbitListener(queues = RabbitMqConfig.QUEUE,containerFactory = "rabbitListenerContainerFactory")
    public String saveUser(UserDto user) {
         try {
             userService.saveUser(user);
             return "User saved successfully";
         }catch (Exception e) {
             return "User not saved";
         }
    }
}
