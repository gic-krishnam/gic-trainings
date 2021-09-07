package day4;

public class Professor {
	  private String pname;
	  private String dept;
	  
	  //Getter methods
	  public String getProfName() {
	    return pname;
	  }
	  
	  public String getDeptName() {
	    return dept;
	  }
	  
	  //Setter methods
	  public void setProfName(String name) {
	    this.pname = name;
	  }
	  
	  public void setDeptName(String dept) {
	    this.dept = dept;
	  }
	  public static void main(String[] args) {
	    Professor p = new Professor();
	    p.setProfName("Mohan");
	    p.setDeptName("CSE");
	    System.out.println("Professor Name: " + p.getProfName());
	    System.out.println("Department: " + p.getDeptName());
	  }
	}
