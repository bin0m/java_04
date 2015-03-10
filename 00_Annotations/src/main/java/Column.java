/**
 *
 */
public @interface Column {
    String value();

    /**
     * Максимальное количество символов
     */
    int maxLen() default 0;

    boolean isPassword() default false;
}
