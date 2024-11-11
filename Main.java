public class Main {
    public static void main(String[] args) {
        Network network = new Network();

        User alice = network.addUser("Alice");
        User bob = network.addUser("Bob");

        network.addPost(alice, "Hello, this is Alice's first post!");
        network.addPost(bob, "Hi everyone, Bob here!");

        bob.likePost(alice.getPosts().get(0));
        alice.likePost(bob.getPosts().get(0));

        network.showAllPosts();
    }
}
