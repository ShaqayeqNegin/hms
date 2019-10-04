package af.hu.cs.se.hospitalmanagementsystem2.service;

import af.hu.cs.se.hospitalmanagementsystem2.model.Rooms;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.RoomsRepository;

@Service
public class RoomsServiceImpl  implements RoomsService{
    @Autowired
    private RoomsRepository roomsRepository;

    @Override
    public void saveRooms(Rooms rooms) {
        roomsRepository.save(rooms);
    }

    @Override
    public Object findAll() {
        return roomsRepository.findAll();
    }
    @Override
    public Rooms findRoomsById(Long id) {
        return roomsRepository.getOne(id);
    }

    @Override
    public void deleteRoomsById(Long id) {
        roomsRepository.deleteById(id);
    }
}
