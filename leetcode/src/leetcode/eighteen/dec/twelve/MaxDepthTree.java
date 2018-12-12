package leetcode.eighteen.dec.twelve;

import java.util.LinkedList;
import java.util.Queue;
import javafx.util.Pair;;

public class MaxDepthTree {
    public int maxDepth(TreeNode root) {
    	// 递归
//    	if (root == null) {
//			return 0;
//		}else {
//			int left_height = maxDepth(root.left);
//			int right_height = maxDepth(root.right);
//			return Math.max(left_height, right_height) + 1;
//		}
    	
    	//迭代（效果一般）
    	Queue<Pair<TreeNode, Integer>> stack = new LinkedList<>();
    	if (root != null) {
			stack.add(new Pair<TreeNode, Integer>(root, 1));
		}
    	
    	int depth = 0;
    	while(!stack.isEmpty()) {
    		Pair<TreeNode, Integer> current = stack.poll();
    		root = current.getKey();
    		int current_depth = current.getValue();
    		if (root != null) {
				depth = Math.max(depth, current_depth);
				stack.add(new Pair<TreeNode, Integer>(root.left, current_depth + 1));
				stack.add(new Pair<TreeNode, Integer>(root.right, current_depth + 1));
			}
    	}
    	return depth;
    }
}
