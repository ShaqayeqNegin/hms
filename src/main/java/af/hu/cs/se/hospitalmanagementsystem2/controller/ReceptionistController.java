package af.hu.cs.se.hospitalmanagementsystem2.controller;

import af.hu.cs.se.hospitalmanagementsystem2.model.Receptionist;
import af.hu.cs.se.hospitalmanagementsystem2.service.ReceptionistService;
import af.hu.cs.se.hospitalmanagementsystem2.service.ReceptionistServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReceptionistController {

    @Autowired
    private ReceptionistService receptionistServiceService;
    private ReceptionistServiceImpl receptionistService;

    @GetMapping("receptionist/register")
    public String getRegisterPage(Model model){
        model.addAttribute( "receptionist",new Receptionist());


        model.addAttribute( "reciptionists",receptionistService.findAll());
        return "Receptionist_Form";
    }
    @PostMapping("/receptionist/register")
    public String register(@ModelAttribute Receptionist receptionist){
        receptionistService.saveReceptonist(receptionist);
        return "redirect:/receptionist/register";
    }
}
