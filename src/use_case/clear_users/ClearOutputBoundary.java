package use_case.clear_users;

// TODO Complete me

public interface ClearOutputBoundary {
    void prepareSuccessView(ClearInputBoundary user);

    void prepareFailView(String error);
}
