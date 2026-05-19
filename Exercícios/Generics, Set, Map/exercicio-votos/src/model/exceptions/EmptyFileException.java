package model.exceptions;

public class EmptyFileException extends Exception {
    public EmptyFileException(String errorMessage) {
        super(errorMessage);
    }
}
