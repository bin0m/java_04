<!-- doc.py -->
Утверждения
-----------
Проверка утверждения
``` java
        assert a > 10 : "a = " + a;
```

Должно быть сообщение: Exception in thread "main" java.lang.AssertionError: a = 9
Для включения нужен ключ VM: -ea
[src/main/java/AssertDemo.java](src/main/java/AssertDemo.java)

