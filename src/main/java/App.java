public class App
{
    public static void main( String[] args ){
    Calc calc = new Calc();
    System.out.println(calc.average(2,4));
    System.out.println(calc.average(6,4));
    System.out.println("odp: " + calc.isEven(6));
    System.out.println("odp: " + calc.isEven(5));
}}