package MD03_Session06_OOP_Class_Object_Lession.StopWatch;

public class StopWatch {
    //1. Fields
    private long startTime;
    private long endTime;

    //2. Constructors

    public StopWatch() {
    }

    public StopWatch(long startTime) {
        this.startTime = System.currentTimeMillis();
    }
    //3. Phuong thuc getter tra ve gia tri cua startTime va endTime

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

//    Phương thức start() để reset startTime về thời gian hiện tại của hệ thống.
    public void start(){
        startTime=System.currentTimeMillis();
    }

//    Phương thức stop() để thiết đặt endTime về thời gian hiện tại của hệ thống.
    public void stop(){
        endTime=System.currentTimeMillis();
    }

//    Phương thức getElapsedTime() trả về thời gian đã trôi qua theo số milisecond giây
    public long getElapsedTime(){
        return endTime-startTime;
    }
}
