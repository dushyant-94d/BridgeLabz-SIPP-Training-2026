interface TextModeration {
    boolean isOffensive(String post);

    default void displayModerationPolicy() {
        System.out.println("Policy: Offensive content is not allowed.");
    }

    static boolean containsRestrictedWords(String post) {
        String[] restricted = {"badword", "hate", "abuse"};

        for (String word : restricted) {
            if (post.toLowerCase().contains(word)) {
                return true;
            }
        }
        return false;
    }
}

interface SpamDetection {
    boolean isSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Policy: Spam content is not allowed.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    public boolean isOffensive(String post) {
        return TextModeration.containsRestrictedWords(post);
    }

    public boolean isSpam(String post) {
        return post.toLowerCase().contains("buy now") ||
               post.toLowerCase().contains("free money") ||
               post.toLowerCase().contains("click here");
    }

    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
}

public class AiBased {
    public static void main(String[] args) {
        String[] posts = {
            "Hello everyone, have a nice day",
            "Buy now and get free money",
            "This post contains hate speech",
            "Click here to win prize",
            "Java is a powerful language"
        };

        ContentModerator moderator = new ContentModerator();

        moderator.displayModerationPolicy();

        for (String post : posts) {
            System.out.println("\nPost: " + post);

            if (moderator.isSpam(post)) {
                System.out.println("Result: Spam post");
            } else if (moderator.isOffensive(post)) {
                System.out.println("Result: Offensive post");
            } else {
                System.out.println("Result: Valid post");
            }
        }
    }
}