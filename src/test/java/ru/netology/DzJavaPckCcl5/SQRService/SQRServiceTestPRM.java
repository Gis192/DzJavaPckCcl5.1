package ru.netology.DzJavaPckCcl5.SQRService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTestPRM {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.scv" )
    public void tets(int expected, int min, int max){
        SQRService service = new SQRService();
        int actual = service.calculate(min, max);
        Assertions.assertEquals(expected,actual);
    }
}
