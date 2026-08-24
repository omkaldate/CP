package InfosysOA;

import java.util.*;

public class TreeBeauty_EasySample {

    static final long MOD = 1_000_000_007L;

    static ArrayList<Integer>[] tree;
    static int[] signature;
    static long answer;

    /*
        Returns:
        [0] -> HashMap: signature -> count
        [1] -> number of good pairs in this subtree

        We use a small wrapper class because Java cannot
        conveniently return both values.
    */
    static class Result {
        HashMap<Integer, Integer> map;
        long pairs;

        Result(HashMap<Integer, Integer> map, long pairs) {
            this.map = map;
            this.pairs = pairs;
        }
    }

    static Result dfs(int u) {

        // Start with u's own signature
        HashMap<Integer, Integer> myMap = new HashMap<>();

        myMap.put(signature[u], 1);

        long pairs = 0;

        // Process children
        for (int v : tree[u]) {

            Result child = dfs(v);

            HashMap<Integer, Integer> childMap = child.map;

            // Pairs already inside child's subtree
            pairs += child.pairs;

            /*
                SMALL -> LARGE

                If myMap is smaller, merge myMap into childMap.
                Otherwise merge childMap into myMap.
            */
            if (myMap.size() < childMap.size()) {

                // Cross pairs between myMap and childMap
                for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {

                    int sig = entry.getKey();
                    int smallCount = entry.getValue();

                    int largeCount = childMap.getOrDefault(sig, 0);

                    pairs += (long) smallCount * largeCount;

                    childMap.put(sig, largeCount + smallCount);
                }

                myMap = childMap;

            } else {

                // Cross pairs between childMap and myMap
                for (Map.Entry<Integer, Integer> entry : childMap.entrySet()) {

                    int sig = entry.getKey();
                    int smallCount = entry.getValue();

                    int largeCount = myMap.getOrDefault(sig, 0);

                    pairs += (long) smallCount * largeCount;

                    myMap.put(sig, largeCount + smallCount);
                }
            }
        }

        /*
            IMPORTANT:
            We initially put u's signature into myMap,
            so the code above has already included u.

            Therefore we should NOT add u again.
        */

        // beauty(u)
        answer = (answer + pairs) % MOD;

        return new Result(myMap, pairs);
    }


    /*
        Creates a signature.

        Two numbers have a perfect-square product iff
        their signatures are equal.

        For simplicity, this version uses trial division.
    */
    static int getSignature(int x) {

        int sig = 0;
        int bit = 0;

        for (int p = 2; (long) p * p <= x; p++) {

            int count = 0;

            while (x % p == 0) {
                x /= p;
                count++;
            }

            if ((count & 1) == 1) {
                sig ^= (1 << bit);
            }

            if (count > 0) {
                bit++;
            }
        }

        if (x > 1) {
            sig ^= (1 << bit);
        }

        return sig;
    }


    public static int get_ans(int n, int[] par, int[] a) {

        tree = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
        }

        /*
            par[0] = 0

            par[i] contains parent using 1-based node numbering.

            Node i+1 has parent par[i].

            So:
                parent = par[i] - 1
                child  = i
        */
        for (int i = 1; i < n; i++) {

            int parent = par[i] - 1;

            tree[parent].add(i);
        }

        // Calculate signatures first
        signature = new int[n];

        for (int i = 0; i < n; i++) {
            signature[i] = getSignature(a[i]);
        }

        answer = 0;

        dfs(0);

        return (int) answer;
    }


    public static void main(String[] args) {

        int n = 5;

        int[] par = {
                0,
                1,
                1,
                2,
                2
        };

        int[] a = {
                2,
                3,
                6,
                12,
                27
        };

        System.out.println(get_ans(n, par, a));
    }
}