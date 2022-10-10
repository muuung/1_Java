package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import view.EmployeeView;
import vo.Employee;

public class EmployeeService {

	private List<Employee> list = new ArrayList<Employee>();
	private int idx;
	
	public EmployeeService() {
		list.add(0, new Employee(152, "김오이", "52", "oe52", "010-5252-5252", "오이시식", "베테랑오이", 252));
		list.add(1, new Employee(252, "박오이", "52", "oe52", "010-5252-5252", "오이시식", "베테랑오이", 352));
		list.add(2, new Employee(352, "이오이", "52", "oe52", "010-5252-5252", "오이요리", "베테랑오이", 452));
		list.add(3, new Employee(452, "최오이", "52", "oe52", "010-5252-5252", "오이요리", "베테랑오이", 552));
	}
	
	public List<Employee> getList() {
		return list;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}
	
	public void addEmployee(int empId, String empName, String empNo, String email, String phone,
							String departmentTitle, String jobName, int salary) {
		list.add(new Employee(empId, empName, empNo, email, phone, departmentTitle, jobName, salary));
	}

	public boolean equalsId(int id) {
		boolean boo = false;
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getEmpId() == id) {
				boo = true;
				setIdx(i);
				break;
			}
		}
		
		return boo;
	}
	
	public List<Employee> selectEmpId() {
		List<Employee> resultList = new ArrayList<Employee>();
		resultList.add(list.get(getIdx()));
		return resultList;
	}

	public void updateEmpId(String email, String phone) {
		list.get(getIdx()).setEmail(email);
		list.get(getIdx()).setPhone(phone);
	}

	public void deleteEmpId() {
		list.remove(getIdx());
	}

	public boolean selectTitle(String departmentTitle) {
		boolean boo = false;
		
		for(Employee e : list) {
			if(e.getDepartmentTitle().equals(departmentTitle)) {
				boo = true;
			}
		}
		
		return boo;
	}

	public boolean selectSalary(int salary) {
		boolean boo = false;
		
		for(Employee e : list) {
			if(e.getSalary() >= salary) {
				boo = true;
			}
		}
		
		return boo;
	}
	
	public Map<String, Integer> salarySum() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(Employee e : list ) {
			String key = e.getDepartmentTitle();
			int value = map.get(key) == null ? 0 : map.get(key); 
			map.put(key, value + e.getSalary());
		}
		
		// 이건 어떻게 쓸지 감이 정말 안와서 선생님 찬스 썼어요...
		
		// 대충 이해한 내용↓↓
		// map은 동일한 키에 값을 저장하면 이전에 있던 값이 없어진다
		// 그래서 key에 부서명을 저장하고
		// value라는 변수에 기존 키의 값을 저장해준 후,
		// getter로 가져온 현재 값과 더해서 해당 key에 다시 넣어준다!
		
		return map;
	}
}