package com.deve.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
@Component
public class Laptop {
    @Autowired
    Cpu cpu;
    public void compile(){
        cpu.process();
    }
}
