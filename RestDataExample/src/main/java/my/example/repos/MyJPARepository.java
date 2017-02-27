package my.example.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import my.example.data.Film;

@EnableJpaRepositories
public interface MyJPARepository extends JpaRepository<Film, Integer> {

	public Film findByFilmId(Integer filmId);
}
