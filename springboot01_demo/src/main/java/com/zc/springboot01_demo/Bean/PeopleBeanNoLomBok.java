package com.zc.springboot01_demo.Bean;

import java.util.Objects;

/**
 * 没有用lombok的实体
 *
 * @author JY
 * @date 2019/11/1 17:22
 */
public class PeopleBeanNoLomBok {
    private String peopleId;
    private String name;
    private String age;

    public PeopleBeanNoLomBok(){}

    public PeopleBeanNoLomBok(String peopleId, String name, String age) {
        this.peopleId = peopleId;
        this.name = name;
        this.age = age;
    }

    public String getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(String peopleId) {
        this.peopleId = peopleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PeopleBeanNoLomBok that = (PeopleBeanNoLomBok) o;
        return peopleId.equals(that.peopleId) &&
                name.equals(that.name) &&
                age.equals(that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peopleId, name, age);
    }

    @Override
    public String toString() {
        return "PeopleBeanNoLomBok{" +
                "peopleId='" + peopleId + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
