package tree;
import java.util.*;
public class LevelSum {
	Node root;
	int maxl,max,l,lmax,lm;
    public static void main(String[] args) throws InterruptedException {
        Queue<Node> q = new LinkedList<Node>();
      	LevelSum l=new LevelSum();
      	l.root=new Node(1);
      	l.root.left=new Node(10);
      	l.root.right=new Node(3);
      	l.root.left.left=new Node(4);
      	l.root.left.right=new Node(5);
      	q.add(l.root);
      	q.add(null);
      	l.lm=1;
      	l.max=l.maxl=0;
      	while(!q.isEmpty()){
      		Node t=q.remove();
      		if(t==null){
      			if(l.maxl<l.max){
      					l.maxl=l.max;
      					l.lmax=l.lm;
      				}
      			if(!q.isEmpty()){
      				q.add(null);
      			}
      			l.max=0;
				l.lm++;
      		}
	      	else
	      	{	l.max+=t.key;
	      		if(t.left!=null){
	      			q.add(t.left);
	      		}
	      		if(t.right!=null){
	      			q.add(t.right);
	      		}
	      	}
      	}
		System.out.println("maximum sum is "+l.maxl + " and level is "+l.lmax);
}
}