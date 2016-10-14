package manuscript.module.academic.disciplines.manage;

import manuscript.module.academic.disciplines.request.AcademicDisciplinesUploadAllRequest;
import manuscript.module.academic.disciplines.response.AcademicDisciplinesUploadAllResponse;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public interface AcademicDisciplinesManagerDao {

	public AcademicDisciplinesUploadAllResponse updateAllAcademicDisciplines(AcademicDisciplinesUploadAllRequest request);
}
