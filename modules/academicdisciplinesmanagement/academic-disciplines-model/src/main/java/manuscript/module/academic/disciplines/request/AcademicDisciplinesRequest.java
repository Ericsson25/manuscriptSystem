package manuscript.module.academic.disciplines.request;

import java.util.List;

import manuscript.module.academic.disciplines.beans.Node;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public class AcademicDisciplinesRequest {

	private List<Node> academicDisciplines;

	public AcademicDisciplinesRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Node> getNodes() {
		return academicDisciplines;
	}

	public AcademicDisciplinesRequest(List<Node> nodes) {
		super();
		this.academicDisciplines = nodes;
	}

	public void setNodes(List<Node> nodes) {
		this.academicDisciplines = nodes;
	}

}
