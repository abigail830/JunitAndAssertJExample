package ExpenseService.Exception;

public class UnexpectedProjectTypeException extends Throwable {
    public UnexpectedProjectTypeException(String errorMsg) {
        super(errorMsg);
    }
}
