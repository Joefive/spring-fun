package com.sunrise.pojo;

import java.util.*;

/**
 * 普通属性
 */
public class Person {
    private String name;
    private int id;
    private int age;
    private Address address;
    private String[] book;
    private List<String> hobby;
    private Map<String,String> card;
    private Set<String> game;
    private String son;
    private Properties info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getBook() {
        return book;
    }

    public void setBook(String[] book) {
        this.book = book;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public Map<String, String> getCard() {
        return card;
    }

    public void setCard(Map<String, String> card) {
        this.card = card;
    }

    public Set<String> getGame() {
        return game;
    }

    public void setGame(Set<String> game) {
        this.game = game;
    }

    public String getSon() {
        return son;
    }

    public void setSon(String son) {
        this.son = son;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    public void make(){
        System.out.println("ID："+"姓名："+"年龄：");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", address=" + address.toString() +
                ", book=" + Arrays.toString(book) +
                ", hobby=" + hobby +
                ", card=" + card +
                ", game=" + game +
                ", son='" + son + '\'' +
                ", info=" + info +
                '}';
    }
}
