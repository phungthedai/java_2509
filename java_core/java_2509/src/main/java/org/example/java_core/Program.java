package org.example.java_core;

import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main() {
        // tạo tạo department
        Department depSale = new Department();
        depSale.departmentId = 1;
        depSale.departmentName = "Sale";

        Department depMarketing = new Department();
        depMarketing.departmentId = 2;
        depMarketing.departmentName = "Marketing";

        Department depDev = new Department();
        depDev.departmentId = 3;
        depDev.departmentName = "Dev";

        // tạo position
        Position posDev = new Position();
        posDev.positionId = 1;
        posDev.positionName =  NamePosition.DEV;

        Position posTest = new Position();
        posTest.positionId = 2;
        posTest.positionName = NamePosition.TEST;

        Position posPm = new Position();
        posPm.positionId = 3;
        posPm.positionName = NamePosition.PM;

        // tạo account
        Account daiPhung = new Account();
        daiPhung.accountID = 1;
        daiPhung.fullName = "Phùng Thế Đại";
        daiPhung.departmentId = depDev;
        daiPhung.positionId = posDev;

        Account vanA = new Account();
        vanA.accountID = 2;
        vanA.fullName = "Trần Văn A";
        vanA.departmentId = depMarketing;
        vanA.positionId = posTest;

        Account thiB = new Account();
        thiB.accountID = 3;
        thiB.fullName = "Trần Thị B";
        thiB.departmentId = depSale;
        thiB.positionId = posPm;

        // tạo Group
        Group groupDev = new Group();
        groupDev.groupId = 1;
        groupDev.groupName = "Dev Freshers";
        groupDev.creatorId = daiPhung;

        Group groupSale = new Group();
        groupSale.groupId = 2;
        groupSale.groupName = "Sale Freshers";
        groupSale.creatorId = vanA;

        Group groupPm = new Group();
        groupPm.groupId = 3;
        groupPm.groupName = "Pm Freshers";
        groupPm.creatorId = thiB;

        // tạo group account
        GroupAccount groupAccountDev = new GroupAccount();
        groupAccountDev.groupId = groupDev;
        groupAccountDev.accountId = new Account[] { daiPhung, vanA, thiB};

        GroupAccount groupAccountSale = new GroupAccount();
        groupAccountSale.groupId = groupSale;
        groupAccountSale.accountId = new Account[] { daiPhung, vanA, thiB};

        GroupAccount groupAccountPm = new GroupAccount();
        groupAccountPm.groupId = groupPm;
        groupAccountPm.accountId = new Account[] { daiPhung, vanA, thiB};

        // tạo type question
        TypeQuestion typeEssay = new TypeQuestion();
        typeEssay.typeId = 1;
        typeEssay.typeName = NameTypeQuestion.ESSAY;

        TypeQuestion typeMultipleChoice = new TypeQuestion();
        typeMultipleChoice.typeId = 2;
        typeMultipleChoice.typeName = NameTypeQuestion.MULTIPLE_CHOICE;


        // category question
        CategoryQuestion categoryJava = new CategoryQuestion();
        categoryJava.categoryId = 1;
        categoryJava.categoryName = "Java";

        CategoryQuestion categorySQL = new CategoryQuestion();
        categorySQL.categoryId = 2;
        categorySQL.categoryName = "SQL";

        CategoryQuestion categoryHtml = new CategoryQuestion();
        categoryHtml.categoryId = 3;
        categoryHtml.categoryName = "Html";

        Question q1 = new Question();
        q1.questionId = 1;
        q1.content = "Java là gì?";
        q1.categoryId = categoryJava;
        q1.typeId = typeEssay;

        Question q2 = new Question();
        q2.questionId = 2;
        q2.content = "SQL dùng làm gì?";
        q2.categoryId = categorySQL;
        q2.typeId = typeMultipleChoice;

        Question q3 = new Question();
        q3.questionId = 3;
        q3.content = "Html dùng làm gì?";
        q3.categoryId = categoryHtml;
        q3.typeId = typeEssay;

        // Answer
        Answer answerQ1 = new Answer();
        answerQ1.answerId = 1;
        answerQ1.content = "Là Ngôn Ngữ Lập Trình";
        answerQ1.questionId = q1;
        answerQ1.isCorrect = true;

        Answer answerQ2 = new Answer();
        answerQ2.answerId = 2;
        answerQ2.content = "Dùng để tạo giao diện";
        answerQ2.questionId = q2;
        answerQ2.isCorrect = false;

        Answer answerQ3 = new Answer();
        answerQ3.answerId = 3;
        answerQ3.content = "Dùng để tạo giao diện";
        answerQ3.questionId = q3;
        answerQ3.isCorrect = true;

        // Exam
        Exam exam1 = new Exam();
        exam1.examId = 1;
        exam1.title = "exam 1";
        exam1.categoryId = categoryJava;
        exam1.creatorId = daiPhung;

        Exam exam2 = new Exam();
        exam2.examId = 1;
        exam2.title = "exam 2";
        exam2.categoryId = categorySQL;
        exam2.creatorId = thiB;

        Exam exam3 = new Exam();
        exam3.examId = 1;
        exam3.title = "exam 3";
        exam3.categoryId = categoryHtml;
        exam3.creatorId = vanA;

        // Exam Question
        ExamQuestion examQuestion1 = new ExamQuestion();
        examQuestion1.examId = exam1;
        examQuestion1.questionId = q1;

        ExamQuestion examQuestion2 = new ExamQuestion();
        examQuestion2.examId = exam2;
        examQuestion2.questionId = q2;

        ExamQuestion examQuestion3 = new ExamQuestion();
        examQuestion3.examId = exam3;
        examQuestion3.questionId = q3;


        // Question 1:
        //Kiểm tra account thứ 2
        //Nếu không có phòng ban (tức là department == null) thì sẽ in ra text "Nhân viên này chưa có phòng ban"
        //Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là …"
        Account[] arrAccount = new Account[] {daiPhung, thiB, vanA};
        if (arrAccount[2].departmentId == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là: " + arrAccount[2].departmentId.departmentName);
        }

        //        Question 2:
        //        Kiểm tra account thứ 2
        //        Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
        //        Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên này là Java Fresher, C# Fresher"
        //        Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người quan trọng, tham gia nhiều group"
        //        Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là người hóng chuyện, tham gia tất cả các group"
        GroupAccount[] arrGroupAcc = new GroupAccount[] {groupAccountPm, groupAccountDev, groupAccountSale};
        int countGroup = 0;
        for (GroupAccount groupAccount : arrGroupAcc) {
            for (Account account: groupAccount.accountId) {
                if (account.accountID == arrAccount[2].accountID) {
                    countGroup += 1;
                }
            }
        }
        if (countGroup == 0) {
            System.out.println("Nhân viên này chưa có group");
        } else if (countGroup == 1 || countGroup == 2) {
            System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
        } else if (countGroup == 3){
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        } else {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }

        //    Question 3:
        //    Sử dụng toán tử ternary để làm Question 1
        String textDepartment = "";
        textDepartment = arrAccount[2].departmentId == null ? "Nhân viên này chưa có phòng ba" : "Phòng ban của nhân viên này là …";
        System.out.println(textDepartment);
//
//        Question 4:
//        Sử dụng toán tử ternary để làm yêu cầu sau:
//        Kiểm tra Position của account thứ 1
//        Nếu Position = Dev thì in ra text "Đây là Developer"
//        Nếu không phải thì in ra text "Người này không phải là Developer"
        String textPosition = "";
        textPosition = arrAccount[1].positionId.positionName == NamePosition.DEV ? "Đây là Developer" : "Người này không phải là Developer";
        System.out.println(textPosition);


//    Question 5:
//    Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//    Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//    Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//    Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//    Còn lại in ra "Nhóm có nhiều thành viên"
        int countAccount = 0;
        for (int i = 0; i < arrGroupAcc.length; i++) {
            if (arrGroupAcc[i].groupId.groupId == 1) {
                countAccount = arrGroupAcc[i].accountId.length;
                break;
            }
        }
        switch (countAccount) {
            case 1:
                System.out.println("Nhóm có một thành viên");
                break;
            case 2:
                System.out.println("Nhóm có hai thành viên");
                break;
            case 3:
                System.out.println("Nhóm có ba thành viên");
                break;
            default:
                System.out.println("Nhóm có nhiều thành viên");
                break;
        }


//        Question 6:
//        Sử dụng switch case để làm lại Question 2
        switch (countGroup) {
            case 1, 2:
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                break;
            case 3:
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                break;
            default:
                System.out.println("Nhân viên này chưa có group");
                break;
        }

//        Question 7:
//        Sử dụng switch case để làm lại Question 4
        switch (arrAccount[1].positionId.positionName) {
            case NamePosition.DEV:
                System.out.println("Đây là Developer");
                break;
            default:
                System.out.println("Người này không phải là Developer");
                break;
        }


        //        Question 8:
        //        In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ
        for (Account account: arrAccount) {
            System.out.println("email: " + account.email);
            System.out.println("full name: " + account.fullName);
            System.out.println("department: " + account.departmentId.departmentName);
        }


//        Question 9:
//        In ra thông tin các phòng ban bao gồm: id và name
        Department[] arrDepartment = new Department[] {depDev, depMarketing, depSale};
        for (Department department: arrDepartment) {
            System.out.println("id: " + department.departmentId);
            System.out.println("name: " + department.departmentName);
        }


//        Question 10:
//        In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//        họ theo định dạng như sau:
//        Thông tin account thứ 1 là:
//        Email: NguyenVanA@gmail.com
//        Full name: Nguyễn Văn A
//        Phòng ban: Sale
//        Thông tin account thứ 2 là:
//        Email: NguyenVanB@gmail.com
//        Full name: Nguyễn Văn B
//        Phòng ban: Marketting
        for (int i = 0; i< arrAccount.length; i++) {
            System.out.println("thông tin acccount thứ " + i + 1 + "là:");
            System.out.println("Email: " + arrAccount[i].email);
            System.out.println("Full name: " + arrAccount[i].fullName);
            System.out.println("Phòng ban: " + arrAccount[i].departmentId.departmentName);
        }


//        Question 11:
//        In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
//        Thông tin department thứ 1 là:
//        Id: 1
//        Name: Sale
//        Thông tin department thứ 2 là:
//        Id: 2
//        Name: Marketing
        for (int i = 0; i< arrDepartment.length; i++) {
            System.out.println("thông tin department thứ " + i + 1 + "là:");
            System.out.println("Id: " + arrDepartment[i].departmentId);
            System.out.println("Name: " + arrDepartment[i].departmentName);
        }

//        Question 12:
//        Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
        for (int i = 0; i< arrAccount.length; i++) {
            if (i > 1) break;
            System.out.println("thông tin acccount thứ " + i + 1 + "là:");
            System.out.println("Email: " + arrAccount[i].email);
            System.out.println("Full name: " + arrAccount[i].fullName);
            System.out.println("Phòng ban: " + arrAccount[i].departmentId.departmentName);
        }
//        Question 13:
//        In ra thông tin tất cả các account ngoại trừ account thứ 2
        for (int i = 0; i< arrAccount.length; i++) {
            if (i == 1) continue;
            System.out.println("thông tin acccount thứ " + i + 1 + "là:");
            System.out.println("Email: " + arrAccount[i].email);
            System.out.println("Full name: " + arrAccount[i].fullName);
            System.out.println("Phòng ban: " + arrAccount[i].departmentId.departmentName);
        }
//        Question 14:
//        In ra thông tin tất cả các account có id < 4
        for (int i = 0; i< arrAccount.length; i++) {
            if (arrAccount[i].accountID < 4) {
                System.out.println("thông tin acccount thứ " + i + 1 + "là:");
                System.out.println("Email: " + arrAccount[i].email);
                System.out.println("Full name: " + arrAccount[i].fullName);
                System.out.println("Phòng ban: " + arrAccount[i].departmentId.departmentName);
            }
        }

//        Question 15:
//        In ra các số chẵn nhỏ hơn hoặc bằng 20
        for (int i = 0; i <= 20; i++) {
            if (i%2 == 0) {

                System.out.println(i);
            }
        }



//        Question 16:
//        Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với
//        lệnh break, continue
        int i = 0;
        while (arrAccount[i].accountID < 4 ) {
            if (i == 1) continue;
            if (i == 2) break;
            System.out.println("thông tin acccount thứ " + i + 1 + "là:");
            System.out.println("Email: " + arrAccount[i].email);
            System.out.println("Full name: " + arrAccount[i].fullName);
            System.out.println("Phòng ban: " + arrAccount[i].departmentId.departmentName);
            i++;
        }

//
//
//        Question 17:
//        Làm lại các Question ở phần FOR bằng cách sử dụng DO-WHILE kết hợp với
//        lệnh break, continue

        int x = 0;
        do {
            if (i == 1) continue;
            if (i == 2) break;
            System.out.println("thông tin acccount thứ " + i + 1 + "là:");
            System.out.println("Email: " + arrAccount[i].email);
            System.out.println("Full name: " + arrAccount[i].fullName);
            System.out.println("Phòng ban: " + arrAccount[i].departmentId.departmentName);
        } while (x <= 2);



//        Question 1:
//        In ngẫu nhiên ra 1 số nguyên
        Random random = new Random();
        int z = random.nextInt();
        System.out.println("số random" + z);


//        Question 2:
//        In ngẫu nhiên ra 1 số thực
        double v = Math.random();
        System.out.println(v);

//        Question 3:
//        Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên ra tên của 1 bạn
        int indexRandom = random.nextInt(arrAccount.length);
        System.out.println("Tên bạn ngẫu nhiên: " + arrAccount[indexRandom].fullName);


        getDateExam(exam1.createDate);
        Exam[] arrExam = new Exam[]{exam1, exam2, exam3};
        for (Exam exam : arrExam) {
            System.out.println(printfDateTime(exam));
        }

        inThongTinAccount(arrAccount);
    }

