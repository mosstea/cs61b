public class Graph {
	private final int V;
	private List<Integer>[] adj; // an array of ArrayList

	public Graph(int V) {
		this.V = V;
		this.adj = (List<Integer>[]) new ArrayList[V];
		for (int v = 0; v < V; v++) {
			adj[v] = new ArrayList<Integer>();
		}
	}

	public void addEdge(int s, int t) {
		adj[s].add(t);
		add[t].add(s);
	}

	public Iterable<Integer> adj(int v) {
		return adj[v];
	}
}