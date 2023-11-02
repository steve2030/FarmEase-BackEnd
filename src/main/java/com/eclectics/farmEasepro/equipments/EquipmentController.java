package com.eclectics.farmEasepro.equipments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;

@RestController
public class EquipmentController {
    @Autowired
    private EquipmentService equipmentService;
    @GetMapping(path = "api/v1/equipments")
    Public List<Equipment>getEquipments(){
        return equipmentService.getEquipments();
    }
}
