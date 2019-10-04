package af.hu.cs.se.hospitalmanagementsystem2.controller;
        import af.hu.cs.se.hospitalmanagementsystem2.model.Bill;
        import af.hu.cs.se.hospitalmanagementsystem2.service.BillService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.ModelAttribute;
        import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BillController {

    @Autowired
    private BillService billService;
    @GetMapping("bill/register")
    public String getRegisterPage(Model model){
        model.addAttribute( "bill",new Bill());


        model.addAttribute( "doctors",billService.findAll());
        return "Bill_Form";
    }
    @PostMapping("/bill/register")
    public String register(@ModelAttribute Bill bill){
        billService.saveBill(bill);
        return "redirect:/bill/register";
    }
}
