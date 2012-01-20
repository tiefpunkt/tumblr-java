package net.asplode.tumblr;

import java.io.UnsupportedEncodingException;

import org.apache.http.entity.mime.content.StringBody;

public class ReblogPost extends Post {

    public ReblogPost() {
        setPostUrl("http://www.tumblr.com/api/reblog");
    }

    /**
     * @param key
     *            Reblog key of the original post
     * @throws UnsupportedEncodingException
     */
    public void setReblogKey(String key) throws UnsupportedEncodingException {
        entity.addPart("reblog-key", new StringBody(key));
    }

    /**
     * @param comment
     *            Optional post comment
     * @throws UnsupportedEncodingException
     */
    public void setComment(String comment) throws UnsupportedEncodingException {
        entity.addPart("comment", new StringBody(comment));
    }

    /**
     * @param reblogAs
     *            Optional type: "text", "link", "quote"
     * @throws UnsupportedEncodingException
     */
    public void reblogAs(String reblogAs) throws UnsupportedEncodingException {
        entity.addPart("as", new StringBody(reblogAs));
    }
}
