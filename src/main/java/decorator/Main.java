package decorator;

public class Main {

    public static void main(String[] args) {

        TextComponent simple = new SimpleText(" hello world ");
        System.out.println("=== Simple ===");
        System.out.println("getText: \"" + simple.getText() + "\"");

        TextComponent trimmed = new TrimDecorator(simple);
        TextComponent upper = new UpperCaseDecorator(trimmed);
        System.out.println("=== Trim = UpperCase ===");
        System.out.println("getText: \"" + upper.getText() + "\"");

        TextComponent plain = new SimpleText("decorator");
        TextComponent prefixed = new PrefixDecorator(plain, "[RESULT] ");
        TextComponent prefixedUpper = new UpperCaseDecorator(prefixed);
        System.out.println("=== Prefix + UpperCase ===");
        System.out.println("getText: \"" + prefixedUpper.getText() + "\"");

        TextComponent multi = new SimpleText(" nested example ");
        TextComponent withPrefix = new PrefixDecorator(multi, ">> ");
        TextComponent withTrim = new TrimDecorator(withPrefix);
        TextComponent withUpper = new UpperCaseDecorator(withTrim);
        System.out.println("=== Prefix + Trim + UpperCase (nested) ===");
        System.out.println("getText: \"" + withUpper.getText() + "\"");
    }
}
