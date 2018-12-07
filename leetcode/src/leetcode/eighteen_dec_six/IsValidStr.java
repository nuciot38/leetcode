package leetcode.eighteen_dec_six;

import java.util.HashMap;
import java.util.Stack;



/**
 * 
 * @author 忆倾城
 *	初始化栈 S。
 *	1.一次处理表达式的每个括号。
 *	2.如果遇到开括号，我们只需将其推到栈上即可。这意味着我们将稍后处理它，让我们简单地转到前面的 子表达式。
 *	3.如果我们遇到一个闭括号，那么我们检查栈顶的元素。如果栈顶的元素是一个 相同类型的 左括号，那么我们将它从栈中弹出并继续处理。否则，这意味着表达式无效。
 *	4.如果到最后我们剩下的栈中仍然有元素，那么这意味着表达式无效。
 */
public class IsValidStr {
	private HashMap<Character, Character> mapping;
	public IsValidStr() {
		this.mapping = new HashMap<Character, Character>();
		this.mapping.put(')', '(');
		this.mapping.put('}', '{');
		this.mapping.put(']', '[');
	}
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if (this.mapping.containsKey(c)) {
				char top = stack.empty() ? '#':stack.pop();
				if (top != this.mapping.get(c)) {
					return false;
				}
			}else {
				stack.push(c);
			}
		}
		return stack.isEmpty();
    }
}
