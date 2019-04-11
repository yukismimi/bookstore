package cn.yukismimi.entity;

import org.apache.ibatis.type.Alias;

@Alias("bookClass")
public class BookClass {

  private int clazz;
  private int subClass;
  private String className;
  private String subClassName;


  public int getClazz() {
    return clazz;
  }

  public void setClazz(int clazz) {
    this.clazz = clazz;
  }

  public int getSubClass() {
    return subClass;
  }

  public void setSubClass(int subClass) {
    this.subClass = subClass;
  }


  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }


  public String getSubClassName() {
    return subClassName;
  }

  public void setSubClassName(String subClassName) {
    this.subClassName = subClassName;
  }

}
