package com.model;

import java.util.Date;

public class Department {
    private String departmentName;
    private Date createdOn;
    Department(String departmentName,Date createdOn)
    {
        super();
        this.departmentName = departmentName;
        this.createdOn = createdOn;
    }
//    public void setCreatedOn(Date createdOn)
//    {
//        this.createdOn = createdOn;
//    }
//    public Date getCreatedOn()
//    {
//        return  createdOn;
//    }
  public void init()
  {
      System.out.println("Init method of dept");
  }
  public  void destroy()
  {
      System.out.println("Destroy method of dept");

  }
    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", createdOn=" + createdOn +
                '}';
    }
}
