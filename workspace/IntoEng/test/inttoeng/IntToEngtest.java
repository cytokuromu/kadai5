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

}
