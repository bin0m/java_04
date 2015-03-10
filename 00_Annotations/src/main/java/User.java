/**
 *
 */
// users
@TableName("main_users")
public class User {

    @PrimaryKey
    @Column("id")
    public int id;

    @Column(value = "name", maxLen = 20, isPassword = false)
    public String name;


//    String tableName(){
//
//    }

}
