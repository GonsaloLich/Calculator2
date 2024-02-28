package com.example.calculator2;

import com.example.calculator2.exception.ZeroException;
import com.example.calculator2.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
class CalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorService();

    @Test
    void sum() {
        assertEquals(3,calculatorService.sum(1,2));
    }

    @Test
    void difference() {assertEquals(2,calculatorService.difference(3,1));

    }

    @Test
    void multiplication() {assertEquals(4,calculatorService.multiplication(2,2));
    }

    @Test
    void division() {assertEquals(2,calculatorService.division(4,2));
    }

    @Test
    void zeroException(){
        assertThrows(ZeroException.class, () -> calculatorService.division(1,0));
    }

}