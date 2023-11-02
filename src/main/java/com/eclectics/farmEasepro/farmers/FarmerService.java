package com.eclectics.farmEasepro.farmers;

import java.util.List;


public class FarmerService {
    public List<Farmer> getFarmers(){

        return List.of(
                new Farmer((long)1, "Mary","Jane", "jane@gmil.com", 2349),
                new Farmer((long)1, "Mary","Jane", "jane@gmil.com", 2349));

    }
}
