package manuscript.module.academic.disciplines.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import manuscript.module.academic.disciplines.manage.AcademicDisciplinesManagerDao;
import manuscript.module.academic.disciplines.request.AcademicDisciplinesUploadAllRequest;
import manuscript.module.academic.disciplines.response.AcademicDisciplinesUploadAllResponse;

/**
 * 
 * @author Balazs Kovacs
 *
 */
@Service
public class AcademicDisciplinesManagerServiceImpl implements AcademicDisciplinesManagerService {

	@Autowired
	private AcademicDisciplinesManagerDao academicDisciplinesDao;

	@Override
	public AcademicDisciplinesUploadAllResponse updateAllAcademicDisciplines(
			AcademicDisciplinesUploadAllRequest request) {

		return academicDisciplinesDao.updateAllAcademicDisciplines(request);
	}

}
