import bean.DayRequest;
import bean.Server;
import bean.Svm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws Exception {

        Map<String,Server> serverMap = new HashMap<>();
        Map<String, Svm> svmMap = new HashMap<>();
        List<DayRequest> daysRequests = new ArrayList<>();
        File file = new File("src/training-1.txt");// Text文件
        BufferedReader br = new BufferedReader(new FileReader(file));// 构造一个BufferedReader类来读取文件
        String s = null;
        String serverNum = br.readLine();
        String temp;
        int num = Integer.valueOf(serverNum);
        for (int i=0;i<num;i++){
            Server server = new Server();
            temp = br.readLine();
            temp = temp.replace("(","");
            temp = temp.replace(")","");
            temp = temp.replaceAll(" +", "");
            String[] str = temp.split(",");
            server.setName(str[0]);
            int[] arr = new int[4];
            for (int j=0;j<4;j++)
                arr[j] = Integer.valueOf(str[j+1]);
            server.setArr(arr);
            serverMap.put(str[0],server);
        }
        String svnNum = br.readLine();
        num = Integer.valueOf(svnNum);
        for (int i=0;i<num;i++){
            Svm svm = new Svm();
            temp = br.readLine();
            temp = temp.replace("(","");
            temp = temp.replace(")","");
            temp = temp.replaceAll(" +", "");
            String[] str = temp.split(",");
            svm.setName(str[0]);
            int[] arr = new int[3];
            for (int j=0;j<3;j++)
                arr[j] = Integer.valueOf(str[j+1]);
            svm.setArr(arr);
            svmMap.put(str[0],svm);
        }
        String days = br.readLine();
        String orderNum;
        int countDay = Integer.valueOf(days);
        for(int k=0;k<countDay;k++){
            DayRequest request = new DayRequest();
            orderNum = br.readLine();
            num = Integer.valueOf(orderNum);
            List<String[]> res = new ArrayList<>();
            for (int i=0;i<num;i++){
                temp = br.readLine();
                temp = temp.replace("(","");
                temp = temp.replace(")","");
                temp = temp.replaceAll(" +", "");
                String[] str = temp.split(",");
                res.add(str);
            }
            request.setRequest(res);
            daysRequests.add(request);
        }
        br.close();
        System.out.println(daysRequests.get(daysRequests.size()-1).getRequest().size());



//        br.close();
//        for(String name : map.keySet()){
//            System.out.println(map.get(name).toString());
//        }

//        while ((s = br.readLine()) != null) {// 使用readLine方法，一次读一行
//
//            System.out.println(s);
//        }
//        br.close();
    }
}
