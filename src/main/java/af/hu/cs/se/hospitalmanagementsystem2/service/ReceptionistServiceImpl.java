package af.hu.cs.se.hospitalmanagementsystem2.service;

import af.hu.cs.se.hospitalmanagementsystem2.model.Receptionist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ReceptionistRepository;

@Service
public class ReceptionistServiceImpl  implements ReceptionistService{
    @Autowired
    private ReceptionistRepository receptionistRepository;
    @Override
    public void saveReceptionist(Receptionist receptionist) {
        receptionistRepository.save(receptionist);
    }

    @Override
    public Object findAll() {
        return receptionistRepository.findAll();
    }

    public void saveReceptonist(Receptionist receptionist) {
    }
    @Override
    public Receptionist findReceptionistById(Long id) {
        return receptionistRepository.getOne(id);
    }

    @Override
    public void deleteReceptionistById(Long id) {
        receptionistRepository.deleteById(id);
    }
}
