package com.example.phonebook;

class People {
    String name;
    String number;
    int faceNum;

    public People(String name, String number, int faceNum) {
        this.name = name;
        this.number = number;
        this.faceNum = faceNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getFaceNum() {
        return faceNum;
    }

    public void setFaceNum(int faceNum) {
        this.faceNum = faceNum;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", faceNum=" + faceNum +
                '}';
    }
}