//        Question 1:
//        In ra thông tin Exam thứ 1 và property create date sẽ được format theo định
//        dạng vietnamese
     public static void getDateExam(String createDate) {
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println(simpleDateFormat.format(createDate));
    }

//
//
//        Question 2:
//        In ra thông tin: Exam đã tạo ngày nào theo định dạng
//        Năm – tháng – ngày – giờ – phút – giây
    public static String printfDateTime (Exam exam) {
        String pattern = "yyyy-MM-dd-hh-mm-ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(exam.createDate);
    }

//    Question 1:
//    Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình.
    public static void inputThreeNumber () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất:");
        int so1 = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai:");
        int so2 = scanner.nextInt();
        System.out.println("Nhập vào số thứ ba:");
        int so3 = scanner.nextInt();
    }
//    Question 2:
//    Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình.
    public static void nhapHaiSoThuc () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thực thứ nhất:");
        float so1 = scanner.nextFloat();
        System.out.println("Nhập vào số thực thứ hai:");
        float so2 = scanner.nextFloat();
    }
//    Question 3:
//    Viết lệnh cho phép người dùng nhập họ và tên.
    public static void nhapHoTen () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ và tên:");
        String so1 = scanner.nextLine();
    }
//    Question 4:
//    Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ.
    public static void nhapNgaySinhNhat  () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ngày sinh nhật:");
        String so1 = scanner.nextLine();
    }

//    Question 1:
//    Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10
    public static void soChanNguyenDuong  () {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
//    Question 2:
//    Tạo method để in thông tin các account
    public static void inThongTinAccount (Account[] accounts) {
        for (Account account : accounts) {
            System.out.println("ID: " + account.accountID);
            System.out.println("Full name: " + account.fullName);
            System.out.println("user name: " + account.userName);
            System.out.println("Email: " + account.email);
            System.out.println("Departnemt: " + account.departmentId);
            System.out.println("Group: " + account.groupId);
            System.out.println("position: " + account.positionId);
            System.out.println("Create date: " + account.createDate);
        }
    }
//    Question 3:
//    Tạo method để in ra các số nguyên dương nhỏ hơn 1
    public static void soNguyenDuong  () {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}




























