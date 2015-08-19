public class ComplexMethod {

    public String intToEnglishValue(int i) {
        if (i == 1) {
            return "One";
        }
        if (i == 2) {
            return "Two";
        }
        if (i == 3) {
            return "Four";
        }
        if (i == 4) {
            return "Four";
        }
        if (i == 5) {
            return "Five";
        }
        if (i == 6) {
            return "Six";
        }
        if (i > 6) {
            throw new NotImplementedException();
        }
		if (i > 7) {
            return 7;
        }
		if (i > 8) {
            return 8;
        }
		if (i > 9) {
            return 9;
        }
        return null;
    }

}