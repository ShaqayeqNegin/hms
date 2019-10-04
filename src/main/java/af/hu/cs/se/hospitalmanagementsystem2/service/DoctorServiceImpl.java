package af.hu.cs.se.hospitalmanagementsystem2.service;

import af.hu.cs.se.hospitalmanagementsystem2.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.DoctorRepository;

@Service
public class DoctorServiceImpl  implements DoctorService{
    @Autowired
    private DoctorRepository doctorRepository;
    @Override
    public void saveDoctor(Doctor doctor) {
       doctorRepository.save(doctor);
    }

    @Override
    public Object findAll() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor findDoctorById(Long id) {
        return doctorRepository.getOne(id);
    }

    @Override
    public void deleteDoctorById(Long id) {
        doctorRepository.deleteById(id);
    }
}
