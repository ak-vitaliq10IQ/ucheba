package addMagaz_3;

public class Main
{
    private static Employee[] employees;

    public static void main(String[] args)
    {

        employees = new Employee[]
                {
                        new Employee("Миша", 500),
                        new Employee("Федя", 3200),
                        new Employee("Даня", 800),
                        new Employee("Влад", 3954),
                        new Employee("Игорь", 20000)
                };

        System.out.println(Report.GenerateReport(employees));
    }
}