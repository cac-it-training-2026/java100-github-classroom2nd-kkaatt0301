package lesson09.challenge04.Nurserry.Exception;

import lesson09.challenge04.Nurserry.logic.NurserySchoolChild;

public class CriticalConditionException extends Exception {

	public CriticalConditionException(NurserySchoolChild child) {
		System.out.println("\n" + child.getName() + "は重体です。");
	}
}
