package com.eclectics.farmEasepro.farmers;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmerService {
    public List<Farmer> getFarmers(){

        return List.of(
                new Farmer((long)1, "Mary","Jane", "jane@gmil.com", 2349),
                new Farmer((long)1, "Abigael","wanjau", "jane@gmil.com", 2349));

    }
}
