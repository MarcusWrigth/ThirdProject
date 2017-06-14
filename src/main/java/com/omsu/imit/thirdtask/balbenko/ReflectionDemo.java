package com.omsu.imit.thirdtask.balbenko;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class ReflectionDemo {

    /*Дан список объектов произвольных типов.
    * Найдите количество элементов списка, которые являются объектами типа Human или его подтипами.*/
    public static int searchTypeHuman(ArrayList arrayList) {
        int counter = 0;
        for (int i = 0; i < arrayList.size(); i++){
            if (arrayList.get(i) instanceof Human){
                counter++;
            }
        }
        return counter;
    }

    /*Для объекта получить список имен его открытых методов. */
    public static ArrayList getNamePublicMethod(Object object){
        ArrayList<String> nameMethod = new ArrayList<String>();
        Method[] methods = object.getClass().getMethods();
        for (int i = 0; i < methods.length; i++){
            if (Modifier.isPublic(methods[i].getModifiers())){
                nameMethod.add(methods[i].getName());
            }
        }
        return nameMethod;
    }

    /*Для объекта получить список (в виде списка строк) имен всех его суперклассов до класса Object включительно.*/
    public static ArrayList getNameSuperClass(Object obj){
        ArrayList<String> nameSuperclass = new ArrayList<String>();
        Class objClass = obj.getClass();
        while (!(objClass.getName().equals("java.lang.Object"))){
            nameSuperclass.add(objClass.getSimpleName());
            objClass = objClass.getSuperclass();
        }
        nameSuperclass.add("Object");
        return nameSuperclass;
    }

}
