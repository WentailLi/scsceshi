import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;


public class testSch {
	@Test
	public void test() {
		List<Work> work = new ArrayList<Work>() ;
		Schedule a = new Schedule();
		Work gz1 = new Work("z1",1,3);
		Work gz2 = new Work("z2",2,1);
		Work gz3 = new Work("z3",3,6);
		work.add(gz1);
		work.add(gz2);
		work.add(gz3);
		List<Double> array1 = new ArrayList<Double>();
		List<Double> array2 = new ArrayList<Double>();
		array1 = a.FCFS(work);
		array2 = a.SJF(work);
		assertEquals(10,array1.get(0),0.0);
		assertEquals(10,array1.get(1),0.0);
		assertEquals(10,array2.get(0),0.0);
		assertEquals(10,array2.get(1),0.0);
	}

}
