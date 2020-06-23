package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = 0; index < post.length; index++) {
            char convertWord = word[index];
            word[index] = word[word.length - index - 1];
            word[word.length - index - 1] = convertWord;

            char convertPost = post[0];
            post[index] = post[post.length - index - 1];
            post[post.length - index - 1] = convertPost;

            if (post[index] != word[index]) {
                result = false;
                break;
            }
                   }

        return result;
    }
}
