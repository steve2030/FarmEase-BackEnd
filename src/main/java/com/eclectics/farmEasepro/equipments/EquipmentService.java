package com.eclectics.farmEasepro.equipments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService {
    @Autowired
    private EquipmentRepository equipmentRepository;
    public List<Equipment>getEquipments(){
        return equipmentRepository.findAll();
    }

//    Find Equipment by Id
    public List<Equipment>getEquipment(){
        return equipmentRepository.findById();
    }

//    Add an Equipment(POst Method)

    public List<Equipment>createEquipment{
        return
    }

//    Update/Edit/
public List<Equipment>updateEquipment{
        return
    }

}
