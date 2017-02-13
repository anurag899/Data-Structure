import java.util.*;
class Node{
    ArrayList<Integer> adjNode=new ArrayList<Integer>();
}
class TestClass{
    static void DFS(Node[] node,int u,int tim,int[] disc,int[] low,boolean[] vis,int[] parent,boolean[] ap){
        vis[u-1]=true;
        int count=0;
        low[u-1]=disc[u-1]=++tim;
        for(Integer t:node[u-1].adjNode){
            int n=t.intValue();
            int v=n-1;
            if(!vis[v]){
                count++;
                parent[v]=u-1;
                DFS(node,n,tim,disc,low,vis,parent,ap);
                low[u-1]=Math.min(low[v],low[u-1]);
                if(parent[u-1]!=-1 && disc[u-1]<=low[v]){
                    ap[u-1]=true;
                }
                if(parent[u-1]==-1 && count>1){
                    ap[u-1]=true;
                }
            }
            else if(v!=parent[u-1]){
                low[u-1]=Math.min(low[u-1],disc[v]);
            }
        }
    }
    public static void main(String... a){
        Scanner sc = new Scanner(System.in);
        int node = sc.nextInt();
        int edge = sc.nextInt();
        Node[] nodes = new Node[node];
        for(int i=0;i<node;i++){
            nodes[i]=new Node();
        }
        for(int i=0;i<edge;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            nodes[x-1].adjNode.add(y);
            nodes[y-1].adjNode.add(x);
        }
        int[] disc = new int[node];
        int[] low = new int[node];
        boolean[] vis = new boolean[node];
        int[] parent = new int[node];
        boolean[] ap = new boolean[node];
        int tim=0;
        for(int i=0;i<node;i++){
            parent[i]=-1;
        }
        DFS(nodes,1,tim,disc,low,vis,parent,ap);
        int q = sc.nextInt();
        int[] qr = new int[q];
        for(int i=0;i<q;i++){
            qr[i]=sc.nextInt();
        }
        for(int i=0;i<q;i++){
            if(ap[qr[i]-1]){
                System.out.println("Satisfied "+nodes[qr[i]-1].adjNode.size());
            }
            else{
                System.out.println("Not Satisfied ");
            }
        }
    }
}