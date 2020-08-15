import sun.reflect.generics.tree.Tree;

import java.util.*;

public class BuildingOutline {
    public static class Node{
        private Boolean isUp;
        private int pos;
        private int height;

public Node(Boolean isUp,Integer pos,Integer height)
{
    this.height=height;
    this.isUp=isUp;
    this.pos=pos;
}

    }
    public static class nodesComparator implements Comparator<Node>
    {

        @Override
        public int compare(Node o1, Node o2) {
            if (o1.pos != o2.pos) {
                return o1.pos - o2.pos;
            }
            return 0;
        }
    }
    public static List<List<Integer>> buildingOutline(int[][] buildings) {

        int len = buildings.length;
        Node[] nodes = new Node[2 * len];
        for (int i = 0; i < len; i++) {
            nodes[2 * i] = new Node(true, buildings[i][0], buildings[i][2]);
            nodes[2 * i + 1] = new Node(false, buildings[i][1], buildings[i][2]);
        }
        Arrays.sort(nodes, new nodesComparator());
        TreeMap<Integer, Integer> htmap = new TreeMap<>();//高度的出现的次数
        TreeMap<Integer, Integer> po_hmap = new TreeMap<>();//每个点的最大的高度
        for (int i = 0; i < nodes.length; i++) {
            if (nodes[i].isUp) {
                if (!htmap.containsKey(nodes[i].height))
                    htmap.put(nodes[i].height, 1);
                else {
                    htmap.put(nodes[i].height, htmap.get(nodes[i].height) + 1);
                }
            } else {
                htmap.put(nodes[i].height, htmap.get(nodes[i].height) - 1);
                if (htmap.get(nodes[i].height) == 0)
                    htmap.remove(nodes[i]);
            }
            if (htmap.isEmpty())
                po_hmap.put(nodes[i].pos, 0);
            else
                po_hmap.put(nodes[i].pos, htmap.lastKey());
        }

        //根据pohmap找轮廓线
        List<List<Integer>> res = new ArrayList<>();
        int start = 0;//之前的x
        int height = 0;//之前的高度
        for (Map.Entry<Integer, Integer> entry : po_hmap.entrySet()) {
            int curPos = entry.getKey();
            int curHei = entry.getValue();
            if (curHei != height) {
                if (height != 0) {//高度为0时没有轮廓线。
                    List<Integer> pos = new ArrayList<>();
                    pos.add(start);
                    pos.add(curPos);
                    pos.add(height);
                    res.add(pos);
                }
                height = curHei;
                start = curPos;
            }
        }
        return res;
    }
}
