package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;
import use_case.clear_users.ClearInputData;

// TODO Complete me
public class ClearController {
    final ClearInputBoundary userClearupUseCaseInteractor;
    public ClearController(ClearInputBoundary userClearUseCaseInteractor) {
        this.userClearupUseCaseInteractor = userClearUseCaseInteractor;
    }

    public void execute(){
        ClearInputData clearInputData = new ClearInputData();
        userClearupUseCaseInteractor.execute(clearInputData);
    };

}
