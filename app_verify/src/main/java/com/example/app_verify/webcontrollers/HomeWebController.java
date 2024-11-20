package com.example.app_verify.webcontrollers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cccd/verify/")
public class HomeWebController {

    @GetMapping("index")
    public String verify() {
        return "index";
    }

}
