package manuscript.module.academic.disciplines.beans;

import java.util.List;

public class Nodes {

	private String id;
	private String name;
	private List<Nodes> nodes;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return name;
	}

	public void setTitle(String title) {
		this.name = title;
	}

	public List<Nodes> getNodes() {
		return nodes;
	}

	public void setNodes(List<Nodes> nodes) {
		this.nodes = nodes;
	}

	public Nodes(String id, String title, List<Nodes> nodes) {
		super();
		this.id = id;
		this.name = title;
		this.nodes = nodes;
	}

	public Nodes() {
		super();
		// TODO Auto-generated constructor stub
	}

}
