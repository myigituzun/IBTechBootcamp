package com.myigituzun.composition;

public class Test {
    public static void main(String[] args) {
        School schoolA = new School(1, "A Üniversitesi");

        Student student1 = new Student(1, "Yiğit Uzun", 75.4);
        student1.setSchool(schoolA);
        schoolA.getStudentList().add(student1);

        Student student2 = new Student(2, "Tuncay Cem Uzun", 72.9);
        student2.setSchool(schoolA);
        schoolA.getStudentList().add(student2);

        Student student3 = new Student(3, "Ertan Canyurt", 65.1);
        student3.setSchool(schoolA);
        schoolA.getStudentList().add(student3);

        System.out.println(schoolA.getSchoolId() + " " + schoolA.getSchoolName());
        for (Student student : schoolA.getStudentList()) {
            System.out.println("\t" + student.getStudentId() + " " + student.getStudentName() + " " + student.getAverageMark());
        }
    }
}
