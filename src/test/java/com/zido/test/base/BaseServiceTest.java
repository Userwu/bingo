package com.zido.test.base;

import com.zido.bingo.BingoApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

/**
 * bingo.
 * Date: 2017/2/16 0016
 * Time: 12:46
 *
 * @author <a href="http://userwu.github.io">wuhongxu</a>.
 * @version 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {BingoApplication.class})
@ActiveProfiles("dev")
public class BaseServiceTest extends AbstractTestNGSpringContextTests {
}
