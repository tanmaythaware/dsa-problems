package spring.boot.dsa;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import spring.boot.dsa.service.StringAndArray;

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
}
