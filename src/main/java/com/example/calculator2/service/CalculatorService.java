package com.example.calculator2.service;

import com.example.calculator2.exception.ZeroException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements Calculator {
    @Override
    public String Hello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public Integer sum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public Integer difference(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public Integer multiplication(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public Integer division(int num1, int num2) {
        if (num2 == 0) {
            throw new ZeroException();
        }
        return num1 / num2;
    }
}
