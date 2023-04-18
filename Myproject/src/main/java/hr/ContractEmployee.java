/**
 * 
 */
package hr;

import java.time.LocalDate;

/**
 * @author ADMIN
 *
 */
public class ContractEmployee extends Employee {
	private int contractPeriod;
	private String contractor;
	private float incentives;

	/**
	 * 
	 */
	public ContractEmployee() {
		// TODO Auto-generated constructor stub
		super();
	}

	public ContractEmployee(int empNo, String empName, float empSal, String department, LocalDate dateOfJoining,
			LocalDate dateOfBirth,int contractPeriod, String contractor, float incentives) {
		super(empNo, empName, empSal, department, dateOfJoining, dateOfBirth);
		this.contractPeriod = contractPeriod;
		this.contractor = contractor;
		this.incentives = incentives;
		
	}

	/**
	 * @return the contractPeriod
	 */
	public int getContractPeriod() {
		return contractPeriod;
	}

	/**
	 * @param contractPeriod the contractPeriod to set
	 */
	public void setContractPeriod(int contractPeriod) {
		this.contractPeriod = contractPeriod;
	}

	/**
	 * @return the contractor
	 */
	public String getContractor() {
		return contractor;
	}

	/**
	 * @param contractor the contractor to set
	 */
	public void setContractor(String contractor) {
		this.contractor = contractor;
	}

	/**
	 * @return the incentives
	 */
	public float getIncentives() {
		return incentives;
	}

	/**
	 * @param incentives the incentives to set
	 */
	public void setIncentives(float incentives) {
		this.incentives = incentives;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + contractPeriod;
		result = prime * result + ((contractor == null) ? 0 : contractor.hashCode());
		result = prime * result + Float.floatToIntBits(incentives);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof ContractEmployee))
			return false;
		ContractEmployee other = (ContractEmployee) obj;
		if (contractPeriod != other.contractPeriod)
			return false;
		if (contractor == null) {
			if (other.contractor != null)
				return false;
		} else if (!contractor.equals(other.contractor))
			return false;
		if (Float.floatToIntBits(incentives) != Float.floatToIntBits(other.incentives))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ContractEmployee [contractPeriod=" + contractPeriod + ", contractor=" + contractor + ", incentives="
				+ incentives + ", toString()=" + super.toString() + "]";
	}

	@Override
	public float processSalary() {
		// TODO Auto-generated method stub
		float empSal=getEmpSal();
		float sal=empSal+incentives;
		return sal;
		
	}

	

	

}
