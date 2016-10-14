package manuscript.module.academic.disciplines.response;

import java.util.List;

import manuscript.module.academic.disciplines.beans.AcademicDisciplinesBean;

public class AcademicDisciplinesUploadAllResponse {

	private List<AcademicDisciplinesBean> academicDisciplines;

	public AcademicDisciplinesUploadAllResponse(List<AcademicDisciplinesBean> academicDisciplines) {
		super();
		this.academicDisciplines = academicDisciplines;
	}

	public AcademicDisciplinesUploadAllResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<AcademicDisciplinesBean> getAcademicDisciplines() {
		return academicDisciplines;
	}

	public void setAcademicDisciplines(List<AcademicDisciplinesBean> academicDisciplines) {
		this.academicDisciplines = academicDisciplines;
	}

	@Override
	public String toString() {
		return "AcademicDisciplinesUploadAllRequest [academicDisciplines=" + academicDisciplines + "]";
	}
}
