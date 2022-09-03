package com.myigituzun.console;

public class BuilderTest {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("HTML").append(", ");
        builder.append("CSS").append(", ");
        builder.append("JS").append(", ");
        builder.append("XML").append(", ");
        builder.append("JSON").append(", ");
        builder.append("SQL").append(". ");

        String string = builder.toString();
        System.out.println("Sicim: " + string);

        String string2 = new StringBuilder().
        append("HTML").append(", ").
        append("CSS").append(", ").
        append("JS").append(", ").
        append("XML").append(", ").
        append("JSON").append(", ").
        append("SQL").append(". ").
        toString();
        
        System.out.println("Sicim: " + string2);
    }
}
