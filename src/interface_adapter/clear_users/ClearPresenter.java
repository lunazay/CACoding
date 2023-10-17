package interface_adapter.clear_users;

// TODO Complete me

public class ClearPresenter {
    public void displayClearResult(boolean success) {
        if (success) {
            System.out.println("All users have been cleared successfully.");
        } else {
            System.out.println("Failed to clear all users.");
        }
    }
}
