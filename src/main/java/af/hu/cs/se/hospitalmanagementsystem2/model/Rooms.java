package af.hu.cs.se.hospitalmanagementsystem2.model;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Rooms {

    private Integer roomNo;
    private String location;
    private String phoneNo;
    private Set<Patient> patient;

    public Integer getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(Integer roomNo) {
        this.roomNo = roomNo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @ManyToMany(mappedBy = "rooms")
    @JoinTable(name="Rooms_patient")
    public Set<Patient> getPatient() {
        return patient;
    }

    public void setPatient(Set<Patient> patient) {
        this.patient = patient;
    }
}
