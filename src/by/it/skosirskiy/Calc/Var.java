package by.it.skosirskiy.Calc;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

abstract class Var implements Operation {


    //private static Map<String,Var> vars= new HashMap<>();
    private static TreeMap<String,Var> vars=  new TreeMap<>();
    static Var saveVar(String name, Var var){
        vars.put(name, var);
        return var;
    }

    public static void printvar(){
        System.out.println(vars);
    }

    static Var createVar(String operand) throws CalcException{
        operand=operand.trim().replace("\\s+","");
        if (operand.matches(Patterns.SCALAR))
            return new Scalar(operand);
        else if (operand.matches(Patterns.VECTOR))
            return new Vector(operand);
        else if (operand.matches(Patterns.MATRIX))
            return new Matrix(operand);
        else if (vars.containsKey(operand)) return vars.get(operand);

        throw new CalcException("Невозможно создать "+operand);

    }


    @Override
    public Var add(Var other) throws CalcException  {
        throw new CalcException("Операция сложения "+this+"+"+other+"невозможна");

    }

    @Override
    public Var sub(Var other) throws CalcException {
        throw new CalcException("Операция вычитания "+this+"-"+other+"невозможна");

    }

    @Override
    public Var mul(Var other) throws CalcException {
        throw new CalcException("Операция умножения "+this+"*"+other+"невозможна");

    }

    @Override
    public Var div(Var other) throws CalcException {
        throw new CalcException("Операция деления "+this+"/"+other+"невозможна");

    }
}