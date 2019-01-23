package nirmal.advice;

import nirmal.exception.ValidationException;
import nirmal.exception.WarningException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalErrorHandler {

  @ExceptionHandler(ValidationException.class)
  protected ValidationException handleValidationException(ValidationException ex) {
    return ex;
  }

  @ExceptionHandler(WarningException.class)
  protected WarningException handleWarningException(WarningException ex) {
      return ex;
  }
}
