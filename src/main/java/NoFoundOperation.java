import java.util.InputMismatchException;

public class NoFoundOperation implements Operation{
    private char action;

    public NoFoundOperation(char action) {
        this.action = action;
    }

    @Override
    public float calculate(float a, float b) {
        throw new InputMismatchException("Оператор не найден: " + action);
    }
}
