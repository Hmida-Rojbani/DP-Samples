package dp.behaviour.template.solution;


import lombok.AllArgsConstructor;
@AllArgsConstructor
public abstract class Task {
	
	private AuditTrail auditTrail;
	public void execute() {
		// record
		auditTrail.record();
		doExecute();
	}

	protected abstract void doExecute();

	
}
