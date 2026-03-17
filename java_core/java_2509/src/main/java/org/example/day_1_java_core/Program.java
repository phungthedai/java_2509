package org.example.day_1_java_core;

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


        System.out.println("name department" + depSale.departmentName);
        System.out.println("name position" + posDev.positionName);
        System.out.println("name account" + daiPhung.fullName);
    }
}
