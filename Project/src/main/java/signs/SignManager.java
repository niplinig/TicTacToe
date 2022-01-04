package signs;

import java.util.Deque;
import java.util.LinkedList;

public class SignManager {

    Deque<String> signQueue = new LinkedList<>();

    public SignManager() {
        signQueue.addFirst("X");
        signQueue.addLast("O");
    }

    public SignManager(String firstSign, String secondSign) {
        signQueue.addFirst(firstSign);
        signQueue.addLast(secondSign);
    }

    public String getSign() {
        return signQueue.removeFirst();
    }

}
