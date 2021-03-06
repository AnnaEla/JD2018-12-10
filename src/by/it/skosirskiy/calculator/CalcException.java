package by.it.skosirskiy.calculator;



public class CalcException extends Exception {


    public CalcException() {
        super( ResMan.INSTANCE.get(Message.str4));
        ConsoleRunner.logger.log(ResMan.INSTANCE.get(Message.str4));
    }

    public CalcException(String message) {
        super( ResMan.INSTANCE.get(Message.str4)+message);
        ConsoleRunner.logger.log(ResMan.INSTANCE.get(Message.str4)+message);
    }

    public CalcException(String message, Throwable cause) {
        super( ResMan.INSTANCE.get(Message.str4)+message, cause);
        ConsoleRunner.logger.log(ResMan.INSTANCE.get(Message.str4)+message+cause);
    }

    public CalcException(Throwable cause) {
        super(cause);
    }

    public CalcException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(ResMan.INSTANCE.get(Message.str4)+message, cause, enableSuppression, writableStackTrace);
        ConsoleRunner.logger.log(ResMan.INSTANCE.get(Message.str4)+message+cause+enableSuppression+writableStackTrace);

    }
}
