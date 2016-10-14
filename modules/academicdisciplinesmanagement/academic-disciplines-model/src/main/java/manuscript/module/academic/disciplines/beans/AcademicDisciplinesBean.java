package manuscript.module.academic.disciplines.beans;

import java.util.HashMap;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public class AcademicDisciplinesBean {

	private String id;
	private String name;

	public AcademicDisciplinesBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AcademicDisciplinesBean(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public HashMap<String, String> getHashMap(){
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put(this.getId(), this.getName());
		return hashMap;
	}

	@Override
	public String toString() {
		return "AcademicDisciplinesBean [id=" + id + ", name=" + name + "]";
	}

}
