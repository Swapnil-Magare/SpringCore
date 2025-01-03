package noUniqueBeanDefException;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class KGF implements Movie {
public void story() {
	System.out.println("KGF movie");
}
}
