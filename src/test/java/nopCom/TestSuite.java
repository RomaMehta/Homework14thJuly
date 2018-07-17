package nopCom;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    JeweleryPage jeweleryPage = new JeweleryPage();
    CartPage cartPage = new CartPage();
    CheckOutLoginPage checkOutLoginPage = new CheckOutLoginPage();
    ShippingAddressPage shippingAddressPage = new ShippingAddressPage();
    ShippingMethodPage shippingMethodPage = new ShippingMethodPage();
    PaymentMethodPage paymentMethodPage = new PaymentMethodPage();
    PaymentInformationPage paymentInformationPage = new PaymentInformationPage();
    ConfirmOrderPage confirmOrderPage = new ConfirmOrderPage();
    CheckoutCompletedPage checkoutCompletedPage = new CheckoutCompletedPage();
    VirtualGiftCardPage virtualGiftCardPage = new VirtualGiftCardPage();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    CompareProductsPage compareProductsPage = new CompareProductsPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();
    BooksPage booksPage = new BooksPage();


    @Test (priority = 1)
    public void toVerifyThatUserIsAbleToRegisterSuccessfully(){
        homePage.clickOnRegister();
        registerPage.toVerifyUserIsOnRegistrationPage();
        registerPage.toRegisterUser();
        registerResultPage.toVerifyRegistrationResult();
        homePage.verifyUserIsLoggedIn();
    }

    @Test (priority = 2)
    public void toVerifyUserIsAbleToCompleteJewelleryOrderAsRegisteredCustomer (){
        homePage.clickOnJeweleryLink();
        jeweleryPage.addingJeweleryToCart();
        cartPage.toUpdateQuantityAndVerifyTermsOfService();
        checkOutLoginPage.toClickOnCheckOutRegisterButton();
        registerPage.toRegisterUser();
        registerResultPage.toVerifyRegistrationResult();
        cartPage.toClickOnTermsOfServiceAndCheckout();
        shippingAddressPage.fillShippingAddressDetails();
        shippingMethodPage.selectShippingOption();
        paymentMethodPage.selectPaymentOption();
        paymentInformationPage.enterCardDetails();
        confirmOrderPage.clickOnConfirm();
        checkoutCompletedPage.checkOrderSuccessful();
    }

    @Test (priority = 3)
    public void toVerifyUserIsAbleToChangeCurrency() {
        homePage.changeCurrency();
    }

    @Test (priority = 4)
    public void toVerifyThatNotRegisteredUserIsUnableToUseEmailAFriendFeature(){
        homePage.clickOnVirtualGiftCard();
        virtualGiftCardPage.fillVirtualGiftCardDetails();
        emailAFriendPage.fillFriendsDetailsAndVerifyResult();
    }

     @Test (priority = 5)
    public void toVerifyUserIsAbleToCompareTwoProducts(){
        homePage.addTwoProductsToCompareList();
        compareProductsPage.verifyUserIsOnCompareProductsPage();
     }

     @Test (priority = 6)
    public void toVerifyUserIsAbleToClearCompareProductList(){
        homePage.addTwoProductsToCompareList();
        compareProductsPage.verifyUserIsOnCompareProductsPage();
        compareProductsPage.toClearCompareProductListAndVerify();
     }

     @Test (priority = 7)
    public void toVerifyUserIsAbleToAddAppleiCamToCartAndIsAbleToSeeTheProductInCart(){
        homePage.clickOnElectronicLink();
        electronicsPage.clickOnCameraAndPhoto();
        cameraAndPhotoPage.addtoCartAppleiCam();
        cartPage.verifyAppleiCamIsAddedToCart();
     }

     @Test (priority = 8)
    public void t0VerifyUserIsAbleToUseSortByAndDisplayDropDownMenuInBooksPage(){
        homePage.clickOnBooksLink();
        booksPage.toUseSortByAndDisplayDropDownAndVerify();
     }

     @Test (priority = 9)
    public void toVerifyThatUserIsAbleToSuccessfullyCompleteJeweleryOrderAsAGuest(){
        homePage.clickOnJeweleryLink();
        jeweleryPage.addingJeweleryToCart();
        cartPage.toUpdateQuantityAndVerifyTermsOfService();
        checkOutLoginPage.checkOutAsGuest();
        shippingAddressPage.fillDetailsForGuestUser();
        shippingAddressPage.fillShippingAddressDetails();
        shippingMethodPage.selectShippingOption();
        paymentMethodPage.selectPaymentOption();
        paymentInformationPage.enterCardDetails();
        confirmOrderPage.clickOnConfirm();
        checkoutCompletedPage.checkOrderSuccessful();

     }
}
