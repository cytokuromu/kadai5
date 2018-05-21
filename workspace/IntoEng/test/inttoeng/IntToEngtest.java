package inttoeng;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class IntToEngtest {

	@Test
	public void にひゃくさんじゅうよんの変更() {
		IntToEng ite = new IntToEng();
		String expected = "two hundreds thirty four";
		String actual = ite.translateEng(234);
		assertThat(actual, is(expected));
	}
	@Test
	public void きゅうひゃくの変更() {
		IntToEng ite = new IntToEng();
		String expected = "nine hundreds";
		String actual = ite.translateEng(900);
		assertThat(actual, is(expected));
	}
	@Test
	public void さんからthreeへ変更() {
		IntToEng ite = new IntToEng();
		String expected = "three";
		String actual = ite.translateEng(3);
		assertThat(actual, is(expected));
	}

	@Test
	public void じゅうはちからeighteenへ変更() {
		IntToEng ite = new IntToEng();
		String expected = "eighteen";
		String actual = ite.translateEng(18);
		assertThat(actual, is(expected));
	}

	@Test
	public void きゅうじゅうよんからninety_fourへ変更() {
		IntToEng ite = new IntToEng();
		String expected = "ninety four";
		String actual = ite.translateEng(94);
		assertThat(actual, is(expected));
	}

	@Test
	public void ななじゅうからseventyへ変更() {
		IntToEng ite = new IntToEng();
		String expected = "seventy";
		String actual = ite.translateEng(70);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void ひゃくからone_hundredへ変更() {
		IntToEng ite = new IntToEng();
		String expected = "one hundred ";
		String actual = ite.translateEng(100);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void ぜろからzeroへ変更() {
		IntToEng ite = new IntToEng();
		String expected = "zero";
		String actual = ite.translateEng(0);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void tensのテスト36() {
		IntToEng ite = new IntToEng();
		String expected = "thirty six";
		String actual = ite.tens(36, "");
		assertThat(actual, is(expected));
	}
	@Test
	public void tensのテスト40() {
		IntToEng ite = new IntToEng();
		String expected = "forty";
		String actual = ite.tens(40, "");
		assertThat(actual, is(expected));
	}
	@Test
	public void tensのテスト5() {
		IntToEng ite = new IntToEng();
		String expected = "five";
		String actual = ite.tens(5, "");
		assertThat(actual, is(expected));
	}
}
