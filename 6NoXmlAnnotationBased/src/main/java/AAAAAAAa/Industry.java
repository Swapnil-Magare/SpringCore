package AAAAAAAa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Industry {
	@Autowired
//	@Qualifier(value="KGF") this is how noUniqueBeanDefException will resovle.
	Movie movie;

	public Movie getMovie() {
		return movie;
	}

	@Autowired
	@Qualifier(value = "KG") // Settter injection
	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Autowired // constructor injection
	public Industry(@Qualifier(value = "KGF") Movie movie) {
		this.movie = movie;
	}

	public void budget() {
		System.out.println("Samantha Budget kkhaaa gyi !!!!!!!!");
		movie.story();
	}
}
