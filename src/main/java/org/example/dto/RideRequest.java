package org.example.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="RideRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class RideRequest {
    int id;
    @XmlElement(name = "ride", required = true)
    Ride ride;
}
