package com.omsu.imit.thirdtask.balbenko;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class ListDemoTest {
    @Test
    public void amountWord() throws Exception {
        List<String> stringList = new ArrayList<String>();
        stringList.add("Hello");
        stringList.add("Hi");
        stringList.add("What");
        stringList.add("His");
        stringList.add("Opsss");
        Assert.assertEquals(3, ListDemo.amountWord(stringList, 'H'));
    }

    @Test
    public void listNamesakes() {
        Human balbenko = new Human("Андрей", "Балбенко", "Николаевич", "18");

        List<Human> humanList = new ArrayList<Human>();
        Human human1 = new Human("Андрей", "Балбенко", "Николаевич", "18");
        humanList.add(human1);
        Human human2 = new Human("Александр", "Васильев", "Алексеевич", "18");
        humanList.add(human2);
        Human human3 = new Human("Виталий", "Рядов", "Витальевич", "18");
        humanList.add(human3);
        Human human4 = new Human("Денис", "Балбенко", "Николаевич", "18");
        humanList.add(human4);
        Human human5 = new Human("Максим", "Мясникян", "Осмягекянович", "18");
        humanList.add(human5);

        List<Human> resultHumanList = new ArrayList<Human>();
        resultHumanList.add(human1);
        resultHumanList.add(human4);
        Assert.assertEquals(resultHumanList, ListDemo.listNamesakes(humanList, balbenko));
    }

    @Test
    public void removeHuman() {
        List<Human> humanList = new ArrayList<Human>();
        Human human1 = new Human("Андрей", "Балбенко", "Николаевич", "18");
        humanList.add(human1);
        Human human2 = new Human("Александр", "Васильев", "Алексеевич", "18");
        humanList.add(human2);
        Human human3 = new Human("Виталий", "Рядов", "Витальевич", "18");
        humanList.add(human3);
        Human human4 = new Human("Денис", "Балбенко", "Николаевич", "18");
        humanList.add(human4);

        Human human5 = new Human("Максим", "Мясникян", "Осмягекянович", "18");
        humanList.add(human5);

        List<Human> resultHumanList = new ArrayList<Human>();
        Human human11 = new Human("Андрей", "Балбенко", "Николаевич", "18");
        resultHumanList.add(human11);
        Human human22 = new Human("Александр", "Васильев", "Алексеевич", "18");
        resultHumanList.add(human22);
        Human human33 = new Human("Виталий", "Рядов", "Витальевич", "18");
        resultHumanList.add(human33);
        Human human44 = new Human("Денис", "Балбенко", "Николаевич", "18");
        resultHumanList.add(human44);

        Assert.assertEquals(resultHumanList, ListDemo.removeHuman(humanList, human5));
    }

    @Test
    public void intersectingSet() {
        List<HashSet<Integer>> treeSetList = new ArrayList<HashSet<Integer>>();
        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(1); set1.add(3); set1.add(4);
        treeSetList.add(set1);

        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(2); set2.add(3); set2.add(5);
        treeSetList.add(set2);

        HashSet<Integer> set3 = new HashSet<Integer>();
        set3.add(1); set3.add(2); set3.add(5);
        treeSetList.add(set3);

        HashSet<Integer> set4 = new HashSet<Integer>();
        set4.add(1); set4.add(2); set4.add(3);
        treeSetList.add(set4);

        HashSet<Integer> set5 = new HashSet<Integer>();
        set5.add(1); set5.add(3); set5.add(5);
        treeSetList.add(set5);

        HashSet<Integer> otherSet = new HashSet<Integer>();
        otherSet.add(1);

        List<HashSet<Integer>> resultTreeSetList = new ArrayList<HashSet<Integer>>();
        HashSet<Integer> set22 = new HashSet<Integer>();
        set22.add(2); set22.add(3); set22.add(5);
        resultTreeSetList.add(set22);

        Assert.assertEquals(resultTreeSetList, ListDemo.intersectingSet(treeSetList, otherSet));

    }

    @Test
    public void setHumanId() {
        Map<Integer, Human> map = new HashMap();
        Human human = new Human("Андрей", "Балбенко", "Николаевич", "19");
        map.put(1, human);
        Human human1 = new Human("Александр", "Игнатович", "Витальевич", "21");
        map.put(2, human1);
        Human human2 = new Human("Константин", "Кононов", "Попоже", "18");
        map.put(3, human2);
        Human human3 = new Human("Александр", "Дубик", "Александрович", "15");
        map.put(4, human3);
        Human human4 = new Human("Шагоян", "Абрам", "Овсепович", "22");
        map.put(5, human4);

        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1); set.add(3);

        Set<Human> humanSet = new HashSet<Human>();
        Human humanFirst = new Human("Андрей", "Балбенко", "Николаевич", "19");
        humanSet.add(humanFirst);
        Human humanSecond = new Human("Константин", "Кононов", "Попоже", "18");
        humanSet.add(humanSecond);



        Assert.assertEquals(humanSet, ListDemo.setHumanId(map, set));
    }

    @Test
    public void yearHuman(){
        Map<Integer, Human> map = new HashMap();
        Human human = new Human("Андрей", "Балбенко", "Николаевич", "19");
        map.put(1, human);
        Human human1 = new Human("Александр", "Игнатович", "Витальевич", "14");
        map.put(2, human1);
        Human human2 = new Human("Константин", "Кононов", "Попоже", "18");
        map.put(3, human2);
        Human human3 = new Human("Александр", "Дубик", "Александрович", "15");
        map.put(4, human3);
        Human human4 = new Human("Шагоян", "Абрам", "Овсепович", "22");
        map.put(5, human4);

        List<Integer> idList = new ArrayList<Integer>();
        idList.add(1); idList.add(3); idList.add(5);

        Assert.assertEquals(idList, ListDemo.yearHuman(map));
    }
}