package ss9_dsa_list.linkedlist.controller;

import ss9_dsa_list.linkedlist.model.MyLinkedList;

public class MainMyLinkedList {
    public static void main(String[] args) {
        class Student{
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
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1,"Hoang");
        Student student2 = new Student(2,"Hoan");
        Student student3 = new Student(3,"Hoa");
        Student student4 = new Student(4,"Ho");
        
        myLinkedList.addFirst(student2);
        myLinkedList.addFirst(student1);
        myLinkedList.addLast(student3);
        myLinkedList.addLast(student4);
//        myLinkedList.remove(3);

        for (int i = 0; i < myLinkedList.size(); i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.print(((Student) myLinkedList.get(i)).getId());
            System.out.println(((Student) myLinkedList.get(i)).getName());

        }
        System.out.println(myLinkedList.constrains(student3));
        System.out.println(myLinkedList.indexOf(student3));
    }
}
