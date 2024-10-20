import java.util.List;

import com.cbfacademy.cars.Car;

public class Showroom {

	private List<Car> cars = List.of(
			new Car("Volvo", "V40", "Blue", 2012),
			new Car("Porsche", "Panamera", "Red", 2009),
			new Car("Audi", "A3", "Grey", 2018));

	public List<Car> getCars() {
		return cars;

	}

}
