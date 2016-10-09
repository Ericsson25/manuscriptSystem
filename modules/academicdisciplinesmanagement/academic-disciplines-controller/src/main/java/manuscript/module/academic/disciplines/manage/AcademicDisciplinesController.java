package manuscript.module.academic.disciplines.manage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import manuscript.module.academic.disciplines.request.AcademicDisciplinesRequest;

/**
 * 
 * @author Balazs Kovacs
 *
 */
@Controller
@RequestMapping(value = "/academicdisciplines")
public class AcademicDisciplinesController {

	@RequestMapping(value = "/manage")
	@ResponseBody
	public void addAcademicDisciplines(@RequestBody AcademicDisciplinesRequest request) {
		System.out.println("helloka");
	}
}
