package server;

import java.util.List;

public class serverCount {
    private List<Integer> serverList;

    public List<Integer> getServerList() {
        return serverList;
    }

    public void setServerList(List<Integer> serverList) {
        this.serverList = serverList;
    }

    @Override
    public String toString() {
        return "serverCount{" +
                "serverList=" + serverList +
                '}';
    }
}
