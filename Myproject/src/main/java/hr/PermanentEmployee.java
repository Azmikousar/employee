package hr;

import java.time.LocalDate;

public class PermanentEmployee extends Employee{
	private float da,hra;

	public PermanentEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PermanentEmployee(int empNo, String empName, float empSal, String department, LocalDate dateOfJoining,
			LocalDate dateOfBirth,float da, float hra) {
		super(empNo, empName, empSal, department, dateOfJoining, dateOfBirth);
		this.da = da;
		this.hra = hra;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the da
	 */
	public float getDa() {
		return da;
	}

	/**
	 * @param da the da to set
	 */
	public void setDa(float da) {
		this.da = da;
	}

	/**
	 * @return the hra
	 */
	public float getHra() {
		return hra;
	}

	/**
	 * @param hra the hra to set
	 */
	public void setHra(float hra) {
		this.hra = hra;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(da);
		result = prime * result + Float.floatToIntBits(hra);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof PermanentEmployee))
			return false;
		PermanentEmployee other = (PermanentEmployee) obj;
		if (Float.floatToIntBits(da) != Float.floatToIntBits(other.da))
			return false;
		if (Float.floatToIntBits(hra) != Float.floatToIntBits(other.hra))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PermanentEmployee [da=" + da + ", hra=" + hra + ", toString()=" + super.toString() + "]";
	}

	@Override
	public float processSalary() {
		// TODO Auto-generated method stub
		float empSal=getEmpSal();
		float sal=empSal+da+hra;
		return sal;
	}
	

	

	

}
