import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGeometricSum
{
    @Test
    public void test1halfGeometricPartialSum()
    {
        testValues(0.5, 1000);
    }

    @Test
    public void test1quarterGeometricPartialSum()
    {
        testValues(0.25, 1000);
    }

    @Test
    public void testnotpoint7GeometricPartialSum()
    {
        testValues(0.7, 1000);
    }


    public void testValues(double r, int nMax)
    {
        double actual = Main.geometricPartialSum(r, nMax);
        double expected = (1 - Math.pow(r, (nMax + 1)))/(1-r);

        assertEquals(actual, expected, 0.0001);
    }
}
