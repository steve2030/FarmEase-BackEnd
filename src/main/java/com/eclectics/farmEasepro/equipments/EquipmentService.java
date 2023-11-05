package com.eclectics.farmEasepro.equipments;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
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
    public optional <Equipment>getEquipment(Long Id){

        return equipmentRepository.findById(Id);
    }

//    Add an Equipment(POst Method)
    public List<Equipment>createEquipment{
        return equipmentRepository.save(equipment);
    }

//    Update/Edit/
public List<Equipment>updateEquipment{
        return equipmentRepository.
    }

//    Delete an Equipment
public void deleteEquipment(){
        return equipmentRepository.deleteById(Id);
}
}
