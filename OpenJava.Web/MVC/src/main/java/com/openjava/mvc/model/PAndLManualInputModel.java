package com.openjava.mvc.model;



public class PAndLManualInputModel {
    private int Id;
    private String Year;
    private String Month;
    private String Item;
    private double Value;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        Month = month;
    }

    public String getItem() {
        return Item;
    }

    public void setItem(String item) {
        Item = item;
    }

    public double getValue() {
        return Value;
    }

    public void setValue(double value) {
        Value = value;
    }
}
