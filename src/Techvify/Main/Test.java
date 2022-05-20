package Techvify.Main;

import Techvify.DAO.InterviewMe;
import Techvify.DAO.Level;
import Techvify.Filter.FilterQuestion;

public class Test {

    public static void main(String[] args) {
        FilterQuestion filter = new FilterQuestion();
        InterviewMe interviewee = new InterviewMe("Java", "Mid Senior");

        switch (interviewee.level()) {
            case "Junior":
                filter.listLevelFilter(Level.JUNIOR, filter.listLanguageFilter(interviewee))
                        .stream()
                        .skip(0)
                        .limit(4)
                        .forEach(question -> System.out.println(question.questionLevel() + " - " + question.questionLevel()));

                filter.listLevelFilter(Level.SENIOR, filter.listLanguageFilter(interviewee))
                        .stream()
                        .skip(0)
                        .limit(1)
                        .forEach(question -> System.out.println(question.questionName() + " - " + question.questionLevel()));
                break;
            case "Mid Senior":
                filter.listLevelFilter(Level.JUNIOR, filter.listLanguageFilter(interviewee))
                        .stream()
                        .skip(0)
                        .limit(2)
                        .forEach(question -> System.out.println(question.questionName() + " - " + question.questionLevel()));

                filter.listLevelFilter(Level.SENIOR, filter.listLanguageFilter(interviewee))
                        .stream()
                        .skip(0)
                        .limit(3)
                        .forEach(question -> System.out.println(question.questionName() + " - " + question.questionLevel()));
                break;
            case "Senior":
                filter.listLevelFilter(Level.SENIOR, filter.listLanguageFilter(interviewee))
                        .stream()
                        .skip(0)
                        .limit(5)
                        .forEach(question -> System.out.println(question.questionName() + " - " + question.questionLevel()));
                break;
        }
    }
}

