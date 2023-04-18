package hr;

import java.time.LocalDate;

public abstract class Employee {
	private int empNo;
	private String empName;
	private float  empSal;
	private String department;
	private LocalDate dateOfJoining;
	private LocalDate dateOfBirth;
	
	
	public Employee() {
		
		// TODO Auto-generated constructor stub
	}


	public Employee(int empNo, String empName, float empSal, String department, LocalDate dateOfJoining,
			LocalDate dateOfBirth) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSal = empSal;
		this.department = department;
		this.dateOfJoining = dateOfJoining;
		this.dateOfBirth = dateOfBirth;
	}


	/**
	 * @return the empNo
	 */
	public int getEmpNo() {
		return empNo;
	}


	/**
	 * @param empNo the empNo to set
	 */
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}


	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}


	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}


	/**
	 * @return the empSal
	 */
	public float getEmpSal() {
		return empSal;
	}


	/**
	 * @param empSal the empSal to set
	 */
	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}


	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}


	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}


	/**
	 * @return the dateOfJoining
	 */
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}


	/**
	 * @param dateOfJoining the dateOfJoining to set
	 */
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}


	/**
	 * @return the dateOfBirth
	 */
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}


	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((dateOfJoining == null) ? 0 : dateOfJoining.hashCode());
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + empNo;
		result = prime * result + Float.floatToIntBits(empSal);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (dateOfJoining == null) {
			if (other.dateOfJoining != null)
				return false;
		} else if (!dateOfJoining.equals(other.dateOfJoining))
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empNo != other.empNo)
			return false;
		if (Float.floatToIntBits(empSal) != Float.floatToIntBits(other.empSal))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empSal=" + empSal + ", department=" + department
				+ ", dateOfJoining=" + dateOfJoining + ", dateOfBirth=" + dateOfBirth + "]";
	}

public abstract float processSalary();
}
