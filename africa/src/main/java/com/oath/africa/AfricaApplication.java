package com.oath.africa;

import com.oath.africa.business.Movie;
import com.oath.africa.persistence.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class AfricaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AfricaApplication.class, args);
	}

	@Component
	public class Runner implements CommandLineRunner {
		private final MovieRepository repository;

		public Runner(MovieRepository repository) {
			this.repository = repository;
		}

		@Override
		public void run(String... args) throws Exception {

			// Save data into database
			repository.save(new Movie("Blockbuster"));
			repository.save(new Movie("Berlin", "drama", 2, 1960));
			repository.save(new Movie("Korea", "series", 4, 1960));
			repository.save(new Movie("Inception", "science fiction", 87, 2010));
			repository.save(new Movie("Fight Club", "thriller", 87, 1999));
			repository.save(new Movie("The Godfather", "drama", 87, 1972));
			repository.save(new Movie("The Prestige", "thriller", 85, 2006));
			repository.save(new Movie("Gladiator", "history", 86, 2000));
			repository.save(new Movie("The Shawshank Redemption", "drama", 91, 1994));
			repository.save(new Movie("Forrest Gump", "drama", 89, 1994));

			// Sorting
			Iterable<Movie> listMovie = repository.findAll(Sort.by("yearOfRelease").descending());
			Iterable<Movie> movies = repository.findAll(Sort.by(Sort.Direction.DESC, "yearOfRelease")
					.and(Sort.by("name"))
					.and(Sort.by("rating"))
			);

			// Paging
			Pageable pageable = PageRequest.of(0, 10); // 10 pages on a single web page
			Page<Movie> pageMovie = repository.findAll(pageable);
		}
	}

}
