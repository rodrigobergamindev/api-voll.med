package med.voll.api.doctor.repository;

import med.voll.api.doctor.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {



}
