package ru.job4j.condition;

public class StringEq {
    public static boolean check(String login) {
        String root = new String("root");
        return login.equals(root);
    }

    public static void main(String[] args) {
        String yourName = "Sergey";
        boolean userHasAccess = StringEq.check(yourName);
        System.out.println(userHasAccess);
    }
}
