package edu.xcdq.demo02;

/**
 * @author zhangshenrui
 * @date 2021/5/11 15:18
 */
public class Pair <T> {  // type
    private T first;
    private T second ;
    // 构造方法
    public Pair() {
    }
    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    // setter & getter
    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }


    // toString()
    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
