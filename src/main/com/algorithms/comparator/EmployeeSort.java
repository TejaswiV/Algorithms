package com.algorithms.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSort {

    public void sortEmployeesByName(List<Employee> employees){

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if(e1.getFirstname().equals(e2.getFirstname())){
                    return e1.getId() - e2.getId();
                }
                return e1.getFirstname().compareTo(e2.getFirstname());
            }
        });
    }


    public void sortEmployeesBySalary(List<Employee> employees){
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if(e1.getSalary() == e2.getSalary()){
                    return e1.getFirstname().compareTo(e2.getFirstname());
                }else if(e2.getSalary() < e1.getSalary()){
                    return -1;
                }else
                    return 1;
            }
        });
    }
}
