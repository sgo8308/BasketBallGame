public class StateCheckThread implements Runnable {
    Thread targetThread;
    static Thread.State state = Thread.State.NEW;
    StateCheckThread(Thread targetThread){
        this.targetThread = targetThread;
    }

    @Override
    public void run() {
        while(true){
            state = targetThread.getState();
            if(state.equals(Thread.State.TERMINATED)){
                break;
            }

        }
    }
}
