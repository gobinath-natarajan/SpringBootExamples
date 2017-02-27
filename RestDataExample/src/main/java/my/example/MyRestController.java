package my.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.example.data.FilmListView;
import my.example.repos.MyJPARepository;
import my.example.repos.MyJPAViewRepo;

@RestController
public class MyRestController {
	
	@Autowired
	MyJPARepository repo;
	
	@Autowired
	MyJPAViewRepo viewRepo;
	
	@RequestMapping("/films/{filmId}")
	public String getFilmTitleById(@PathVariable int filmId){
		return repo.findByFilmId(filmId).getTitle();
	}
	
	@RequestMapping("/filmView/{category}")
	public List<FilmListView> getFilmsByCategory(@PathVariable String category){
		return viewRepo.findByCategory(category);
	}

}
