package chap22_Collections;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollections {
    static void main(String[] args) {
        List<Integer> numlist = new ArrayList<>();
        numlist.add(4);
        numlist.add(5);
        numlist.add(8);
        numlist.add(1);
        numlist.add(0);
        Collections.sort(numlist);
        Utility.print(numlist);
        Collections.reverse(numlist);
        Utility.print(numlist);
        List<Integer> unmodifiable = Collections.unmodifiableList(numlist);
        unmodifiable.add(888);

    }

}
