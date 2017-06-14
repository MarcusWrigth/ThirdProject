package com.omsu.imit.thirdtask.balbenko;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ReflectionDemoTest {
    @Test
    public void searchTypeHuman() throws Exception {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Human human = new Human();
        arrayList.add(human);
        Student student = new Student("Имит");
        arrayList.add(student);
        int[] a = new int[5];
        arrayList.add(a);
        Assert.assertEquals(2, ReflectionDemo.searchTypeHuman(arrayList));
    }

    @Test
    public void getNameSuperClass() {
        Student student = new Student("IMIT");
        List<String> nameSuperclass = new ArrayList<String>();
        nameSuperclass.add("Student");
        nameSuperclass.add("Human");
        nameSuperclass.add("Object");

        Assert.assertEquals(nameSuperclass, ReflectionDemo.getNameSuperClass(student));
    }

    @Test
    public void getNameSuperClass2() {
        class A {}
        class B extends A {}
        class C extends B { public C(){} }
        C c = new C();
        ArrayList<String> res = ReflectionDemo.getNameSuperClass(c);
        ArrayList<String> list = new ArrayList<String>();
        list.add("C");
        list.add("B");
        list.add("A");
        list.add("Object");
        assertEquals(res,list);
    }


    //    @Test
//    public void getNamePublicMethod() {
//        ArrayList<String> arrayList = new ArrayList<String>();
//        arrayList.add("setFaculty");
//        arrayList.add("getFaculty");
//        arrayList.add("equals");
//        arrayList.add("hashCode");
//        arrayList.add("getName");
//        arrayList.add("setName");
//        arrayList.add("getMiddleName");
//        arrayList.add("getSurname");
//        arrayList.add("setYear");
//        arrayList.add("setSurname");
//        arrayList.add("getYear");
//        arrayList.add("setMiddleName");
//        arrayList.add("wait");
//        arrayList.add("wait");
//        arrayList.add("wait");
//        arrayList.add("toString");
//        arrayList.add("getClass");
//        arrayList.add("notify");
//        arrayList.add("notifyAll");
//
//        Student student = new Student("IMIT");
//        Assert.assertEquals(arrayList, ReflectionDemo.getNamePublicMethod(student));
//    }
}