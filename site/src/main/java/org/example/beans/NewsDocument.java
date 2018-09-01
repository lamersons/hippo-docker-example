package org.example.beans;
/*
 * Copyright 2014-2018 Hippo B.V. (http://www.onehippo.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import java.util.Calendar;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;

@HippoEssentialsGenerated(internalName = "hippodockerexample:newsdocument")
@Node(jcrType="hippodockerexample:newsdocument")
public class NewsDocument extends HippoDocument {

    /**
     * The document type of the news document.
     */
    public static final String DOCUMENT_TYPE = "hippodockerexample:newsdocument";

    private static final String TITLE = "hippodockerexample:title";
    private static final String DATE = "hippodockerexample:date";
    private static final String INTRODUCTION = "hippodockerexample:introduction";
    private static final String IMAGE = "hippodockerexample:image";
    private static final String CONTENT = "hippodockerexample:content";
    private static final String LOCATION = "hippodockerexample:location";
    private static final String AUTHOR = "hippodockerexample:author";
    private static final String SOURCE = "hippodockerexample:source";

    /**
     * Get the title of the document.
     *
     * @return the title
     */
    @HippoEssentialsGenerated(internalName = "hippodockerexample:title")
    public String getTitle() {
        return getProperty(TITLE);
    }

    /**
     * Get the date of the document.
     *
     * @return the date
     */
    @HippoEssentialsGenerated(internalName = "hippodockerexample:date")
    public Calendar getDate() {
        return getProperty(DATE);
    }

    /**
     * Get the introduction of the document.
     *
     * @return the introduction
     */
    @HippoEssentialsGenerated(internalName = "hippodockerexample:introduction")
    public String getIntroduction() {
        return getProperty(INTRODUCTION);
    }

    /**
     * Get the image of the document.
     *
     * @return the image
     */
    @HippoEssentialsGenerated(internalName = "hippodockerexample:image")
    public HippoGalleryImageSet getImage() {
        return getLinkedBean(IMAGE, HippoGalleryImageSet.class);
    }

    /**
     * Get the main content of the document.
     *
     * @return the content
     */
    @HippoEssentialsGenerated(internalName = "hippodockerexample:content")
    public HippoHtml getContent() {
        return getHippoHtml(CONTENT);
    }

    /**
     * Get the location of the document.
     *
     * @return the location
     */
    @HippoEssentialsGenerated(internalName = "hippodockerexample:location")
    public String getLocation() {
        return getProperty(LOCATION);
    }

    /**
     * Get the author of the document.
     *
     * @return the author
     */
    @HippoEssentialsGenerated(internalName = "hippodockerexample:author")
    public String getAuthor() {
        return getProperty(AUTHOR);
    }

    /**
     * Get the source of the document.
     *
     * @return the source
     */
    @HippoEssentialsGenerated(internalName = "hippodockerexample:source")
    public String getSource() {
        return getProperty(SOURCE);
    }

}

