package af.hu.cs.se.hospitalmanagementsystem2.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Receptionist {
    private Integer receptionId;
    private String name;
    private Set<Patient> patient;
   private Bill bill;

    @ManyToOne
    @JoinColumn(name="bill_id")
    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    @OneToMany(mappedBy = "receptionist")
    public Set<Patient> getPatient() {
        return patient;
    }

    public void setPatient(Set<Patient> patient) {
        this.patient = patient;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getReceptionId() {
        return receptionId;
    }

    public void setReceptionId(Integer receptionId) {
        this.receptionId = receptionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
