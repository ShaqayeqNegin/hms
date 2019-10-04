package af.hu.cs.se.hospitalmanagementsystem2.service;

import af.hu.cs.se.hospitalmanagementsystem2.model.Receptionist;

public interface ReceptionistService {
    void saveReceptionist(Receptionist receptionist);

    Object findAll();
    Receptionist findReceptionistById(Long id);

    void deleteReceptionistById(Long id);
}
