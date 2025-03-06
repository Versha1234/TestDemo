package com.terex.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	protected Driver() {
	}

	public static WebDriver driver;

	public static WebDriver initDriver(String browser) throws Exception {

		if (browser.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else if (browser.equalsIgnoreCase("chrome")) {

			// Initialize the chrome driver

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}
		driver.manage().window().maximize();
		driver.get("https://login-epvk-dev1-saasfaprod1.fa.ocs.oraclecloud.com/oam/server/obrareq.cgi?encquery%3DFQGXKW3GGnerb%2BSKOyIMZVxlEjOx1g6dzgAC%2B0zh5YEJI4nSn8iaWqvQtPr%2Feh7x89d8Su1%2FesdkmECsIUnInBaMEVw0ApzB6cflDSewY8AO5DDEceX3FHIQCnqmXbVN1%2BZIm0jCr626%2BZaj%2FeOISAXiBOsD2goXXzjgPApu2%2BO7GtlJBOt7qzenp7jVoN5BiEtHI7zWyQQrOqSoFGup8aFyMgI7HrcLs5r183pWrKQUQFzJ6bu7w9JTFTN4IdbVYv2%2FfSjKO4YCzY%2BNDSCuu2alpxtCpEJ8lNokWORYx0N%2BWCVQwZV3c1Z2my3EIAqlh0RkGpcrJxb73MgZ2wxD1xPJbQi96%2F5QizlI%2B9HhwTeag54%2FKjWqWgUyM25%2B8KThBlgeUmtF8PX4pA%2FoaVpf5jrUw1Ar5UadUb8CFalsNOp%2FCOxKgq%2FFAdki8hphNYIjvdaG%2F7J81tn3Sd0%2BJnHGmM3i%2BeoUD%2FFsnLGEZOuOFrYGud0cEcWQLtkr%2FpfBg8LS7c54um2%2B6rFgVimtzJfGCvI59wt5KYcID4kXeCSpiZghCwvWDd1xZ%2FiFlQcg8%2BUSTHr%2FsGgmWbgr5L1R7uNrLL6TBj%2BdVIggt5HBS0B%2FRLTbV48rqr%2FZa8UmRDny6Q8sf3N%2BSDiN4VutU39J7Nn4Gud3BD5cdnyfZMeVK54l3lkuAOllMa%2FS3Hk8aOHlNgh41Vjy80Zo6JDTGTfoLKso1W1X7fV1UiXTKkkQiJMHzMrIdzZfGs3zkEH7G5%2FcG8LDIfCGwvMUSxmgE2h5Li45KIRMHa2Y6ee%2F88dPlbLArzy3hTyS%2FwwRj9V7XH336m4j13TNfWwsATnSqA%2B%2BadEIPTRuADv4PCJQH1iKdI8Hk0UrKIrQdwrjPXDsAlD9SsrAaGPLKNFMUDn6fUu2CQMrOd1nno4fbcQEdY%2Fuu5CjHfIPAnqHPIPY2wlmiwU0x0sFgnxaIx5kRH53WMplLvzDPeD4IYv%2FFDBDr9D2Iis%2FVafzk2OxPn%2FWJeHr%2Bao0Q29TL0CCuSGcW4%2B3b0v3Co%2FRojqI8k3HSdVtGyvPm3bdpwWzoY6wChrsE27iE9VVC%2FWItwx0mVYxaYkoCmEIV7uI6HNZSHv4Q26nlxmYaIt9LuIBPMN9oxtZ1nJ8fLD6asasbb79lRE1vAiSfJnpS0gXlZtX6mxUyLRF0DH4jqi%2FvBlaJ5e7jw03U2DbkbaZVq32DQE0uu5grukeyiBi9GtF0DK9r%2FEUSyIBydfAirumjcRYpweuOpw3yOMAkcLHzrhPZ%2F3IEh7YTnE5aD%2FclJrSU2k55yys6lGgEvAgs8dNBoYWVgyJkCPuBXKU2%2Bu2zTtsY8vDNlHEUfQGHnyYHyIcDXouaaAT3dewG9%2FZuL%2BP7H4NSFB3cMmckBjq2%2Ba6lqfIpS4%2FdktSair%2FGMp7yisCBx6il81TrnNJSUjVlj%2BfMslCsdkqFgWRJgu7pEoDgIi%2BM5etNGY7yAfKRWlPk5uzJR4YAXuqZRD3I6H0tQavvO%2F8VvVdniS6X8zD5%2BGw%2BzLqQ%2BbcqFECZ6XcstFPAmoE8PZLFaLpGjMaKSQaEB6ckb9H9ynuy9upa%2B49AtGYbKhgMZWB9X1kv1Uvv22It%2FR2lne1lbMJhnKea76orOyrRf0KQhoqvLo%2BYfH5c%2BayS79IEAR6huQpmAf%2FCg5jO93mtw%3D%3D%20agentid%3DOraFusionApp_11AG%20ver%3D1%20crmethod%3D2%26cksum%3D7f36c86f21d766680c64734622bccad137720295&ECID-Context=1.00629amqjMJ6MQQ5ubc9yX0004p20001Pq%3BkXjE");
		return driver;
	}

	public static void quitDriver() {
		driver.quit();
	}
}

