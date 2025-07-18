package Contracts;

public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifySubscribers(String videoName);
    void uploadAvideo(String videoName);
}
