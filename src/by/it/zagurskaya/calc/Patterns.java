package by.it.zagurskaya.calc;

import java.util.regex.Pattern;

class Patterns {

    private Patterns() {
    }

    static final String SCALAR = "-?[0-9]+(\\.[0-9]+)?";
    static final String VECTOR = "\\{(" + SCALAR + ",?\\s?)+}";
    static final String MATRIX = "\\{(" + VECTOR + ",?\\s?)+}";
    static final String OPERATION = "(?<=[^*/])[-+*/=]";
//    static final String OPERATION = "[+=*/-]";

//    static final Pattern p = Pattern.compile("[+=*/-]");

//    static final String OPERATION = "(?<=[^-+*/={, ])[-+*/=](?=>[^-+*/={, ])";
//    static final String OPERATION = "(?<=[^-+*/={(), ])[-+*/=]";


}
