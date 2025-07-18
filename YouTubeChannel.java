import java.util.ArrayList;

import Contracts.Observer;
import Contracts.Subject;

public class YouTubeChannel implements Subject{

    private String channelName;

    YouTubeChannel(String channelName)
    {
        this.channelName=channelName;
        this.listOfSubscribers = new ArrayList<>();

    }

    private ArrayList<Observer> listOfSubscribers;

    @Override
    public void subscribe(Observer observer)
    {
        listOfSubscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer)
    {
        listOfSubscribers.remove(observer);
    }


    @Override
    public void notifySubscribers(String videoName)
    {
        for(Observer subscriber : listOfSubscribers)
        {
            subscriber.update(videoName, this.channelName);
        }
    }

    @Override
    public void uploadAvideo(String videoName)
    {
        // uploading process

        this.notifySubscribers(videoName);
    }
}