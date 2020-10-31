public class MainWait {

    public synchronized void waitMain(){
        try{
            wait();
        }catch(Exception e){}

    }

    public synchronized void notifyMain(){
        try{
            notify();
        }catch(Exception e){}

    }
}
