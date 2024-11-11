import java.util.ArrayList;
import java.util.List;

public class Post {
    private User author;
    private String content;
    private List<User> likes;

    public Post(User author, String content) {
        this.author = author;
        this.content = content;
        this.likes = new ArrayList<>();
    }

    public User getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public List<User> getLikes() {
        return likes;
    }

    public void addLike(User user) {
        likes.add(user);
    }
}
