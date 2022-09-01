package Calculator;

import org.junit.Assert;
import org.junit.Test;


public class CalcTest {

	
	@Test
	public void sumTest()
	{
		Calc c=new Calc();
	   int sum=	c.sum(20, 10);
		Assert.assertEquals(30, sum);
	}
	
	@Test
	public void subTest()
	{
		Calc c=new Calc();
	   int sub=	c.sub(20, 10);
		Assert.assertEquals(30, sub);
	}
	
	@Test
	public void mulTest()
	{
		Calc c=new Calc();
	   int mul=	c.mul(20, 10);
		Assert.assertEquals(200, mul);
	}
	
	
	
	
	
	
	
	
	
	
	
}
