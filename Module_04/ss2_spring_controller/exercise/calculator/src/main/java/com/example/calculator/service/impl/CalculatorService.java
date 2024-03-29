package com.example.caculator.service.impl;

import com.example.caculator.service.ICalculatorService;

public class CalculatorService implements ICalculatorService {
    @Override
    public int addition(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    @Override
    public int subtraction(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    @Override
    public int multiplication(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    @Override
    public double division(int numberOne, int numberTwo) {
        return numberOne / numberTwo;
    }
}
