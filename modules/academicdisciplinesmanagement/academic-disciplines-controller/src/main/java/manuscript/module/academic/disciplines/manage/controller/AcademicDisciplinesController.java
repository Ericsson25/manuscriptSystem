package manuscript.module.academic.disciplines.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import manuscript.module.academic.disciplines.beans.AcademicDisciplinesBean;
import manuscript.module.academic.disciplines.manage.service.AcademicDisciplinesService;
import manuscript.module.academic.disciplines.request.AcademicDisciplinesUploadAllRequest;
import manuscript.module.academic.disciplines.response.AcademicDisciplinesUploadAllResponse;

/**
 * 
 * @author Balazs Kovacs
 *
 */
@Controller
@RequestMapping(value = "/academicdisciplines")
public class AcademicDisciplinesController {

	@Autowired
	private AcademicDisciplinesService academicDisciplinesService;
	
	@RequestMapping(value = "/uploadAll")
	@ResponseBody
	public AcademicDisciplinesUploadAllResponse addAcademicDisciplines(@RequestBody AcademicDisciplinesUploadAllRequest request) {
		return academicDisciplinesService.updateAllAcademicDisciplines(request);
	}
}
