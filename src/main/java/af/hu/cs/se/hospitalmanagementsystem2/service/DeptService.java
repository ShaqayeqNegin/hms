package af.hu.cs.se.hospitalmanagementsystem2.service;

import af.hu.cs.se.hospitalmanagementsystem2.model.Dept;

public interface DeptService {
    void saveDept(Dept dept);

    Object findAll();
    Dept findDeptById(Long id);

    void deleteDeptById(Long id);
}
