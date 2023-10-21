package use_case.clear_users;


// TODO Complete me


import interface_adapter.clear_users.ClearState;

import java.util.ArrayList;

public class ClearOutputData {

    public ArrayList<String> clearedUsers;


    public ClearOutputData(ArrayList users) {
        this.clearedUsers = users;
    }
    public ArrayList<String> getClearedUsers(){
        return clearedUsers;
    }

}