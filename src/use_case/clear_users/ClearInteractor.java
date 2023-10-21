package use_case.clear_users;
        import entity.User;
        import entity.UserFactory;
        import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    private final ClearOutputBoundary userPresenter;
    final UserFactory userFactory;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessObject, ClearOutputBoundary clearOutputBoundary, UserFactory userFactory) {
        this.userDataAccessObject = userDataAccessObject;
        this.userPresenter = clearOutputBoundary;
        this.userFactory = userFactory;
    }


    @Override
    public void execute(ClearInputData clearInputData) {
        ArrayList<String> clearedUsers = userDataAccessObject.clearedUsers();
        userDataAccessObject.clear();
        ClearOutputData clearOutputData = new ClearOutputData(clearedUsers);
        userPresenter.prepareSuccessView(clearOutputData);
    }

}