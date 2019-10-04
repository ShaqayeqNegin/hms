package af.hu.cs.se.hospitalmanagementsystem2.service;

import af.hu.cs.se.hospitalmanagementsystem2.model.Rooms;

public interface RoomsService {
    void saveRooms(Rooms rooms);

    Object findAll();
    Rooms findRoomsById(Long id);

    void deleteRoomsById(Long id);
}
