package top.niunaijun.blackreflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import top.niunaijun.blackreflection.utils.ReflectorApi;

public class BlackReflectionConfig {

    public static ReflectorApi reflectorApi=null;

    public  static Field findField(Class<?> aClass, String name){
        if (reflectorApi!=null){
            reflectorApi.findField(aClass, name);
        }
        return null;
    }

    public static Method getDeclaredMethod(Class<?> clazz, String methodName, Class<?>... parameterTypes){
        if (reflectorApi!=null){
            reflectorApi.getDeclaredMethod(clazz, methodName, parameterTypes);
        }
        return null;
    }

}
