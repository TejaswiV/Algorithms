package comparator;


import com.teju.algorithms.comparator.Employee;
import com.teju.algorithms.comparator.EmployeeSort;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class EmployeeSortTest {

    EmployeeSort sort;
    List<Employee> list;

    @Before
    public void setUp(){
        sort = new EmployeeSort();
        list = new ArrayList<>();
        list.add(new Employee(1,"Teju","V",4000.0));
        list.add(new Employee(2,"Kondal","M",8000.0));
        list.add(new Employee(3,"Chinni","k",5000.0));
        list.add(new Employee(4,"Nani","A",6000.0));
        list.add(new Employee(5,"Gundu","V",10000.0));
    }

    @Test
    public void testSortEmployeesByName(){
        sort.sortEmployeesByName(list);
        Assert.assertEquals("Chinni", list.get(0).getFirstname());

    }

    @Test
    public void testSortEmployeesBySalary(){
        sort.sortEmployeesBySalary(list);
        Assert.assertEquals(10000,list.get(0).getSalary(),0);

    }
}
