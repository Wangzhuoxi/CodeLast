import java.util.HashMap;
import java.util.List;

/**
 * 并查集：1.检验两个数字是否是一个set  2.合并两个set (两个节点所在的set合并) 是一种特殊的数据结构
 *必须刚开始把所有的节点给并查集
 */
public class UnionFind {
    public static class Node {

        // whatever you like
    }

    public static class unionFind
    {
        private static HashMap<Node,Node> fathermap;//自己的父节点
        private static  HashMap<Node,Integer> countmap;//该节点所在的集合有几个节点
        public unionFind()
        {
            fathermap=new HashMap<Node,Node>();
            countmap=new HashMap<Node,Integer>();
        }
        public static void makeset(List<Node> nodes)//初始化
        {
            fathermap.clear();
            countmap.clear();
        for(Node node:nodes)//初始化时父节点是自己
            {
                fathermap.put(node,node);
                countmap.put(node,1);
            }

        }
        private static Node findHead(Node node)//找到头部并且把所有的节点的父节点设置为该头结点
        {
            Node father=fathermap.get(node);
            if(father!=node)
               father= findHead(father);
            fathermap.put(node,father);
            return father;
        }
        public boolean isSameSet(Node a,Node b)
        {
            return findHead(a)==findHead(b);

        }
        public void union(Node a,Node b)
        {
            Node headA=findHead(a);
            Node headB=findHead(b);
            if(headA!=headB)
            {
                int numa=countmap.get(headA);
                int numb=countmap.get(headB);
                if(numa>numb)
                {

                    fathermap.put(headA,headB);
                    countmap.put(headB,numa+numb);
                }
                else{
                    fathermap.put(headB,headA);
                    countmap.put(headA,numa+numb);
                }
            }

        }
    }
}
