import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.qa.garage.Motorbike;
import com.qa.garage.Vehicle;

public class BikeTest {

	@Test
	public void getBikeModel() {
		Vehicle bike1 = new Motorbike("Motorbike","Honda CBR500R",112,6499,500, 2);
		assertEquals("Honda CBR500R",bike1.getModel(),"Expecting Honda CBR500R");
	}
	
	@Test
	public void setBikeModel() {
		Vehicle bike1 = new Motorbike("Motorbike","Honda CBR500R",112,6499,500, 2);
		bike1.setModel("Honda CBR500T");
		assertEquals("Honda CBR500T",bike1.getModel(),"Expecting Honda CBR500T");
	}
	
	@Test
	public void getBikeSpeed() {
		Vehicle bike1 = new Motorbike("Motorbike","Honda CBR500R",112,6499,500, 2);
		assertEquals(112,bike1.getTopSpeed(),"Expecting 112");		
	}

	@Test
	public void setBikeSpeed() {
		Vehicle bike1 = new Motorbike("Motorbike","Honda CBR500R",112,6499,500, 2);
		bike1.setTopSpeed(120);
		assertEquals(120,bike1.getTopSpeed(),"Expecting 120");	
	}
	
	@Test
	public void getBikePrice() {
		Vehicle bike1 = new Motorbike("Motorbike","Honda CBR500R",112,6499,500, 2);
		assertEquals(6499,bike1.getPrice(),"Expecting 6499");
	}
	
	@Test
	public void setBikePrice() {
		Vehicle bike1 = new Motorbike("Motorbike","Honda CBR500R",112,6499,500, 2);
		bike1.setPrice(6999);
		assertEquals(6999,bike1.getPrice(),"Expecting 6999");
	}
	
	@Test
	public void getBikeType() {
		Vehicle bike1 = new Motorbike("Motorbike","Honda CBR500R",112,6499,500, 2);
		assertEquals("Motorbike",bike1.getType(),"Expecting Motorbike");
	}
	
	@Test
	public void setBikeType() {
		Vehicle bike1 = new Motorbike("Motorbike","Honda CBR500R",112,6499,500, 2);
		bike1.setType("Car");
		assertEquals("Car",bike1.getType(),"Expecting Car");
	}
	
	@Test
	public void getBikeWheels() {
		Vehicle bike1 = new Motorbike("Motorbike","Honda CBR500R",112,6499,500, 2);
		assertEquals(2,((Motorbike) bike1).getWheels(),"Expecting 2");
	}
	
	@Test
	public void setBikeWheels() {
		Vehicle bike1 = new Motorbike("Motorbike","Honda CBR500R",112,6499,500, 2);
		((Motorbike) bike1).setWheels(3);
		assertEquals(3,((Motorbike) bike1).getWheels(),"Expecting 3");
	}
	
	@Test
	public void getBikeEngine() {
		Vehicle bike1 = new Motorbike("Motorbike","Honda CBR500R",112,6499,500, 2);
		assertEquals(500,((Motorbike) bike1).getEngine(),"Expecting 500");
	}
	
	@Test
	public void setBikeEngine() {
		Vehicle bike1 = new Motorbike("Motorbike","Honda CBR500R",112,6499,500, 2);
		((Motorbike) bike1).setEngine(750);
		assertEquals(750,((Motorbike) bike1).getEngine(),"Expecting 750");
	}
}
