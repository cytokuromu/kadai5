package inttoeng;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class IntToEngtest {

	@Test
	public void さんからthreeへ変更() {
		IntToEng ite=new IntToEng();
		String expected="three";
		String actual = ite.translateEng(3);
		assertThat(actual, is(expected)); 
	}
	@Test
	public void じゅうはちからeighteenへ変更() {
		IntToEng ite=new IntToEng();
		String expected="eighteen";
		String actual = ite.translateEng(18);
		assertThat(actual, is(expected)); 
	}
	@Test
	public void きゅうじゅうよんからninety_fourへ変更() {
		IntToEng ite=new IntToEng();
		String expected="ninety four";
		String actual = ite.translateEng(94);
		assertThat(actual, is(expected)); 
	}
	@Test
	public void ななじゅうからseventyへ変更() {
		IntToEng ite=new IntToEng();
		String expected="seventy";
		String actual = ite.translateEng(70);
		assertThat(actual, is(expected)); 
	}
}
