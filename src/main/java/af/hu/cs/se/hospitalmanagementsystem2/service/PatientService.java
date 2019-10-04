package af.hu.cs.se.hospitalmanagementsystem2.service;

import af.hu.cs.se.hospitalmanagementsystem2.model.Patient;

public interface PatientService {
    void savePatient(Patient patient);

    Object findAll();
    Patient findPatientById(Long id);

    void deletePatientById(Long id);
}
