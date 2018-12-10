package leetcode.eighteen_dec_eight;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	List<List<Integer>> list = new ArrayList<>();
    	if (candidates.length == 0 || candidates == null) {
			return list;
		}
    	
    	Arrays.sort(candidates);
    	helper(candidates, target, list, 0, new ArrayList<Integer>());
		return null;
        
    }
    
    private void helper(int[] candidates, int target, List<List<Integer>> res, int startIndex, List<Integer> path) {
        if (target == 0) {// target == 0针对当前找不到组合和的情况不会成为递归的出口，程序会一直进行下去
            res.add(new ArrayList<>(path));
            return;
        }
        
        for (int i = startIndex; i < candidates.length; i++) {
            if (i > 0 && candidates[i] == candidates[i - 1]) { //remove duplicates
                continue;
            }
            if (candidates[i] > target) {
                return; //这个看似是一个剪枝，实际上也是一个递归的出口，说明再往下进行也找不到组合和了，必须停止程序
            }
            path.add(candidates[i]);
            helper(candidates, target - candidates[i], res, i, path);
            path.remove(path.size() - 1);
        }
    }
}
