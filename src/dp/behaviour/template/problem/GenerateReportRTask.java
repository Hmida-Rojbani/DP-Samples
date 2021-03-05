package dp.behaviour.template.problem;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GenerateReportRTask {
	
	private AuditTrail auditTrail;
	public void execute() {
		// record
		auditTrail.record();
		System.out.println("Generate Report");
	}

}
