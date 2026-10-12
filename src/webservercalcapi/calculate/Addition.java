package webservercalcapi.calculate;

public class Addition{
    private final Calculate calculate;

    public Addition(Calculate calculate){
        this.calculate = calculate;
    }

    public int addNumbers(int a, int b){
        if (calculate.validate(a) && calculate.validate(b)){
            return a + b;
        }
        throw new IllegalStateException("invalid input");
    }
}