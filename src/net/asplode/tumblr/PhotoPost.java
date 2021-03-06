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

import java.io.File;
import java.io.UnsupportedEncodingException;

import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;

public class PhotoPost extends Post {

    public PhotoPost() {
        try {
            entity.addPart("type", new StringBody("photo"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param caption Caption. Optional. HTML allowed.
     * @throws UnsupportedEncodingException
     */
    public void setCaption(String caption) throws UnsupportedEncodingException {
        entity.addPart("caption", new StringBody(caption));
    }

    /**
     * @param url Click-through URL.
     * @throws UnsupportedEncodingException
     */
    public void setClickThroughURL(String url) throws UnsupportedEncodingException {
        entity.addPart("click-through-url", new StringBody(url));
    }

    /**
     * @param url Source URL of the image
     * @throws UnsupportedEncodingException
     */
    public void setSourceURL(String url) throws UnsupportedEncodingException {
        entity.addPart("source", new StringBody(url));
    }

    /**
     * @param image Image file
     * @throws UnsupportedEncodingException
     */
    public void setSourceFile(File image) throws UnsupportedEncodingException {
        entity.addPart("data", new FileBody(image));
    }
}
