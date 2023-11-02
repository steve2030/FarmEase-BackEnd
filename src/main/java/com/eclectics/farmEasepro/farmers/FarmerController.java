package com.eclectics.farmEasepro.farmers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FarmerController {
   private FarmerService farmerService;
    @GetMapping(path = "/api/v1/farmers")
    public List<Farmer> getFarmers(){
        return farmerService.getFarmers()
    }
}
