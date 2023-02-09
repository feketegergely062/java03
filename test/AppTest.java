
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.Test;

public class AppTest {
  @Test
  public void testcalcRadius() {
    double radius = App.calcRadius(30, 35);
    assertEquals(8.60364654526569, radius);
  }

  @Test
  public void testSecondCalcRadius() {
    double expectedRadius = 29.53918647207887;
    double actualRadius = App.calcRadius(103, 35);
    assertEquals(expectedRadius, actualRadius);
  }

  @Test
  public void TestEdgeMinCalcRadius() {
    double expectedRadius = 0.008076203218641756;
    double actualRadius = App.calcRadius(1, 1);
    assertEquals(expectedRadius, actualRadius);
  }

  @Test
  public void testHaveSome() {
    ArrayList<String> methodNameList = new ArrayList<>();
    Method[] methods = App.class.getMethods();
    for (Method method : methods) {
      String name = method.getName();
      methodNameList.add(name);

    }
    boolean hasCalcRadius = methodNameList.contains("calcRadius");
    assertTrue(hasCalcRadius);
  }

}
