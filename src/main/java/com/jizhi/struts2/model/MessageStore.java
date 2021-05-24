package com.jizhi.struts2.model;

public class MessageStore {

    private final String message;


    public MessageStore() {
        this.message = "Hello Struts User";
    }

    public String getMessage() {
        return message;
    }
}
