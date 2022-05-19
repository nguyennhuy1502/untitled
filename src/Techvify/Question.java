package Techvify;

public record Question(String questionCode, String questionName, Level questionLevel, Language language) {

    @Override
    public String toString() {
        return "Question{" +
                "questionCode=" + questionCode +
                ", questionName='" + questionName + '\'' +
                ", questionLevel='" + questionLevel + '\'' +
                ", language='" + language + '\'' +
                '}';
    }

    @Override
    public String questionCode() {
        return questionCode;
    }

    @Override
    public String questionName() {
        return questionName;
    }

    @Override
    public Level questionLevel() {
        return questionLevel;
    }

    @Override
    public Language language() {
        return language;
    }
}
