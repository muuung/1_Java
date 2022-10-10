package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import service.EmployeeService;
import vo.Employee;

public class EmployeeView {
	
	EmployeeService es = new EmployeeService();
	Scanner sc = new Scanner(System.in);
	
	public void view() {
		int input = 0;
		
		do {
			System.out.println("[메뉴]");
			System.out.println("1. 새로운 사원 정보 추가");
			System.out.println("2. 전체 사원 정보 조회");
			System.out.println("3. 사번이 일치하는 사원 정보 조회");
			System.out.println("4. 사번이 일치하는 사원 정보 수정");
			System.out.println("5. 사번이 일치하는 사원 정보 삭제");
			System.out.println("6. 입력 받은 부서와 일치하는 모든 사원 정보 조회");
			System.out.println("7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회");
			System.out.println("8. 부서별 급여 합 전체 조회");
			System.out.println("0. 프로그램 종료");
			System.out.println();
			
			try {
				System.out.print("선택 : ");
				input = sc.nextInt();

				System.out.println();
				
				switch(input) {
				case 1 : addEmployee(); break;
				case 2 : selectAll(); break;
				case 3 : selectEmpId(); break;
				case 4 : updateEmpId(); break;
				case 5 : deleteEmpId(); break;
				case 6 : selectTitle(); break;
				case 7 : selectSalary(); break;
				case 8 : salarySum(); break;
				case 0 : System.out.println("프로그램 종료"); break;
				default : System.out.println("잘못 입력하셨습니다.\n");
				}
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		} while(input != 0);
	}

	public void addEmployee() {
		System.out.println("[새로운 사원 정보 추가]");
		
		Employee em = new Employee();
		
		System.out.print("사원 번호 : ");
		int empId = sc.nextInt();
		
		System.out.print("사원 이름 : ");
		String empName = sc.next();
		
		System.out.print("주민등록번호 : ");
		String empNo = sc.next();
		
		System.out.print("이메일 : ");
		String email = sc.next();
		
		System.out.print("전화번호 : ");
		String phone = sc.next();
		
		System.out.print("부서명 : ");
		String departmentTitle = sc.next();
		
		System.out.print("직급명 : ");
		String jonName = sc.next();
		
		System.out.print("급여 : ");
		int salary = sc.nextInt();
		
		System.out.println();
		
		es.addEmployee(empId, empName, empNo, email, phone, departmentTitle, jonName, salary);

		System.out.println("추가 완료");
		System.out.println();
	}
	
	public void selectAll() {
		System.out.println("[전체 사원 정보 조회]");
		
		List<Employee> list = es.getList();
		
		for(Employee e : list) {
			System.out.println(e);
		}
		
		System.out.println();
	}

	public void selectEmpId() {
		System.out.println("[사번이 일치하는 사원 정보 조회]");
		
		System.out.print("사원 번호 : ");
		int id = sc.nextInt();
		
		System.out.println();
		
		if(es.equalsId(id)) {
			List<Employee> list = es.selectEmpId();

			for(Employee e : list) {
				System.out.println(e);
			}
			
		} else {
			System.out.println("조회할 사원이 존재하지 않습니다.");
		}
		
		System.out.println();
	}
	
	public void updateEmpId() {
		System.out.println("[사번이 일치하는 사원 정보 수정]");
		
		System.out.print("사원 번호 : ");
		int id = sc.nextInt();
		
		if(es.equalsId(id)) {
			System.out.print("수정할 이메일 : ");
			String email = sc.next();
			
			System.out.print("수정할 전화번호 : ");
			String phone = sc.next();
			
			es.updateEmpId(email, phone);
			
			System.out.println();
			System.out.println("수정 완료");
			
		} else {
			System.out.println();
			System.out.println("수정할 사원이 존재하지 않습니다.");
		}
		
		System.out.println();
	}

	public void deleteEmpId() {
		System.out.println("[사번이 일치하는 사원 정보 삭제]");
		
		System.out.print("사원 번호 : ");
		int id = sc.nextInt();
		
		System.out.println();
		
		if(es.equalsId(id)) {
			es.deleteEmpId();
			System.out.println("삭제 완료");
		} else {
			System.out.println("삭제할 사원이 존재하지 않습니다.");
		}
		
		System.out.println();
	}
	
	public void selectTitle() {
		System.out.println("[입력 받은 부서와 일치하는 모든 사원 정보 조회]");
		
		System.out.print("부서명 : ");
		String departmentTitle = sc.next();
		
		System.out.println();
		
		List<Employee> list = es.getList();
		
		if(es.selectTitle(departmentTitle)) {
			for(Employee e : list) {
				if(e.getDepartmentTitle().equals(departmentTitle)) {
					System.out.println(e);
				}
			}
			
		} else {
			System.out.println("존재하지 않는 부서입니다.");
		}
		
		System.out.println();
	}
	
	public void selectSalary() {
		System.out.println("[입력 받은 급여 이상을 받는 모든 사원 정보 조회]");
		
		System.out.print("급여 : ");
		int salary = sc.nextInt();
		
		System.out.println();
		
		List<Employee> list = es.getList();
		
		if(es.selectSalary(salary)) {
			for(Employee e : list) {
				if(e.getSalary() >= salary) {
					System.out.println(e);
				}
			}
		
		} else {
			System.out.println("조회 결과가 존재하지 않습니다.");
		}
		
		System.out.println();
	}
	
	public void salarySum() {
		System.out.println("[부서별 급여 합 전체 조회]");
		
		Map<String, Integer> map = es.salarySum();
		
		for(String key : map.keySet()) {
			System.out.printf("[%s : %4d]\n", key, map.get(key));
		}
		
		System.out.println();
	}
}