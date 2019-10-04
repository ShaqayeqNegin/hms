package af.hu.cs.se.hospitalmanagementsystem2.controller;

import af.hu.cs.se.hospitalmanagementsystem2.model.Patient;
import af.hu.cs.se.hospitalmanagementsystem2.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PatientController {

    @Autowired
    private PatientService patientService;
    @GetMapping("patient/register")
    public String getRegisterPage(Model model){
        model.addAttribute( "patient",new Patient());


        model.addAttribute( "patients",patientService.findAll());
        return "Patient_Form";
    }
    @PostMapping("/doctor/register")
    public String register(@ModelAttribute Patient patient){
        patientService.savePatient(patient);
        return "redirect:/patient/register";
    }
}
