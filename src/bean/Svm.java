package bean;

import java.util.Arrays;

public class Svm {
    private String name;
    private int[] arr;

    public void setName(String name) {
        this.name = name;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public String getName() {
        return name;
    }

    public int[] getArr() {
        return arr;
    }

    @Override
    public String toString() {
        return "Svm{" +
                "name='" + name + '\'' +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
