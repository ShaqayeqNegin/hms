package af.hu.cs.se.hospitalmanagementsystem2.controller;

import af.hu.cs.se.hospitalmanagementsystem2.model.Doctor;
import af.hu.cs.se.hospitalmanagementsystem2.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.awt.peer.LabelPeer;

@Controller
public class DoctorController {

    @Autowired
    private DoctorService doctorService;
    @GetMapping("doctor/register")
    public String getRegisterPage(Model model){
        model.addAttribute( "doctor",new Doctor());



        return "Doctor_Form";
    }
    @PostMapping("/doctor/register")
    public String register(@ModelAttribute Doctor doctor){
        doctorService.saveDoctor(doctor);
        return "redirect:/doctor/list";
    }


    @RequestMapping(path={"/doctor/list","/"},method= RequestMethod.GET)
    public String getDoctorListPage(Model model){
        model.addAttribute( "doctors",doctorService.findAll());
        return "Doctor_List";
    }

  @GetMapping("doctor/edit/{id}")
  public String editdoctor(@PathVariable Long id, Model model){
  Doctor doctor=doctorService.findDoctorById(id);
      model.addAttribute("doctor",new Doctor());
  return "Doctor_Form";
 }
 @PostMapping("/doctor/delete/{id}")
    public String deleteDoctor(@PathVariable Long id){
        doctorService.deleteDoctorById(id);
        return "redirect:/doctor/list";
 }
}
