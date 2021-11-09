package com.netzwerkplan.netzwerk;

import formularinputs.Knoten;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class NetzwerkplanController {

    @GetMapping("startpage")
    private String startpage(Model model, Knoten knoten) {
        List<Knoten> knotenliste = new ArrayList<>();
        

        return "userinput-template";
    }

}
