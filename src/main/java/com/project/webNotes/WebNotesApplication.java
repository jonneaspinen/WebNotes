package com.project.webNotes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebNotesApplication {

	private static final Logger log = LoggerFactory.getLogger(WebNotesApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WebNotesApplication.class, args);
	}

	/*
	@Bean
	public CommandLineRunner insertDemoQuestions(NoteRepo noterepo, UrgencyRepo urepo, UserRepo userrepo) {
		return (args) -> {
			
			/*
			// CREATE TEST DATA
			urepo.save(new Urgency("High"));
			urepo.save(new Urgency("Medium"));
			urepo.save(new Urgency("Low"));

			noterepo.save(new Note("Drink water!", "2021-11-12", urepo.findByImportance("Low").get(0)));
			noterepo.save(new Note("Return exercise", "2021-11-18", urepo.findByImportance("High").get(0)));

			// PRINT TEST DATA IN CONSOLE
			log.info("Fetching test data...");

			// Create users: admin/admin user/user
			User user1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			User user2 = new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
			userrepo.save(user1);
			userrepo.save(user2);

			for (Note note : noterepo.findAll()) {
				log.info(note.toString());
			
			}
		};
	}
	*/

}
