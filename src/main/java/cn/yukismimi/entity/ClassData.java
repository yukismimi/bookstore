package cn.yukismimi.entity;

import java.util.List;

public class ClassData {
    private int clazz;
    private String className;
    private List<BookClass> clzList;

    public int getClazz() {
        return clazz;
    }

    public void setClazz(int clazz) {
        this.clazz = clazz;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<BookClass> getClzList() {
        return clzList;
    }

    public void setClzList(List<BookClass> clzList) {
        this.clzList = clzList;
    }
}
