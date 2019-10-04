package af.hu.cs.se.hospitalmanagementsystem2.controller;

import af.hu.cs.se.hospitalmanagementsystem2.model.Dept;
import af.hu.cs.se.hospitalmanagementsystem2.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DeptController {

    @Autowired
    private DeptService deptService;
    @GetMapping("dept/register")
    public String getRegisterPage(Model model){
        model.addAttribute( "dept",new Dept());


        model.addAttribute( "depts",deptService.findAll());
        return "Dept_Form";
    }
    @PostMapping("/dept/register")
    public String register(@ModelAttribute Dept dept){
        deptService.saveDept(dept);
        return "redirect:/dept/register";
    }
}
