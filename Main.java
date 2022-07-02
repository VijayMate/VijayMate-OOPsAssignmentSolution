package gl.assignments;


class SuperDepartment{
	String departmentName() {		
		return "SuperDepartment";
	}
	
	String getTodaysWork() {
		return "No Work as of now";
	}
	
	String getWorkDeadline() {
		return "Nil";
	}
	
	String isTodayAHoliday() {
		return "Today is not a holiday";
	}	
}

class AdminDepartment extends SuperDepartment {
	
	String departmentName() {		
		return "Welcome to Admin Department";
	}
	
	String getTodaysWork() {
		return "Complete your documents Submission";
	}
	
	String getWorkDeadline() {
		return "Complete by EOD";
	}
}

class HrDepartment extends SuperDepartment{
	
	String departmentName() {		
		return "Welcome to Hr Department";
	}
	
	String getTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";
	}
	
	String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	String doActivity() {
		return "team Lunch";
	}	
}

class TechDepartment extends SuperDepartment{
	
	String departmentName() {		
		return "Welcome to Tech Department";
	}
	
	String getTodaysWork() {
		return "Complete coding of Module 1";
	}
	
	String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	String getTechStackInformation() {
		return "core Java";
	}	
}

public class Main {

	public static void main(String[] args) {
		
		AdminDepartment emp1 = new AdminDepartment();
		HrDepartment emp2 = new HrDepartment();
		TechDepartment emp3 = new TechDepartment();
		
		System.out.println(emp1.departmentName());
		System.out.println(emp1.getTodaysWork());
		System.out.println(emp1.getWorkDeadline());
		System.out.println(emp1.isTodayAHoliday());
		
		System.out.println();
		
		System.out.println(emp2.departmentName());
		System.out.println(emp2.doActivity());
		System.out.println(emp2.getTodaysWork());
		System.out.println(emp2.getWorkDeadline());
		System.out.println(emp2.isTodayAHoliday());
		
		System.out.println();
		
		System.out.println(emp3.departmentName());
		System.out.println(emp3.getTodaysWork());
		System.out.println(emp3.getWorkDeadline());
		System.out.println(emp3.getTechStackInformation());
		System.out.println(emp3.isTodayAHoliday());		
			
	}

}
