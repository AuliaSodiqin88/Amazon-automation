import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.click(findTestObject('Object Repository/SignIn/Page_Amazoncom Online Shopping for Electron_9e43a3/span_Account  Lists'))

WebUI.setText(findTestObject('Object Repository/SignIn/Page_Amazon Sign-In/input_Email (phone for mobile accounts)_email'), 
    'benjamin.aulia88@gmail.com')

WebUI.click(findTestObject('Object Repository/SignIn/Page_Amazon Sign-In/input_Enter your email or mobile phone numb_fc7402'))

WebUI.setEncryptedText(findTestObject('Object Repository/SignIn/Page_Amazon Sign-In/input_Forgot your password_password'), 
    'PBa4DhhSiMjRhOeDEcFLRQ==')

WebUI.click(findTestObject('Object Repository/SignIn/Page_Amazon Sign-In/input_Enter your password_signInSubmit'))

WebUI.click(findTestObject('Object Repository/SignIn/Page_Authentication required/input_We will email you a One Time Password_aaa974'))

WebUI.delay(25)

WebUI.setText(findTestObject('Object Repository/SignIn/Page_Authentication required/input_Enter OTP_code'), '825429')

WebUI.click(findTestObject('Object Repository/SignIn/Page_Authentication required/input_Enter OTP_a-button-input'))

WebUI.click(findTestObject('Object Repository/SignIn/Page_/a_Not now'))

