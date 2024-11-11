import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Post> posts;

    public User(String name) {
        this.name = name;
        this.posts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void addPost(String content) {
        Post newPost = new Post(this, content);
        posts.add(newPost);
        System.out.println(name + " posted: " + content);
    }

    public void likePost(Post post) {
        if (!post.getLikes().contains(this)) {
            post.addLike(this);
            System.out.println(name + " liked: " + post.getContent());
        }
    }
}
