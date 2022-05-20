package Techvify.DAO;

public record InterviewMe(String language, String level) {
    @Override
    public String language() {
        return language;
    }

    @Override
    public String level() {
        return level;
    }

    @Override
    public String toString() {
        return "InterviewMe{" +
                "language='" + language + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
