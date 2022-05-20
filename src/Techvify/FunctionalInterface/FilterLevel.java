package Techvify.FunctionalInterface;

import Techvify.DAO.Level;
import Techvify.DAO.Question;

import java.util.List;

public interface FilterLevel {
    List<Question> listLevelFilter(Level level, List<Question> listLanguageFilter);
}
