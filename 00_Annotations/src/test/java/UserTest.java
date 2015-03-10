import org.junit.Assert;
import org.junit.Test;
// Подключить все методы: assertEquals
// import static org.junit.Assert.*;

/**
 *
 */
public class UserTest extends Assert {
    @Test
    public void testUser() {
        User user = new User();
        user.name = "Иван Иванович Иванов";

        Class userClass = user.getClass();
        TableName tableName = (TableName) userClass.getAnnotation(TableName.class);
        assertNotNull(tableName);
        assertEquals("users", tableName.value());
    }
}
