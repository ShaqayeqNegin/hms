package af.hu.cs.se.hospitalmanagementsystem2.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Doctor {
    @Column(name="Doctor_id")
    private Integer docId;
    private String name;
    private String dept;
    private String specialization;
    private Set<Dept> depts;
    private Set<Patient> patients;

    public Set<Patient> getPatients() {
        return patients;
    }
    @OneToMany(mappedBy = "doctor")
    public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }

    public Set<Dept> getDepts() {
        return depts;
    }
   @OneToMany(mappedBy = "doctor")
    public void setDepts(Set<Dept> depts) {
        this.depts = depts;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private String phoneNo;
    private String location;


}
