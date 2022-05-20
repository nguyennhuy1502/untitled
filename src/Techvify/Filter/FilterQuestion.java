package Techvify.Filter;

import Techvify.DAO.Data;
import Techvify.DAO.Question;
import Techvify.FunctionalInterface.FilterLanguage;
import Techvify.FunctionalInterface.FilterLevel;
import Techvify.DAO.InterviewMe;
import Techvify.DAO.Level;

import java.util.List;
import java.util.stream.Collectors;

public class FilterQuestion implements FilterLanguage, FilterLevel {

    @Override
    public List<Question> listLanguageFilter(InterviewMe interviewMe) {
        List<Question> listLanguageFilter = Data.getQuestionsList().stream().
                filter(question -> question.language().getName().equals(interviewMe.language()))
                .collect(Collectors.toList());
        return listLanguageFilter;
    }

    @Override
    public List<Question> listLevelFilter(Level level, List<Question> listLanguageFilter) {
        List<Question>listLevelFilter  = listLanguageFilter.stream().
                filter(question -> question.questionLevel().equals(level))
                .collect(Collectors.toList());
        return listLevelFilter;
    }
}
