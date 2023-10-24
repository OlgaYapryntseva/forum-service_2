package telran.java48.accounting.dto.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class UserExistsException extends RuntimeException{
	public UserExistsException(String message) {
		super(message);
	}
	private static final long serialVersionUID = 1L;

}
