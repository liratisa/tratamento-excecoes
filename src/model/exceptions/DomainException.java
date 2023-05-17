package model.exceptions;

// poderia ser Exception tb (mas se torna obrigatório tratar ou propagar a exceção)

public class DomainException extends RuntimeException {

	public DomainException(String msg) {
		super(msg);
	}
	
	private static final long serialVersionUID = 1L;

}
