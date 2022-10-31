package com.example.combos.controller;

import com.example.combos.model.Combo;
import com.example.combos.repo.ComboRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/*@Controller*/
@RestController
public class ComboController {

    @Autowired
    private ComboRepository comboRepository;

    @GetMapping("/listacombo")
    ModelAndView index(){
        List<Combo> combo = comboRepository.findAll();

        return new ModelAndView("index")
                .addObject("comb", combo);
    }
}
