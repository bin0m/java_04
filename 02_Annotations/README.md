<!-- doc.py -->

Аннотация для столбца (поля) в базе данных
``` java
public @interface Column {
    String value();

    // Максимальное количество символов
    // По-умолчанию: 0
    int maxLen() default 0;

    // Свойства аннотаций могут быть
    // любых примитивных типов + String + enum
    boolean isPassword() default false;
}
```

[src/main/java/Column.java](src/main/java/Column.java)

Является ли поле первичным ключом?
``` java
@Retention(RetentionPolicy.RUNTIME)
public @interface PrimaryKey {
}
```

[src/main/java/PrimaryKey.java](src/main/java/PrimaryKey.java)

Объявление аннотации
--------------------
@Retention - служебная аннотация, которая
задаёт область видимости аннотаций
Значение "без имени" называется value()
[src/main/java/TableName.java](src/main/java/TableName.java)

Использование своих аннотаций
``` java
// users
@TableName("main_users")
public class User {

    @PrimaryKey
    @Column("id")
    public int id;

    @Column(value = "NAME_STR", maxLen = 20, isPassword = false)
    public String name;

    @Column(value = "password", isPassword = true)
    public String password;


    /**
     * Альтернативный способ получения имя таблицы
     *
     * @return имя таблицы
     */
    String tableName() {
        return "main_users";
    }
}
```

[src/main/java/User.java](src/main/java/User.java)

Подключить все методы: assertEquals
import static org.junit.Assert.*;
[src/test/java/UserTest.java](src/test/java/UserTest.java)

