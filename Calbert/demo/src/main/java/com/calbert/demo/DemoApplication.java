package com.calbert.demo;

import com.calbert.demo.model.entity.PostSerialization;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

/*
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
*/

	@Component
	class JsonConsoleRunner implements CommandLineRunner {

		// Serialization
		private final ObjectMapper objectMapper; // Convert Java objects to JSON and vice versa

		public JsonConsoleRunner(ObjectMapper objectMapper) {
			this.objectMapper = objectMapper;
		}

        @Override
		public void run(String... args) throws JsonProcessingException {

			List<PostSerialization> post = List.of(
					new PostSerialization(1, Instant.now(), "I learned to use Jackson", 10, Arrays.asList("Well done!", "Good job!")),
					new PostSerialization(2, Instant.now(), "Content 2", 10, Arrays.asList("Comment 2", "Comment 3")),
					new PostSerialization(3, Instant.now(), "Content 6", 16, Arrays.asList("Comment 78", "Comment 977"))
			);


			String postAsString = objectMapper.writeValueAsString(post); // Generate JSON and return it as string

			System.out.println("\n--- Post JSON Output ---");
			System.out.println(postAsString);
			System.out.println("------------------------");

			System.out.println("\n==========");
			String formattedPostAsString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(post); // Format previous line well
			System.out.println(formattedPostAsString);
		}
	}


	// Deserialization
	@Component
	class JsonDeserialize implements CommandLineRunner {

		ObjectMapper objectMapper;

		String inputJson = "{\"id\":1,\"createdDate\":1654027200000,\"content\":\"I learned how to use jackson!\"," +
				"\"likes\":10,\"comments\":[\"Well done!\",\"Great job!\"]}\n";

		public JsonDeserialize(ObjectMapper objectMapper) throws JsonProcessingException {
			this.objectMapper = objectMapper;
		}

		public void run(String... args) throws JsonProcessingException {
			PostSerialization post = objectMapper.readValue(inputJson, PostSerialization.class);
			String postDeserialized = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(post);
			System.out.println(postDeserialized);
		}
	}
}
