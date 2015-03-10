Системы сборки Java
===================

ant
---
**ant** - утилита для автоматизации процесса сборки программного продукта. Является платформонезависимым аналогом утилиты make, где все команды записываются в XML-формате.
**Императивная** сборка проекта.

Пример **build.xml**:
``` xml
<?xml version="1.0"?>
<project default="build" basedir=".">
    <property name="name" value="AntBuildJar"/>
    <property name="src.dir" location="${basedir}/src"/>
    <property name="build" location="${basedir}/build"/>
    <property name="build.classes" location="${build}/classes"/>
    <path id="libs.dir">
	<fileset dir="lib" includes="**/*.jar"/>
    </path>
    <!-- Сборка приложения -->
    <target name="build" depends="clean" description="Builds the application">
        <!-- Создание директорий -->
        <mkdir dir="${build.classes}"/>

        <!-- Компиляция исходных файлов -->
        <javac srcdir="${src.dir}"
               destdir="${build.classes}"
               debug="false"
               deprecation="true"
               optimize="true" >
            <classpath refid="libs.dir"/>
        </javac>

        <!-- Копирование необходимых файлов -->
        <copy todir="${build.classes}">
            <fileset dir="${src.dir}" includes="**/*.*" excludes="**/*.java"/>
        </copy>

        <!-- Создание JAR-файла -->
        <jar jarfile="${build}/${name}.jar">
            <fileset dir="${build.classes}"/>
        </jar>
    </target>

    <!-- Очистка -->
    <target name="clean" description="Removes all temporary files">
        <!-- Удаление файлов -->
        <delete dir="${build.classes}"/>
    </target>
</project>
```

maven
-----
Фреймворк для автоматизации сборки проектов, специфицированных на XML-языке POM (Project Object Model).
Декларативная сборка проекта.

``` xml
<project>
  <!-- версия модели для POM-ов Maven 2.x всегда 4.0.0 -->
  <modelVersion>4.0.0</modelVersion>

  <!-- координаты проекта, то есть набор значений, который
       позволяет однозначно идентифицировать этот проект -->

  <groupId>com.mycompany.app</groupId>
  <artifactId>my-app</artifactId>
  <version>1.0</version>

  <!-- зависимости от библиотек -->

  <dependencies>
    <dependency>

      <!-- координаты необходимой библиотеки -->

      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>

      <!-- эта библиотека используется только для запуска и компилирования тестов -->

      <scope>test</scope>

    </dependency>
  </dependencies>
</project>
```

**Структура maven-проекта**
Корневой каталог проекта: файл **pom.xml** и все дальнейшие подкаталоги
* src: все исходные файлы
 * src/main: исходные файлы собственно для продукта
   * src/main/java: Java-исходный текст
   * src/main/resources: другие файлы, которые используются при компиляции или исполнении, например Properties-файлы
 * src/test: исходные файлы, необходимые для организации автоматического тестирования
   * src/test/java: JUnit-тест-задания для автоматического тестирования
* target: все создаваемые в процессе работы Мавена файлы
 * target/classes: компилированные Java-классы

gradle
------
Система автоматической сборки, построенная на принципах Apache Ant и Apache Maven, но предоставляющая DSL на языке Groovy вместо XML.

Внутренние классы. Параметризация. MVC, CRUD, DAO
=================================================

Внутренние классы (статические, нестатические, анонимные)
---------------------------------------------------------

Реализация анонимного маппера. Параметризация. Стирание типов. Ограничения
--------------------------------------------------------------------------

Слои приложения. MVC. CRUD. DAO
-------------------------------

Дополнительные примеры
----------------------
Калькулятор: git@github.com:levelp/JavaCalc.git

Домашнее задание
----------------
* Создать интерфейс DAO работы с моделью.
* Реализовать этот интерфейс через коллекции.

Литература:
-----------
* Структуры данных в картинках.
* Часто-задаваемые-на-собеседованиях-вопросы-по-классам-коллекций.
* Коллекции Java (Java Collections Framework)
* Пакет java.util


Модульное тестирование JUnit4
=============================

Аннотации JUnit4
----------------

Основная: @Test - помечаем все "тестовые" методы (каждый метод - тест)


Если в тестируемом коде мы ожимдаем исключение (исключение сообщает об ощибке),
то используем параметр expected
...
Пишем что-то в файл
@After
...
Внутренние классы Java
======================

Внутри классов Java можно объявять вложенные (внутренние классы).

Они бывают 3-х видов:
 * Статический внутренний класс (с ключевым словом static)
 * Внутренние классы - объявляются внутри основного класса (без слова static)
 * Анонимные (безымянные) классы - объявляются внутри методов основного класса

Вложенные классы в Java
-----------------------
notFinal++; // Ошибка компиляции
При определении анонимного класса применен полиморфизм - переменная listener
содержит экземпляр анонимного класса, реализующего существующий
интерфейс ActionListener
int getOuterField() {
return OuterClass.this.outerField; // Эта строка кода - ошибка компиляции
}
LocalInnerClass inner; // Ошибка компиляции: локальные классы тут не видны
Анонимный класс
``` java
        MyInterface myInterface = new MyInterface() {
            @Override
            public void myMethod() {
                System.out.println("InnerClassTest.myMethod");
            }
        };

        myInterface.myMethod();
```
Перебор (тупая проверка)
Проверка условий
Вывод решения
Динамика по количеству переменных
3 переменных
Using implicity navigation, this request come from /projects/show.xhtml and directs to /project/edit.xhtml
Using implicity navigation, this request come from /projects/show.xhtml and directs to /project/show.xhtml
could be null instead
Implicity navigation, this request come from /projects/edit.xhtml and directs to /project/show.xhtml
Implicity navigation, this request come from /projects/show.xhtml and directs to /project/showSprints.xhtml
Verify if the currentProject is out of date
If there is a new CurrentProject we need to update sprintList and set currentSprint to null and tell user he/she needs to select a Sprint
will call the postConstruct method.
will call the preDestroy method.
looking for bean in scope already created.
looking for custom scope in the session
if doesn't exists create and put it in the session
looking for mbean in taskScope
remove scope from the session
System.out.println("Leave counts :" + impl.leafCount(impl.getRoot(12)));
System.out.println("Leave counts :" + impl.leafSum(impl.getRoot(24)));
Left child rotate
Right child rotate
adjustTree function to perform rotations and zig - zig, zig-zag operations.
left child data match do simple left child rotate
zig-zig
zig-zag
right child data match do simple left child rotate
zig-zig
zig-zag
Link node and its all parent after zig-zig or zig-zag
set root to node.
The root is now that of the final tree
Check if any node exist or not.
item need to be added
item and root where it need to be added
Get the root value
Get the current root of the tree.
preorder traversal of the tree.
count the leaf in tree.
count leaf sum
Удаляем элемент 6
Удаляем элемент 4
Удаляем элемент 5
Получаем из интерфейса логин
String login = textField1.getText();
Получаем из интерфейса пароль
char[] password = passwordField1.getPassword();
write your code here
TODO
