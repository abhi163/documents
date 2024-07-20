class VarAndDataTypes {
	int instanceVariable = 7;
	static int staticVariable = 7;
	static String name = "Abhi";
	
	public void setStaticVariable(int variable){
		System.out.println(staticVariable);	
		staticVariable = variable;
	}
	
	public static void main(String[] args){
		int localVariable = 7;
		VarAndDataTypes variables = new VarAndDataTypes();
		variables.setStaticVariable(5);
		VarAndDataTypes variables1 = new VarAndDataTypes();
		System.out.println(localVariable);	
	}
}