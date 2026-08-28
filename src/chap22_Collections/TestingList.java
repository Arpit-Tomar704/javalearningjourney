package chap22_Collections;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("ansh ");
        strList.add("tomar");

        strList.add(1,"Arpit ");
        strList.remove(0);

        if (strList.contains("tomar")){
            System.out.println( strList.indexOf("tomar"));
        }

        for (int i = 0; i < strList.size() ; i++) {
            System.out.print(strList.get(i));

        }

        for (String str : strList){
            System.out.print(str);
        }

       // System.out.println(strList.get(0));
    }
}
