package com.serializ;

import java.io.Serializable;

public class ChildSerialize extends ParentSerialize implements Serializable
{
  private String childName;

  public String getChildName()
  {
    return childName;
  }

  public void setChildName(String childName)
  {
    this.childName = childName;
  }
}
