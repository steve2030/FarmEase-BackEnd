package com.eclectics.farmEasepro.farmers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmerService {
    @Autowired
    private FarmerRepository farmerRepository;
    public List<Farmer> getFarmers(){
        return farmerRepository.findAll();





    }
}
