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
        if (target == 0) {// target == 0��Ե�ǰ�Ҳ�����Ϻ͵���������Ϊ�ݹ�ĳ��ڣ������һֱ������ȥ
            res.add(new ArrayList<>(path));
            return;
        }
        
        for (int i = startIndex; i < candidates.length; i++) {
            if (i > 0 && candidates[i] == candidates[i - 1]) { //remove duplicates
                continue;
            }
            if (candidates[i] > target) {
                return; //���������һ����֦��ʵ����Ҳ��һ���ݹ�ĳ��ڣ�˵�������½���Ҳ�Ҳ�����Ϻ��ˣ�����ֹͣ����
            }
            path.add(candidates[i]);
            helper(candidates, target - candidates[i], res, i, path);
            path.remove(path.size() - 1);
        }
    }
}
