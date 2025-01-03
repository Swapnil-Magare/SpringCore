package InjectinDataByautowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
//	@Value(value = "55252")
	int cc;

	public void start() {
		System.out.println("CC: "+ cc);
		System.out.println("Car is need engine.!!!");
	}

	@Override
	public String toString() {
		return "Engine [cc=" + cc + "]";
	}

}
