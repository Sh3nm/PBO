public class Main {
    public static void main(String[] args){
        Network network = new Network();

        User rahmat = network.addUser("Rahmat");
        User ren = network.addUser("Ren");
        User po = network.addUser("Po");

        rahmat.addPost("Hello, this is Rahmat first post!");
        ren.addPost("Hello everyone, Ren is here!");

        network.addPost(rahmat.getPosts().get(0));
        network.addPost(ren.getPosts().get(0));

        rahmat.likePost(ren.getPosts().get(0));
        po.likePost(ren.getPosts().get(0));

        ren.likePost(rahmat.getPosts().get(0));

        network.showAllPosts();
    }
}
