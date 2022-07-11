import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.qa.garage.Car;
import com.qa.garage.Motorbike;
import com.qa.garage.Quadbike;
import com.qa.garage.Vehicle;

public class QuadTest {

	@Test
	public void getQuadModel() {
		Vehicle quad1 = new Quadbike("Quadbike","Tesla Cyberquad",10,1590,true);
		assertEquals("Tesla Cyberquad",quad1.getModel(),"Expecting Tesla Cyberquad");
	}

	@Test
	public void setQuadModel() {
		Vehicle quad1 = new Quadbike("Quadbike","Tesla Cyberquad",10,1590,true);
		quad1.setModel("Cyberquad 2");
		assertEquals("Cyberquad 2",quad1.getModel(),"Expecting Cyberquad 2");
	}
	
	@Test
	public void getBikeSpeed() {
		Vehicle quad1 = new Quadbike("Quadbike","Tesla Cyberquad",10,1590,true);
		assertEquals(10,quad1.getTopSpeed(),"Expecting 10");		
	}

	@Test
	public void setQuadSpeed() {
		Vehicle quad1 = new Quadbike("Quadbike","Tesla Cyberquad",10,1590,true);
		quad1.setTopSpeed(15);
		assertEquals(15,quad1.getTopSpeed(),"Expecting 15");	
	}
	
	@Test
	public void getQuadPrice() {
		Vehicle quad1 = new Quadbike("Quadbike","Tesla Cyberquad",10,1590,true);
		assertEquals(1590,quad1.getPrice(),"Expecting 1590");
	}
	
	@Test
	public void setBikePrice() {
		Vehicle quad1 = new Quadbike("Quadbike","Tesla Cyberquad",10,1590,true);
		quad1.setPrice(1500);
		assertEquals(1500,quad1.getPrice(),"Expecting 1500");
	}
	
	@Test
	public void getQuadType() {
		Vehicle quad1 = new Quadbike("Quadbike","Tesla Cyberquad",10,1590,true);
		assertEquals("Quadbike",quad1.getType(),"Expecting Quadbike");
	}

	@Test
	public void setBikeType() {
		Vehicle quad1 = new Quadbike("Quadbike","Tesla Cyberquad",10,1590,true);
		quad1.setType("Car");
		assertEquals("Car",quad1.getType(),"Expecting Car");
	}
	
}
