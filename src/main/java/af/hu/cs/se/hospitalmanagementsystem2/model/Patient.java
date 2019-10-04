package af.hu.cs.se.hospitalmanagementsystem2.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Patient {
    private Integer patientId;
    private String patientName;
    private String phoneNo;
    private String address;
    private Integer age;
    private String sex;
    private Integer roomNo;
    private Doctor doctor;
    private Receptionist receptionist;
    private Set<Rooms> rooms;
    private Set<Bill> bill;

    @ManyToMany(mappedBy = "patient")
    public Set<Bill> getBill() {
        return bill;
    }

    public void setBill(Set<Bill> bill) {
        this.bill = bill;
    }

    @ManyToMany(mappedBy = "patient")
    public Set<Rooms> getRooms() {
        return rooms;
    }


    public void setRooms(Set<Rooms> rooms) {
        this.rooms = rooms;
    }

    @ManyToOne
    @JoinColumn(name="receptionit_id")
    public Receptionist getReceptionist() {
        return receptionist;
    }

    public void setReceptionist(Receptionist receptionist) {
        this.receptionist = receptionist;
    }

    @ManyToOne
    @JoinColumn(name="doctor_id")
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(Integer roomNo) {
        this.roomNo = roomNo;
    }
}
