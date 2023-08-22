package org.study.chap02_01;

import java.util.function.BiFunction;

public enum CalculateType {
    ADD ((num1, num2) -> num1 + num2),
    MINUS ((num1, num2) -> num1 - num2),
    MULTIPLY ((num1, num2) -> num1 * num2),
    DIVIDE ((num1, num2) -> num1 / num2);

    CalculateType(BiFunction<Integer, Integer, Integer> expression) {
        this.expression = expression;
    }

    private BiFunction<Integer, Integer, Integer> expression;

    public int calculate(int num1, int num2) {
        return this.expression.apply(num1, num2);
    }
}

