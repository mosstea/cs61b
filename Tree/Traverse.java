import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Traverse {

	public static void dfs(Tree T) {
		if (T == null) {
			return;
		}
		System.out.print(T.node + " ");
		dfs(T.left);
		dfs(T.right);
	}

	public static void bfs(Tree T) {
		boolean[] marked = new boolean[10];
		for (int i = 0; i < 10; i++) {
			marked[i] = false;
		}
		int[] edgeTo = new int[10];
		Queue<Tree> fringe = new LinkedList<>();
		marked[T.node] = true;
		fringe.offer(T);
		while (!fringe.isEmpty()) {
			Tree v = fringe.poll();
			System.out.print(v.node + " ");
			if (v.left != null) {
				if (!marked[v.left.node]) {
					fringe.offer(v.left);
					edgeTo[v.left.node] = v.node;
					marked[v.left.node] = true;
				}
			}
			if (v.right != null) {
				if (!marked[v.right.node]) {
					fringe.offer(v.right);
					edgeTo[v.right.node] = v.node;
					marked[v.right.node] = true;
				}
			} 	
		}
	}

	public static void iterativeDFS(Tree T) {
		Stack<Tree> stack = new Stack<>();
		boolean[] marked = new boolean[10];
		Arrays.fill(marked, false);
		int[] edgeTo = new int[10];
		stack.push(T);
		while (!stack.isEmpty()) {
			Tree v = stack.pop();
			System.out.print(v.node + " ");
			marked[v.node] = true;
			if (v.right != null) {
				if (!marked[v.right.node]) {
					stack.push(v.right);
					edgeTo[v.right.node] = v.node;
				}	
			}
			if (v.left != null) {
				if (!marked[v.left.node]) {
					stack.push(v.left);
					edgeTo[v.left.node] = v.node;	
				}
			}			
		}
	} 

	public static void main(String[] args) {
		Tree T1 = new Tree(0);
		Tree T2 = new Tree(1);
		Tree T3 = new Tree(2);
		Tree T4 = new Tree(3);
		T1.left = T2;
		T1.right = T3;
		T2.left = T4;
		dfs(T1);
		System.out.println();
		bfs(T1);
		System.out.println();
		iterativeDFS(T1);
	}
}