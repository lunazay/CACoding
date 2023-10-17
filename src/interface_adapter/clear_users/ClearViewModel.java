package interface_adapter.clear_users;

// TODO Complete me

public class ClearViewModel {
    private boolean clearSuccessful;

    public ClearViewModel(boolean clearSuccessful) {
        this.clearSuccessful = clearSuccessful;
    }

    public boolean isClearSuccessful() {
        return clearSuccessful;
    }
}
