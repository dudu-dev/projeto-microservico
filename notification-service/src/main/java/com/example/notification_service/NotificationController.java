package com.example.notification_service;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    private List<Notification> notifications;
    
    @GetMapping("/")
    public List<Notification> getNotification(){
        return notifications;
    }
    
    @PostMapping("/")
    public Notification createNotification(@RequestBody Notification notification){
        notifications.add(notification);
        return notification;
    }
}
