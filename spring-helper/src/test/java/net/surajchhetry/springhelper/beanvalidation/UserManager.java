package net.surajchhetry.springhelper.beanvalidation;

import net.surajchhetry.springhelper.annotation.Log;
import net.surajchhetry.springhelper.annotation.ValidateBean;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

/**
 *
 * @author surajchhetry
 */
@Component
public class UserManager implements UserManagerService {

    @Log
    private Logger logger;
    
    @Override
    @ValidateBean(bean = User.class)
    public void addUser(User user) {
        logger.info("Adding user");
        user.setId(20);
    }
}
