package org.example.day_5_java.Ex1.Qs1;

import java.util.ArrayList;
import java.util.Scanner;

public class MyNew {
    static void main(String[] args) {
        ArrayList<New> listNew = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3.  Average rate\n");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (scanner.hasNextInt()) {
                if ( choice >= 1 && choice <= 4) {
                    switch (choice) {
                        case 1:
                            ArrayList<Integer> listDg = new ArrayList<>();


                            System.out.println("nhập title: ");
                            String title = scanner.nextLine();
                            System.out.println("nhập title: ");
                            String publishDate = scanner.nextLine();
                            System.out.println("nhập title: ");
                            String author = scanner.nextLine();
                            System.out.println("nhập title: ");
                            String content = scanner.nextLine();


                            System.out.println("Nhập vào 3 đánh giá");
                            System.out.println("Nhập vào 1 đánh giá");
                            int dg1 = scanner.nextInt();
                            listDg.add(dg1);
                            scanner.nextLine();
                            System.out.println("Nhập vào 2 đánh giá");
                            int dg2 = scanner.nextInt();
                            listDg.add(dg2);
                            scanner.nextLine();
                            System.out.println("Nhập vào 3 đánh giá");
                            int dg3 = scanner.nextInt();
                            listDg.add(dg3);
                            scanner.nextLine();

                            New createNew = new New(title, publishDate, author, content);
                            listNew.add(createNew);
                            break;
                        case 2:
                            System.out.println("View list news: \n");
                            for (New elem: listNew) {
                                elem.display();
                                System.out.println("View list news: \n");
                            }
                            break;
                        case 3:
                            for (New elem: listNew) {
                                elem.calculate();
                                elem.display();
                            }

                            break;
                        case 4:
                            return;
                    }
                } else System.out.println("Nhập số từ 1 đến 4");
            } else System.out.println("Nhập số từ 1 đến 4");
        }
    }
}
