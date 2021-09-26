package org.jana.kafka2.resource;

import org.jana.kafka2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserResource {

    @Autowired
    KafkaTemplate<String, User> kafkaTemplate;

    private static final String USER_TOPIC = "user-topic";

    @GetMapping("/publish/{name}")
    public String postUser(@PathVariable("name") final String name) {
        kafkaTemplate.send(USER_TOPIC, new User(name, "IT"));
        return "User message published successfully";
    }

}
