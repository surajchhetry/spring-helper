package net.surajchhetry.springhelper.beanvalidation;

import net.surajchhetry.springhelper.BaseTest;
import org.springframework.beans.factory.annotation.Autowired;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author surajchhetry
 */
public class BeanValidationTest extends BaseTest {

    @Autowired
    UserManagerService manager;

    public BeanValidationTest() {
    }

    @Test(expectedExceptions = {IllegalArgumentException.class})
    public void notNullTest() {
        User u = new User();
        this.manager.addUser(u);
    }

    @Test
    public void addUserTest() {
        User u = new User("test", "test", 20);
        this.manager.addUser(u);
        assertEquals(u.getId(), 20);
    }
}