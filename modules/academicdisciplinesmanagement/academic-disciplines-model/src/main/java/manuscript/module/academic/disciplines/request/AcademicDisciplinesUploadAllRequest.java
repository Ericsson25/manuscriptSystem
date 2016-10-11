package manuscript.module.academic.disciplines.request;

import java.util.List;

import manuscript.module.academic.disciplines.beans.ParentNode;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public class AcademicDisciplinesUploadAllRequest {

	private List<ParentNode> academicDisciplines;

	public AcademicDisciplinesUploadAllRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<ParentNode> getNodes() {
		return academicDisciplines;
	}

	public AcademicDisciplinesUploadAllRequest(List<ParentNode> nodes) {
		super();
		this.academicDisciplines = nodes;
	}

	public void setNodes(List<ParentNode> nodes) {
		this.academicDisciplines = nodes;
	}

}
