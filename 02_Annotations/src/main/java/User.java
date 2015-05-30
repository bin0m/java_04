// Использование своих аннотаций
//-->
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
//<--
