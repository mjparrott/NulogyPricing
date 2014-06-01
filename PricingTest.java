import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PricingTest
{
  @Test
  public void testInput1()
  {
    Pricing p = new Pricing(1299.99, 3, Product.FOOD);
    assertEquals(p.estimateCost(), 1591.58, 0.005);
  }

  @Test
  public void testInput2()
  {
    Pricing p = new Pricing(5432.00, 1, Product.PHARMACEUTICALS);
    assertEquals(p.estimateCost(), 6199.81, 0.005);
  }

  @Test
  public void testInput3()
  {
    Pricing p = new Pricing(12456.95, 4, Product.OTHER);
    assertEquals(p.estimateCost(), 13707.63, 0.005);
  }

  @Test
  public void testSimple()
  {
    Pricing p = new Pricing(1000.00, 0, Product.OTHER);
    assertEquals(p.estimateCost(), 1050.00, 0.005);
  }

  @Test
  public void testElectronics()
  {
    Pricing p = new Pricing(2000.00, 5, Product.ELECTRONICS);
    assertEquals(p.estimateCost(), 2268.00, 0.005);
  }

  @Test
  public void testFreeProduct()
  {
    Pricing p = new Pricing(0.00, 1, Product.FOOD);
    assertEquals(p.estimateCost(), 0.00, 0.005);
  }
}
