package use_case.clear_users;

import entity.User;

import java.util.ArrayList;

public interface ClearUserDataAccessInterface {

    ArrayList<String> clearedUsers();

    void clear();
}
