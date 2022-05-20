package Techvify.DAO;

import java.util.ArrayList;
import java.util.List;

public class Data {
    public static List<Question> questionsList = new ArrayList<>();
    static Language java = new Language("J00","Java");
    static Language reactJS = new Language("R00","ReactJS");

    private static void addQuestion(){
        questionsList.add(new Question("J01","Cac dac tinh OOP", Level.JUNIOR,java));
        questionsList.add(new Question("J02","Private variable la gi",Level.JUNIOR,java));
        questionsList.add(new Question("J03","Neu diem khac nhau giua List va Set",Level.JUNIOR,java));
        questionsList.add(new Question("J04","Overload va Override",Level.JUNIOR,java));
        questionsList.add(new Question("J05","TInh ke thua",Level.JUNIOR,java));
        questionsList.add(new Question("J06","Neu diem khac nhau giua List va Set",Level.SENIOR,java));
        questionsList.add(new Question("J07","Tinh da hinh",Level.SENIOR,java));
        questionsList.add(new Question("J08","Tinh bao dong",Level.SENIOR,java));
        questionsList.add(new Question("J09","Tinh da hinh",Level.SENIOR,java));
        questionsList.add(new Question("J010","Interface",Level.SENIOR,java));

        questionsList.add(new Question("R01","Chi ra nhung diem moi cua ES6",Level.JUNIOR,reactJS));
        questionsList.add(new Question("R02","Liet ke ra cac component life cycle",Level.JUNIOR,reactJS));
        questionsList.add(new Question("R03","Neu diem khac nhau giua List va Set reactJS",Level.JUNIOR,reactJS));
        questionsList.add(new Question("R04","Overload va Override reactJS",Level.JUNIOR,reactJS));
        questionsList.add(new Question("R05","TInh ke thua reactJS",Level.JUNIOR,reactJS));
        questionsList.add(new Question("R06","Neu diem khac nhau reactJS",Level.SENIOR,reactJS));
        questionsList.add(new Question("R07","reactJS 07",Level.SENIOR,reactJS));
        questionsList.add(new Question("R08","reactJS 08",Level.SENIOR,reactJS));
        questionsList.add(new Question("R09","reactJS 09",Level.SENIOR,reactJS));
        questionsList.add(new Question("R010","reactJS 10",Level.SENIOR,reactJS));
    }
    public static List<Question> getQuestionsList(){
        if (questionsList.size() == 0){
            addQuestion();
        }
        return questionsList;
    }
}
