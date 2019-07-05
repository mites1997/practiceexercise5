package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

import static org.junit.Assert.*;

public class StudentComparatorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void testStudent() {

        List<StudentComparator> students = new ArrayList<>();
        StudentComparator obj1 = new StudentComparator(1, "Ajay", 27);
        StudentComparator obj2 = new StudentComparator(2, "Sneha", 23);
        StudentComparator obj3 = new StudentComparator(3, "Simran", 37);
        StudentComparator obj4 = new StudentComparator(4, "Ajay", 22);
        StudentComparator obj5 = new StudentComparator(5, "Ajay", 29);
        StudentComparator obj6 = new StudentComparator(6, "Sneha", 22);
        students.add(obj1);
        students.add(obj2);
        students.add(obj3);
        students.add(obj4);
        students.add(obj5);
        students.add(obj6);


        Collections.sort(students,new Studentsort());



        String expected="[Student{id=3, name='Simran', age=37}, Student{id=5, name='Ajay', age=29}, Student{id=1, name='Ajay', age=27}, Student{id=2, name='Sneha', age=23}, Student{id=6, name='Sneha', age=22}, Student{id=4, name='Ajay', age=22}]";
        assertEquals(expected, students.toString());


    }
}