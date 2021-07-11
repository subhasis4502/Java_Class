public class App {
    public class <E> maxOccur (E[] elements) {
        E maxcount = 1, res = elements[0], curr_count = 1;
        for (int i; i<elements.length; i++) {
            if (elements[i] == elements[i-1])
                curr_count++;
            else {
                if (curr_count > maxcount) {
                    maxcount = curr_count;
                    res = elements [i-1];
                }
                curr_count = 1;
            }
            if (curr_count > maxcount) {
                maxcount = curr_count;
                res = elements[(elements.length)-1]
            }
            return res;
        }
        public static void main(String[] args) {
            Integer[] iArr = {1,2,3,4,2,6};
            System.out.println("Max occuring integer: " + maxOccur(iArr));

            Float[] fArr = {1.5,2.5,3.5,4.5,3.5};
            System.out.println("Max occuring float: " + maxOccur(fArr));

            char[] cArr = {'a', 'b', 'c', 'd', 'd', 'e'};
            System.out.println("Max occuring integer: " + maxOccur(cArr));

            Double[] dArr = {2.55, 3.55, 1.55, 1.55, 4.55};
            System.out.println("Max occuring double number: " + maxOccur(iArr));

            Long[] lArr = {12356, 1225577, 1225577, 127523};
            System.out.println("Max occuring long number: " + maxOccur(lArr));
        }

    }
}
