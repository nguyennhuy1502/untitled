package Techvify;

import java.util.List;

@FunctionalInterface
public interface FilterLanguage {
    List<Question> listLanguageFilter(InterviewMe interviewMe);
}
