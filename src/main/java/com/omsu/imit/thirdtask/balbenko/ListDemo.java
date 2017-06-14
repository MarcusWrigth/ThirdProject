package com.omsu.imit.thirdtask.balbenko;

import java.util.*;

public class ListDemo {

    /*Вход: список строк и символ.
    * Выход: количество строк входного списка, у которых первый символ совпадает с заданным.*/
    public static int amountWord(List list, char value) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).toString().charAt(0) == value) {
                count++;
            }
        }
        return count;
    }

    /*Вход - список объектов типа Human и еще один объект типа Human.
    * Результат — список однофамильцев заданного человека среди людей из входного списка.*/
    public static List listNamesakes(List<Human> listHuman, Human human) {
        List<Human> list = new ArrayList<Human>();
        for (int i = 0; i < listHuman.size(); i++) {
            if (listHuman.get(i).getSurname().equals(human.getSurname())) {
                list.add(listHuman.get(i));
            }
        }
        return list;
    }

    /*Вход: список объектов типа Human и еще один объект типа Human.
    * Выход — копия входного списка, не содержащая выделенного человека. */
    public static List removeHuman(List<Human> humanList, Human human) {
        List<Human> list = new ArrayList<Human>();
        for (int i = 0; i < humanList.size(); i++) {
            list.add(humanList.get(i));
        }
        for (int i = 0; i < humanList.size(); i++) {
            if (list.get(i).equals(human)) {
                list.remove(i);
            }
        }
        return list;
    }

    /* Вход: список множеств целых чисел и еще одно множество.
    * Выход: список всех множеств входного списка, которые не пересекаются с заданным множеством.*/
    public static List intersectingSet(List<HashSet<Integer>> setList, Set set) {
        List<HashSet<Integer>> setList1 = new ArrayList<HashSet<Integer>>();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer buf = (Integer) iterator.next();
            for (int i = 0; i < setList.size(); i++) {
                if (setList.get(i).contains(buf)) {
                    setList.remove(i);
                    i--;
                }
            }
        }
        return setList;
    }

    /*Вход - отображение (Map) целочисленных идентификаторов в объекты типа Human и множество целых чисел.
    * Результат — множество людей, идентификаторы которых содержатся во входном множестве.*/
    public static Set setHumanId(Map<Integer, Human> map, Set set) {
        Set<Human> idSet = new HashSet<Human>();
        Iterator iteratorSet = set.iterator();
        List<Integer> longList = new ArrayList<Integer>(map.keySet());
        while (iteratorSet.hasNext()) {
            Integer bufSet = (Integer) iteratorSet.next();
            for (int i = 0; i < longList.size(); i++) {
                Integer it = longList.get(i);
                if ((bufSet.equals(it))) {
                    idSet.add(map.get(bufSet));
                }
            }
        }
        return idSet;
    }

    /*Вход - то же отображение
    * Выход - список людей, чей возраст не менее 18 лет*/
    public static List yearHuman(Map<Integer, Human> map){
        List<Integer> listHuman = new ArrayList<Integer>();
        Iterator<Map.Entry<Integer, Human>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<Integer, Human> bufHuman = it.next();
            Integer id = Integer.parseInt(bufHuman.getValue().getYear());
            if (id >= 18){
                listHuman.add(bufHuman.getKey());
            }
        }
        return listHuman;
    }


}
