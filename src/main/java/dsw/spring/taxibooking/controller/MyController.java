package dsw.spring.taxibooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping(path = {"", "home", "welcome", "index"})
    public String welcomeView() {
        return "index";
    }

    @GetMapping("about")
    public String aboutView() {
        return "about";
    }

    @GetMapping("cars")
    public String carsView() {
        return "cars";
    }

    @GetMapping("services")
    public String servicesView() {
        return "services";
    }

    @GetMapping("contacts")
    public String contactsView() {
        return "contacts";
    }
}
