package af.hu.cs.se.hospitalmanagementsystem2.model;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Dept {
    public Integer getDeptId() {
        return deptId;
    }
@Id
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    private Integer deptId;
    private String name;
    private Integer docId;
    private Doctor doctor;
  @ManyToOne
  @JoinColumn(name="doctor_id")
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
