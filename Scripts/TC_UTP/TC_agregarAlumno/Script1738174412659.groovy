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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('TC_UTP/TC_loginUTP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/lateral_labelLibroDigital'), 5)

WebUI.click(findTestObject('Page_menuLateral/lateral_labelLibroDigital'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/lateral_lDigital_labelMatricula'), 5)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/lateral_lDigital_labelMatricula'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/matricula_buttonAgregarAlumno'), 
    5)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/matricula_buttonAgregarAlumno'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioButtonPasaporte'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioButtonRut'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inoutRut'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inoutRut'), 
    '241734994')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNombre'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNombre'), 
    'PRUEBAS')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputAPaterno'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputAPaterno'), 
    'PRUEBA')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputAMaterno'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputAMaterno'), 
    'PRUEBA')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputFechaN'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputFechaN'), 
    '25/11/2019')

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputAMaterno'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioButtonMasculino'), 
    5)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioButtonFemenino'), 
    5)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioButtonFemenino'))

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioButtonMasculino'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectNacionalidad                                                                                                                                                                                          Extranjera'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectNacionalidad                                                                                                                                                                                          Extranjera'), 
    'Alemana', false)

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectNacionalidad                                                                                                                                                                                          Extranjera'), 
    'Chilena', false)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectCivil                                                                                                                                       Casado(a)'), 
    5)

WebUI.selectOptionByValue(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectCivil                                                                                                                                       Casado(a)'), 
    '3', false)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectCivil                                                                                                                                       Casado(a)'), 
    '1', false)

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputReligion'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkReligion'), 
    5)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkReligion'))

WebUI.verifyElementVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputReligion'))

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputReligion'), 
    'NA')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputDireccion'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputDireccion'), 
    'PRUEBA')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectRegion                                                                                                                                          Tarapac'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectRegion                                                                                                                                          Tarapac'), 
    'Coquimbo', false)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectComuna'), 
    5)

WebUI.selectOptionByValue(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectComuna'), 
    '4202', false)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputCoPostal'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputCoPostal'), 
    '1570035')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectFax                                                                                              Numero principal'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectFax                                                                                              Numero principal'), 
    'Otro', false)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputTelefono'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputTelefono'), 
    '123456789')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputTeleCasa'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputTeleCasa'), 
    '123456789')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectTipoCorreo                                                                                Trabajo                                                                                                 Orga'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectTipoCorreo                                                                                Trabajo                                                                                                 Orga'), 
    'Trabajo', false)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputCorreo'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputCorreo'), 
    'Prueba@prueba.cl')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonAgregarCorreo'), 
    5)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonAgregarCorreo'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectTipoContacto'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectTipoContacto'), 
    'Correo', false)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputContactoNuevo'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputContactoNuevo'), 
    'prueba@prueba.cl')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectEnCasoEmergencia                                                                                                                                    Clnica'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectEnCasoEmergencia                                                                                                                                    Clnica'), 
    'Posta', false)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputEnfermedad'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputEnfermedad'), 
    'riñon')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputAlergia'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputAlergia'), 
    'mani')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputSangre'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputSangre'), 
    'b+')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputSisSalud'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputSisSalud'), 
    'fonasa')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNMatricula'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNMatricula'), 
    '1234')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputFechaMatricula'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputFechaMatricula'), 
    '30/01/2025')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputFechaIncorporacion'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputFechaIncorporacion'), 
    '30/01/2025')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputAnioIngreso'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputAnioIngreso'), 
    '2025')

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectPIE                                                                                                                    Sndrome de Down'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonAgregarPIE'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioDuracionPIE_NoEspe'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioDuracionPIE_permanente'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioDuracionPIE_transitorio'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPIE'), 
    5)

WebUI.scrollToElement(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputSisSalud'), 
    5)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputColegioProcedencia'))

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPIE'))

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectPIE                                                                                                                    Sndrome de Down'), 
    'Discapacidad Visual', false)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonAgregarPIE'))

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_select2PIE                                                                                                                Sndrome de Down'), 
    'Disfasia', false)

