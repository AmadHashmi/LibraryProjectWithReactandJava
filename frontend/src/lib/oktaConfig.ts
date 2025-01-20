export const oktaConfig = {
  clientId: "0oamrbcksbAN9zCBa5d7",
  issuer: "https://dev-44428806.okta.com/oauth2/default",
  redirectUri: "http://localhost:3000/login/callback",
  scopes: ["openid", "profile", "email"],
  pkce: true,
  disableHttpsCheck: true,
};
