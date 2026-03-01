package week03.example01_IdGenerator;

import static org.junit.Assert.*;

import org.junit.Test;


public class IdGeneratorTest {

    IdGenerator generator = new IdGenerator();

    @Test
    public void test() {
        int id1 = generator.generateID();
        int id2 = generator.generateID();

        assertNotEquals(id1, id2);
    }
}