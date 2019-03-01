package by.it.moroz.jd01.jd01_09;

class Patterns {

    private Patterns(){


    }
    static final String SCALAR = "-?[0-9]+(\\.[0-9]+)?";
    static final String VECTOR = "\\{("+SCALAR+",?\\s?)+}";
    static final String MATRIX = "\\{("+VECTOR+",?\\s?)+}";
    static final String OPERATION = "[+*/-]";
}
