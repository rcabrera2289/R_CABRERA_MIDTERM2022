package math.problems;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        Factorial factorialObj= new Factorial();
        int factorialNum= 5;
        int result= (factorialObj.factorial(1));
        System.out.println(result);


        int factorialNum2= 10;
        int result2= factorialObj.factor(10);
        System.out.println(result2);


    }
}


