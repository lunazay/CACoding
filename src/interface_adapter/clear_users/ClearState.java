package interface_adapter.clear_users;

import use_case.clear_users.ClearOutputData;

import java.util.ArrayList;

public class ClearState {
    ArrayList<String> users = new ArrayList<>();
    public ClearState(){}
    public ClearState(ClearState copy) {
        users = copy.users;
    }
    public ArrayList<String> getUsers(){
        return users;
    }
    public void setUsers(ArrayList<String> users){
        this.users= users;
    }

    public ArrayList prepareSuccessView(ClearOutputData clearedUsers) {
        return clearedUsers.getClearedUsers();

    }
}
