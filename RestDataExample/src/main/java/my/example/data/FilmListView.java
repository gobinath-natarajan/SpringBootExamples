package my.example.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Film_List")
public class FilmListView {

	@Id
	@GeneratedValue
	@Column(name = "FID")
	private Integer FilmId;

	private String title;

	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getFilmId() {
		return FilmId;
	}

	public void setFilmId(Integer filmId) {
		FilmId = filmId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
