package dp.behaviour.template.solution;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TransferMoneyTaskMoreSecure {
	private AuditTrail auditTrail;
	private class TransferMoney extends Task{
		
		public TransferMoney(AuditTrail auditTrail) {
			super(auditTrail);
		}

		protected void doExecute() {

			System.out.println("Tansfer Money");
		}
	}
	
	public void execute() {
		new TransferMoney(auditTrail).execute();;
	}

}