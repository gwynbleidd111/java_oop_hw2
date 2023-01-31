public final class ImmutableClassHuman {
    private final String name;
    private final int age;

    public ImmutableClassHuman(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public ImmutableClassHuman(ImmutableClassHuman other) {
        this(other.getName(), other.getAge());
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return (String) name;
    }
}
