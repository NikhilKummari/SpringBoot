package com.demo.app.service;

import com.demo.app.model.Laptop;
import com.demo.app.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap) {

        repo.save(lap);
    }


    public boolean isGoodForProg(Laptop lap) {
        return true;
    }
}
