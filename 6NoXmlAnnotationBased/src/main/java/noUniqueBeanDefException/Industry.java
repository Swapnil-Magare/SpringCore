package noUniqueBeanDefException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Industry {
	@Autowired
	Movie movie;
	
	public void budget() {
		System.out.println("Samantha Budget kkhaaa gyi !!!!!!!!");
		movie.story();
	}
}
