# Spring Boot + Single-Page App + Okta example

This example shows how to secure a Single-Page App using Spring Boot and Okta.

Read [Secure your SPA with Spring Boot and OAuth](https://developer.okta.com/blog/2017/10/27/secure-spa-spring-boot-oauth) to see how this app was created.

**Prerequisites:** [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

> [Okta](https://developer.okta.com/) has Authentication and User Management APIs that reduce development time with instant-on, scalable user infrastructure. Okta's intuitive API and expert support make it easy for developers to authenticate, manage and secure users and roles in any application.

* [Getting started](#getting-started)
* [Links](#links)
* [Help](#help)
* [License](#license)

## Getting started

To install this example application, run the following commands:

```bash
git clone git@github.com:oktadeveloper/spring-boot-oauth-implicit-tutorial.git
cd spring-boot-oauth-implicit-tutorial
```

This will download a copy of the project.

### Create an application in Okta

You will need to create an OpenID Connect application in Okta to to perform authentication. 

Log in to your Okta Developer account (or [sign up](https://developer.okta.com/signup/) if you don’t have an account) and navigate to **Applications** > **Add Application**. Click **Single-Page App**, click **Next**, and give the app a name you'll remember. Change both the Base URI and Login redirect URI to `http://localhost:8080` and click **Done**.

#### Server configuration

Set the issuer and client ID in `src/main/resources/application.yml`:

```yaml
okta:
  oauth2:
    clientId: {clientId} # Okta app client ID
    issuer: https://{yourOktaDomain}.com/oauth2/default # update with your Okta domain name
```

**Note:** The value of `{yourOktaDomain}` should be something like `dev-123456.oktapreview.com`. Make sure you don't include `-admin` in the value!

### Start the app

To install all of the dependencies and start the app, run:

```bash
./mvnw spring-boot:run
```

## Links

This example uses the following libraries provided by Okta:

* [Okta Spring Boot Starter](https://github.com/okta/okta-spring-boot)
* [Okta Sign-In Widget](https://github.com/okta/okta-signin-widget)

## Help

Please post any questions as comments on the [blog post](https://developer.okta.com/blog/2017/10/27/secure-spa-spring-boot-oauth), or visit the [Okta Developer Forums](https://devforum.okta.com/). You can also email developers@okta.com if you would like to create a support ticket.

## License

Apache 2.0, see [LICENSE](LICENSE).
