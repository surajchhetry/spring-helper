package net.surajchhetry.springhelper;

import java.util.Set;
import net.surajchhetry.springhelper.annotation.Log;
import net.surajchhetry.springhelper.annotation.ValidateBean;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

/**
 *
 * @author surajchhetry
 */
@Component
@Aspect
public class ValidatorAspect {

    @Autowired
    private Validator validator;
    @Log
    private Logger logger;

    @Before(value = "execution(* *.*(..)) && @annotation(validateBean)", argNames = "validateBean")
    public void validate(JoinPoint joinPoint, ValidateBean bean) {
        logger.debug("Validating for  " + bean.bean().getCanonicalName());
        Object o = joinPoint.getArgs()[bean.paramIndex()];
        Set<ConstraintViolation<Object>> errors = this.validator.validate(o);

        StringBuilder builder = new StringBuilder();
        for (ConstraintViolation cv : errors) {
            logger.error(cv.getMessage());
            builder.append(cv.getMessage());
            builder.append(System.getProperty("line.separator"));
        }
        if (!errors.isEmpty()) {
            throw new IllegalArgumentException(builder.toString());
        }

    }
}
