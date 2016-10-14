package manuscript.module.academic.disciplines.manage.service;

import manuscript.module.academic.disciplines.request.AcademicDisciplinesUploadAllRequest;
import manuscript.module.academic.disciplines.response.AcademicDisciplinesUploadAllResponse;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public interface AcademicDisciplinesManagerService {

	/**
	 * It will update the whole academic disciplines table.
	 * 
	 * @param The whole json of the academic disciplines
	 * @return Success or error message. If success the updated academic discipline tree as well.
	 */
	public AcademicDisciplinesUploadAllResponse updateAllAcademicDisciplines(AcademicDisciplinesUploadAllRequest request);
}
