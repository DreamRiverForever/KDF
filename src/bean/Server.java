package bean;

import java.util.Arrays;

public class Server {
    private String name;
    private int[] arr;

    public String getName() {
        return name;
    }

    public int[] getArr() {
        return arr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
