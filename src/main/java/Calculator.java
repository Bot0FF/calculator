import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private final float a;
    private final float b;
    private final char action;
    private final Map<Character, Operation> operationMap = new HashMap<>();

    public Calculator(float a, float b, char action) {
        this.a = a;
        this.b = b;
        this.action = action;

        operationMap.put('+', new Addition());
        operationMap.put('-', new Subtraction());
        operationMap.put('*', new Multiplication());
        operationMap.put('/', new Division());
    }

    /**
     * @return возвращает результат вычисления a и b
     */
    public float calculateResult() {
        Operation operation = operationMap.get(action);
        return operation.calculate(a, b);
    }
}
