package employeeApp;

import employeeApp.enums.Plan;
import employeeApp.model.Company;
import employeeApp.model.Employee;
import employeeApp.model.Healthplan;

import java.util.Arrays;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Healthplan plan1 = new Healthplan(1, "A Sigorta", Plan.ADVANCE);
        Healthplan plan2 = new Healthplan(2, "B Sigorta", Plan.MEDIUM);

        System.out.println(plan1);
        System.out.println(plan2);

        String[] Healthplan = new String[3];
        Healthplan[0] = plan1.getName();
        Healthplan[1] = plan2.getName();

        //["A Sigorta", "B Sigorta"]
        Employee employee = new Employee(1, "Ali Veli",
                "aliveli.com", "1234", Healthplan);

        employee.addHealthPlan(0, "C Sigorta");
        employee.addHealthPlan(2, "A Sigorta");
        employee.addHealthPlan(2, "C Sigorta");
        employee.addHealthPlan(3, "T Sigorta");
        System.out.println(Arrays.toString(employee.getHealthPlans()));

        System.out.println("**********************************");
        Company company = new Company(1, "Workintech",
                1000000000, new String[]{"Dogancan Kınık", "Omer Fatih Tanriverdi", null});

        company.addEmployee(0, "Ali Veli");
        company.addEmployee(2, "Mehmet Ali");
        company.addEmployee(-1, "Mehmet Ali");
        company.addEmployee(5, "Mehmet Ali");

        System.out.println(Arrays.toString(company.getDeveloperNames()));
        System.out.println(company);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        //double num = 1000000000;
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
