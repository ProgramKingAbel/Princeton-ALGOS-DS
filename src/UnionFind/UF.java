package UnionFind;
/*
*  API that does basic operations to solve the connectivity problem
*
* initializes N sites with integer names(the indexes of the arr 0 to N-1)
* -> UF(int N)
*
* add a connection between two sites i.e. p and q
* -> void union(int p, int q)
*
* identify component containing site e.g. p(0 to N-1)
* -> int find(int p)
*
* determine if two sites are in the same component
* -> boolean connected(int p, int q)
*
* count the number of components
* -> int count()
*
* */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class UF {
    private int[] id;
    private int count;

    public UF(int N) {
        count = N;
        id = new int[N];

        for (int i = 0; i < N; i++)
            id[i] = i;
    }

    public int count() {
        return count;
    }

    // depends on find method
    public boolean connected(int p, int q) {
        // return find(p) == find(q);
        return true; // or false depending on output
    }

    // Implement find and union see different implementations

    /*
     public int find(int p)
     public void union(int p, int q)
     */


    // Client to interact with Union Find API
    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);

        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();

            if (uf.connected(p, q)) continue;
//            uf.union(p, q);
            StdOut.println(p + " " + q);
        }

        StdOut.println(uf.count() + " components");

    }
}

/*
 * Sample input
 *   % more tinyUF.txt
 *   10
 *   4 3
 *   3 8
 *   6 5
 *   9 4
 *   2 1
 *   8 9
 *   5 0
 *   7 2
 *   6 1
 *   1 0
 *   6 7
 *
 * */

/*Sample Output
 * % java UF < tinyUF.txt
 * 4 3
 * 3 8
 * 6 5
 * 9 4
 * 2 1
 * 5 0
 * 7 2
 * 6 1
 * 2 components
 */
