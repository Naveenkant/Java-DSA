package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

	public static void main(String []args) throws InterruptedException {
		System.setProperty("webdriver.chrome.device", 
				"D:\\chromeDriver\\chromedriver_win32.exe");
		
	
				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
				driver.get("https://www.cricbet99.com");
				
				String Id="s9bna7382";
				String pass="#@1Naveen";
                    WebElement username=driver.findElement(By.name("User Name"));
					username.isDisplayed();
					username.isEnabled();
					username.sendKeys(Id);
					 
					WebElement password=driver.findElement(By.name("Password"));
					password.isDisplayed();
					password.isEnabled();
					password.sendKeys(pass);

				
				WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
				button.isDisplayed();
				button.isEnabled();
				button.click();
				
				
				driver.findElement(By.xpath("//a[contains(text(),'Chennai Super Kings v Delhi Capitals / May 10 2023')]")).click();
				
			//  infity run krna hai 
				int flag=1;
				boolean firstTeamBetDone=false;
				boolean secondTeamBetDone=false;
				int count=100000;
				String firstTeamRelativePath="//body[1]/app-root[1]/app-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-sport-detail[1]/app-d-sport-detail[1]/div[1]/div[1]/div[1]/div[3]/div[1]/app-market-detail[1]/div[1]/div[3]/div[1]/div[4]";
				String secondTeamRelativePath="//body[1]/app-root[1]/app-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-sport-detail[1]/app-d-sport-detail[1]/div[1]/div[1]/div[1]/div[3]/div[1]/app-market-detail[1]/div[1]/div[3]/div[2]/div[4]";
				String inputBoxCssSelector="input[type='number']";
				String submitButtonRelativePath="//button[normalize-space()='Submit']";
				String balanceRelativePath="/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/div[1]/app-topnav[1]/header[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[1]/b[1]/span[1]";
				double currentBal=Double.parseDouble(driver.findElement(By.xpath(balanceRelativePath)).getText().toString());                   
				double prevBal=currentBal;
				WebElement cashoutButton=driver.findElement(By.xpath("//div[3]//div[1]//app-market-detail[1]//div[1]//div[1]//button[1]"));
				
				while(true) {
					TimeUnit.MILLISECONDS.sleep(1000);
					
				WebElement teamA=driver.findElement(By.xpath(firstTeamRelativePath));
				WebElement teamB=driver.findElement(By.xpath(secondTeamRelativePath));
//				System.out.println(teamA+" -- "+teamB);
				String arr[]=teamA.getText().split("\n",2);
				String brr[]=teamB.getText().split("\n",2);
				
				double aTeamRate=Double.parseDouble(arr[0]);
				double bTeamRate=Double.parseDouble(brr[0]);
				
				if(firstTeamBetDone)
				System.out.println("Searching for second Team Now \n");
				else if(secondTeamBetDone)
					System.out.println("Searching for first Team Now \n");
				else System.out.println("Searching for first Team");
//				// FIRST TIME BET PLACED
				if(flag==1) {
					
						if(aTeamRate>=2.5 && aTeamRate<25) {
							teamA.click();
							WebElement stake=driver.findElement(By.cssSelector(inputBoxCssSelector));
							stake.clear();
							stake.sendKeys("100");
							driver.findElement(By.xpath(submitButtonRelativePath)).click();
							TimeUnit.SECONDS.sleep(7);
							 currentBal=Double.parseDouble(driver.findElement(By.xpath(balanceRelativePath)).getText().toString());                   
							 if(currentBal!=prevBal) {
								 prevBal=currentBal;
								    flag=0;
									firstTeamBetDone=true;
									System.out.println("Here first team bet placed at rate "+aTeamRate+"/n");

							 }
														}
						else if(bTeamRate>=2.5 && bTeamRate<25) {  // && b<25
							teamB.click();
							WebElement stake=driver.findElement(By.cssSelector(inputBoxCssSelector));
							stake.clear();
							stake.sendKeys("100");
							driver.findElement(By.xpath(submitButtonRelativePath)).click();
							TimeUnit.SECONDS.sleep(7);
							 currentBal=Double.parseDouble(driver.findElement(By.xpath(balanceRelativePath)).getText().toString());                   

							if(currentBal!=prevBal) {
								 prevBal=currentBal;
								 flag=0;
								 secondTeamBetDone=true;
								System.out.println("Here second team bet placed at rate "+bTeamRate+"/n");

							 }
						}
					
				}
				// SECOND TIME BET PLACED
				else if(flag==0){
					double cashoutPrice=0;
					double betPrice=0;
					if(firstTeamBetDone) {
						
						cashoutButton.click();
					//min lena hai 	(cashoutPrice=Math.min(up,down));
						
						if(bTeamRate>=2.35 && bTeamRate<25) {
							teamB.click();
							WebElement stake=driver.findElement(By.cssSelector(inputBoxCssSelector));
							stake.clear();
							stake.sendKeys("100");
							
							//min lena hai 	(betPrice=Math.min(up,down));
						}
						if(cashoutPrice>betPrice && cashoutPrice>=50) {
							cashoutButton.click();
							driver.findElement(By.xpath(submitButtonRelativePath)).click();
							TimeUnit.SECONDS.sleep(7);
							 currentBal=Double.parseDouble(driver.findElement(By.xpath(balanceRelativePath)).getText().toString());                   
                  
							 if(currentBal!=prevBal) {
								 prevBal=currentBal;
								 flag=1;
								 secondTeamBetDone=true;
								 System.out.println("Here second team bet placed after first at rate "+bTeamRate);
								 System.out.println("hamara kaam khtm");
									break;
							 }
						}else if(betPrice>cashoutPrice && betPrice>=25){
							
							driver.findElement(By.xpath(submitButtonRelativePath)).click();
							TimeUnit.SECONDS.sleep(7);
							 currentBal=Double.parseDouble(driver.findElement(By.xpath(balanceRelativePath)).getText().toString());                   
                   
							 if(currentBal!=prevBal) {
								 prevBal=currentBal;
								 flag=1;
								 secondTeamBetDone=true;
								 System.out.println("Here second team bet placed after first at rate "+bTeamRate);
								 System.out.println("hamara kaam khtm");
									break;
							 }
							
							
						}
					}else if(secondTeamBetDone) {
						
						if(aTeamRate>=2.35 && aTeamRate<25) {
							teamA.click();
							WebElement stake=driver.findElement(By.cssSelector(inputBoxCssSelector));
							stake.clear();
							stake.sendKeys("100");
							
						
						
							driver.findElement(By.xpath(submitButtonRelativePath)).click();
							TimeUnit.SECONDS.sleep(7);
							 currentBal=Double.parseDouble(driver.findElement(By.xpath(balanceRelativePath)).getText().toString());                   
                   
							 if(currentBal!=prevBal) {
								 prevBal=currentBal;
								 flag=1;
									firstTeamBetDone=true;
									System.out.println("Here first team bet placed after second at rate "+aTeamRate);
									System.out.println("hamara kaam khtm");
									break;
							 }else {
								 continue;
								 // try again to click submit button
							 }
								
						}
					}
					
				}

			}
		}
	}