package com.jizhi.struts2.action;

import com.jizhi.struts2.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
    private static final long serialVersionUID = 5237531433877118597L;
    private MessageStore messageStore;

    public String execute() {
        messageStore = new MessageStore();

        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
}
