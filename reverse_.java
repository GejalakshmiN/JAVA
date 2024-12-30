
import java.util.*;

class solution<T> {

    List<T> rev(List<T> arr) {
        List<T> ans = new ArrayList<>();
        for (int i = arr.size(); i > 0; i--) {
            ans.add(arr.get(i - 1));
        }
        return ans;
    }
}

public class reverse_ {

    public static void main(String args[]) {
        solution s = new solution();
        List<Integer> l = List.of(12, 34, 66);
        List<Integer> ans = s.rev(l);
        for (Integer i : ans) {
            System.out.println(i);
        }
        List<String> l2 = List.of("Shiva", "Vinay", "Paru");
        List<String> ans2 = s.rev(l2);
        for (String i2 : ans2) {
            System.out.println(i2);
        }
    }
}
