public enum KindOfTea {
    EnglishBreakfast ("EnglishBreakfast"),
    IrishBreakfast ("IrishBreakfast"),
    EarlGray ("EarlGray"),
    DarjeelingTea ("DarjeelingTea"),
    GreenTea ("DarjeelingTea");

    private String name;

    KindOfTea(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " - " + name;
    }
}
