package com.university.csv;

import com.university.auth.AuthService;
import com.university.core.Student;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        AuthService authService = new AuthService();
        if (!authService.authenticate("admin", "password")) {
            System.out.println("Authentication failed.");
            return;
        }
        TextImporter importer = new TextImporter();
        List<Student> students = importer.importFromTxt("students.txt");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
