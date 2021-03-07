package pa.lab3.compulsory.classes;

import java.util.HashMap;
import java.util.Map;

public abstract class Location implements Comparable<Location> {
    private String name;
    private Map<Location, Integer> cost = new HashMap<>();

    public Location(String name, Map<Location, Integer> cost) {
        this.name = name;
        this.cost = cost;
    }

    public Location(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Location, Integer> getCost() {
        return cost;
    }

    public void setCost(Map<Location, Integer> cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public int compareTo(Location o) {
        if(this.name != null && o.name != null){
            return this.name.compareTo(o.name);
        }
        return 0;
    }
}
