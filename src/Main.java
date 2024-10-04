import java.math.BigDecimal;

public class Main
{
    /**
     * @explination the first 2 lines are defualt values (ps i forgot to write down the exact numbers used in class sorr) and lines 14 to 26 deal with taking the args passed into the script converting them to primative doubles and prints a error and exits if it cant be converted and line 29 calls the method to get the value
     * @param args r nmax (r is a real number) and nmax is a integer
     */
    public static void main(String[] args)
    {
        double r =(4.0/9.0);
        int nMax = 1000;

        try
        {
            if(args.length == 2)
            {
                r = Double.parseDouble(args[0]);
                nMax = Integer.parseInt(args[1]);
            }
        }
        catch(Exception e)
        {
            System.out.println("Cant convert parameters to string");
            System.exit(1);
        }

        System.out.println(geometricPartialSum(r, nMax));
    }

    /**
     * @param r the value to be squared
     * @param nMax the number in the series to calculate to
     * @return the partial sum given by r^n
     * @explination first 2 lines are creating the rActual to avoid floating point errors and sum for the sum. r is a real number and nMax and n are integers. the for (int = 0; n <= nMax; n++) is the same thing as Σ where the top half is nMax and the bottom n = 0 sum.add(r.pow(2)) is equivalent to r^n return sum.double value just returns the value
     */
    public static double geometricPartialSum(Double r, int nMax)
    {
        BigDecimal rActual = new BigDecimal(r);

        BigDecimal sum = new BigDecimal(0);

        for(int n = 0; n <= nMax; n++)
        {
            sum = sum.add(rActual.pow(n));
        }

        return sum.doubleValue();
    }
}