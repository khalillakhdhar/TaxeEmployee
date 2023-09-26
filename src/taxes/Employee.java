package taxes;

public class Employee {

	private String nom,grade;
	private double salaireBase;
	
	
	
	
	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}




	public String getGrade() {
		return grade;
	}




	public void setGrade(String grade) {
		this.grade = grade;
	}




	public double getSalaireBase() {
		return salaireBase;
	}




	public void setSalaireBase(double salaireBase) {
		this.salaireBase = salaireBase;
	}




	public Employee(String nom, String grade, double salaireBase) {
		super();
		this.nom = nom;
		this.grade = grade;
		this.salaireBase = salaireBase;
	}

public double taxe()
{
if(salaireBase<800)
	return 0;
else if(salaireBase<1600)
	return salaireBase*0.10;
else
	return salaireBase*0.15;
}
public double nette()
{
return salaireBase-taxe();	
}

	public Employee() {
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "Employee [" + (nom != null ? "nom=" + nom + ", " : "") + (grade != null ? "grade=" + grade + ", " : "")
				+ "salaireBase=" + salaireBase + ", taxe=" + taxe() + ", nette=" + nette() + "]";
	}

	
	
	
	
}
