/**
 * This file is part of the Joana IFC project. It is developed at the
 * Programming Paradigms Group of the Karlsruhe Institute of Technology.
 *
 * For further details on licensing please read the information at
 * http://joana.ipd.kit.edu or contact the authors.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.02.26 at 10:58:55 AM CET
//


package edu.kit.joana.ui.ifc.wala.rifl.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
		"attributes",
		"parameters",
		"returnvalues"
})
@XmlRootElement(name = "category")
public class Category {

	@XmlAttribute(name = "name", required = true)
	@XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	protected String name;
	@XmlElement(required = true)
	protected Attributes attributes;
	@XmlElement(required = true)
	protected Parameters parameters;
	@XmlElement(required = true)
	protected Returnvalues returnvalues;

	/**
	 * Gets the value of the name property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 * 
	 */
	public void setName(final String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the attributes property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Attributes }
	 * 
	 */
	public Attributes getAttributes() {
		return attributes;
	}

	/**
	 * Sets the value of the attributes property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Attributes }
	 * 
	 */
	public void setAttributes(final Attributes value) {
		this.attributes = value;
	}

	/**
	 * Gets the value of the parameters property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Parameters }
	 * 
	 */
	public Parameters getParameters() {
		return parameters;
	}

	/**
	 * Sets the value of the parameters property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Parameters }
	 * 
	 */
	public void setParameters(final Parameters value) {
		this.parameters = value;
	}

	/**
	 * Gets the value of the returnvalues property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Returnvalues }
	 * 
	 */
	public Returnvalues getReturnvalues() {
		return returnvalues;
	}

	/**
	 * Sets the value of the returnvalues property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Returnvalues }
	 * 
	 */
	public void setReturnvalues(final Returnvalues value) {
		this.returnvalues = value;
	}

}
