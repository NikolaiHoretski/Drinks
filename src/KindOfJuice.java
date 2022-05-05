public enum KindOfJuice {
    Orange ("Orange"),
    Apple ("Apple");

    private String name;

    KindOfJuice(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " - " + name;
    }
}
