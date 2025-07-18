import Contracts.Observer;

public class Subscriber implements Observer{

    private String userName;

    Subscriber(String name)
    {
        this.userName=name;
    }
    @Override
    public void update(String videoName,String youtubeChannelName)
    {
        System.out.println("Hi "+this.userName+" "+youtubeChannelName+" upload a video " + videoName);
    }
}
