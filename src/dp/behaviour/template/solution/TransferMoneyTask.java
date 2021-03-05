package dp.behaviour.template.solution;


public class TransferMoneyTask extends Task{
	
	public TransferMoneyTask(AuditTrail auditTrail) {
		super(auditTrail);
	}

	protected void doExecute() {

		System.out.println("Tansfer Money");
	}

}
