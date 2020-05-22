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

WebUI.delay(20)

WebUI.click(findTestObject('SignUP/Page_Amazoncom Online Shopping for Electronics Apparel Computers Books DVDs  more/span_Account  Lists_nav-icon nav-arrow'))

WebUI.click(findTestObject('SignUP/Page_Amazon Sign-In/span_Create your Amazon account'))

WebUI.setText(findTestObject('Object Repository/SignUP/Page_Amazon Registration/input_Your name_customerName'), 'Aulia1')

WebUI.setText(findTestObject('Object Repository/SignUP/Page_Amazon Registration/input_Email_email'), 'benjamin.aulia01@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/SignUP/Page_Amazon Registration/input_Password_password'), 'PBa4DhhSiMjRhOeDEcFLRQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/SignUP/Page_Amazon Registration/input_Re-enter password_passwordCheck'), 
    'PBa4DhhSiMjRhOeDEcFLRQ==')

WebUI.click(findTestObject('Object Repository/SignUP/Page_Amazon Registration/span_Create your Amazon account'))

WebUI.click(findTestObject('Object Repository/SignUP/Page_Amazon Registration/input_Passwords must match_continue'))

WebUI.setText(findTestObject('Object Repository/SignUP/Page_Authentication required/input_Enter OTP_code'), '808867')

WebUI.click(findTestObject('Object Repository/SignUP/Page_Authentication required/span_Create your Amazon account'))

WebUI.click(findTestObject('SignUP/Page_Authentication required/span_Create your Amazon account'))

WebUI.setText(findTestObject('Object Repository/SignUP/Page_Authentication required/input_Enter OTP_a-button-input'), '123456')

WebUI.click(findTestObject('SignUP/Page_Authentication required/span_Create your Amazon account'))

WebUI.closeBrowser()

