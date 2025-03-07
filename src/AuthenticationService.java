import java.util.ArrayList;

public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;

// TODO Now: Add a constructor to initialize the users list with the default user
    public AuthenticationService() {
        users.add(new User ("test", "test"));
    }


// TODO Now: Implement the signUp method to add a new user to the list if the username is not taken and return the user; returns null otherwise
    public User signUp(String username, String password) {
        for(User existingUser : users){
            if (existingUser.getUsername().equals(username)) {
                return null; // Username taken
            }
        }
        // Add the new user to the user list
        User newUser = new User (username, password);
        users.add(newUser);
        return newUser;
    }

// TODO Now: Implement the logIn method to return the user if the username and password match, and null otherwise
    public User logIn(String username, String password) {
        // Check if the username and password match
        for(User userL : users) {
            if (userL.getUsername().equals(username) && userL.getPassword().equals(password)) {
                return userL; // Return the user if credentials match
            }
        }
        return null; // Return null if no match is found
    }
}