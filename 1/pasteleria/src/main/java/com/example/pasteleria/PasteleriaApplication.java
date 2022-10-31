package com.example.pasteleria;

import com.example.pasteleria.model.Pastel;
import com.example.pasteleria.repo.PastelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class PasteleriaApplication {

/*	@Autowired
	private PastelRepository pastelRepository;

	@PostConstruct
	void init(){
		Pastel pastel2 = new Pastel();
		pastel2.setNombre("pastel de fresa");
		pastel2.setDescripcion("pastel de crema con fresas");
		pastel2.setPrecio(200);

		pastelRepository.save(pastel2);

		Pastel pastel3 = new Pastel();
		pastel3.setNombre("pastel de helado");
		pastel3.setDescripcion("pastel de helado de cafe");
		pastel3.setPrecio(300);

		pastelRepository.save(pastel3);

		pastelRepository.findAll().forEach(c ->{
			System.out.println("pastel: " + c.getNombre());
		});
	}*/


	public static void main(String[] args) {
		SpringApplication.run(PasteleriaApplication.class, args);
	}

}
