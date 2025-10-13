package com.calbert.demo;

import com.calbert.demo.model.entity.Treadmill;
import com.calbert.demo.repository.TreadmillRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.NoSuchElementException;
import java.util.Optional;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Component
	class Runner implements ApplicationRunner {
		private final TreadmillRepository repository;

		// Constructor for injection for TreadmillRepository
		Runner(TreadmillRepository repository) {
			this.repository = repository;
		}

		private void doWeHaveSomethingInDb() {
			long count = repository.count();

			if (count > 0) {
				System.out.printf("Database has %d treadmill(s)%n", count);
			} else {
				System.out.println("Database has no treadmill");
			}
		}


		@Override
		public void run(ApplicationArguments args) {
			System.out.println("Before save: ");
			doWeHaveSomethingInDb();

			System.out.println("Saving...");
			repository.save(new Treadmill("G239", "Australia"));

			System.out.println("After save: ");
			doWeHaveSomethingInDb();

			System.out.println("\n+++ CREATE +++");
			// CREATE
			repository.save(new Treadmill("BBBB", "Kenya"));
			repository.save(new Treadmill("CCCC", "Nigeria"));
			repository.save(new Treadmill("DDDD	", "Malta"));
			repository.save(new Treadmill("EEEE", "Austria"));
			repository.save(new Treadmill("FFFF", "Namibia"));
			repository.save(new Treadmill("EEEE", "Berlin"));


			System.out.println("\n+++ READ +++");
			// READ
			try {
				Treadmill treadmill = repository.findById("EEdEE").orElseThrow(NoSuchElementException::new);
				System.out.println(treadmill);
			} catch (NoSuchElementException e) {
				System.out.println("No treadmill found");
			}

			Iterable<Treadmill> treadmills = repository.findAll();
			System.out.println(treadmills);
			treadmills.forEach(System.out::println);

			System.out.println("\n+++ UPDATE +++");
			// UPDATE
			Treadmill treadmill = repository.findById("BBBB").orElseThrow();
			System.out.println("Before update: " + treadmill);
			System.out.println("Updating...");
			treadmill.setModel("Bonty Bucket");
			repository.save(treadmill);

			Treadmill updatedTreadmill = repository.findById("BBBB").orElseThrow();
			System.out.println("After update: " + updatedTreadmill);

			System.out.println("\n+++ DELETE +++");
			// DELETE
			System.out.println("Before delete: ");
			printAllTreadmills();

			repository.deleteById("DDDD     ");

			System.out.println("After delete: ");
			printAllTreadmills();

			Iterable<Treadmill> allTreadmills = repository.findAll();
			for (Treadmill t : allTreadmills) {
				if (t.getModel().equals("Malta")) {
					repository.delete(t);
				}
			}

			printAllTreadmills();

			// Use Optional<T> to delete
			Optional<Treadmill> optionalTreadmill = repository.findById("CCCC");
			optionalTreadmill.ifPresent(repository::delete);

			printAllTreadmills();
		}

		public void printAllTreadmills() {
			Iterable<Treadmill> treadmills = repository.findAll();
			treadmills.forEach(System.out::println);
		}
	}
}
