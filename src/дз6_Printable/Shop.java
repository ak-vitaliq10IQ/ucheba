package дз6_Printable;

import java.util.Random;

public class Shop implements Printable
{
    public void print()
    {
        System.out.print(String.format("Номер магазина: %s\n", new Random().nextInt(1,10)));
    }
}
