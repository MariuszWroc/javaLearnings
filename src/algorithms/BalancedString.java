package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BalancedString {

	public static void main(String[] args) {
		List<String> expressions = Arrays.asList("<<>>","<>","<><>",">>","<<>","><><");
		List<Integer> maxReplacements = Arrays.asList(0,1,2,2,2,2);
		System.out.println(balancedOrNot(expressions, maxReplacements));

	}

	public static List<Integer> balancedOrNot(List<String> expressions, List<Integer> maxReplacements) {
		if (expressions == null || maxReplacements == null)
			return Collections.emptyList();
		if (expressions.isEmpty() || maxReplacements.isEmpty())
			return Collections.emptyList();

		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < expressions.size(); i++) {
			boolean isBalanced = balancedOrNot(expressions.get(i), maxReplacements.get(i));
			result.add(isBalanced ? 1 : 0);
		}
		return result;
	}

	private static boolean balancedOrNot(String expression, int max) {
		int openBrackets = 0;
		for (int i = 0; i < expression.length(); i++) {
			char currentChar = expression.charAt(i);
			if (currentChar == '<') {
				openBrackets++;
			} else if (currentChar == '>') {
				openBrackets--;
				if (openBrackets < 0) {
					if (max > 0) {

					} else {
						return false;
					}
				}
			}
		}

		return openBrackets >= -max && openBrackets <= 0;
	}

}
