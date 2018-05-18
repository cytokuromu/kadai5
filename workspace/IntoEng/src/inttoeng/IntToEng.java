package inttoeng;

import java.util.Scanner;

public class IntToEng {

	// メインメソッド
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		System.out.println(translateEng(input));

	}

	// 数値を英訳する変換するメソッド
	static String translateEng(int n) {
		int quo = n;
		int place = 1;// 何の位まであるか
		String eng = "";// 返す文字列
		while (quo > 1) {
			quo = n / 10;
			place++;
		}
		String[] number = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		if (place == 3) {
			if (quo == 1) eng = "one hundred ";
			else eng=number[quo]+"  hundreds ";
			
		}
		String[] tens = { "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
		if (0 <= n && n < 20)
			eng = eng + number[n];
		else {
			if (n % 10 == 0)
				eng = eng + tens[n / 10 - 2];
			else
				eng = eng + tens[n / 10 - 2] + " " + number[n % 10];
		}

		return eng;
	}
}