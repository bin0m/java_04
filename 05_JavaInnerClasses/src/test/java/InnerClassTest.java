import org.junit.Test;

/**
 * Тесты на демонстрацию работы с внутренними классами
 */
public class InnerClassTest {

    @Test
    public void testAnonymClasses() {

        // Анонимный класс
        //-->
        MyInterface myInterface = new MyInterface() {
            @Override
            public void myMethod() {
                System.out.println("InnerClassTest.myMethod");
            }
        };

        myInterface.myMethod();
        //<--
    }

    /**
     * Внутренний интерфейс
     */
    interface MyInterface {
        void myMethod();
    }
}
