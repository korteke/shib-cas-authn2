package net.unicon.idp.externalauth;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jasig.cas.client.validation.Assertion;

/**
 * This interface defines the public interface for a class that will translate the information from CAS to Shib. The translator
 * should only push details into the request and should NOT attempt to call
 * AuthenticationEngine.returnToAuthenticationEngine(request, response);
 * 
 * Instance of this type should implement hashcode and equals.
 * @author chasegawa@unicon.net
 */
public interface CasToShibTranslator {
    /**
     * Do the needed translation.
     * @param request The HttpServletRequest object
     * @param response The HttpServletResponse object
     * @param assertion The CAS Assertion after validating the CAS ticket
     */
    public void doTranslation(final HttpServletRequest request, final HttpServletResponse response,
            final Assertion assertion);
}
