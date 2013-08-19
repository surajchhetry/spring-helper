package net.surajchhetry.springhelper;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author suraj
 */
public class BeanHelper {

    public static boolean isGetter(Method method) {
        if (!method.getName().startsWith("get")) {
            return false;
        }
        if (method.getParameterTypes().length != 0) {
            return false;
        }
        if (void.class.equals(method.getReturnType())) {
            return false;
        }
        return true;
    }

    public static String getFieldName(Method method) {
        if (isGetter(method)) {
            return method.getName().substring(3);
        }
        return "";

    }

    public static boolean isReturnTypePrimitive(Method method) {
        return method.getReturnType().isPrimitive();
    }

    public static boolean isCollectionReturnType(Method method) {
        return Collections.class.isAssignableFrom(method.getReturnType());
    }

    public static Object getFiledValue(String filedName, Object obj) {
        try {
            Field field = obj.getClass().getDeclaredField(filedName);
            field.setAccessible(true);
            return field.get(obj);
        } catch (NoSuchFieldException ex) {
            Logger.getLogger(BeanHelper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(BeanHelper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(BeanHelper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(BeanHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
