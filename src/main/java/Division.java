public class Division implements Operation{
    @Override
    public float calculate(float a, float b) {
        if(b == 0) throw new ArithmeticException("На ноль делить нельзя");
        return a / b;
    }
}
