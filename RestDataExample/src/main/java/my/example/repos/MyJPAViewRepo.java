package my.example.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import my.example.data.FilmListView;

public interface MyJPAViewRepo extends JpaRepository<FilmListView, Integer> {

	public List<FilmListView> findByCategory(String category);
}
