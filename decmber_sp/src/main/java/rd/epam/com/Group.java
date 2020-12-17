package rd.epam.com;

public enum Group {
    FIRST("First group"), SECOND("Second group");

    private final String name;

    Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
