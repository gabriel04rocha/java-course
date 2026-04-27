package exceptions;

public class DirectoryNotCreatedException extends Exception{
    public DirectoryNotCreatedException(String errorMessage) {
        super(errorMessage);
    }
}
