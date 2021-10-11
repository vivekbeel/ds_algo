package com.example.abc;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Employee { 
	 
    private Integer id;
    private String name; 

    public Employee(Integer id, String name) {
         this.id = id;
         this.name = name;
    }
    public Integer getId() {
         return id;
    }
    public void setId(Integer id) {
         this.id = id;
    }
    public String getName() {
         return name;
    }
    public void setName(String name) {
         this.name = name;
    }
    public String toString() {
         return this.name+":"+id;
    }
}

public class TreeMapExample {
	

	     public static void main(String[] args) { 
	 
	           Map<Employee, String> treeMap = new TreeMap<Employee, String>(new MyNameComp()); 
	 
	           treeMap.put(new Employee(10,  "Anil"), "one");
	           treeMap.put(new Employee(10,  "Mahesh"), "two");
	           treeMap.put(new Employee(10,  "John"), "three");
	           treeMap.put(new Employee(10,  "Anil"), "four");
	           System.out.println(treeMap.size());
	     }
}

class MyNameComp implements Comparator<Employee> {

    public int compare(Employee o1, Employee o2) {
           return o1.getName().compareTo(o2.getName());
    }

}


