package nirmal.domain.ui;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class ExceptionResponse {
  String id;
  String errorCode;
  String message;
}
