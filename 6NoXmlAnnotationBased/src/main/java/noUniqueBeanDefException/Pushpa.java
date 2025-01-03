package noUniqueBeanDefException;

import org.springframework.stereotype.Component;

@Component
public class Pushpa implements Movie {

	public void story() {
		System.out.println("pusha abi siznada");
	}
}
