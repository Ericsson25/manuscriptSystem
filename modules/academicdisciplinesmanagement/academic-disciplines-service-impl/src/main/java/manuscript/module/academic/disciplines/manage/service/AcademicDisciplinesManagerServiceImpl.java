package manuscript.module.academic.disciplines.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import manuscript.module.academic.disciplines.manage.dao.AcademicDisciplinesDao;
import manuscript.module.academic.disciplines.request.AcademicDisciplinesUploadAllRequest;
import manuscript.module.academic.disciplines.response.AcademicDisciplinesUploadAllResponse;


/**
 * 
 * @author Balazs Kovacs
 *
 */
@Service
public class AcademicDisciplinesServiceImpl implements AcademicDisciplinesService {

	@Autowired
	private AcademicDisciplinesDao academicDisciplinesDao;
	
	@Override
	public AcademicDisciplinesUploadAllResponse updateAllAcademicDisciplines(AcademicDisciplinesUploadAllRequest request) {
		
		AcademicDisciplinesUploadAllResponse respones = new AcademicDisciplinesUploadAllResponse();
		
		return respones;
	}
	

}
