package ss9_dsa_list.arraylist.controller;

import ss9_dsa_list.arraylist.model.MyArrayList;

public class MainMyArrayList {
    public static class Student{
        private int id;
        private String name;

        public Student(){
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

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
    }

    public static void main(String[] args) {
        Student a = new Student(1,"Hoang");
        Student b = new Student(2,"Hoan");
        Student c = new Student(3,"Hoa");
        Student d = new Student(4,"Ho");
        Student e = new Student(5,"Ha");
        Student f = new Student(6,"Hoan2");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> newMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
        studentMyArrayList.add(f,2);

        for (int i = 0; i < studentMyArrayList.size(); i++) {
            Student student= (Student) studentMyArrayList.elements[i];
            System.out.print(student.getId());
            System.out.println(student.getName());
        }
        System.out.println(studentMyArrayList.get(2).getName());
        System.out.println(studentMyArrayList.indexOf(c));
        System.out.println(studentMyArrayList.contains(f));
        newMyArrayList = studentMyArrayList.clone();
        newMyArrayList.remove(3);
        newMyArrayList.clear();
        newMyArrayList.add(a);
        newMyArrayList.add(b,1);
        newMyArrayList.remove(1);
        for (int i = 0; i < newMyArrayList.size(); i++) {
            System.out.println(newMyArrayList.get(i).getName());
        }
    }

}
