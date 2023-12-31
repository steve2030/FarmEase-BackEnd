package com.eclectics.farmEasepro.equipments;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController


public class EquipmentController {
    @Autowired
    private EquipmentService equipmentService;
    @GetMapping(path = "api/v1/equipments")
    public List<Equipment>getEquipments(){

        return equipmentService.getEquipments();
    }

//    Fetching A single Farmer
    @GetMapping(path = "api/v1/equipments{Id}")
    public List<Equipment>getEquipment(){

        return equipmentService.getEquipment();
    }






}
