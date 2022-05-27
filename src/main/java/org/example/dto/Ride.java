package org.example.dto;

import javax.xml.bind.annotation.XmlType;

@XmlType(name="Ride")
public class Ride {
    int id;
    String from;
    String to;
    Double cost;
}
