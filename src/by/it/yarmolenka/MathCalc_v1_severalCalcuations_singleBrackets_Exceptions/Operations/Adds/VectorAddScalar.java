package by.it.yarmolenka.MathCalc_v1_severalCalcuations_singleBrackets_Exceptions.Operations.Adds;

import by.it.yarmolenka.MathCalc_v1_severalCalcuations_singleBrackets_Exceptions.Variables.*;

import java.util.Arrays;

public class VectorAddScalar {
    public static Vector vectorScalar(Vector vec, Scalar sc) {
        double[] res = Arrays.copyOf(vec.value,vec.value.length);
        for (int i = 0; i < res.length; i++) res[i] += sc.value;
        return new Vector(res);
    }
}