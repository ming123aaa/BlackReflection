package top.niunaijun.blackreflection.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public interface ReflectorApi {
      Field findField(Class<?> aClass, String name);

      Method getDeclaredMethod(Class<?> clazz, String methodName, Class<?>... parameterTypes);
}
