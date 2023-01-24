public final class ImmutableClassHuman {
    private String name;
    private int age;

    public ImmutableClassHuman(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
