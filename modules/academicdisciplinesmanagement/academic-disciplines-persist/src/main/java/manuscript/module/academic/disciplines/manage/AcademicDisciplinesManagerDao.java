package manuscript.module.academic.disciplines.manage.dao;

import manuscript.module.academic.disciplines.request.AcademicDisciplinesUploadAllRequest;
import manuscript.module.academic.disciplines.response.AcademicDisciplinesUploadAllResponse;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public interface AcademicDisciplinesDao {

	public AcademicDisciplinesUploadAllResponse updateAllAcademicDisciplines(AcademicDisciplinesUploadAllRequest request);
}
