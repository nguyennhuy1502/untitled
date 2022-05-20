package Techvify.FunctionalInterface;

import Techvify.DAO.InterviewMe;
import Techvify.DAO.Question;

import java.util.List;

@FunctionalInterface
public interface FilterLanguage {
    List<Question> listLanguageFilter(InterviewMe interviewMe);
}
