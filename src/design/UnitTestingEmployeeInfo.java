package design;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.

        EmployeeInfo user = new EmployeeInfo(1337) {
            @Override
            public int employeeId() {
                return 0;
            }

            @Override
            public String employeeName() {
                return null;
            }

            @Override
            public int calculateSalary() {
                return 0;
            }
        };
    }
}
