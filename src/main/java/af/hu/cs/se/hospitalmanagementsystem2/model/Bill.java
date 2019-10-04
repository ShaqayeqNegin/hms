package af.hu.cs.se.hospitalmanagementsystem2.model;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Bill {
    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    private String billNo;
    private String patientName;
    private Set<Receptionist> receptionist;
    private Set<Patient> patient;

    @JoinTable(name="Bill_patient")
    @ManyToMany(mappedBy = "bill")
    public Set<Patient> getPatient() {
        return patient;
    }

    public void setPatient(Set<Patient> patient) {
        this.patient = patient;
    }

    @OneToMany(mappedBy = "")
    public Set<Receptionist> getReceptionist() {
        return receptionist;
    }

    public void setReceptionist(Set<Receptionist> receptionist) {
        this.receptionist = receptionist;
    }
}
