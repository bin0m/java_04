import java.util.Random;

// Утверждения
// -----------
public class AssertDemo {

    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(10);
        System.out.println("a = " + a);
        // Проверка утверждения
        //-->
        assert a > 10 : "a = " + a;
        //<--
        // Должно быть сообщение: Exception in thread "main" java.lang.AssertionError: a = 9
        // Для включения нужен ключ VM: -ea
    }
}
