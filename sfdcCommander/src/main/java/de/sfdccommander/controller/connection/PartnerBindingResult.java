package de.sfdccommander.controller.connection;

import com.sforce.soap.partner.LoginResult;
import com.sforce.soap.partner.SoapBindingStub;

public class PartnerBindingResult {

    private LoginResult loginResult;

    private SoapBindingStub binding;

    public PartnerBindingResult() {
    }

    public PartnerBindingResult(LoginResult loginResult,
            SoapBindingStub binding) {
        super();
        this.setLoginResult(loginResult);
        this.setBinding(binding);
    }

    public SoapBindingStub getBinding() {
        return binding;
    }

    public void setBinding(SoapBindingStub binding) {
        this.binding = binding;
    }

    public LoginResult getLoginResult() {
        return loginResult;
    }

    public void setLoginResult(LoginResult loginResult) {
        this.loginResult = loginResult;
    }

}
