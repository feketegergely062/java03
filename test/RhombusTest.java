
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.Test;


public class RhombusTest {
  @Test
  public void testcalcRadius() {
    Rhombus rhombus = new Rhombus();
    double radius = rhombus.calcRadius(30, 35);
    assertEquals(8.60364654526569, radius);
  }

  @Test
  public void testSecondCalcRadius() {
    double expectedRadius = 29.53918647207887;
    Rhombus rhombus = new Rhombus();
    double actualRadius = rhombus.calcRadius(103, 35);
    assertEquals(expectedRadius, actualRadius);
  }

  @Test
  public void TestEdgeMinCalcRadius() {
    double expectedRadius = 0.008726203218641756;
    Rhombus rhombus = new Rhombus();
    double actualRadius = rhombus.calcRadius(1, 1);
    assertEquals(expectedRadius, actualRadius);
  }

  @Test
  public void testHaveCalcRadiusMethod() {

    ArrayList<String> methodNameList = new ArrayList<>();
    Method[] methods = Rhombus.class.getMethods();
    for (Method method : methods) {
     String name = method.getName();
     methodNameList.add(name);
    }
     boolean hasCalcRadius = methodNameList.contains("calcRadius");
     assertTrue(hasCalcRadius);
  }
  @Test
  public void testHaveFeladat0312Method() {
    ArrayList<String> methodNameList = new ArrayList<>();
    Method[] methods = tombsug.class.getMethods();
    for (Method method : methods) {
     String name = method.getName();
     methodNameList.add(name);
    }
     boolean hasCalcRadius = methodNameList.contains("feladat0312");
     assertTrue(hasCalcRadius);
  }
}
