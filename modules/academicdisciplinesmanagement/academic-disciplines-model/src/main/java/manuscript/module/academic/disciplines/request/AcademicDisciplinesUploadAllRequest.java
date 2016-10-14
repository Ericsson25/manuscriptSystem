package manuscript.module.academic.disciplines.request;

import java.util.List;

import manuscript.module.academic.disciplines.manage.beans.AcademicDisciplinesBean;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public class AcademicDisciplinesUploadAllRequest {

	List<AcademicDisciplinesBean> academicDisciplines;

	public AcademicDisciplinesUploadAllRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AcademicDisciplinesUploadAllRequest(List<AcademicDisciplinesBean> academicDisciplines) {
		super();
		this.academicDisciplines = academicDisciplines;
	}

	public List<AcademicDisciplinesBean> getAcademicDisciplines() {
		return academicDisciplines;
	}

	public void setAcademicDisciplines(List<AcademicDisciplinesBean> academicDisciplines) {
		this.academicDisciplines = academicDisciplines;
	}

}
