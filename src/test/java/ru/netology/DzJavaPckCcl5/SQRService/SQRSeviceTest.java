package ru.netology.DzJavaPckCcl5.SQRService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SQRSeviceTest {
    @Test
    public void testBelowBoundaryValues() {
        SQRService service = new SQRService();
        // ожидаемый ответ
        int expected = 0;
        //ввод границ диапазона
        int actual = service.calculate(0,99);
        // производим проверку
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testSetParametersInOrder(){
        SQRService service = new SQRService();
        // ожидаемый ответ
        int expected = 3;
        //ввод границ диапазона
        int actual = service.calculate(200,300);
        // производим проверку
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void testAboveBoundaryValues() {
        SQRService service = new SQRService();
        // ожидаемый ответ
        int expected = 0;
        //ввод границ диапазонA
        int actual = service.calculate(9802, 100_000);
        // производим проверку
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testFullBoundaryValues() {
        SQRService service = new SQRService();
        // ожидаемый ответ
        int expected = 90;
        //ввод границ диапазона
        int actual = service.calculate(100, 9801);
        // производим проверку
        Assertions.assertEquals(expected, actual);
    }
}
