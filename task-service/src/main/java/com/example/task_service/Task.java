package com.example.task_service;

public class Task {
    private String responsible;
    private String descripition;

    public Task(String responsible, String descripition){
        this.responsible = responsible;
        this.descripition = descripition;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible){
        this.responsible = responsible;
    }

    public void setDescripition(String descripition) {
        this.descripition = descripition;
    }

    public String getDescripition() {
        return descripition;
    }
    
}