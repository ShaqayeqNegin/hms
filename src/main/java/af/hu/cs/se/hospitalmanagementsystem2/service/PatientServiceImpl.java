package af.hu.cs.se.hospitalmanagementsystem2.service;

import af.hu.cs.se.hospitalmanagementsystem2.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PatientRepository;

@Service
public class PatientServiceImpl  implements PatientService{

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public void savePatient(Patient patient) {

        patientRepository.save(patient);
    }

    @Override
    public Object findAll() {

        return patientRepository.findAll();
    }
    @Override
    public Patient findPatientById(Long id) {
        return patientRepository.getOne(id);
    }

    @Override
    public void deletePatientById(Long id) {
        patientRepository.deleteById(id);
    }
}
