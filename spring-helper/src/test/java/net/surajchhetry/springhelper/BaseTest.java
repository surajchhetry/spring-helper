package net.surajchhetry.springhelper;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

/**
 *
 * @author surajchhetry
 */
@ContextConfiguration(locations = "classpath:spring-config/core-context.xml")
public abstract class BaseTest extends AbstractTestNGSpringContextTests {
}