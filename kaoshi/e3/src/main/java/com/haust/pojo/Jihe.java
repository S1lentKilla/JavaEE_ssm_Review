package com.haust.pojo;

import java.util.*;

public class Jihe {
    private List<String> lists;
    private Integer[] arrs;
    private Set<String> sets;
    private Map<String, String> maps;
    private Properties props;

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public Integer[] getArrs() {
        return arrs;
    }

    public void setArrs(Integer[] arrs) {
        this.arrs = arrs;
    }

    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "Jihe{" +
                "lists=" + lists +
                ", arrs=" + Arrays.toString(arrs) +
                ", sets=" + sets +
                ", maps=" + maps +
                ", props=" + props +
                '}';
    }
}
