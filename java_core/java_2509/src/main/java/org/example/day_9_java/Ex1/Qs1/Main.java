package org.example.day_9_java.Ex1.Qs1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Student> listStudent = new ArrayList<>();
    static void main(String[] args) {
        listStudent.add(new Student(1,"Dai"));
        listStudent.add(new Student(2,"Hai"));
        listStudent.add(new Student(3,"Phong"));
        listStudent.add(new Student(4,"Hung"));
        listStudent.add(new Student(4,"Dat"));
        listStudent.add(new Student(5,"Dai"));
        listStudent.add(new Student(6,"Dai"));
        listStudent.add(new Student(7,"Tung"));


        //a) In ra tổng số phần tử của students
        System.out.println("Tông Số phần Tử: " + listStudent.size());

        //b) Lấy phần tử thứ 4 của students
        System.out.println("Lấy phần tử thứ 4 của students: " + listStudent.get(3).toString());

        //c) In ra phần tử đầu và phần tử cuối của students
        System.out.println("Lấy phần tử đầu: " + listStudent.getFirst().toString());
        System.out.println("Lấy phần tử cuối: " + listStudent.getLast().toString());

        //d) Thêm 1 phần tử vào vị trí đầu của students
        listStudent.addFirst(new Student(8,"Son"));

        //e) Thêm 1 phần tử vào vị trí cuối của students
        listStudent.addLast(new Student(9,"Thinh"));

        //f) Đảo ngược vị trí của students
        List<Student> reversed = listStudent.reversed();

        //g) Tạo 1 method tìm kiếm student theo id
        getStudentByid(5).toString();

        //h) Tạo 1 method tìm kiếm student theo name
        getStudentBybName("Hai");

        //i) Tạo 1 method để in ra các student có trùng tên
        getStudentTrungTen();

        //j) Xóa name của student có id = 2;
        Student getStudentId2 = getStudentByid(2);
        getStudentId2.setName("");
        getStudentId2.toString();

        //k) Delete student có id = 5;
        listStudent.removeIf(std -> std.getId() == 5);

        //l) Tạo 1 ArrayList tên là studentCopies và add tất cả students vào studentCopies
        List<Student> studentCopies = new ArrayList<>(listStudent);
//        for (Student student : listStudent) {
//            studentCopies.add(new Student(student.getId(), student.getName()));
//        }

    }

    public static Student getStudentByid(int id) {
//        for (Student student: listStudent) {
//            if (student.getId() == id) {
//                System.out.println(student.toString());
//            }
//        }
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId() == id) {
                return listStudent.get(i);
            }
        }
        return null;
    }

    public static void getStudentBybName(String name) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getName().equals(name)) {
                System.out.println(listStudent.get(i).toString());
            }
        }
    }

    public static void getStudentTrungTen() {
        for (int i = 0; i < listStudent.size(); i++) {
            boolean key = false;
            for (int j = 0 ; j < listStudent.size(); j++) {
                if (i != j && listStudent.get(i).equals(listStudent.get(j))) {
                    key = true;
                    break;
                }
            }
            if (key) {
                System.out.println(listStudent.get(i).toString());
            }
        }
    }

}
