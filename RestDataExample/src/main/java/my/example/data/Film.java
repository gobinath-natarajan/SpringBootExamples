package my.example.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;


@Entity
public class Film {

	@javax.persistence.Id
	@GeneratedValue
	private Integer filmId;
	
	//@Column()
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getFilmId() {
		return filmId;
	}

	public void setFilmId(Integer filmId) {
		this.filmId = filmId;
	}

}
