package com.j256.cloudwatchlogbackappender;

/**
 * Set of common utility methods copied from the Net.
 *
 * @author graywatson
 */
public class MiscUtils {

	/**
	 * Return true if the string is null, empty, or all whitespace, otherwise false.
	 * @param cs to check
	 * @return false is string has content
	 */
	public static boolean isBlank(final CharSequence cs) {
		if (cs == null || cs.length() == 0) {
			return true;
		}
		for (int i = 0; i < cs.length(); i++) {
			if (!Character.isWhitespace(cs.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}
