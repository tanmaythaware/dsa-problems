package spring.boot.dsa;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import spring.boot.dsa.service.StringAndArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DsaApplicationTests {
	/*
	assertEquals
	assertTrue
	assertFalse
	assertNotNull
	assertNull

	assertAll
	*/

	@Test
	void contextLoads() {
	}

	@Test
	void countConsistentStringsTest(){
		StringAndArray stringAndArray = new StringAndArray();
		assertAll("countConsistentStrings",
				() -> assertEquals(2, stringAndArray.countConsistentStrings("ab",new String[] {"ad","bd","aaab","baa","badab"})),
				() -> assertEquals(7, stringAndArray.countConsistentStrings("abc",new String[] {"a","b","c","ab","ac","bc","abc"}))
		);
	}

	@Test
	void firstPalindromeTest(){
		StringAndArray stringAndArray = new StringAndArray();
		assertAll("firstPalindrome",
				() -> assertEquals("ujvoejixvaioikkwzxgtmkchckrigfejjpheiiehpjjefgirkchckmtgxzwkkioiavxijeovju",stringAndArray.firstPalindrome(new String[] {"knywrurkwbrtpalvuuzbczcwzpdqibcwwyflwiddixemsrwblupyerjgvcpavdjfhmujitcsmdbvhxw","ovkeowhqvwlndtpxdnimgietvjsqydbuuwmxkfxxgn","damomwtjugmsrfyvytaheg","bngqatscosdakdwjz","jwzcowuantgqlzjrzgpapcugxvviltrhmcwijtpqapmxjfcilrsmsbeffphcxmaozlczncoxxjmuqijhidxqinhywrtah","ujvoejixvaioikkwzxgtmkchckrigfejjpheiiehpjjefgirkchckmtgxzwkkioiavxijeovju","kacjvcouuigbhydrryaperxvjetwsycmnlkxujaqngjhhotqskclquklxsozfryfxwiksstmropcdvhgsnosgvltqo","qrbsdxxolwzmyltproznfgyydxkkejwdiwpvfzvjoxqvwguoerhclytzvolymbxummwsoqtttyttik","tkekt","esrshrlfoihhjrouleucwpeubygivoatrfraphgwpvtkanwu","kwzrfelynncvsrwvaukiinhjdydmlimggjldhflygemzwnjizzlsuqwahsufwmwhfjkjpngdfsudyavtogoaqzknpew","sdgpcnvsbzxhyjt"})),
				() -> assertEquals("",stringAndArray.firstPalindrome(new String[]{"def","ghi"})));
	}

	@Test
	void countSeniorsTest(){
		StringAndArray stringAndArray = new StringAndArray();
		assertAll("countSeniors",
				() -> assertEquals(2,stringAndArray.countSeniors(new String[]{"7868190130M7522","5303914400F9211","9273338290F4010"})));
	}

	@Test
	void minOperations(){
		StringAndArray stringAndArray = new StringAndArray();
		int[] ans = new int[]{1,1,3};
		assertEquals(true, Arrays.equals(ans,stringAndArray.minOperations("110")));
	}

	@Test
	void findAndReplacePatternTest(){
		StringAndArray stringAndArray = new StringAndArray();
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");

		assertEquals(true, list.equals(stringAndArray.findAndReplacePattern(new String[]{"a","b","c"},"a")));
	}

	@Test
	void numOfPairsTest(){
		StringAndArray stringAndArray = new StringAndArray();
		assertEquals(2,stringAndArray.numOfPairs(new String[]{"123","4","12","34"},"1234"));
	}

	@Test
	void getSecondHighestElementTest(){
		StringAndArray stringAndArray = new StringAndArray();
		assertEquals(-1,stringAndArray.getSecondHighestElement(new int[]{5,5,5,5,5}));
	}

	@Test
	void moveZeroesTest(){
		StringAndArray stringAndArray = new StringAndArray();
//		int[] ans = ;
		assertEquals(new int[]{10, 2, 12, 13, 0, 0},stringAndArray.moveZeroes(new int[]{10,0,2,12,0,13},6));
	}

	@Test
	void splitWordsBySeparatorTest(){
		StringAndArray stringAndArray = new StringAndArray();
		stringAndArray.splitWordsBySeparator();
	}
}
