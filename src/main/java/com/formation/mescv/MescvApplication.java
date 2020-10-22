package com.formation.mescv;

import com.formation.mescv.dao.IPersonRepository;
import com.formation.mescv.entities.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MescvApplication implements CommandLineRunner {

	private IPersonRepository iPersonRepository;

	public MescvApplication(IPersonRepository iPersonRepository) {
		this.iPersonRepository = iPersonRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(MescvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Person person = Person.builder()
		                      .lastName("Brahim")
		                      .job("JavaDev")
		                      .name("BARHOUMI")
		                      .cin(03112254L)
		                      .path("brahim.png")
						.build();
		iPersonRepository.save(person);

	}
}
