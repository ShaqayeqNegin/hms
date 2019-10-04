package af.hu.cs.se.hospitalmanagementsystem2.service;

import af.hu.cs.se.hospitalmanagementsystem2.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.DeptRepository;


@Service
public class DeptServiceImpl  implements DeptService{
    @Autowired
    private DeptRepository deptRepository;
    @Override
    public void saveDept(Dept dept) {

        deptRepository.save(dept);
    }


    @Override
    public Object findAll() {
        return deptRepository.findAll();
    }
    @Override
    public Dept findDeptById(Long id) {
        return deptRepository.getOne(id);
    }

    @Override
    public void deleteDeptById(Long id) {
        deptRepository.deleteById(id);
    }
}
