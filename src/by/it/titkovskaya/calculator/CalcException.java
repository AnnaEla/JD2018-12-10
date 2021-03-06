package by.it.titkovskaya.calculator;

import by.it.titkovskaya.calculator.internationalization.strings.Programme;

public class CalcException extends Exception {

    public CalcException() {
        super();
    }

    public CalcException(String message) {
        super(ResMan.INSTANCE.get(Programme.ERROR) + " " + message);
        System.out.println(ResMan.INSTANCE.get(Programme.ERROR) + " " + message);
    }

    public CalcException(String message, Throwable cause) {
        super(ResMan.INSTANCE.get(Programme.ERROR) + " " + message, cause);
    }

    public CalcException(Throwable cause) {
        super(cause);
    }
}
