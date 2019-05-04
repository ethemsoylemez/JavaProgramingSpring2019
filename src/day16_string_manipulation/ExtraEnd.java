package day16_string_manipulation;

public class ExtraEnd {
	public static void main(String[] args) {
		String str = "java";
		String result = "";

		if (str.length() == 2) {
			result = str + str + str;
		} else {
			result = str.substring(str.length() - 2);
			result += result + result;
		}
		System.out.println(result);

		int c = 1;
		switch (c) {
		case 1:
			System.out.println(c);//do not forget break
		case 2:
			System.out.println(c+"2");
			//break;
		case 3:
			System.out.println(c+"3");
			break;
		default:
			System.out.println("non of them");
		}
	}

}

