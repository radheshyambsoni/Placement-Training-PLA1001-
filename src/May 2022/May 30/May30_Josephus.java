import java.util.ArrayList;
import java.util.List;

public class May30_Josephus {
    // static int josephus(int n, int k) {
    // if (n == 1)
    // return 1;
    // else
    // /*
    // * The position returned by josephus(n - 1, k)
    // * is adjusted because the recursive call
    // * josephus(n - 1, k) considers the original
    // * position k%n + 1 as position 1
    // */
    // return (josephus(n - 1, k) + k - 1) % n + 1;
    // }

    static void josephus(List<Integer> person, int k, int start) {

        // Base case , when only one person is left
        if (person.size() == 1) {
            System.out.println(person.get(0));
            return;
        }

        // find the start of first person which will die
        start = ((start + k) % person.size());

        // remove the first person which is going to be killed
        person.remove(start);

        // recursive call for n-1 persons
        josephus(person, k, start);
    }

    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/josephus-problem-set-1-a-on-solution/
        // System.out.println(josephus(14,2));
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<5;i++){l1.add(i+1);}
        josephus(l1,3,2);
    }
}