package org.example.day_2;

public class baiTap {
    public static void main(String[] args) {
        // Question 1:
        //Kiểm tra account thứ 2
        //Nếu không có phòng ban (tức là department == null) thì sẽ in ra text "Nhân viên này chưa có phòng ban"
        //Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là …"
        String departmentId = null;
        if (departmentId == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là …");
        }

        //        Question 2:
        //        Kiểm tra account thứ 2
        //        Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
        //        Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên này là Java Fresher, C# Fresher"
        //        Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người quan trọng, tham gia nhiều group"
        //        Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là người hóng chuyện, tham gia tất cả các group"
        int countGroup = 1;
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
        String departmentId = null;
        String textDepartment = "";
        textDepartment = departmentId == null ? "Nhân viên này chưa có phòng ba" : "Phòng ban của nhân viên này là …";
        System.out.println(textDepartment);
//
//        Question 4:
//        Sử dụng toán tử ternary để làm yêu cầu sau:
//        Kiểm tra Position của account thứ 1
//        Nếu Position = Dev thì in ra text "Đây là Developer"
//        Nếu không phải thì in ra text "Người này không phải là Developer"
        String position = "dev";
        String textPosition = "";
        textPosition = position == "dev" ? "Đây là Developer" : "Người này không phải là Developer";
        System.out.println(textPosition);


//    Question 5:
//    Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//    Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//    Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//    Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//    Còn lại in ra "Nhóm có nhiều thành viên"
        int countAccount = 1;
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
        switch (position) {
            case "dev":
                System.out.println("Đây là Developer");
                break;
            default:
                System.out.println("Người này không phải là Developer");
                break;
        }



//        Question 8:
//        In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ
    }
}


































