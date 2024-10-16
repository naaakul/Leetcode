class Solution {
    public class Pair {
        char ch;
        int cou;

        Pair(char ch, int cou) {
            this.ch = ch;
            this.cou = cou;
        }
    }
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<Pair> heap = new PriorityQueue<>((p1, p2) -> p2.cou - p1.cou);

        if (a > 0) heap.add(new Pair('a', a));
        if (b > 0) heap.add(new Pair('b', b));
        if (c > 0) heap.add(new Pair('c', c));

        StringBuilder ans = new StringBuilder();

        while (!heap.isEmpty()) {
            Pair one = heap.poll();

            int len = ans.length();
            if (len >= 2 && ans.charAt(len - 1) == one.ch && ans.charAt(len - 2) == one.ch) {
                if (heap.isEmpty()) break;

                Pair two = heap.poll();
                ans.append(two.ch);
                two.cou--;

                if (two.cou > 0) heap.add(two);

                heap.add(one);
            } else {
                ans.append(one.ch);
                one.cou--;

                if (one.cou > 0) heap.add(one);
            }
        }

        return ans.toString();
    }
}