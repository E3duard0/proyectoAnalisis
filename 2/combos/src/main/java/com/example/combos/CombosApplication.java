package com.example.combos;

import com.example.combos.model.Combo;
import com.example.combos.repo.ComboRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CombosApplication {
	/*@Autowired
	private ComboRepository comboRepository;
	@PostConstruct
	void init(){
		Combo combo1 = new Combo();
		combo1.setCombo("Combo cumpleañero 1");
		combo1.setDescripcion("Combo de pastel mediano mas velas");
		combo1.setPrecio(175);
		comboRepository.save(combo1);

		comboRepository.findAll().forEach(c ->{
			System.out.println("combo:"+ c.getCombo());
		});
	}*/


	public static void main(String[] args) {
		SpringApplication.run(CombosApplication.class, args);
	}

}
