package manuscript.module.academic.disciplines.beans;

import java.util.List;

public class Node {

	private List<Nodes> node;

	public List<Nodes> getNodes() {
		return node;
	}

	public void setNodes(List<Nodes> nodes) {
		this.node = nodes;
	}

	public Node(List<Nodes> nodes) {
		super();
		this.node = nodes;
	}

	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}
}
