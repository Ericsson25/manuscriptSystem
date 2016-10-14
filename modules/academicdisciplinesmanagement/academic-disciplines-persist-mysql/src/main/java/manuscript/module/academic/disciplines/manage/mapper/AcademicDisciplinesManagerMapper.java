package manuscript.module.academic.disciplines.manage.mapper;

import java.util.List;

import manuscript.module.academic.disciplines.manage.beans.AcademicDisciplinesBean;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public interface AcademicDisciplinesManagerMapper {

	public void updateAllAcademicDisciplines(List<AcademicDisciplinesBean> request);
	
	public void deleteAllAcademicDisciplines();
}
