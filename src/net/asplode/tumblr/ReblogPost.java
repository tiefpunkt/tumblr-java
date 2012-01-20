/* Copyright (c) 2011 Niall Sheridan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
