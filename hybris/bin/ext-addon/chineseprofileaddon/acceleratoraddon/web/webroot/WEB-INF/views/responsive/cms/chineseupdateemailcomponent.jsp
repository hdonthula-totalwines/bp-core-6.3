<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="formElement" tagdir="/WEB-INF/tags/responsive/formElement" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>

<div class="account-section-header">
	<div class="row">
		<div class="container-lg col-md-6">
			<spring:theme code="text.account.update.email.address"/>
		</div>
	</div>
</div>

<div class="row">
	<div class="container-lg col-md-6">
		<div class="account-section-content">
			<div class="account-section-form">
				<form:form action="update-email" method="post" commandName="updateEmailForm">
					<formElement:formInputBox idKey="profile.email" labelKey="profile.email" path="email" inputCSS="text" mandatory="true"/>
					<formElement:formInputBox idKey="profile.checkEmail"  labelKey="profile.checkEmail" path="chkEmail" inputCSS="text" mandatory="true"/>
					<formElement:formPasswordBox idKey="profile.pwd" labelKey="profile.pwd" path="password" inputCSS="text form-control" mandatory="true"/>
					
					<div class="form-group">
						<label for="email.language" class="control-label">
							<spring:message code="profile.email.language" />
						</label>
						<select name="emailLanguage" class="form-control">
							<c:forEach items="${languages}" var="lang">
								<option value="${lang.isocode}" <c:if test="${user.emailLanguage eq lang.isocode}">selected</c:if> >
									<c:out value="${lang.nativeName}" />
								</option>
							</c:forEach>
						</select>
					</div>
					
					
					<input type="hidden" id="recaptchaChallangeAnswered" value="${requestScope.recaptchaChallangeAnswered}"/>
					<div class="form_field-elements control-group js-recaptcha-captchaaddon"></div>
					<div class="form-actions">
						<div class="row">
							<div class="col-sm-6 col-sm-push-6">
								<div class="accountActions">
									<ycommerce:testId code="email_saveEmail_button">
										<button type="submit" class="btn btn-primary btn-block">
											<spring:theme code="text.account.profile.saveUpdates" text="Save Updates"/>
										</button>
									</ycommerce:testId>
								</div>
							</div>
							<div class="col-sm-6 col-sm-pull-6">
								<div class="accountActions">
									<ycommerce:testId code="email_cancelEmail_button">
										<button type="button" class="btn btn-default btn-block backToHome">
											<spring:theme code="text.account.profile.cancel" text="Cancel"/>
										</button>
									</ycommerce:testId>
								</div>
							</div>
						</div>
					</div>
				</form:form>
			</div>
		</div>
	</div>
</div>