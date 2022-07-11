import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.qa.garage.Car;
import com.qa.garage.Vehicle;

public class CarTest {

	@Test
	public void getCarModel() {
		Vehicle car1 = new Car("Car","Tesla Model 3",160,48490);
		assertEquals("Tesla Model 3",car1.getModel(),"Expecting Tesla Model 3");
	}
	
	@Test
	public void setCarModel() {
		Vehicle car1 = new Car("Car","Tesla Model 3",160,48490);
		car1.setModel("Tesla Model 3 Black");
		assertEquals("Tesla Model 3 Black",car1.getModel(),"Expecting Tesla Model 3 Black");
	}
	
	@Test
	public void getCarSpeed() {
		Vehicle car1 = new Car("Car","Tesla Model 3",160,48490);
		assertEquals(160,car1.getTopSpeed(),"Expecting 160");		
	}
	
	@Test
	public void setCarSpeed() {
		Vehicle car1 = new Car("Car","Tesla Model 3",160,48490);
		car1.setTopSpeed(170);
		assertEquals(170,car1.getTopSpeed(),"Expecting 170");	
	}
	
	@Test
	public void getCarPrice() {
		Vehicle car1 = new Car("Car","Tesla Model 3",160,48490);
		assertEquals(48490,((Car) car1).getCarPrice(),"Expecting 48490");
	}
	
	@Test
	public void setCarPrice() {
		Vehicle car1 = new Car("Car","Tesla Model 3",160,48490);
		((Car) car1).setCarPrice(30000);
		assertEquals(30000.0,((Car)car1).getCarPrice(),"Expecting 50000");
	}
	
	@Test
	public void getCarType() {
		Vehicle car1 = new Car("Car","Tesla Model 3",160,48490);
		assertEquals("Car",car1.getType(),"Expecting Car");
	}
	
	@Test
	public void setCarType() {
		Vehicle car1 = new Car("Car","Tesla Model 3",160,48490);
		car1.setType("Motorbike");
		assertEquals("Motorbike",car1.getType(),"Expecting Motorbike");
		
	}
	
}
