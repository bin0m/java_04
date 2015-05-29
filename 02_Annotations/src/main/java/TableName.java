import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Объявление аннотации
// --------------------
// @Retention - служебная аннотация, которая
// задаёт область видимости аннотаций
@Retention(RetentionPolicy.RUNTIME)
public @interface TableName {
    // Значение "без имени" называется value()
    String value();
}
