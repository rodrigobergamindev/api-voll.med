package med.voll.api.doctor.controller;


import jakarta.validation.Valid;
import med.voll.api.doctor.dto.CreateDoctorDTO;
import med.voll.api.doctor.entities.Doctor;
import med.voll.api.doctor.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("doctors")
public class DoctorController {

    @Autowired
    private DoctorRepository repository;


    @PostMapping
    @Transactional
    public void create(@RequestBody @Valid CreateDoctorDTO data){

        repository.save(new Doctor(data));

    }

    @GetMapping
    public List<GetAllDoctorsDTO> getAll(){
        return repository.findAll().stream().map(GetAllDoctorsDTO::new).toList();
    }

}
