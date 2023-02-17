package med.voll.api.pacient.controller;

import jakarta.validation.Valid;
import med.voll.api.doctor.dto.GetAllDoctorsDTO;
import med.voll.api.pacient.dto.CreatePacientDTO;
import med.voll.api.pacient.dto.GetAllPatientsDTO;
import med.voll.api.pacient.entities.Pacient;
import med.voll.api.pacient.repository.PacientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pacients")
public class PacientController {

        @Autowired
        private PacientRepository repository;

        @PostMapping
        public void create(@RequestBody @Valid CreatePacientDTO data) {

            repository.save(new Pacient(data));
        }


        @GetMapping
        public Page<GetAllPatientsDTO> getAll(Pageable pagination){

                return repository.findAll(pagination).map(GetAllPatientsDTO::new);
        }


}
