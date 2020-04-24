import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    public void test1(){
        Carro c = new Carro();
        c.setMarca("BMW");
        assertEquals("BMW",c.getMarca());
    }

    @Test
    public void test2(){
        Carro c = new Carro();
        assertEquals(1.25,c.costChangeWheels(1));
    }

    @Test
    void test3(){
        Carro privateObject = new Carro();

        Field privateStringField = null;
        try {
            privateStringField = Carro.class.getDeclaredField("modelo");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        privateStringField.setAccessible(true);
        String fieldValue = null;
        try {
            fieldValue = (String) privateStringField.get(privateObject);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}