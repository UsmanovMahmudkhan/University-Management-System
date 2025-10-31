package com.university.csv;

import com.university.core.Student;
import java.io.*;
import java.util.*;

public class TextImporter {
    public List<Student> importFromTxt(String path) throws IOException {
        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    Student s = new Student(parts[0].trim(), parts[1].trim(), parts[2].trim());
                    students.add(s);
                }
            }
        }
        return students;
    }
}
