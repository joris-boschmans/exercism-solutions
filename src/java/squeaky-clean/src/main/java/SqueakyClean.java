
class SqueakyClean {
	static String clean(String identifier) {
		StringBuilder sb = new StringBuilder();
		boolean toUpper = false;
		for (char c : identifier.toCharArray()) {
			if (c == ' ') {
				sb.append("_");
			} else if (c <= 31 || c >= 127 && c <= 159) {
				sb.append("CTRL");
			} else if (c == '-') {
				toUpper = true;
			} else if (toUpper && Character.isLetter(c)) {
				sb.append(Character.toUpperCase(c));
				toUpper = false;
			} else if (Character.isLetter(c) && (c < 940 || c > 993)){
				sb.append(c);
			}
		}
		return sb.toString();
	}
}
