package com.paypal.selion.testcomponents;

import com.paypal.selion.testcomponents.BasicPageImpl;
import com.paypal.selion.platform.html.Link;
import com.paypal.selion.platform.html.Container;
import com.paypal.selion.platform.html.ParentTraits;

public class Login extends BasicPageImpl {

    private HeaderContainer headerContainer;
    private Link enableExpressCheckoutLink;
    private Link requestAPICredentialsLink;
    private Link grantAPIPermissionLink;
    private Link addOrEditAPIPermissionsLink;
    private Link viewAPISignatureLink;
    private Link viewAPICertificateLink;


     /**
     * SeLion GUI Html Object Standard
     *    
     * The naming conventions followed in SeLion for html elements are as follows,
     *
     * <alias>{corresponding class name of the html element in SeLion} where - <alias> will be the object name with its 
     * first letter in lowercase.
     * 
     * <alias>Button                For Button html element.
     * <alias>CheckBox              For Check Box html element.
     * <alias>DatePicker            For Date Picker html element.
     * <alias>Form                  For Form html element.
     * <alias>Image                 For Image html element.
     * <alias>Label                 For Label html element.
     * <alias>Link                  For Link html element.
     * <alias>RadioButton           For Radio Button html element.
     * <alias>List                  For Select List html element.
     * <alias>Table                 For Table html element.
     * <alias>TextField             For Text Field html element.
     * <alias>Container             For Container html element.
     * 
     */
     

    private static String CLASS_NAME = "Login";
    private static String PAGE_DOMAIN = "";


    /**
     * Creates a new Login object
     */
    public Login() {
        super.initPage(PAGE_DOMAIN, CLASS_NAME);
    }
    
    /**
     * Creates a new Login object
     *
     * @param siteLocale
     *            The Country locale for the site you are accessing
     */
    public Login(String siteLocale) {
        super.initPage(PAGE_DOMAIN, CLASS_NAME, siteLocale);
    }

    public Login getPage() {
        return this;
    }



    /**
     * Used to get the HeaderContainer.
     *
     * @return headerContainer
     */
    public HeaderContainer getHeaderContainer() {
        HeaderContainer element = this.headerContainer;
        if(element == null) {
            this.headerContainer = new HeaderContainer(getObjectMap().get("headerContainer"), 
                    "headerContainer", this,this.getObjectContainerMap().get("headerContainer"));
        }
        return this.headerContainer;
    }

    /**
     * Used to get HeaderContainer at specified index.
     *
     * @return headerContainer at index
     */
    public HeaderContainer getHeaderContainer(int index) {
        getHeaderContainer().setIndex(index);
        return headerContainer;
    }



    /**
     * Used to get enableExpressCheckoutLink in the page Login
     *
     * @return enableExpressCheckoutLink
     */
    public Link getEnableExpressCheckoutLink() {
        Link element = this.enableExpressCheckoutLink;
        if(element == null) {
            this.enableExpressCheckoutLink = new Link(getObjectMap().get("enableExpressCheckoutLink"), "enableExpressCheckoutLink",
                    this);
        }
        return this.enableExpressCheckoutLink;
    }

    /**
     * Used to check the control enableExpressCheckoutLink in the page Login and wait for the object to load.
     */
    public void clickEnableExpressCheckoutLink(Object... expected) {
        getEnableExpressCheckoutLink().click(expected);
    }

    /**
     * Used to click enableExpressCheckoutLink in the page Login
     */
    public void clickEnableExpressCheckoutLink() {
        getEnableExpressCheckoutLink().click();
    }



    /**
     * Used to get requestAPICredentialsLink in the page Login
     *
     * @return requestAPICredentialsLink
     */
    public Link getRequestAPICredentialsLink() {
        Link element = this.requestAPICredentialsLink;
        if(element == null) {
            this.requestAPICredentialsLink = new Link(getObjectMap().get("requestAPICredentialsLink"), "requestAPICredentialsLink",
                    this);
        }
        return this.requestAPICredentialsLink;
    }

    /**
     * Used to check the control requestAPICredentialsLink in the page Login and wait for the object to load.
     */
    public void clickRequestAPICredentialsLink(Object... expected) {
        getRequestAPICredentialsLink().click(expected);
    }

    /**
     * Used to click requestAPICredentialsLink in the page Login
     */
    public void clickRequestAPICredentialsLink() {
        getRequestAPICredentialsLink().click();
    }



    /**
     * Used to get grantAPIPermissionLink in the page Login
     *
     * @return grantAPIPermissionLink
     */
    public Link getGrantAPIPermissionLink() {
        Link element = this.grantAPIPermissionLink;
        if(element == null) {
            this.grantAPIPermissionLink = new Link(getObjectMap().get("grantAPIPermissionLink"), "grantAPIPermissionLink",
                    this);
        }
        return this.grantAPIPermissionLink;
    }

