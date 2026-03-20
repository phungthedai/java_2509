package org.example.java_core;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class day_3 {
    public static void main() {
        Account account1 = new Account();
        account1.accountID = 1;
        account1.fullName = "qwe";

        Account account2 = new Account();
        account2.accountID = 1;
        account2.fullName = "qwe";

        System.out.println(account1.equals(account2));



        Exam exam1 = new Exam();
        exam1.examId = 1;
        exam1.title = "123123";
        Exam exam2 = new Exam();

        exam2.examId = 1;
        exam2.title = "123123";
        System.out.println(exam1.equals(exam2));
    }
//    Question 1:
//    Khai báo 2 số lương có kiểu dữ liệu là float.
//    Khởi tạo Lương của Account 1 là 5240.5 $
//    Khởi tạo Lương của Account 2 là 10970.055$
//    Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
//    Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra
    public static void lamTronLuong() {
        float luongAccount1 = 5240.5f;
        float luongAccount2 = 10970.055f;
        int lamTronLuong1 = (int) luongAccount1;
        int lamTronLuong2 = (int) luongAccount2;
        System.out.println("luong lam tron account 1: " + lamTronLuong1);
        System.out.println("luong lam tron account 2: " + lamTronLuong2);
    }
//    Question 1:
//    Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
//            ∙ Email: "Email 1"
//            ∙ Username: "User name 1"
//            ∙ FullName: "Full name 1"
//            ∙ CreateDate: now
    public static void createAccount() {
        Account[] accounts = new Account[5];
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        for (int i = 0; i < accounts.length; i++) {
            Date date = new Date();
            accounts[i].accountID = i;
            accounts[i].email = "Email " + i;
            accounts[i].userName = "User name " + i;
            accounts[i].fullName = "Full name " + i;
            accounts[i].createDate = simpleDateFormat.format(date);
        }
    }
//    Question 1:
//    Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
//    Sau đó convert lương ra float và hiển thị lương lên màn hình (với số float có 2 số sau dấu thập phân).
    public static void convertLuong() {
        Integer luong = 5000;
        float convert = (float) luong;
        System.out.printf("luong: %.2f", convert);

    }
//    Question 2:
//    Khai báo 1 String có value = "1234567"
//    Hãy convert String đó ra số int
    public static void convertString() {
        String string = "1234567";
        int convert = Integer.parseInt(string);
        System.out.println("string -> int" + convert);
    }

//    question 1:
//    Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có thể cách nhau bằng nhiều khoảng trắng );
    public static void demKyTu(String string) {
        String[] convertstring = string.split(" ");
        System.out.println("so ky tu: " + convertstring.length);
    }
//    Question 2:
//    Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
    public static void noiSauKyTu(String string1, String string2) {
        System.out.println("noi ky tu: " + string1 + ' ' + string2);
    }
//    Question 5:
//    Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ.
    public static void nhapHoTen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao ho:");
        String ho = scanner.nextLine();
        System.out.println("nhap vao ten:");
        String ten = scanner.nextLine();
        System.out.println("ho va ten: " + ho + ' ' + ten);
    }

//   Exercise 1
//    Question 2:
//    Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm có số 0 ở đầu cho      đủ 5 chữ số)
//
//
//    Question 3:
//    Lấy 2 số cuối của số ở Question 2 và in ra.
//    Gợi ý:
//    Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
//    Cách 2: chia lấy dư số đó cho 100
//
//
//    Question 4:
//    Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng.



//    Exercise 3
//    Question 3:
//    Khởi tạo 1 số Integer có value là chữ "1234567"
//    Sau đó convert số trên thành datatype int



//    Exercise 4
//    Question 3:
//    Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chữ viết hoa chữ cái đầu thì viết hoa lên.
//    Question 4:
//    Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên của người dùng ra
//    VD:
//    Người dùng nhập vào "Nam", hệ thống sẽ in ra
//        "Ký tự thứ 1 là: N"
//                "Ký tự thứ 1 là: A"
//                "Ký tự thứ 1 là: M"
//    Question 6:
//    Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và sau đó hệ thống sẽ tách ra họ, tên , tên đệm
//    VD:
//    Người dùng nhập vào "Nguyễn Văn Nam"
//    Hệ thống sẽ in ra
//    "Họ là: Nguyễn"
//            "Tên đệm là: Văn"
//            "Tên là: Nam"
//    Question 7:
//    Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và chuẩn hóa họ và tên của họ như sau:
//    a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập vào
//    VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ chuẩn hóa thành "nguyễn văn   nam"
//    b) Viết hoa chữ cái mỗi từ của người dùng
//    VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ chuẩn hóa thành "Nguyễn Văn Nam"
//
//
//    Question 8:
//    In ra tất cả các group có chứa chữ "Java"
//
//
//    Question 9:
//    In ra tất cả các group "Java"
//
//
//    Question 10:
//    Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
//    Nếu có xuất ra “OK” ngược lại “KO”.
//    Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.
//
//
//    Question 11: Count special Character
//    Tìm số lần xuất hiện ký tự "a" trong chuỗi
//
//
//    Question 12: Reverse String
//    Đảo ngược chuỗi sử dụng vòng lặp
//
//
//    Question 13:
//    String not contains digit
//    Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược lại true.
//    Ví dụ:
//            "abc" => true
//            "1abc", "abc1", "123", "a1bc", null => false
//
//
//    Question 14: Replace character
//    Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác cho trước.
//    Ví dụ:
//            "VTI Academy" chuyển ký tự 'e' sang '*' kết quả " VTI Acad*my"
//
//
//    Question 15: Revert string by word
//    Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng thư viện.
//    Ví dụ: " I am developer " => "developer am I".
//    Các ký tự bên trong chỉ cách nhau đúng một dấu khoảng cách.
//    Gợi ý: Các bạn cần loại bỏ dấu cách ở đầu và cuối câu, thao tác cắt chuỗi theo dấu cách
//
//
//    Question 16:
//    Cho một chuỗi str và số nguyên n >= 0. Chia chuỗi str ra làm các phần bằng nhau với n    ký tự. Nếu chuỗi không chia được thì xuất ra màn hình “KO”.




//    Exercise 5: Object’s Method
//    Question 1:
//    In ra thông tin của phòng ban thứ 1 (sử dụng toString())
//
//
//    Question 2:
//    In ra thông tin của tất cả phòng ban (sử dụng toString())
//
//
//    Question 3:
//    In ra địa chỉ của phòng ban thứ 1
//
//
//    Question 4: Kiểm tra xem phòng ban thứ 1 có tên là "Phòng A" không?
//
//
//    Question 5:
//    So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau không (bằng nhau khi tên của 2 phòng ban đó bằng nhau)
//
//
//    Question 6:
//    Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD)
//    VD:
//    Accounting
//    Boss of director
//            Marketing
//    Sale
//    Waiting room
//
//
//    Question 7:
//    Khởi tạo 1 array học sinh gồm 5 Phòng ban, sau đó in ra dan sách phòng ban được sắp xếp theo tên
//    VD:
//    Accounting
//    Boss of director
//            Marketing
//    waiting room
//    Sale


}
