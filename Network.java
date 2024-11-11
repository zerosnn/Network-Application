import java.util.ArrayList;
import java.util.List;

public class Network {
    private List<User> users;
    private List<Post> posts;

    public Network() {
        users = new ArrayList<>();
        posts = new ArrayList<>();
    }

    public User addUser(String name) {
        User user = new User(name);
        users.add(user);
        System.out.println("User added: " + name);
        return user;
    }

    public void addPost(User user, String content) {
        Post post = new Post(user, content);
        user.getPosts().add(post); 
        posts.add(post); 
        System.out.println(user.getName() + " posted: " + content);
    }

    public void showAllPosts() {
        System.out.println("\nAll Posts:");
        for (Post post : posts) {
            System.out.println(post.getAuthor().getName() + " posted: " + post.getContent() + " - Likes: " + post.getLikes().size());
        }
    }
}
