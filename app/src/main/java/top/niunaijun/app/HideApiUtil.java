package top.niunaijun.app;

import android.os.Build;

import org.lsposed.hiddenapibypass.HiddenApiBypass;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

import top.niunaijun.blackreflection.utils.ReflectorApi;

public class HideApiUtil implements ReflectorApi {

    public  Field findField(Class<?> aClass,String name){
        if (name==null){
            return null;
        }
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.P) {
            List<Field> staticField = HiddenApiBypass.getStaticFields(aClass);
            for (Field field : staticField) {
                if (name.equals(field.getName())){
                    return field;
                }
            }
            List<Field> instanceFields = HiddenApiBypass.getInstanceFields(aClass);
            for (Field instanceField : instanceFields) {
                if (name.equals(instanceField.getName())){
                    return instanceField;
                }
            }
        }
        return null;
    }

    public  Method getDeclaredMethod( Class<?> clazz, String methodName,  Class<?>... parameterTypes){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            return HiddenApiBypass.getDeclaredMethod(clazz,methodName,parameterTypes);
        }
        return null;
    }
}
