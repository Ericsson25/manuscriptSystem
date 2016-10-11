package manuscript.module.academic.disciplines.manage.service;

import java.util.List;

import org.springframework.stereotype.Service;

import manuscript.module.academic.disciplines.beans.ParentNode;
import manuscript.module.academic.disciplines.request.AcademicDisciplinesUploadAllRequest;
import manuscript.module.academic.disciplines.response.AcademicDisciplinesUploadAllResponse;


/**
 * 
 * @author Balazs Kovacs
 *
 */
@Service
public class AcademicDisciplinesServiceImpl implements AcademicDisciplinesService {

	@Override
	public AcademicDisciplinesUploadAllResponse upload(AcademicDisciplinesUploadAllRequest request) {
		
		List<ParentNode> node = request.getNodes();
		
		return null;
	}

}
