package ZTI_Lab01;

public aspect AutoLog {
	public static void Logger.exit(String message){
		System.out.println("[" + i + "] Exiting method " + message);
		++i;
	}
	
	pointcut publicMethods() : execution(protected * ZTI_Lab01..*(..));

	pointcut logObjectCalls() : execution(* Logger.*(..));

	pointcut loggableCalls() : publicMethods() && ! logObjectCalls();

	before() : loggableCalls(){
		Logger.entry(thisJoinPoint.getSignature().toString());
	}

	after() : loggableCalls(){
		Logger.exit(thisJoinPoint.getSignature().toString());
	}
}
