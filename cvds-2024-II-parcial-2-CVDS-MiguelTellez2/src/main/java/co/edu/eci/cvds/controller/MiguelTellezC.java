package co.edu.eci.cvds.controller;

import co.edu.eci.cvds.service.MiguelTellezS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/MiguelTellez")
public class MiguelTellezC {

    private final MiguelTellezS MiguelTellezS;

    @Autowired
    public MiguelTellezC(MiguelTellezS MiguelTellezS) {
        this.MiguelTellezS = MiguelTellezS;
    }

    @GetMapping("")
    public String example(Model model) {
        model.addAttribute("migueltellez", MiguelTellezS.getAllMiguelTellezm());
        return "miguel_tellez";
    }
}
