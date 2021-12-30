package task1;

public class Work {
    private int work;
    private Task aquireNextTask;
    private boolean currentUnassignedNotFinishedTask;

    public int getWork() {
        return work;
    }

    public Task getAquireNextTask() {
        return aquireNextTask;
    }

    public boolean getCurrentUnassignedNotFinishedTask() {
        return currentUnassignedNotFinishedTask;
    }

    public void setWork(int work) {
        this.work = work;
    }

    public void setAquireNextTask(Task aquireNextTask) {
        if (aquireNextTask != null) {
            this.aquireNextTask = aquireNextTask;
        }
    }

    public void setCurrentUnassignedNotFinishedTask() {
        currentUnassignedNotFinishedTask = false;
    }
}
