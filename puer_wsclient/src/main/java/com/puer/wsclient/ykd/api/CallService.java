
package com.puer.wsclient.ykd.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramsJson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appToken" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="appKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="service" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "paramsJson",
    "appToken",
    "appKey",
    "service"
})
@XmlRootElement(name = "callService")
public class CallService {

    protected String paramsJson;
    @XmlElement(required = true)
    protected String appToken;
    @XmlElement(required = true)
    protected String appKey;
    @XmlElement(required = true)
    protected String service;

    /**
     * 获取paramsJson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamsJson() {
        return paramsJson;
    }

    /**
     * 设置paramsJson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamsJson(String value) {
        this.paramsJson = value;
    }

    /**
     * 获取appToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppToken() {
        return appToken;
    }

    /**
     * 设置appToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppToken(String value) {
        this.appToken = value;
    }

    /**
     * 获取appKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppKey() {
        return appKey;
    }

    /**
     * 设置appKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppKey(String value) {
        this.appKey = value;
    }

    /**
     * 获取service属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * 设置service属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }

}
