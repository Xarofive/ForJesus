package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;

@Controller
public class UserController {

    @GetMapping("/index")
    public String index() {
        return "people/index";
    }

}
