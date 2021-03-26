public class intTree {
    private intTreeNode overallRoot;

    public intTree(int max) {
        if (max < 0) {
            throw new IllegalArgumentException("max: " + max);
        }
        overallRoot = buildTree(1, max);
    }

    private intTreeNode buildTree(int n, int max) {
        if (n > max * 2) {
            return null;
        } else {
            return new intTreeNode(n,
                    buildTree(n * 2 + 1, max),  //left
                    buildTree(n * 2 + 3, max)); //right
        }
    }
}
