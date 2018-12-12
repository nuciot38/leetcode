package leetcode.eighteen.dec.twelve;

import java.util.LinkedList;
import java.util.Queue;

public class IsSymmetricTree {
//    public boolean isSymmetric(TreeNode root) {
//    	return isMirror(root, root);
//    }
    //ตÝน้
    /*
    public boolean isMirror(TreeNode t1, TreeNode t2) {
    	if (t1 == null && t2 == null) {
			return true;
		}
    	if (t1 == null || t2 == null) {
			return false;
		}
    	return t1.val == t2.val 
    			&& isMirror(t1.right, t2.left)
    			&& isMirror(t1.left, t2.right);
    }*/
    
    public boolean isSymmetric(TreeNode root) {
    	Queue<TreeNode> queue =new LinkedList<>();
    	queue.add(root);
    	queue.add(root);
    	while(!queue.isEmpty()) {
    		TreeNode t1 = queue.poll();
    		TreeNode t2 = queue.poll();
    		if (t1 == null && t2 == null) continue;
    		if (t1 == null || t2 == null) return false;
    		if (t1.val != t2.val) return false;
    		queue.add(t1.left);
    		queue.add(t2.right);
    		queue.add(t1.right);
    		queue.add(t2.left);
    	}
    	return true;
    }
}

//class TreeNode{
//	int val;
//	TreeNode left;
//	TreeNode right;
//	TreeNode(int x){val = x;}
//}