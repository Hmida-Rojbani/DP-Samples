package dp.behaviour.template.solution;



public class Main {
	
	public static void main(String[] args) {
		TransferMoneyTask  trTask = new TransferMoneyTask(new AuditTrail());
		trTask.execute();
		
		GenerateReportTask grTask = new GenerateReportTask(new AuditTrail());
	
		grTask.execute();
	}

}
