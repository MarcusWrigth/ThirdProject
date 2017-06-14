package com.omsu.imit.thirdtask.balbenko;

public class Human {
    private String name;
    private String surname;
    private String middleName;
    private String year;

    public Human() {
        this.name = null;
        this.surname = null;
        this.middleName = null;
        this.year = null;
    }

    public Human(Human human){
        this.name = human.getName();
        this.surname = human.getSurname();
        this.middleName = human.getMiddleName();
        this.year = human.getYear();
    }

    public Human(String name, String surname, String middleName, String year) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Human)) return false;

        Human human = (Human) object;

        if (name != null ? !name.equals(human.name) : human.name != null) return false;
        if (surname != null ? !surname.equals(human.surname) : human.surname != null) return false;
        if (middleName != null ? !middleName.equals(human.middleName) : human.middleName != null) return false;
        return year != null ? year.equals(human.year) : human.year == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        return result;
    }

}
