import java.util.ArrayList;

public class FriendsList {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>(); //sets up the array to store the friends
        friends.add("Lysithea");
        friends.add("Faker");
        friends.add("Zeus");
        friends.add("Domosnr");
        friends.add("Domojr");
        for (int i = 0; i < friends.size(); i++) {
            System.out.println("Name: " + friends.get(i) + ", Index: " + i); //prints the Friends and index from 0-4
        }
    }
}