package med.voll.api.doctor.controller;


import jakarta.validation.Valid;
import med.voll.api.doctor.dto.CreateDoctorDTO;
import med.voll.api.doctor.dto.GetAllDoctorsDTO;
import med.voll.api.doctor.dto.UpdateDoctorDTO;
import med.voll.api.doctor.entities.Doctor;
import med.voll.api.doctor.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    public Page<GetAllDoctorsDTO> getAll(Pageable pagination){

        return repository.findAll(pagination).map(GetAllDoctorsDTO::new);
    }


    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid UpdateDoctorDTO data){
        var doctor = repository.getReferenceById(data.id());

        doctor.update(data);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }

}
