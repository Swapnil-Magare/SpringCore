package NoXmlPractice;

import org.springframework.stereotype.Component;

@Component("KGF")
public class Pushpa implements Movie {

	public void story() {
		System.out.println("pusha abi siznada");
	}
}
