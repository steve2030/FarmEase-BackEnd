package com.eclectics.farmEasepro.equipments;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService {
    public List<Equipment>getEquipments(){
        return List.of(
                new Equipment((long)1, "Tractor", "A red Fergurson KCA234",500, 2)

                );
    }

}
