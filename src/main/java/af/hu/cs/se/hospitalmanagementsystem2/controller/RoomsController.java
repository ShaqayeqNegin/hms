package af.hu.cs.se.hospitalmanagementsystem2.controller;

import af.hu.cs.se.hospitalmanagementsystem2.model.Rooms;
import af.hu.cs.se.hospitalmanagementsystem2.service.RoomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RoomsController {

    @Autowired
    private RoomsService roomsService;
    @GetMapping("rooms/register")
    public String getRegisterPage(Model model){
        model.addAttribute( "rooms",new Rooms());


        model.addAttribute( "roomss",roomsService.findAll());
        return "Rooms_Form";
    }
    @PostMapping("/rooms/register")
    public String register(@ModelAttribute Rooms rooms){
        roomsService.saveRooms(rooms);
        return "redirect:/rooms/register";
    }
}
