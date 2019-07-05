/*4. Create a Student class that represents the following information of a student: id, name, and age
all the member variables should be private .
a. Implement `getter and setter` .
b. Create a `StudentSorter` class that implements `Comparator interface` .
c. Write a class `Maintest` create Student class object(minimum 5)
d. Add these student object into a List of type Student .
e. Sort the list based on their age in decreasing order, for student having
same age, sort based on their name.
f. For students having same name and age, sort them according to their ID.*/

package com.stackroute.pe5;
import java.util.*;






    public class StudentComparator {
        private int id;
        private String name;
        private int age;

        //constructor
        public StudentComparator(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
	//getters and setters method is written

        public int getId() {

            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {

            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {

            this.age = age;
        }


    }

    class Studentsort implements Comparator<StudentComparator> {

//    Sort the list based on their age in decreasing order, for student having
//        same age, sort based on their name.
//        f. For students having same name and age, sort them according to their ID.

        @Override
        public int compare(StudentComparator student, StudentComparator t1) {
            if (student.getAge() == t1.getAge()) {
                if (student.getName().equals(t1.getName()))
                    return t1.getId() - student.getId();
                else
                    return t1.getName().compareTo(student.getName());
            } else {
                return t1.getAge() - student.getAge();
            }
        }
    }

