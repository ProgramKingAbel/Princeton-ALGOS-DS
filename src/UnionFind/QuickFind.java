package UnionFind;

// The eager approach
public class QuickFind {
    private int[] id;

    // set the id of each object to itself ->  N array accesses
    public QuickFind(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    // check whether p and q are connected | in the same component -> 2 array accesses
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    // change all entries of id[p] to id[q] -> at most 2N + 2 array access
    public void union(int p, int q) {
        int pID = id[p];
        int qID = id[q];

        for (int i = 0; i < id.length; i++) {
            if (id[i] == pID) id[i] = qID;
        }
    }
}

