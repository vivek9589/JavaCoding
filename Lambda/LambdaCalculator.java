


@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}


public class LambdaCalculator {

    public static void main(String[] args) {
        
        Calculator  add = (a,b) -> a+b;
        Calculator multiply = (a,b) -> a*b;


        System.out.println("");
        System.out.println("Addition : " + add.operate(5,3));
        System.out.println("Multiplication : " + multiply.operate(5,3));
        

    }
    
}
