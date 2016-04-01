import static org.junit.Assert.*;

import org.junit.Test;
public class testTriangle {
	int borders1[]={1,2,3};
	int borders2[]={0,-1,-1};
	int borders3[]={3,4,5};
	int borders4[]={2,2,3};
	int borders5[]={1,1,1};
	private Triangle a = new Triangle(borders1[0],borders1[1],borders1[2]);
	private Triangle b = new Triangle(borders2[0],borders2[1],borders2[2]);
	private Triangle c = new Triangle(borders3[0],borders3[1],borders3[2]);
	private Triangle d = new Triangle(borders4[0],borders4[1],borders4[2]);
	private Triangle e = new Triangle(borders5[0],borders5[1],borders5[2]);
	@Test
	public void test(){
		
	
	int array[] = {1,2,3};
	
	
	assertEquals(false,a.isTriangle(a));
	assertEquals(false,b.isTriangle(b));
	assertEquals(true,c.isTriangle(c));
	assertEquals(true,d.isTriangle(d));
	assertEquals(true,e.isTriangle(e));
	assertEquals("Illegal",a.getType(a));
	assertEquals("Illegal",b.getType(b));
	assertEquals("Scalene",c.getType(c));
	assertEquals("Isosceles",d.getType(d));
	assertEquals("Regular",e.getType(e));
	for(int i=0;i<=2;i++)
	{assertEquals(array[i],a.getBorders()[i]);
	}

}}
