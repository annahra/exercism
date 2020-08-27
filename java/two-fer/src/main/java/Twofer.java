public class Twofer {
    public String twofer(String name) {
        String realName = name == null ? "you" : name;

        return "One for " + realName + ", one for me.";
    }
}
