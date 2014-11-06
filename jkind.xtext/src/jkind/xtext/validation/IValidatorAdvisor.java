package jkind.xtext.validation;


public interface IValidatorAdvisor {
	public boolean allowNonlinear();
	public boolean isYices2();
	public boolean isMathSat();
	public String getSolverName();
}
