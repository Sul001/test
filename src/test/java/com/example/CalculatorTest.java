package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    @DisplayName("Тест для сложения")
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals("Ошибка сложения: 2 + 3 должно быть равно 5", 5, calculator.add(2,3));
    }

    @Test
    @DisplayName("Тест для вычитания")
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals("Ошибка вычитания: 3 - 2 должно быть равно 1", 1, calculator.subtract(3, 2));
    }

    @Test
    @DisplayName("Тест для умножения")
    public void tro(){
        Calculator calculator = new Calculator();
        assertEquals("Ошибка умножения: 3 * 2 должно быть равно 6", 6, calculator.tro(3, 2));
    }
}