/**
 * 
 */
package manuscript.module.academic.disciplines.response;

import java.util.List;

import manuscript.module.academic.disciplines.manage.beans.AcademicDisciplinesBean;

/**
 * @author Balazs Kovacs
 *
 */
public class AcademicDisciplinesGetAllResponse extends BaseResponseBean {

	private List<AcademicDisciplinesBean> academicDisciplines;

	public AcademicDisciplinesGetAllResponse(List<AcademicDisciplinesBean> academicDisciplines) {
		super();
		this.academicDisciplines = academicDisciplines;
	}

	public AcademicDisciplinesGetAllResponse() {
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
