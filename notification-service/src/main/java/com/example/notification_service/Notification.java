package com.example.notification_service;

public class Notification {
    private String mensage;

    public Notification(String mensage){
        this.mensage = mensage;
    }

    public String getMensage() {
        return mensage;
    }

    public void setMensage(String mensage) {
        this.mensage = mensage;
    }
}
