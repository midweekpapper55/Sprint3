import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

File APK = new File('APK//FuerzaVenta_HU1a12.apk')

Mobile.startApplication(APK.getAbsolutePath(), true)

Mobile.waitForElementPresent(findTestObject('Object Repository/Configuracion regional/ventana_region'), 50)

Mobile.waitForElementPresent(findTestObject('Object Repository/Configuracion regional/Opcin_Colombia'), 50)

Mobile.tap(findTestObject('Object Repository/Configuracion regional/Opcin_Colombia'), 50)

Mobile.waitForElementPresent(findTestObject('Configuracion regional/CONTINUAR'), 50)

Mobile.tap(findTestObject('Configuracion regional/CONTINUAR'), 50)

Mobile.waitForElementPresent(findTestObject('Object Repository/Configuracion regional/Completado'), 50)

Mobile.delay(2)

Mobile.pressBack()

Mobile.waitForElementPresent(findTestObject('Object Repository/Login/Input_user'), 50)

Mobile.setText(findTestObject('Object Repository/Login/Input_user'), '1022330668', 50)

Mobile.waitForElementPresent(findTestObject('Object Repository/Login/input_password'), 50)

Mobile.setText(findTestObject('Object Repository/Login/input_password'), '1111', 50)

Mobile.tap(findTestObject('Login/INGRESAR'), 50)

Mobile.waitForElementPresent(findTestObject('Object Repository/Login/btn_siguiente'), 500)

Mobile.tap(findTestObject('Object Repository/Login/btn_siguiente'), 50)

Mobile.tap(findTestObject('Object Repository/Login/btn_siguiente'), 50)

Mobile.tap(findTestObject('Object Repository/Login/btn_siguiente'), 50)

Mobile.tap(findTestObject('Object Repository/Login/btn_siguiente'), 50)

Mobile.waitForElementPresent(findTestObject('Object Repository/Login/btn_ok'), 50)

Mobile.tap(findTestObject('Object Repository/Login/btn_ok'), 50)

Mobile.waitForElementPresent(findTestObject('Object Repository/Login/infromacin general'), 50, FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('Login/informacion_ SIGUIENTE'), 50, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Login/informacion_ SIGUIENTE'), 50, FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('venta movil/android.widget.TextView10 - Venta Movil'), 50)

Mobile.tap(findTestObject('venta movil/android.widget.TextView10 - Venta Movil'), 50)

Mobile.delay(2)

Mobile.waitForElementPresent(findTestObject('venta movil/Seleccione - Producto'), 50, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('venta movil/Seleccione - Producto'), 50)

Mobile.waitForElementPresent(findTestObject('venta movil/android.widget.TextView1 - 1 Documento unitario'), 50)

Mobile.tap(findTestObject('venta movil/android.widget.TextView1 - 1 Documento unitario'), 50)

Mobile.waitForElementPresent(findTestObject('Documento unitario/Ciudad de destino'), 50)

Mobile.tap(findTestObject('Documento unitario/Ciudad de destino'), 50)

Mobile.scrollToText('Bogota')

Mobile.waitForElementPresent(findTestObject('venta movil/Bogota - Cundinamarca'), 50)

Mobile.tap(findTestObject('venta movil/Bogota - Cundinamarca'), 50)

Mobile.waitForElementPresent(findTestObject('Documento unitario/Tiempo de entrega'), 50)

Mobile.tap(findTestObject('Documento unitario/Tiempo de entrega'), 50)

Mobile.waitForElementPresent(findTestObject('Object Repository/venta movil/Tiempo de entrega - Normal'), 50)

Mobile.tap(findTestObject('Object Repository/venta movil/Tiempo de entrega - Normal'), 50)

Mobile.waitForElementPresent(findTestObject('Documento unitario/Forma de pago'), 50)

Mobile.tap(findTestObject('Documento unitario/Forma de pago'), 50)

Mobile.waitForElementPresent(findTestObject('Object Repository/venta movil/forma de pago - Contado'), 50)

Mobile.tap(findTestObject('Object Repository/venta movil/forma de pago - Contado'), 50)

Mobile.waitForElementPresent(findTestObject('Documento unitario/Medio de trasporte'), 50)

Mobile.tap(findTestObject('Documento unitario/Medio de trasporte'), 50)

Mobile.waitForElementPresent(findTestObject('Object Repository/venta movil/medio - Terrestre'), 50)

Mobile.tap(findTestObject('Object Repository/venta movil/medio - Terrestre'), 50)

Mobile.scrollToText('% Descuento', FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('Object Repository/venta movil/input_Peso fisico'), 50)

Mobile.setText(findTestObject('Object Repository/venta movil/input_Peso fisico'), '1', 50)

Mobile.waitForElementPresent(findTestObject('Object Repository/venta movil/Valor declarado'), 50)

Mobile.setText(findTestObject('Object Repository/venta movil/Valor declarado'), '5000', 50)

Mobile.waitForElementPresent(findTestObject('Documento unitario/Seleccione - Plan de descuento'), 50)

Mobile.tap(findTestObject('Documento unitario/Seleccione - Plan de descuento'), 50)

Mobile.waitForElementPresent(findTestObject('Documento unitario/Descuento Autorizado 10 Cdsd'), 50)

Mobile.tap(findTestObject('Documento unitario/Descuento Autorizado 10 Cdsd'), 50)

Mobile.waitForElementPresent(findTestObject('Object Repository/venta movil/LIQUIDAR'), 50)

Mobile.tap(findTestObject('Object Repository/venta movil/LIQUIDAR'), 50)

Mobile.waitForElementPresent(findTestObject('Documento unitario/COTIZAR(ATRAS)'), 500)

WebUI.delay(2)

Mobile.tap(findTestObject('Documento unitario/COTIZAR(ATRAS)'), 50)

Mobile.waitForElementPresent(findTestObject('Documento unitario/CE atras'), 500)

Mobile.tap(findTestObject('Documento unitario/CE atras'), 50)

Mobile.waitForElementPresent(findTestObject('Object Repository/cerrar sesion/menu_hamburguesa'), 50)

Mobile.tap(findTestObject('Object Repository/cerrar sesion/menu_hamburguesa'), 50)

Mobile.waitForElementPresent(findTestObject('cerrar sesion/boton cerrar sesion'), 50)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('cerrar sesion/boton cerrar sesion'), 50)

Mobile.waitForElementPresent(findTestObject('Object Repository/cerrar sesion/bloquear-aceptar'), 50)

Mobile.tap(findTestObject('Object Repository/cerrar sesion/bloquear-aceptar'), 50)

Mobile.waitForElementPresent(findTestObject('Object Repository/cerrar sesion/Cerrar sesin'), 50)

Mobile.tap(findTestObject('Object Repository/cerrar sesion/Cerrar sesin'), 50)

Mobile.tap(findTestObject('Object Repository/cerrar sesion/bloq_continuar'), 50)

Mobile.waitForElementPresent(findTestObject('Object Repository/cerrar sesion/Sesion cerrada'), 50)

Mobile.pressBack()

Mobile.closeApplication()

