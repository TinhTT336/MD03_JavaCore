import org.junit.function.ThrowingRunnable;

public class Calculator implements ThrowingRunnable {
    public double add(double a,double b){
        return  a+b;
    }
    public double multiply(double a, double b){
        return a*b;
    }
    public double divide(double a, double b){
        return a/b;
    }
    public int divideInt(int a,int b){
        return a/b;
    }

    @Override
    public void run() throws Throwable{
        divideInt(3,0);
    }

    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        double a= calculator.divideInt(3,0);
    }
}
