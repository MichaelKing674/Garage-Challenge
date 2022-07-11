import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.qa.garage.Car;
import com.qa.garage.Garage;
import com.qa.garage.Vehicle;


public class GarageTest {
	@Test
	public void garageToString() {
		Garage garage = new Garage();
		Vehicle car1 = new Car("Car","Tesla Model 3",160,48490);
		garage.add(car1);
		assertEquals("[Car:\nModel: Tesla Model 3\nTopSpeed: 160\nPrice: 48490\nType: Car\n]",garage.toString());
	}
	
	@Test
	public void garageRemove() {
		Garage garage = new Garage();
		Vehicle car1 = new Car("Car","Tesla Model 3",160,48490);
		garage.add(car1);
		garage.remove(car1);
		assertEquals("[]",garage.toString(),"Expecting empty garage list");
	}
}
