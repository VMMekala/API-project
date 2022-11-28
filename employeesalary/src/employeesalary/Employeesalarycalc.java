package employeesalary;

public class Employeesalarycalc {
	
	
	
	public float claculategrosssalary(float basicpay,float BOA,float bonus)
	{
		float grosssalary = basicpay+BOA+bonus;
		
		//System.out.println("grosspayof employee " +grosssalary);
		
		return grosssalary;
	}
    public float taxcalc(float grosssalary)
{
	float tax = (grosssalary*13)/100;
	//System.out.println("tax deduction " +tax);
	
	return tax;
}
    
    public float pfdeduction(float basicpay)
    {
    	float pf = (float)12/100 *basicpay;
    	//System.out.println("PFdeduction " +pf);
    	
    	return pf;
    }
    
    public float takehomesalary(float grosssalary,float tax,float pf)
    {
    	float takehome = grosssalary-tax-pf;
    	
    	
    	return takehome;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Employeesalarycalc e1= new Employeesalarycalc();
		float g1 = e1.claculategrosssalary(7000, 5000, 2000);
	    float t1 = e1.taxcalc(g1);
		float pf1= e1.pfdeduction(7000);
		float empth1 = e1.takehomesalary(g1,t1,pf1);
		System.out.println("takehomesalary of an employee1 " +empth1);
		
		
		Employeesalarycalc e2= new Employeesalarycalc();
		float g2 = e2.claculategrosssalary(10000, 7000, 2500);
	    float t2 = e2.taxcalc(g2);
		float pf2= e2.pfdeduction(10000);
		float empth2 =e2.takehomesalary(g2,t2,pf2);
		System.out.println("takehomesalary of an employee2 " +empth2);
		
		Employeesalarycalc e3= new Employeesalarycalc();
		float g3 = e3.claculategrosssalary(12000, 9000, 3000);
	    float t3 = e3.taxcalc(g3);
		float pf3= e3.pfdeduction(12000);
		e3.takehomesalary(g3,t3,pf3);
		float empth3 =e3.takehomesalary(g2,t2,pf2);
		System.out.println("takehomesalary of an employee3 " +empth3);
		
	
		Employeesalarycalc e4= new Employeesalarycalc();
		float g4 = e4.claculategrosssalary(15000, 10000, 3500);
	    float t4 = e4.taxcalc(g4);
		float pf4= e4.pfdeduction(15000);
		e4.takehomesalary(g4,t4,pf4);
		float empth4 =e4.takehomesalary(g2,t2,pf2);
		System.out.println("takehomesalary of an employee4 " +empth4);
	}

}
