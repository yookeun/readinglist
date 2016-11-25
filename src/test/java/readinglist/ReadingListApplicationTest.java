package readinglist;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

/**
 * Created by yookeun on 2016. 11. 24..
 */

@RunWith(SpringJUnit4ClassRunner.class)
//  @SpringApplicationConfiguration(classes = ReadingListApplication.class) ==> deprecated 되어서 아래의 @SpringBootTest로 변경함
@SpringBootTest(classes = ReadingListApplication.class)
@WebAppConfiguration
public class ReadingListApplicationTest {

    @Test
    public void contextLoads() {
        System.out.println("TEst...");
    }
}