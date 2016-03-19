package scsceshi;
import static org.junit.Assert.*;
import org.junit.Test;
public class test {
	
	private static triangle cal = new triangle();
	@Test
	public void testTriangle(){
		
	cal.triangle(3, 4, 5);
	assertEquals(1, cal.getResult());
	cal.triangle(3, 3, 5);
	assertEquals(2, cal.getResult());
	cal.triangle(6, 6, 6);
	assertEquals(3, cal.getResult());
	cal.triangle(10, 4, 4);
	assertEquals(-1, cal.getResult());
	cal.triangle(-1, 3, 4);
	assertEquals(-1, cal.getResult());
	}
	

}
