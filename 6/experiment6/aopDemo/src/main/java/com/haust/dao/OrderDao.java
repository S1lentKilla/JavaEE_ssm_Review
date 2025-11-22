package com.haust.dao;

public interface OrderDao {
    public void save();
    public void update();
    public void delete();
    public int find(int id);
}
