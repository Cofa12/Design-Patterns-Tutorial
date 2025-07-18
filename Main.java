public class Main{
    public static void main(String[] args)
    {
        YouTubeChannel playWithCode = new YouTubeChannel("PlayWithCode");

        Subscriber sub1 = new Subscriber("Ahmed");
        Subscriber sub2 = new Subscriber("Mohaemd");
        Subscriber sub3 = new Subscriber("Mahmoud");


        playWithCode.subscribe(sub1);
        playWithCode.subscribe(sub2);
        playWithCode.subscribe(sub3);

        playWithCode.uploadAvideo("Observer Design Pattern");
        
        playWithCode.unsubscribe(sub3);
        
        playWithCode.uploadAvideo("Last Update of Design patterns");

    }
}

