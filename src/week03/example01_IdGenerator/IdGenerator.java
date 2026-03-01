package week03.example01_IdGenerator;

public class IdGenerator {

    public int generateID() {
        return (int)(Math.random() * 90000) + 10000;
    }
}