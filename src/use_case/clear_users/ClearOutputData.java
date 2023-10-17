package use_case.clear_users;

// TODO Complete me

public class ClearOutputData {
    private String clearTime;
    private boolean useCaseFailed;

    public ClearOutputData(String clearTime, boolean useCaseFailed) {
        this.clearTime = clearTime;
        this.useCaseFailed = useCaseFailed;
    }

    public String getClearTime() {
        return clearTime;
    }

    public void setClearTime(String clearTime) {
        this.clearTime = clearTime;
    }
}