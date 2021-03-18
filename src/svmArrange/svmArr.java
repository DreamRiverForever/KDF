package svmArrange;

import java.util.List;

public class svmArr {
    private String Id;
    private List<Integer> arr;

    public void setId(String id) {
        Id = id;
    }

    public void setArr(List<Integer> arr) {
        this.arr = arr;
    }

    public String getId() {
        return Id;
    }

    public List<Integer> getArr() {
        return arr;
    }
}
