package entities;

public class TaxPayer {

	public double salaryIncome;
	public double servicesIncome;
	public double capitalIncome;
	public double healthSpending;
	public double educationSpending;
	
	public TaxPayer(double salaryIncome, double serviceIncome, double capitalIncome, double healthSpending,
			double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.servicesIncome = serviceIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(double serviceIncome) {
		this.servicesIncome = serviceIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}

	public double salaryTax() {
		double salaryTax = 0;
		if(salaryIncome / 12 >= 3000 & salaryIncome / 12 <= 5000) {
			return salaryTax = salaryIncome * 0.1;
		}
		else if (salaryIncome / 12 > 5000) {
			return salaryTax  = salaryIncome * 0.20; 
		}
		else {
			return salaryTax;
		}
	}
	
	public double servicesTax() {
		double serviceTax = 0;
		if (servicesIncome > 0) {
			serviceTax = servicesIncome * 0.15;
		}
		return serviceTax;
	}
	
	public double capitalTax() {
		double capitalTax = 0;
		if (capitalIncome > 0) {
			capitalTax = capitalIncome * 0.2;
		}
		return capitalTax;
	}
	
	public double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}
	
	public double taxRebate() {
		if(healthSpending + educationSpending > grossTax() * 0.3) {
			return grossTax() * 0.3;
		}
		else {
			return (healthSpending + educationSpending);
		}
	}
	
	public double netTax() {
		return grossTax() - taxRebate();
	}

	public String toString() {
		return "Imposto bruto total: " + 
				String.format("%.2f%n", grossTax()) + 
				"Abatimento: " +
				String.format("%.2f%n", taxRebate()) +
				"Imposto devido: " +
				String.format("%.2f%n", netTax());
	}
}
