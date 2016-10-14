package manuscript.module.academic.disciplines.manage;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import manuscript.module.academic.disciplines.manage.beans.AcademicDisciplinesBean;
import manuscript.module.academic.disciplines.manage.mapper.AcademicDisciplinesManagerMapper;
import manuscript.module.academic.disciplines.request.AcademicDisciplinesUploadAllRequest;
import manuscript.module.academic.disciplines.response.AcademicDisciplinesUploadAllResponse;

/**
 * 
 * @author Balazs Kovacs
 *
 */
@Repository
public class AcademicDisciplinesManagerDaoImpl implements AcademicDisciplinesManagerDao {

	@Autowired
	AcademicDisciplinesManagerMapper academicDisciplinesManagerMapper;

	@Override
	public AcademicDisciplinesUploadAllResponse updateAllAcademicDisciplines(
			AcademicDisciplinesUploadAllRequest request) {
		AcademicDisciplinesUploadAllResponse response = new AcademicDisciplinesUploadAllResponse();

		List<AcademicDisciplinesBean> academicDisciplinesList = new ArrayList<AcademicDisciplinesBean>();
		academicDisciplinesList = request.getAcademicDisciplines();

			academicDisciplinesManagerMapper.deleteAllAcademicDisciplines();
			academicDisciplinesManagerMapper.updateAllAcademicDisciplines(academicDisciplinesList);
			response.setSucces(true);

		return response;
	}

}