    /**
     * Used to check the control grantAPIPermissionLink in the page Login and wait for the object to load.
     */
    public void clickGrantAPIPermissionLink(Object... expected) {
        getGrantAPIPermissionLink().click(expected);
    }

    /**
     * Used to click grantAPIPermissionLink in the page Login
     */
    public void clickGrantAPIPermissionLink() {
        getGrantAPIPermissionLink().click();
    }



    /**
     * Used to get addOrEditAPIPermissionsLink in the page Login
     *
     * @return addOrEditAPIPermissionsLink
     */
    public Link getAddOrEditAPIPermissionsLink() {
        Link element = this.addOrEditAPIPermissionsLink;
        if(element == null) {
            this.addOrEditAPIPermissionsLink = new Link(getObjectMap().get("addOrEditAPIPermissionsLink"), "addOrEditAPIPermissionsLink",
                    this);
        }
        return this.addOrEditAPIPermissionsLink;
    }

    /**
     * Used to check the control addOrEditAPIPermissionsLink in the page Login and wait for the object to load.
     */
    public void clickAddOrEditAPIPermissionsLink(Object... expected) {
        getAddOrEditAPIPermissionsLink().click(expected);
    }

    /**
     * Used to click addOrEditAPIPermissionsLink in the page Login
     */
    public void clickAddOrEditAPIPermissionsLink() {
        getAddOrEditAPIPermissionsLink().click();
    }



    /**
     * Used to get viewAPISignatureLink in the page Login
     *
     * @return viewAPISignatureLink
     */
    public Link getViewAPISignatureLink() {
        Link element = this.viewAPISignatureLink;
        if(element == null) {
            this.viewAPISignatureLink = new Link(getObjectMap().get("viewAPISignatureLink"), "viewAPISignatureLink",
                    this);
        }
        return this.viewAPISignatureLink;
    }

    /**
     * Used to check the control viewAPISignatureLink in the page Login and wait for the object to load.
     */
    public void clickViewAPISignatureLink(Object... expected) {
        getViewAPISignatureLink().click(expected);
    }

    /**
     * Used to click viewAPISignatureLink in the page Login
     */
    public void clickViewAPISignatureLink() {
        getViewAPISignatureLink().click();
    }



    /**
     * Used to get viewAPICertificateLink in the page Login
     *
     * @return viewAPICertificateLink
     */
    public Link getViewAPICertificateLink() {
        Link element = this.viewAPICertificateLink;
        if(element == null) {
            this.viewAPICertificateLink = new Link(getObjectMap().get("viewAPICertificateLink"), "viewAPICertificateLink",
                    this);
        }
        return this.viewAPICertificateLink;
    }

    /**
     * Used to check the control viewAPICertificateLink in the page Login and wait for the object to load.
     */
    public void clickViewAPICertificateLink(Object... expected) {
        getViewAPICertificateLink().click(expected);
    }

    /**
     * Used to click viewAPICertificateLink in the page Login
     */
    public void clickViewAPICertificateLink() {
        getViewAPICertificateLink().click();
    }

    public class HeaderContainer extends Container {
    
        private Link someLink;

        /**
         * HeaderContainer Construction method <br>
         * <br>
         * <b>Usage:</b>
         * 
         * <pre>
         * private Login pageInstance = new Login();
         * private Login.HeaderContainer headerContainer = pageInstance.new HeaderContainer(&quot;//span[@id='containerLocator']&quot;);
         * </pre>
         * 
         * @param locator
         *            the element locator
         */
        public HeaderContainer(String locator) {
            super(locator);
        }

        /**
         * Use this constructor to override default controlName for logging purposes. Default controlName would be the
         * element locator.
         * 
         * @param locator
          *            the element locator
          * @param controlName
         *            the control name used for logging
         */
        public HeaderContainer(String locator, String controlName) {
            super(locator, controlName);
        }
        
        /**
         * Use this constructor to override default controlName and assign a parent
         * 
         * @param locator
         *            - A String that represents the means to locate this element (could be id/name/xpath/css locator).
         * @param controlName
         *            - the control name used for logging.
         * @param parent
         *            - A {@link ParentTraits} object that represents the parent element for this element.
         * 
         */
        public HeaderContainer(String locator, String controlName,ParentTraits parent) {
            super(locator, controlName, parent);
        }
        
        public HeaderContainer(String locator, String controlName, ParentTraits parent, 
                 java.util.Map<String,String> containerElements) {
            super(locator, controlName, parent, containerElements);
        }

        private HeaderContainer getContainer() {
            if (!isInitialized()) {
                getObjectMap();
                            }
            return this;
        }

        /**
         * For HeaderContainer Link : someLink 
         *
         * Used to get someLink in headerContainer
         *
         * @return someLink
         */
        public Link getSomeLink() {
            Link containerElement = getContainer().someLink;
            if(containerElement == null) {
                getContainer().someLink = new Link(this.containerElements.get("someLink"), 
                    "someLink", this);
            }
            return getContainer().someLink;
        }

    }
}

