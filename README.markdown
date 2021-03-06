tumblr-java is a java library for the Tumblr API.

Notes:

 * xAuth is the only supported authentication.
 * The library uses a mix of the v1 and v2 Tumblr APIs. The v1 API is used for creating new posts. Everything else uses the v2 API. This is mainly because file uploads using the v2 API are problematic.
 * Creating a post returns the HTTP status of the request. Everything else returns a JSONObject.
 * Tumblr API docs: [v1 API](http://www.tumblr.com/docs/en/api/v1), [v2 API](http://www.tumblr.com/docs/en/api/v2).
 * [Java Doc for tumblr-java](http://nsheridan.github.com/tumblr-java/)

Dependencies:

 * [Apache HTTP Components](http://hc.apache.org/index.html)
   Specifically: commons-codec, commons-logging, httpclient, httpcore, httpmime
 * [JSON](http://www.json.org)
 * [Signpost Core and Signpost Commons](http://code.google.com/p/oauth-signpost/)

Example use:

    TextPost post = new TextPost();
    post.setCredentials("email@provider.com", "password");
    post.setTitle("Hello World!");
    post.setBody("Fnord");
    int result = post.postToTumblr();

    Tumblr tumblr = new Tumblr("oauth_consumer_key", "oauth_secret_key");
    // Set user credentials for xauth
    tumblr.setCredentials("email@provider.com", "password");
    JSONObject json = tumblr.getDashboard();


tumblr-java is licensed under the Apache 2.0 license
