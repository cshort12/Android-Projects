package cshort012.gmail.com.newsapplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

/**
 * Created by Short on 5/26/2015.
 * Autogenerated with http://www.jsonschema2pojo.org/
 */

@Generated("org.jsonschema2pojo")
public class Story {

    private String section;
    private String subsection;
    private String title;
    private String _abstract;
    private String url;
    private String byline;
    private String itemType;
    private String updatedDate;
    private String createdDate;
    private String publishedDate;
    private String materialTypeFacet;
    private String kicker;
    private List<String> desFacet = new ArrayList<String>();
    private String orgFacet;
    private String perFacet;
    private List<String> geoFacet = new ArrayList<String>();
    private String multimedia;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The section
     */
    public String getSection() {
        return section;
    }

    /**
     *
     * @param section
     *     The section
     */
    public void setSection(String section) {
        this.section = section;
    }

    /**
     *
     * @return
     *     The subsection
     */
    public String getSubsection() {
        return subsection;
    }

    /**
     *
     * @param subsection
     *     The subsection
     */
    public void setSubsection(String subsection) {
        this.subsection = subsection;
    }

    /**
     *
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     *     The _abstract
     */
    public String getAbstract() {
        return _abstract;
    }

    /**
     *
     * @param _abstract
     *     The abstract
     */
    public void setAbstract(String _abstract) {
        this._abstract = _abstract;
    }

    /**
     *
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     *     The byline
     */
    public String getByline() {
        return byline;
    }

    /**
     *
     * @param byline
     *     The byline
     */
    public void setByline(String byline) {
        this.byline = byline;
    }

    /**
     *
     * @return
     *     The itemType
     */
    public String getItemType() {
        return itemType;
    }

    /**
     *
     * @param itemType
     *     The item_type
     */
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    /**
     *
     * @return
     *     The updatedDate
     */
    public String getUpdatedDate() {
        return updatedDate;
    }

    /**
     *
     * @param updatedDate
     *     The updated_date
     */
    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     *
     * @return
     *     The createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     *
     * @param createdDate
     *     The created_date
     */
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    /**
     *
     * @return
     *     The publishedDate
     */
    public String getPublishedDate() {
        return publishedDate;
    }

    /**
     *
     * @param publishedDate
     *     The published_date
     */
    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    /**
     *
     * @return
     *     The materialTypeFacet
     */
    public String getMaterialTypeFacet() {
        return materialTypeFacet;
    }

    /**
     *
     * @param materialTypeFacet
     *     The material_type_facet
     */
    public void setMaterialTypeFacet(String materialTypeFacet) {
        this.materialTypeFacet = materialTypeFacet;
    }

    /**
     *
     * @return
     *     The kicker
     */
    public String getKicker() {
        return kicker;
    }

    /**
     *
     * @param kicker
     *     The kicker
     */
    public void setKicker(String kicker) {
        this.kicker = kicker;
    }

    /**
     *
     * @return
     *     The desFacet
     */
    public List<String> getDesFacet() {
        return desFacet;
    }

    /**
     *
     * @param desFacet
     *     The des_facet
     */
    public void setDesFacet(List<String> desFacet) {
        this.desFacet = desFacet;
    }

    /**
     *
     * @return
     *     The orgFacet
     */
    public String getOrgFacet() {
        return orgFacet;
    }

    /**
     *
     * @param orgFacet
     *     The org_facet
     */
    public void setOrgFacet(String orgFacet) {
        this.orgFacet = orgFacet;
    }

    /**
     *
     * @return
     *     The perFacet
     */
    public String getPerFacet() {
        return perFacet;
    }

    /**
     *
     * @param perFacet
     *     The per_facet
     */
    public void setPerFacet(String perFacet) {
        this.perFacet = perFacet;
    }

    /**
     *
     * @return
     *     The geoFacet
     */
    public List<String> getGeoFacet() {
        return geoFacet;
    }

    /**
     *
     * @param geoFacet
     *     The geo_facet
     */
    public void setGeoFacet(List<String> geoFacet) {
        this.geoFacet = geoFacet;
    }

    /**
     *
     * @return
     *     The multimedia
     */
    public String getMultimedia() {
        return multimedia;
    }

    /**
     *
     * @param multimedia
     *     The multimedia
     */
    public void setMultimedia(String multimedia) {
        this.multimedia = multimedia;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}