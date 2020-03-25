package HDK.model;

public class TamGiac {
	private double canhA;
	private double canhB;
	private double canhC;
	public TamGiac(double canhA, double canhB, double canhC)
	{
		this.canhA=canhA;
		this.canhB=canhB;
		this.canhC=canhC;	
	}
	public TamGiac()
	{
		this.canhA=6;
		this.canhB=8;
		this.canhC=10;
	}
	public void setCanhA(double canhA)
	{
		this.canhA=canhA;
	}
	public double getCanhA()
	{
		return this.canhA;
	}
	public void setCanhB(double canhB)
	{
		this.canhB=canhB;
	}
	public double getCanhB()
	{
		return this.canhB;
	}
	public void setCanhC(double canhC)
	{
		this.canhC=canhC;
	}
	public double getCanhC()
	{
		return this.canhC;
	}
	public double tinhChuVi()
	{
		return this.canhA+this.canhB+this.canhC;
	}
	private double tinhNuaChuVi()
	{
		return tinhChuVi()/2;
	}
	public double tinhDienTich()
	{
		double p=tinhNuaChuVi();
		double dt = Math.sqrt(p*(p-this.canhA)*(p-this.canhB)*(p-this.canhC));
		return dt;
	}
}
