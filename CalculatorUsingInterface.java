interface AddSub{
    public abstract int add(int num1, int num2);
    public abstract int sub(int num1,int num2);
}
interface MultiDiv{
    public abstract int multi(int num1,int num2);
    public abstract double div(double num1,double num2);
}

public class CalculatorUsingInterface implements AddSub,MultiDiv{
    public int add(int num1, int num2){
        int sum=num1+num2;
        return sum;
    }
    public int sub(int num1, int num2){
        int subtraction=num1-num2;
        return subtraction;
    }
    public int multi(int num1,int num2){
        int multiplication=num1*num2;
        return multiplication;
    }
    public double div(double num1,double num2){
        double division = num1/num2;
        return division;
    }
    public static void main(String[] args) {
        CalculatorUsingInterface obj= new CalculatorUsingInterface();
        System.out.println("Addition of two number is: "+obj.add(10, 6)); 
        System.out.println("Subtraction of two number is: "+obj.sub(30, 10)); 
        System.out.println("Multiplication of two number is: "+ obj.multi(4, 7));
        System.out.println("Division of two number is: "+obj.div(50, 10));
       
    }
}