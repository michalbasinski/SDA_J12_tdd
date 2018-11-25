package pl.sda;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public float divide(float a, float b) {
        if (b == 0) {
            throw new DivideByZeroException("Nie dziel przez zero!");
        } else {
            return a / b;
        }
    }
}
