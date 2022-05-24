package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String getMessage() {
        String str = "Sandeep sonar qube example";
        Object obj = getObject(str);
        System.out.println(obj.toString());
        return  str;
    }

    private Object getObject(String msg) {
        return msg;
    }
}
