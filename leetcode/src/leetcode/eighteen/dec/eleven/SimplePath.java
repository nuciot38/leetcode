package leetcode.eighteen.dec.eleven;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.naming.spi.DirStateFactory.Result;

public class SimplePath {
	public static String simplifyPath(String path) {
        String result = "/";
        String[] stubs = path.split("/");
        ArrayList<String> paths = new ArrayList<>();
        for(String s : stubs) {
        	if (s.equals("..")) {
				if (paths.size() > 0) {
					paths.remove(paths.size() - 1);
				}
			}else if (!s.equals(".") && !s.equals("")) {
				paths.add(s);
			}
        }
        for(String s : paths) {
        	result += s + "/";
        }
        if (result.length() > 1) {
			result = result.substring(0, result.length() - 1);
		}
        return result;
    }
	
	public static String simplifyPath2(String path) {
		LinkedList<String> queue = new LinkedList<>();
		String[] paths = path.split("/");
		for(String p : paths) {
			if("".equals(p) || ".".equals(p)) {
				continue;
			}else if ("..".equals(p)) {
				if(!queue.isEmpty()) {
					queue.removeLast();
				}
			}else {
				queue.addLast("/" + p);
			}
		}
		
		if (queue.isEmpty()) {
			return "/";
		}else {
			StringBuffer res = new StringBuffer();
			while(!queue.isEmpty()) {
				res.append(queue.removeFirst());
			}
			return res.toString();
		}
	}
	
	public static void main(String[] args) {
		System.out.println(simplifyPath("/a/./b///../../c/"));
		System.out.println(simplifyPath("//home/"));
		System.out.println();
	}
}
