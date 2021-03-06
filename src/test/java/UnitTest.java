import org.junit.*;
import static org.junit.Assert.*;

public class UnitTest {

  @Test
  public void newPackage_instantiatesCorrectly() {
    ShippingCalculator testShippingCalculator = new ShippingCalculator(3,4,3);
    assertEquals(true, testShippingCalculator instanceof ShippingCalculator);
  }

  @Test
  public void newPackage_returnsCorrectVolume() {
    ShippingCalculator testShippingCalculator = new ShippingCalculator(3,4,3);
    assertEquals(36, testShippingCalculator.getVolume());
  }

  @Test
  public void newPackage_returnsCorrectCost() {
    ShippingCalculator testShippingCalculator = new ShippingCalculator(3,4,3);
    assertEquals(21, testShippingCalculator.getCost(3, 200));
  }

  @Test
  public void newPackage_returnsSurfaceArea() {
    ShippingCalculator testShippingCalculator = new ShippingCalculator(3,4,3);
    assertEquals(66, testShippingCalculator.getSurfaceArea());
  }

  @Test
  public void newPackage_returnGiftWrapCost() {
    ShippingCalculator testShippingCalculator = new ShippingCalculator(3,4,3);
    testShippingCalculator.getSurfaceArea();
    testShippingCalculator.getCost(3,200);
    assertEquals(26, testShippingCalculator.getGiftWrapCost());
  }
}
