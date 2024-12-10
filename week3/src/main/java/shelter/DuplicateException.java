package shelter;

import animals.Animal;

public class DuplicateException extends Exception {
    public DuplicateException() {
        super(String.format("Animal already exists"));
    }
}