WebUI.delay(5)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonQuitarPie'))

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioDuracionPIE_transitorio'))

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioDuracionPIE_permanente'))

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioDuracionPIE_NoEspe'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkGrupDiferido'), 
    5)

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectGrupDiferido                                                                                                      Sin diagnstico PIE'))

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkGrupDiferido'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectGrupDiferido                                                                                                      Sin diagnstico PIE'), 
    5, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectGrupDiferido                                                                                                      Sin diagnstico PIE'), 
    'Disfasia', false)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectNivel                                                                                                                                            Nivel Medio Menor'), 
    5, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectNivel                                                                                                                                            Nivel Medio Menor'), 
    'Primero Básico', false)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectCurso'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectCurso'), 
    'Primero Básico B', false)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputColegioProcedencia'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputColegioProcedencia'), 
    'PRUEBA')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectOrigenIndigena                                                                                               Aymara'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectOrigenIndigena                                                                                               Aymara'), 
    'Mapuche', false)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPrioritario'), 
    5)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPrioritario'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPrioritario'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputPreferente'), 
    5)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputPreferente'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputPreferente'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkVulnerable'), 
    5)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkVulnerable'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkAlta'), 
    5)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkAlta'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkBecaIndigena'), 
    5)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkBecaIndigena'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkBecaIndigena'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPDLR'), 
    5)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPDLR'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPDLR'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPrioritario'), 
    5)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPrioritario'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkotrosBen'), 
    5)

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPAE'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_check3Colacion'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkUtilesEscolares'))

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkotrosBen'))

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPAE'))

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkUtilesEscolares'))

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPAE'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputBecaOtra'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputBecaOtra'), 
    'Prueba')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepitente'), 
    5)

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite1Basico'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite1Medio'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite2Basico'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite2Medio'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite3Basico'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite3Medio'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite4Basico'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite4Medio'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite5Basico'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite6Basico'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite7Basico'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite8Basico'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepiteKinder'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepitePreKin'))

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepitente'))

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite1Basico'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite1Basico'))

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite1Medio'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite1Medio'))

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite2Basico'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite2Basico'))

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite2Medio'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite2Medio'))

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite3Basico'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite3Basico'))

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite3Medio'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite3Medio'))

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite4Basico'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite4Basico'))

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite4Medio'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite4Medio'))

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite5Basico'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite5Basico'))

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite6Basico'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite6Basico'))

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite7Basico'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite7Basico'))

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite8Basico'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite8Basico'))

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepiteKinder'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepiteKinder'))

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepitePreKin'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkTextoMineduc'), 
    5)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkTextoMineduc'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectViveCon                                                                                   Padres                                                                                     Pap'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectViveCon                                                                                   Padres                                                                                     Pap'), 
    'Padres', false)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNPersonasFamilia'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNPersonasFamilia'), 
    '2')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNLugarHermano'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNLugarHermano'), 
    '1')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNhermanosColegio'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNhermanosColegio'), 
    '0')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputIndiqueOtros'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputIndiqueOtros'), 
    'PRUEBA')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNumeroHermanos'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNumeroHermanos'), 
    'PRUEBA')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNHermanosEdadEscolar'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNHermanosEdadEscolar'), 
    'PRUEBA')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectPertenece                                                               Programa Puente                                                                            Chile Solidario'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectPertenece                                                               Programa Puente                                                                            Chile Solidario'), 
    'Chile Solidario', false)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonAgregarApoderado'), 
    5)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonAgregarApoderado'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNombreApoderado'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNombreApoderado'), 
    'PUEBA')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputApellidoPApoderado'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputApellidoPApoderado'), 
    'PRUEBA')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputApellidoMApoderado'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputApellidoMApoderado'), 
    'PRUEBA')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputFechaNacimientoApo'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputFechaNacimientoApo'), 
    '10-10-1991')

WebUI.verifyElementClickable(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonAgregarFoto'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectDocumentoApoderado'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectDocumentoApoderado'), 
    'RUN', false)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputRutApoderado'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputRutApoderado'), 
    '1130026-K')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioMasculinoApoderado'), 
    5)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioMasculinoApoderado'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectEstadoCivilApo                                                                   Casado(a)                                                                                Separado(a)'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectEstadoCivilApo                                                                   Casado(a)                                                                                Separado(a)'), 
    'Casado(a)', false)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectParentescoApoderado'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectParentescoApoderado'), 
    'Madre', false)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectNacionalidadApo                                                                                                            Extranjera'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectNacionalidadApo                                                                                                            Extranjera'), 
    'Chilena', false)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputDireccionApo'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputDireccionApo'), 
    'Prueba')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectRegionApo'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectRegionApo'), 
    'Coquimbo', false)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectComunaApo'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectComunaApo'), 
    'Canela', false)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_codigoPostalApo'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_codigoPostalApo'), 
    '1570035', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputCorreoApoderado'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputCorreoApoderado'), 
    'prueba@prueba.cl')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputCelularApo'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputCelularApo'), 
    '123456789')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputTelefonoApo'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputTelefonoApo'), 
    '123456789')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectEscolaridadApo                                                                                                                                                             Sin escolaridad'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectEscolaridadApo                                                                                                                                                             Sin escolaridad'), 
    'Sin escolaridad', false)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputOcupacionApo'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputOcupacionApo'), 
    'NA')

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkCargaSaludApo'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkCargaSaludApo'))

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkApoFinanciero'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkApoFinanciero'))

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkApoTitular'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonAgregarApo'), 
    5)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonAgregarApo'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonConfirmarMatricula'), 
    5)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonConfirmarMatricula'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonCancelarImprecion'), 
    5)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonCancelarImprecion'))

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonCancelarImprecion'))

WebUI.delay(10)

