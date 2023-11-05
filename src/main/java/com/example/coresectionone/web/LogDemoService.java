package com.example.coresectionone.web;

import com.example.coresectionone.common.MyLogger;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LogDemoService {

    private final MyLogger myLogger;

    public void logic(String id) {
        myLogger.log("service id = " + id);
    }
}
