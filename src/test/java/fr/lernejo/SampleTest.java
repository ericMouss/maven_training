package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    private final Sample sample = new Sample();
    @ParameterizedTest
    @CsvSource({
        "3, 7, 10",
        "0, 3, 3"
    })
    void test1(int a, int b, int expectedR){
        int result = sample.op(Sample.Operation.ADD,a ,b);

        Assertions.assertThat(result).isEqualTo(expectedR);
    }
    /*
    @Test
    void op_throw_if_operation_is_null(){
        Assertions.assertThatExceptionOfType(NullPointerException.class)
            .isThrownBy(()-> sample.op(null, 1, 3));
    }*/

}
