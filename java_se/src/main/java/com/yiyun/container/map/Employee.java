package com.yiyun.container.map;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Map;
import java.util.TreeMap;

@ToString
@AllArgsConstructor
public class Employee implements Comparable<Employee>{
    private String name;
    private double salary;

    @Override
    public int compareTo(Employee o) {

        if (this.salary<o.salary) {
            return -1;
        } else if (this.salary>o.salary){
            return 1;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("yi1yun", 10000);
        Employee employee2 = new Employee("yi2yun", 300);
        Employee employee3 = new Employee( "yi3yun", 5200);
        Map<Employee, String> treeMap = new TreeMap<>();

        treeMap.put(employee1,"yi1yun");
        treeMap.put(employee2,"yi2yun");
        treeMap.put(employee3,"yi3yun");
        for (Employee e:treeMap.keySet()) {
            System.out.println(e+"----"+treeMap.get(e));
        }
    }
}
