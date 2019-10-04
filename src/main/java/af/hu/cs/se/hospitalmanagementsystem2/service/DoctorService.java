package af.hu.cs.se.hospitalmanagementsystem2.service;

import af.hu.cs.se.hospitalmanagementsystem2.model.Doctor;

public interface DoctorService {
    void saveDoctor(Doctor doctor);

    Object findAll();

    Doctor findDoctorById(Long id);

    void deleteDoctorById(Long id);
}
