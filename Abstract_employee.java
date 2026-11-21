
abstract class Employ {

    abstract double calculatedSalary();

    void companyName() {
        System.out.println("ABC Technologies");
    }
}

class FullTimeEmploy extends Employ {

    double calculatedSalary() {
        return 40000;
    }
}

class PartTimeEmploy extends Employ {

    double calculatedSalary() {
        return 15000;
    }
}

public class Abstract_employee {
    public static void main(String[] args) {

        FullTimeEmploy f = new FullTimeEmploy();
        PartTimeEmploy p = new PartTimeEmploy();

        f.companyName();
        System.out.println("Full Time Salary = " + f.calculatedSalary());

        p.companyName();
        System.out.println("Part Time Salary = " + p.calculatedSalary());
    }
}
