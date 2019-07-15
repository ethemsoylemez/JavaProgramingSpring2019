package day65_collections02;

public class Student implements Comparable<Student>{
	
	private int id;
	private String name;
	
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int compareTo(Student anotherStudent) {

		if(this.id > anotherStudent.id) { 		//first is greater
			return 1;
			
		}else if(this.id<anotherStudent.id) { 	//second is greater
			return -1; 
		}else {
			return 0;							//equals
		}
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}


	
}
