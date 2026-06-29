package hash.map;

import binary_tree.node;
import java.util.*;
public class timeToInfectTree {
    static class Pair {
        node node;
        int time;

        Pair(node node, int time) {
            this.node = node;
            this.time = time;
        }
    }

    class Solution {
        static HashMap<node, node> parent;
        static node first;

        public static int amountOfTime(node root, int start) {
            parent = new HashMap<>();
            first = null;
            dfs(root, start);
            Queue<Pair> q = new LinkedList<>();
            HashSet<node> burned = new HashSet<>();
            burned.add(first);
            q.add(new Pair(first, 0));
            int maxTime = 0;
            while (!q.isEmpty()) {
                Pair front = q.poll();
                node node = front.node;
                int time = front.time;
                maxTime = Math.max(maxTime, time);
                if (node.left != null && !burned.contains(node.left)) {
                    q.add(new Pair(node.left, time + 1));
                    burned.add(node.left);
                }
                if (node.right != null && !burned.contains(node.right)) {
                    q.add(new Pair(node.right, time + 1));
                    burned.add(node.right);
                }

                if (parent.containsKey(node) && !burned.contains(parent.get(node))) {
                    q.add(new Pair(parent.get(node), time + 1));
                    burned.add(parent.get(node));
                }
            }

            return maxTime;

        }

        public static void dfs(node root, int start) {
            if (root == null) return;
            if (root.data == start) first = root;
            if (root.left != null) parent.put(root.left, root);
            if (root.right != null) parent.put(root.right, root);
            dfs(root.left, start);
            dfs(root.right, start);
        }
    }
}

