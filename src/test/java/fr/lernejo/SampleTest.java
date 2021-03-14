package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    private final Sample sample = new Sample();
    @Test
    void test1(){
        int result = sample.op(Sample.Operation.ADD, 7, 3);

        Assertions.assertThat(result).isEqualTo(12);
        if(result != 12){
            throw new AssertionFailedError(result + " != 12");
        }
    }
}
