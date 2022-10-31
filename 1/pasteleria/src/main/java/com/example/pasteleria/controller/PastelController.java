package com.example.pasteleria.controller;

import com.example.pasteleria.model.Pastel;
import com.example.pasteleria.repo.PastelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/*@Controller*/
@RestController
public class PastelController {
    // para resolver la dependencia
    @Autowired
    private PastelRepository pastelRepository;


    //anotar el metodo para resolver la ruta principal de la aplicacion
    @GetMapping("/lista")
    ModelAndView index(){
        List<Pastel> pastel = pastelRepository.findAll();
        //retorna nueva instancia modelandviev
        return new ModelAndView("index")
                //agregamos el nuevo objeto al modelo
                .addObject("paste", pastel );

    }
}
